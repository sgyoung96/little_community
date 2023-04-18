package smoim.com.sim.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="test")
public class TestController {

	@RequestMapping(value="test")
	public ModelAndView test(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("test");
		
		System.out.println("TEST SUCCESS!");
		
		return mv;
	}
}
