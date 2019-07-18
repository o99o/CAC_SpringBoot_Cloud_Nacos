package com.zit.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Nacos实现配置动态更新
 * 注意事项：在首次针对某个配置设置之后，在nacos控制台->配置列表才可见
 * @author core
 *
 */
@RestController
@RequestMapping("/webservice/config")
@RefreshScope
public class ConfigController {
	@Value("${useLocalCache:false}")
	private boolean useLocalCache;
	
	@RequestMapping("/get")
	public boolean get() {
		return useLocalCache;
	}
	
	
}

