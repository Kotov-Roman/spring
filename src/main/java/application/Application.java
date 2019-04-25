package application;

import java.util.Arrays;
import java.util.Iterator;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(Application.class);
    ConfigurableListableBeanFactory beanFactory = ((ConfigurableApplicationContext) context).getBeanFactory();
    Iterator<String> beanNamesIterator = beanFactory.getBeanNamesIterator();
    while (beanNamesIterator.hasNext()){
      System.out.println(beanNamesIterator.next());
    }

  }

}
