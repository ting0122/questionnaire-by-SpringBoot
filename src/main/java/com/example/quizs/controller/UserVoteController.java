package com.example.quizs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.quizs.constant.ResMsg;
import com.example.quizs.entity.Questionnaire;
import com.example.quizs.entity.User;
import com.example.quizs.service.ifs.QuestionnaireService;
import com.example.quizs.service.ifs.UserService;
import com.example.quizs.vo.UserVoteReq;
import com.example.quizs.vo.UserVoteRes;

@RestController
public class UserVoteController {

	private final UserService userService;
	
	@Autowired
	public UserVoteController(UserService userService, QuestionnaireService activityService) {
		this.userService = userService;
	}
	
	@PostMapping("/uservote")
	public UserVoteRes submit(@RequestBody UserVoteReq userVoteReq){
				
		return userService.saveUser(userVoteReq);
		
	}
}
