package springmvc.web.base.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import springmvc.web.base.dao.BaseDao;

@SuppressWarnings("unchecked")
@Repository
public class BaseDaoImpl extends AbstractDao implements BaseDao {
	
	@Resource  
    public void setSessionFacotry(SessionFactory sessionFacotry) {  
        super.setSessionFactory(sessionFacotry);  
    }  
	
	/**
	 * 根据给定参数执行HQL语句
	 * @param queryString
	 * @param params
	 * @return
	 * 2017年12月29日下午3:50:08
	 */
	
	@Override
	public <T> List<T> findByParams(String queryString, Object[] params) {
		if(params != null){
			return this.getHibernateTemplate().find(queryString, params);
		}else{
			return this.getHibernateTemplate().find(queryString);
		}
	}

}
