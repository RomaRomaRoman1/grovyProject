// ApplicationContext.groovy
import model.FirstBean
import model.Prototype
import model.SecondBean
import model.Singleton
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Scope

@Configuration
class ApplicationContext {

    @Bean
    @Scope("prototype")
    Prototype prototype() {
        new Prototype()
    }

    @Bean
    Singleton singleton() {
        new Singleton()
    }

    @Bean
    FirstBean firstBean(Prototype prototype, Singleton singleton) {
        new FirstBean(prototype, singleton)
    }

    @Bean
    SecondBean secondBean(Prototype prototype, Singleton singleton) {
        new SecondBean(prototype, singleton)
    }
}