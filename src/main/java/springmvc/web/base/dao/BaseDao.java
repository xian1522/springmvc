package springmvc.web.base.dao;

import java.util.List;

public interface BaseDao {
	/**
	 * ���ݸ�������ִ��HQL���
	 * @param queryString
	 * @param params
	 * @return
	 * 2017��12��29������3:50:08
	 */
	public <T> List<T> findByParams(String queryString, Object[]params);
}
