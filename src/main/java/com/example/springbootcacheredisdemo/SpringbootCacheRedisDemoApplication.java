package com.example.springbootcacheredisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
@EnableCaching
public class SpringbootCacheRedisDemoApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringbootCacheRedisDemoApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCacheRedisDemoApplication.class, args);
	}

	// @Bean
	// public CacheManagerCustomizer<ConcurrentMapCacheManager>
	// cacheManagerCustomizer() {
	// return new CacheManagerCustomizer<ConcurrentMapCacheManager>() {
	// @Override
	// public void customize(ConcurrentMapCacheManager cacheManager) {
	// cacheManager.setAllowNullValues(false);
	// }
	// };
	// }

}
