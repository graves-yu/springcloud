/**
 * 
 */
package com.graves.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**  
 * <p>Title: HelloController</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年7月23日  
 */


/**
 * 1) 如果只是使用@RestController注解Controller，则Controller中的方法无法返回jsp页面，或者html，
 * 	      配置的视图解析器 InternalResourceViewResolver不起作用，返回的内容就是Return 里的内容。
 * 
 * 2) 如果需要返回到指定页面，则需要用 @Controller配合视图解析器InternalResourceViewResolver才行。
 * 	     如果需要返回JSON，XML或自定义mediaType内容到页面，则需要在对应的方法上加上@ResponseBody注解。
 * <p>Title: HelloController</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年7月23日
 */

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello(){
		return "Hello SpringBoot~~~";
	}
	
	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("name", "graves");
		model.addAttribute("age", 20);
		model.addAttribute("info", "我是一个爱学习的好青年");
		return "index";
	}

}
