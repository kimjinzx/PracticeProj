package PracticeProject.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import PracticeProject.domain.ProblemsDto;
import PracticeProject.service.ProService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Controller
@RequiredArgsConstructor
@Slf4j
public class homeController {
	private final ProService ser;

	@GetMapping(value = "/home/")
	public String problemsAllList (ProblemsDto pd, Model model) {
		
		List<ProblemsDto> problemsList = ser.findProblemsList();
		
		model.addAttribute("problemsList", problemsList);
		
		return "/home";
	}
	
	
}
