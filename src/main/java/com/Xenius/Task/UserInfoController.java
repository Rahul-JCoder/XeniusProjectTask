package com.Xenius.Task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {
	
	
	/*
	In this project we have used internal database h2 ,
 	so when you launch the application, you have to provide data by urself.
 	and the api /getuserdata will fetch it... 
 	to use database you can use localhost:8080/h2-console
	*/
	@Autowired
	userdao user;
		@RequestMapping("/getuserdata")  
		@ResponseBody
		public List<UserInformation> getStudentsJson() {
			return user.findAll();
		}
}
