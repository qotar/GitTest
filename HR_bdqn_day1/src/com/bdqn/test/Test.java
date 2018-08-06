package com.bdqn.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bdqn.pojo.Users;


public class Test {
	
	 public static void main(String[] args) {
		    test();
	}
    
	 //���� ��Users  �������һ������ 
	 public  static void  test(){
		  // 加载Hibernate的配置文件，
	        Configuration configuration = 
	        		   new Configuration().configure();
	        // 获取SessionFactory对象.
	        /*
	         * 用于初始化Hibernate，充当了数据存储的代理，负责创建Session对象，
	         * 一般情况下一个项目只要一个Sessionactory就够了
	         */
	        SessionFactory sessionFactory =     
	        		   configuration.buildSessionFactory();
		    //通过SessionFactory有两种
	        /*
	         * 1.openSession()
	         * 	在连接池中得到一个非线程安全的数据
	         * 2.getCurrentSession()
	         * 	线程安全数据
	         */
	        Session  session  = sessionFactory.openSession(); 
		    //开始事务管理器
	        Transaction transaction =
	        		     session.beginTransaction();
	        // �����ݿ�users ���������һ������
	        Users  user= new Users();
	        user.setName("admin");
	        user.setPassword("1234567");
	        user.setTelephone("15626282207");
	        user.setUsername("admin");
	        // 1  �ǹ���Ա   2  ���ǹ���Ա
	        user.setIsadmin("1");
	        session.save(user);
	        //�ύ����
	        transaction.commit();
	        // �ͷ���Դ
	        session.close(); 
	 }
	 
	 public void testA(){
		 
	 }
	 
}
