package guru.springframework.spring6di.component;

import guru.springframework.spring6di.controllers.di.MyController;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean, BeanPostProcessor {

    private String javaVer;

    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycleBean Constructor ##");
    }

    @Value("${java.specification.version}")
    public void setJavaVer(String javaVer) {
        this.javaVer = javaVer;
        System.out.println("## 1 Properties Set. Java Ver: " + this.javaVer);
    }

    //BeanNameAware
    @Override
    public void setBeanName(String name) {
        System.out.println("## 2 BeanNameAware - My Bean Name is: " + name);
    }

    //BeanFactoryAware
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## 3 BeanFactoryAware - Bean Factory has been set");
    }

    //ApplicationContextAware
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## 4 ApplicationContextAware - Application context has been set");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## 5 postConstruct The Post Construct annotated method has been called");
    }

    //InitializingBean
    @Override
    public void afterPropertiesSet() {
        System.out.println("## 6 InitializingBean.afterPropertiesSet - Populate Properties The LifeCycleBean has its properties set!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## 7 The @PreDestroy annotated method has been called");
    }

    //DisposableBean
    @Override
    public void destroy() throws Exception {
        System.out.println("## 8 DisposableBean.destroy - The Lifecycle bean has been terminated");
    }

    //BeanPostProcessor
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("## postProcessBeforeInitialization: " + beanName);
        if (bean instanceof MyController myController) {
            System.out.println("## postProcessBeforeInitialization - MyController bean has been called");
            myController.beforeInit();
        }

        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    //BeanPostProcessor
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("## postProcessAfterInitialization: " + beanName);
        if (bean instanceof MyController myController) {
            System.out.println("## postProcessAfterInitialization - MyController bean has been called");
            myController.afterInit();
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
