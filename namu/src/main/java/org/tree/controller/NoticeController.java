package org.tree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.tree.domain.Criteria;
import org.tree.domain.NoticeVO;
import org.tree.domain.PageDTO;
import org.tree.service.NoticeService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/notice")
@AllArgsConstructor
public class NoticeController {

	private NoticeService service;
	
	@GetMapping("/list")
	public void list(Criteria cri, Model model) {
		log.info("> list: " + cri);
		model.addAttribute("list", service.getList(cri));
		//model.addAttribute("pageMaker", new PageDTO(cri, 123));
		
		int total = service.getTotal(cri);
		log.info("> total: " + total);
		model.addAttribute("pageMaker", new PageDTO(cri, total));
	}
	
	@GetMapping("/new")
	public String register() {
		return "register";
	}
	
	@PostMapping("/new")
	public String register(NoticeVO notice, RedirectAttributes rttr) {
		log.info("> register: " + notice);
		service.register(notice);
		rttr.addFlashAttribute("result", notice.getN_code());
		return "redirect:/notice/list";
	}
	
}
