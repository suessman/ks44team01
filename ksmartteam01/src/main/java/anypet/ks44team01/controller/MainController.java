package anypet.ks44team01.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
	@GetMapping("/user/mainPage")
	public String main(Model model) {
		return"main";
	}
	
	@GetMapping("index")
	public String home(Model model) {
		return"admin/index";
	}
	
	@GetMapping("/admin/login")
	public String login() {
		return "/admin/login";
	}

	//시작화면
	@GetMapping("/")
	public String intro() {
		return "/user/intro";
	}
}