package com.mymvc.web;

import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mymvc.entity.Users;
/**
 * 处理用户相关操作的控制类
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/userAction")
@SessionAttributes({"doUser2"})//数组
public class UserAction {

	//处理请求登录
	@RequestMapping(value="/doLogin",method={RequestMethod.POST,RequestMethod.GET})
	public String queryUser(Users u , HttpServletRequest request, HttpServletResponse response, PrintWriter out){
		System.out.println("姓名："+u.getUname()+"密码："+u.getUpwd());
		response.setContentType("text/html; charset=utf-8");
		if(u!=null && u.getUname().length()>0 && u.getUpwd().length()>0){
			if("admins".equals(u.getUname())||"admins".equals(u.getUpwd())){
			//	out.print("<h1>登录成功！欢迎您的光临！</h1>");
				
				//获取Session对象
				HttpSession session = request.getSession();
				session.setAttribute("sessionUser", u);
				
				//获取上下文
				ServletContext ctx=request.getServletContext();
				ctx.setAttribute("ctxUser", u);
				
				return "welcome";
			}else{
				out.print("<script>alert('登录失败！用户名和密码有误！！');history.back();</script>");
			}
		}else{
			out.print("<script>alert('用户名和密码不能为空！！');location.href='../dologin.jsp';</script>");
		}
		return null;
	}

	
	//登录2
	@RequestMapping("doLogin2")
	public String dologin(Users user, ModelMap map, RedirectAttributes attr){
		map.addAttribute("doUser","hello");
		map.addAttribute("doUser2", user);//转发拿数据
		
		//设置重定向参数，会在地址栏显示也参数 
		attr.addAttribute("message", "ssss");//重定向
		//attr.addFlashAttribute("message", "ssss");
		
		//return "welcome";
		return "redirect:/welcome.jsp";
		
	}
	//如何从一个action方法调整到另一个action方法set
	@RequestMapping("/testOne")
	public String testOne(RedirectAttributes attr){
		attr.addFlashAttribute("uname", "Jack");
		attr.addFlashAttribute("upwd", "12345");
		
		return "redirect:/userAction/testTwo";
	}
	@RequestMapping("/testTwo")
	public String testTwo(@ModelAttribute(name="uname")String ua,@ModelAttribute(name="upwd")String pw,HttpServletResponse response,PrintWriter out){
		response.setContentType("text/html;charset=utf-8");
		System.out.println("请求来了");
		out.print("您好!"+ua+"---Your Password:"+pw);
		return null;
	}

}





























