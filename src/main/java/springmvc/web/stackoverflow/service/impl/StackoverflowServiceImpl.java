package springmvc.web.stackoverflow.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import springmvc.data.stackoverflow.StackoverflowQuestion;
import springmvc.web.stackoverflow.dao.StackoverflowDao;
import springmvc.web.stackoverflow.service.StackoverflowService;
@Service("stackoverflowSerivce")
public class StackoverflowServiceImpl implements StackoverflowService {
	@Resource
	private StackoverflowDao stackoverflowDao;
	
	@Override
	public List<StackoverflowQuestion> findQuestionList(StackoverflowQuestion question) {
		
		return stackoverflowDao.findQuestionList(question);
	}

}
