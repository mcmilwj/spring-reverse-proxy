package com.mlesniak.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * This is a very simple configurable reverse-proxy.
 *
 * @author Michael Lesniak (mlesniak@micromata.de)
 */
@EnableZuulProxy
@SpringBootApplication
public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOG.info("Proxy started");
        SpringApplication.run(Main.class, args);
    }
}
