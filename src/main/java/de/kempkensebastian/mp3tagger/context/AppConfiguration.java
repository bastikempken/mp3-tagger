package de.kempkensebastian.mp3tagger.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("de.kempkensebastian.mp3tagger")
@Configuration
public class AppConfiguration {
	@Bean
	public BeanFacade helloWorld() {
		return new BeanFacade();
	}
}
