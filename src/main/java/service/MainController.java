package service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
	public String postForm(Model model){
        model.addAttribute("post", new Scratch());
        return "post";}

	@PostMapping("/post")
	public String submitPost(@ModelAttribute Scratch post, Model model) {
		model.addAttribute("post", post);
		DatabaseConnection d = new DatabaseConnection();
		d.saveData(post);
        System.out.println(post);
		return "/account";
	}
}