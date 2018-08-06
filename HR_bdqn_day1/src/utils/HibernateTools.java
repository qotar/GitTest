package utils;

import javax.jms.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
 * 工具类
 * 保证全局中只有一个Session工厂
 */
public class HibernateTools {

	//全局返回的SessionFactory对象
	private static SessionFactory factory;
	
	static{
		
		factory = new Configuration().configure().buildSessionFactory();
	}
//	防止外部创建
	private HibernateTools(){}
	public static SessionFactory getSessionFactory(){
		return factory;
			
	}
	
	public Session openSessionTools(){
		
		return (Session) factory.openSession();
		
	}
	
}
