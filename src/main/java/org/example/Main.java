package org.example;

import org.example.config.SpringConfig;
import org.example.dao.DataBase;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataBase data = context.getBean("dataBase", DataBase.class);


        context.close();


    }
}
