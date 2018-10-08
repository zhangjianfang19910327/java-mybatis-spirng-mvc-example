package com.web.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.dao.UserMapper;
import com.web.entity.User;



@Controller
public class Test {
	
	@Autowired
	UserMapper userMapper;
	
	@RequestMapping("/myTest")
      public String  myTest(Model model,HttpServletRequest request,HttpServletResponse response,HttpSession httpSession) throws Exception {
		
		/*int user=userMapper.updateUserNameByPassword("�Ž���", "123456");*/
		int user=userMapper.insertUser("�����",12, "123");
		int user1=userMapper.insertUser("������",11, "135");
		
		System.out.println(user);
    	return "en";
		
	}
	@RequestMapping("/myTest.jspx")
    public String myIndex(Model model,HttpServletRequest request,HttpServletResponse response) {
  	   model.addAttribute("string", "g1o");
		return "index";
	}
}
