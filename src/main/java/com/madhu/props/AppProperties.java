package com.madhu.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app")
@Configuration
public class AppProperties {

	private Map<String, String> messages = new HashMap<>();

	public Map<String, String> getMessages() {
		return messages;
	}

}
