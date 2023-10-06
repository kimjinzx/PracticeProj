package PracticeProject.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import PracticeProject.domain.ArticleDto;
import PracticeProject.domain.DepartmentDto;
import PracticeProject.domain.MemberDto;
import PracticeProject.service.ArticleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Controller
@RequiredArgsConstructor
@Slf4j
public class homeController {
	private final ArticleService as;
	
	
//	@RequestMapping(value="/")
//	public String index() {
//		return "redirect:/index";
//	}
	

	@GetMapping(value = "/board")
	public String articleAllList (ArticleDto ad, Model model) {
		
		List<ArticleDto> articleList = as.findArticleList();
		
		model.addAttribute("articleList", articleList);
		
		return "board";
	}
	
	
//	@GetMapping(value = "/board/WriteForm")
//	public String writeForm (ArticleDto ad, MemberDto md, DepartmentDto dd, Model model) {
//		
//		List<>
//	}
		
	
	
}
