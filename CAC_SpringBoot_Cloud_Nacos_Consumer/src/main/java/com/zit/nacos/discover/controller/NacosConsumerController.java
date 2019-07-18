package com.zit.nacos.discover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 调用服务
 * @author core
 */
@RestController
public class NacosConsumerController {
	
	private final RestTemplate restTemplate;
	@Autowired
	public NacosConsumerController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@RequestMapping("/webservice/hello")
	public String hello(@RequestParam("name") String name) {
		// 下面“provider”为服务注册端的服务名
		String res = restTemplate.
				getForObject("http://provider/webservice/hello?name="+name, 
						String.class);
		return res;
	}
}
