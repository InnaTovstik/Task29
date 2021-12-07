package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext contextXML = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext contextJava = new AnnotationConfigApplicationContext(Config.class);
        DeckOfCards deckXML = contextXML.getBean(DeckOfCards.class);
        DeckOfCards deckJava = contextJava.getBean(DeckOfCards.class);
        deckJava.shuffle();
        deckXML.shuffle();
        System.out.println(deckJava);
        System.out.println(deckXML);





    }
}
