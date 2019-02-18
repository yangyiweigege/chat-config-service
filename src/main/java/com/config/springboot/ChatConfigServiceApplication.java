package com.config.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 分布式配置中心 项目运行后 输入localhost:8888/chat-log-service/dev 即可访问到 切换一次分支
 * @author yangyiwei
 * @date 2018年5月29日
 * @time 下午2:41:55
 */
@EnableConfigServer
@SpringBootApplication
@EnableEurekaClient//服务注册 配置中心注意事项 如果是github上的 不需要.git 如果是gitlab 则需要.git 建议使用http路径 不带git
public class ChatConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatConfigServiceApplication.class, args);
	}
}
