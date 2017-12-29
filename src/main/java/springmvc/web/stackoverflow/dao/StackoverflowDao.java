package springmvc.web.stackoverflow.dao;

import java.util.List;

import springmvc.data.stackoverflow.StackoverflowQuestion;

/**
 * stackoverflow信息
 * @author Administrator
 * 2017年12月29日下午4:46:47
 */
public interface StackoverflowDao {
	/**
	 * 查询问题列表
	 * @param question
	 * @return
	 * 2017年12月29日下午4:48:31
	 */
	public List<StackoverflowQuestion> findQuestionList(StackoverflowQuestion question);
	
}
