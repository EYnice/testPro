package com.mymvc.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 理解SpringMVC处理方法的返回值类型
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/reAction")
public class ResultAction {
		//无敌多少寂寞，多少寂寞！
		//返回字符串1[跳转到页面或者Action中方法]
		@RequestMapping("/testOne")
		public String testOne(){
			System.out.println("执行方法TestOne");
			
			
			return "testResult";//转向到testResult.jsp页面
			//return "redirect:/testResult";//重定向到testResult这个方法
			//return "redirect:/testResult.jsp";//重定向到testResult页面
		}
		
		//返回字符串2[响应字符串到客户端]
		@RequestMapping("/testTwo")
		@ResponseBody
		public String testTwo(){
			System.out.println("执行方法TestTwo");
			return "Hello,World!";
		}
		
		//返回类型为ModelAndView
		@RequestMapping("/testThree")
		public ModelAndView testThree(){
			System.out.println("执行方法testThree");
			
			Map map=new HashMap();
			map.put("msg", "Hello!");
			//return new ModelAndView("testResult","map",map);
			return new ModelAndView("redirect:/testResult.jsp","map",map);
		}
		
}
