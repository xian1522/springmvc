package springmvc.web.base.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import springmvc.web.base.dao.BaseDao;

@SuppressWarnings("unchecked")
@Repository("baseDao")
public class BaseDaoImpl extends AbstractDao implements BaseDao {
	
	@Resource
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.openSession();
	}
	/**
	 * ���ݸ�������ִ��HQL���
	 * @param queryString
	 * @param params
	 * @return
	 * 2017��12��29������3:50:08
	 */
	
	@Override
	public <T> List<T> findByParams(String queryString, Object[] params) {
		if(params != null){
			return getSession().createQuery(queryString).setString(1, params[0]+"").list();
		}else{
			return getSession().createQuery(queryString).list();
		}
	}

}
