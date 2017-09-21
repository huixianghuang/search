package com.weapes;

import org.apache.log4j.LogManager;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Logger;

/**
 * Created by 不一样的天空 on 2017/6/27.
 */
@Configuration
public class ElasticSearchConfig {
    @Autowired
    Environment env;
    @Bean
    public TransportClient elasticsearchClient(){   //向spring注入es的客户端操作对象
        TransportClient transportClient = null;
        try {
            String host = env.getProperty("spring.elasticsearch.host");
            int port = Integer.parseInt(env.getProperty("spring.elasticsearch.port"));
            transportClient = TransportClient
                    .builder()
                    .build()
                    .addTransportAddress(
                            new InetSocketTransportAddress(InetAddress.getByName(host), port)
                    );
        } catch (UnknownHostException e) {
            System.err.println("创建elasticsearch客户端失败");
        }
        System.out.println("创建elasticsearch客户端成功");

        return transportClient;

    }
}
