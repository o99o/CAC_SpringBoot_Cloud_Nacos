package com.zit.nacos.discover.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 发布服务
 * @author core
 */
@RestController
public class NacosProducerController {
	@RequestMapping("/webservice/hello")
	public String hello(@RequestParam("name") String name) {
		return "hello:"+name;
	}
}
