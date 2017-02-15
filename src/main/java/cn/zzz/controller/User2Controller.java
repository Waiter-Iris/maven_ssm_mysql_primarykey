package cn.zzz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zzz.po.User2;
import cn.zzz.service.User2Service;

@Controller("user2Controller")
public class User2Controller {
	@Autowired
	public User2Service user2Service;

	@RequestMapping("/getPK")
	public @ResponseBody
	String getPrimaryKey(User2 user2) {
		System.out.println("/getPK");
		user2Service.insert(user2);
		return user2.getId() + "";
	}
}
