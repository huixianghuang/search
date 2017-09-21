package com.weapes.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.weapes.domin.login.LoginForm;
import com.weapes.domin.login.User;
import com.weapes.domin.response.Response;
import com.weapes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 不一样的天空 on 2017/6/25.
 */
@RestController
@CrossOrigin
public class LoginController {
    @Autowired
    UserService userService;
    @Autowired
    private Producer captchaProducer;
    private HttpSession session;
    @RequestMapping("/login")
    public Response login( @RequestBody LoginForm loginForm) {

        Response response = new Response();
        User user = userService.getUserByUserName(loginForm.getUsername());
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = loginForm.getPassword();
        String code = (String) session.getAttribute(Constants.KAPTCHA_SESSION_KEY);
        System.err.println("--------------"+code);
        System.out.println(loginForm.toString());
        if (code == null || !code.equals(loginForm.getCaptcha())){
            response.setMessage("验证码错误!!");
            return response;
        }
        if (user == null || !encoder.matches(rawPassword, user.getPassword())) {
            response.setMessage("用户名或密码错误!");
            return response;
        } else {
            List<GrantedAuthority> authorities = new ArrayList<>();
            userService.listRoleByUserId(user.getUserId()).stream().forEach(
                    roleName -> authorities.add(new SimpleGrantedAuthority(roleName))
            );
            user.setAuthorities(authorities);
            Authentication authentication = new UsernamePasswordAuthenticationToken(user, user.getPassword(), user.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            System.out.println(loginForm.toString());
            response.setMessage("登录成功");
            return response;
        }
    }
    @RequestMapping("/captcha")
    public ModelAndView getCaptchaImage(HttpServletRequest request, HttpServletResponse response) throws Exception {
        session = request.getSession();
        String code = (String)session.getAttribute(Constants.KAPTCHA_SESSION_KEY);
        System.out.println("******************验证码是: " + code + "******************");

        response.setDateHeader("Expires", 0);

        // Set standard HTTP/1.1 no-cache headers.
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");

        // Set IE extended HTTP/1.1 no-cache headers (use addHeader).
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");

        // Set standard HTTP/1.0 no-cache header.
        response.setHeader("Pragma", "no-cache");

        // return a jpeg
        response.setContentType("image/jpeg");

        // create the text for the image
        String capText = captchaProducer.createText();

        // store the text in the session
        session.setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);

        // create the image with the text
        BufferedImage bi = captchaProducer.createImage(capText);
        ServletOutputStream out = response.getOutputStream();

        // write the data out
        ImageIO.write(bi, "jpg", out);
        try {
            out.flush();
        } finally {
            out.close();
        }
        return null;
    }
}
