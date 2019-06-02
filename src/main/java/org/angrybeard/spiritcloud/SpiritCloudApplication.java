package org.angrybeard.spiritcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpiritCloudApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpiritCloudApplication.class).web(true).run(args);
    }

}
