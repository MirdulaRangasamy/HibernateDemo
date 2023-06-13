package com.exterro.HibernateDemo;

import org.hibernate.Session;

import com.exterro.HibernateDemo.dao.SessionFactoryProvider;
import com.exterro.HibernateDemo.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		
		  Session sess = SessionFactoryProvider.getSessionFactory().openSession();
		  sess.beginTransaction();
		  //Create a record on Table
		  /*Student1 stud = new Student1(6,"GGG",6.7f);
		  sess.save(stud);*/
		  
		  //Read a record from Table
		  Student stud = (Student)sess.get(Student.class, 3);
		  System.out.println(stud);
		  
		  //Update a record from Table
		 // Student1 stud = new Student1(4,"XXX",7.7f);
		  /*sess.update(stud);*/
		  
		  //Delete a record on the table
		 // sess.delete(stud);
		  sess.getTransaction().commit(); 
		  sess.close();
		  SessionFactoryProvider.shutdown();
		 
    }
}
