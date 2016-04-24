package com.yamkoviy.jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yamkoviy.jpa.data.Lecture;
import com.yamkoviy.jpa.workers.LecturesWorker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
    	Lecture lecture = new Lecture();
    	lecture.setName("JavaEE");
    	lecture.setCredits(4.5);
    	LecturesWorker worker = (LecturesWorker)context.getBean("worker");
    	worker.addLecture(lecture);

    }
}
