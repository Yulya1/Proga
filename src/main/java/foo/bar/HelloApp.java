package foo.bar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {

        // todo запустить приложение, не внося изменений, для проверки общей работоспособности

        // todo в класс Poem добавить атрибут "текст поэмы"
        // todo в xml-конфигурацию добавить инициализацию атрибута "текст поэмы"
        // todo изменить метод Poem.recite() так, чтобы выводился текст поэмы
        // todo запустить приложение

        // todo добавить класс "конферансье", который вызывает на сцену исполнителя
        // todo изменить xml-конфигурацию и код HelloApp так, чтобы жонглер (Juggler) вызывался посредством конферансье
        // todo запустить приложение

        // todo добавить произвольного нового исполнителя по аналогии с жонглером
        // todo создать вторую xml-конфигурацию, в которой конферансье вызывает вашего нового исполнителя
        // todo запустить приложение с новой конфигурацией

        //ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //2)
       // Performer performer = (Performer) context.getBean("vasya");
       // performer.perform();

        //3)
        //Conf confer = (Conf) context.getBean("conf");
        //confer.makePerform();

        ApplicationContext context = new ClassPathXmlApplicationContext("forTrainer.xml");
        Trainer trainer = (Trainer) context.getBean("trainer");
        trainer.perform();
    }
}
