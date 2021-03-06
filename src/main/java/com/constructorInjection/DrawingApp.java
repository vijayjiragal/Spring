package com.constructorInjection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
            //Dependancy Injection and Constructor injection
    public static void main(String[] args) {
//        Triangle triangle = new Triangle();
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle)appContext.getBean("triangle");
        triangle.draw();
    }
}
