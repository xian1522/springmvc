package springmvc.web.stackoverflow.service;

import java.util.List;

import springmvc.data.stackoverflow.StackoverflowQuestion;

public interface StackoverflowService {
	/**
	 * ��ѯ�����б�
	 * @return
	 */
	public List<StackoverflowQuestion> findQuestionList(StackoverflowQuestion question);
}
