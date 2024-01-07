package model;

import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class ApplicationStarter {
   public static void main(String[] args) {
        GenericApplicationContext context = new GenericApplicationContext();
        GroovyBeanDefinitionReader reader = new GroovyBeanDefinitionReader(context);
        reader.loadBeanDefinitions("classpath:ApplicationContext.groovy");
        context.refresh();
        context.close();
    }
}
