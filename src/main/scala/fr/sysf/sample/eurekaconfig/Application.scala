package fr.sysf.sample.eurekaconfig

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.context.annotation.Configuration

/**
 * @author florent 
 *         27/03/2016
 */
object Application extends App {

  SpringApplication.run(classOf[ApplicationConfig])
}

@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableConfigServer
class ApplicationConfig

