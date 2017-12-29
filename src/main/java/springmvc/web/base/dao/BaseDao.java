package springmvc.web.base.dao;

import java.util.List;

public interface BaseDao {
	/**
	 * 根据给定参数执行HQL语句
	 * @param queryString
	 * @param params
	 * @return
	 * 2017年12月29日下午3:50:08
	 */
	public <T> List<T> findByParams(String queryString, Object[]params);
}
