package springmvc.web.stackoverflow.dao;

import java.util.List;

import springmvc.data.stackoverflow.StackoverflowQuestion;

/**
 * stackoverflow��Ϣ
 * @author Administrator
 * 2017��12��29������4:46:47
 */
public interface StackoverflowDao {
	/**
	 * ��ѯ�����б�
	 * @param question
	 * @return
	 * 2017��12��29������4:48:31
	 */
	public List<StackoverflowQuestion> findQuestionList(StackoverflowQuestion question);
	
}
