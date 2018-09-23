
package com.norellanac.courier2018.controllers;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {
    //@Autowired	
  
    @GetMapping("/hi")
	public String init(HttpServletRequest req) {
                return "index";
	}
        
    @GetMapping("home")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }
}