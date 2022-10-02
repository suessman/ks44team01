package anypet.ksmartteam01.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
	@GetMapping("/")
	public String main(Model model) {
		return"main";
	}
	
	@GetMapping("index")
	public String home(Model model) {
		return"admin/index";
	}
}