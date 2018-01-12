package springmvc.web.stackoverflow.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.data.stackoverflow.StackoverflowQuestion;
import springmvc.web.stackoverflow.service.StackoverflowService;

@Controller
@RequestMapping("/stackoverflow")
public class StackoverflowController {
	@Resource
	private StackoverflowService stackoverflowService;
	
	@RequestMapping(value="/managerlist")
	public String managerList(){
		return "stackoverflow/managerlist";
	}
	/**
	 * 查询问题列表
	 * @return
	 */
	@RequestMapping(value="/findQuestionList")
	public List<StackoverflowQuestion> findQuestionList(){
		StackoverflowQuestion question = new StackoverflowQuestion();
		List<StackoverflowQuestion> questionList = stackoverflowService.findQuestionList(question);
		return questionList;
	}
}
