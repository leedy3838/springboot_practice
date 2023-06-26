package hello.demo.beanfind;

import hello.demo.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextInfoTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈 출력하기")
    public void findAllBean(){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            Object bean = applicationContext.getBean(beanDefinitionName);

            System.out.println("name = " + beanDefinitionName + ", Object = " + bean);
        }
    }

    @Test
    @DisplayName("애플리케이션 빈 출력하기")
    public void findApplicationBean(){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String beanDefinitionName : beanDefinitionNames){
            BeanDefinition beanDefinition = applicationContext.getBeanDefinition(beanDefinitionName);

            if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION){
                Object bean = applicationContext.getBean(beanDefinitionName);

                System.out.println("name = " + beanDefinitionName + ", Object = " + bean);
            }
        }
    }
}
