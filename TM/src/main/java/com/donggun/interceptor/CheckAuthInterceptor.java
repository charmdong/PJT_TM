package com.donggun.interceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

/**
 * url 접근 권한 체크 인터셉터 
 * @author donggun
 * @since Apr 12, 2021
 */
public class CheckAuthInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		
		String id = (String) session.getAttribute("id");
		
		// 로그인이 되어있지 않은 상태
		if(id.isEmpty() || id == null) {
			// 로그인 화면으로 이동 
			response.sendRedirect("/login.jsp");
			return false;
		}
		
		return true;
	}

	

}
