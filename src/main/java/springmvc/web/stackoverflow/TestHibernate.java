package springmvc.web.stackoverflow;

import org.hibernate.Session;
import org.junit.Test;

import springmvc.TestDb;
import springmvc.data.stackoverflow.StackoverflowQuestion;

public class TestHibernate extends TestDb {

	@Test
	public void testSaveEntity() {
		
		StackoverflowQuestion question = new StackoverflowQuestion();
		question.setTitle("test");
		question.setContent("content_test");
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(question);
		session.getTransaction().commit();
		session.clear();
		
	}

}
