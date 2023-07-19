package com.simple.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

// HandlerAdapter에 연결되려면 특정 클래스를 상속받아야한다
public class HomeController extends MultiActionController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		
		String uri = request.getRequestURI();
		
		String path = uri.substring( request.getContextPath().length() );
		
		System.out.println(path);
		
		if(path.equals("/test/aaa")) {
			System.out.println("aaa실행");
			
			ModelAndView mv = new ModelAndView();
//			mv.setViewName("/WEB-INF/views/aaa.jsp");
			mv.setViewName("aaa");
			mv.addObject("data","hello world");
			
			return mv; // Controller에서는 View에 대한 정보, 데이터에 정보를 반환
			
		} else if(path.equals("/test/bbb")) {
			System.out.println("bbb실행");
		}
		
		
		return null;
	}
	
	

}
