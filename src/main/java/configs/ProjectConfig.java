package configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
@Configuration is an annotation that indicates this class has @Bean definition method.
 */
@Configuration
@ComponentScan(basePackages = {"beans", "service", "implementation"})
public class ProjectConfig {

}
