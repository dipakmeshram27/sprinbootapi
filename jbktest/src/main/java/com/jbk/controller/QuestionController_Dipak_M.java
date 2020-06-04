package com.jbk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testapi")
public class QuestionController_Dipak_M {
	@RequestMapping("/selecttopic")
	public Question getTopic() {
		Question topic=new Question();
		topic.setQuestionText("Please Select the Topic...");
		topic.setOption1("Abstraction");
		topic.setOption2("Polymorphism");
		topic.setOption3("Inheritance");
		topic.setOption4("Collection");
		if("Abstraction".equals(topic.option1)) {
			topic.setExplanation("You are selected Abstraction");
		}
		if("Polymorphism".equals(topic.option2)) {
			topic.setExplanation("You are selected Polymorphism");
		}
		if("Inheritance".equals(topic.option3)) {
			topic.setExplanation("You are selected Inheritance");
		}
		if("Collection".equals(topic.option4)) {
			topic.setExplanation("You are selected Collection");
		}
		return topic;
	}
}
