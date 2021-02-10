package service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/info/{category}")
	public String category(@PathVariable("category")String category, Model model) {
		model.addAttribute("category", category);
		return category;}

	@GetMapping("/account/post")
	public String post() {return "post";}

//	@GetMapping("/info/info/{category}")
//	public String category(@PathVariable("category")String category, Model model) {
//		model.addAttribute("category", category);
//		return category
}