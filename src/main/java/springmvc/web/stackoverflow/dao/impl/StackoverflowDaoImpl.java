package springmvc.web.stackoverflow.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import springmvc.data.stackoverflow.StackoverflowQuestion;
import springmvc.web.base.dao.BaseDao;
import springmvc.web.stackoverflow.dao.StackoverflowDao;

public class StackoverflowDaoImpl implements StackoverflowDao {
	
	@Resource
	private BaseDao baseDao;
	/**
	 * ��ѯ�����б�
	 * @param question
	 * @return
	 * 2017��12��29������4:48:31
	 */
	@Override
	public List<StackoverflowQuestion> findQuestionList(
			StackoverflowQuestion question) {
		return null;
	}

}
