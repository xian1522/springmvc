package springmvc.web.stackoverflow.service;

import java.util.List;

import springmvc.data.stackoverflow.StackoverflowQuestion;

public interface StackoverflowService {
	/**
	 * 查询问题列表
	 * @return
	 */
	public List<StackoverflowQuestion> findQuestionList(StackoverflowQuestion question);
}
