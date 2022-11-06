package com.it;

import com.it.dao.BookDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.Beans;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) applicationContext.getBean("bookdao");
        bookDao.getlist();
    }
}
