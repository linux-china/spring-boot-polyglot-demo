package org.mvnsearch.domain;

import org.jetbrains.annotations.NotNull;
import org.mvnsearch.domain.model.UserRepository;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Demo Application context
 *
 * @author linux_china
 */
public class DemoAppContext implements ApplicationContextAware {

    @NotNull
    public static UserRepository userRepository;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        userRepository = applicationContext.getBean(UserRepository.class);
    }
}
