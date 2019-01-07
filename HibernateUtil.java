package firsthibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
private static final SessionFactory sessionFactory;
static {
	try {
				
		sessionFactory=new Configuration().configure().buildSessionFactory();
	}catch(Throwable ex) {
		System.out.println("sessionFactory creation failed"+ ex);
	throw new ExceptionInInitializerError(ex);
	}
}
/*public static SessionFactory createSessionFactory()
{
	Configuration configuration=new Configuration();
	configuration.configure();
	ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().configuration.getProperties()).buildServiceRegistry();
	sessionFactory =configuration.buildSessionFactory(serviceRegistry);
	return sessionFactory;
}*/
public static SessionFactory getSessionFactory() {
	return sessionFactory;
}
}
