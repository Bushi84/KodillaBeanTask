package com.kodilla.lifecycle;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanMonitorLogger implements BeanPostProcessor {

    private static final Logger logger = LogManager.getLogger(BeanMonitorLogger.class);

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        logger.log(Level.INFO, "Initialization of bean: " + beanName);
        return bean;
    }

}
