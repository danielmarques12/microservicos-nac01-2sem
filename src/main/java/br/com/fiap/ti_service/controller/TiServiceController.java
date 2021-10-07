package br.com.fiap.ti_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.ti_service.model.TiService;
import br.com.fiap.ti_service.repository.TiServiceRepository;

@Controller
public class TiServiceController {
	@Autowired
	TiServiceRepository repository;

	@GetMapping("/abrirSolicitacao")
	public ModelAndView abrirSolicitacao() {
		ModelAndView view = new ModelAndView("ti_service/abrirSolicitacao");
		
		return view;
	}
	
	@GetMapping("/cadastroSolicitacao")
	public ModelAndView cadastroSolicitacao() {
		ModelAndView view = new ModelAndView("ti_service/cadastroSolicitacao");
		
		return view;
	}
	
	@PostMapping("/confirmacaoSolicitacao")
	public ModelAndView confirmacaoSolicitacao(TiService tiservice) {
		repository.save(tiservice);
		ModelAndView view = new ModelAndView("ti_service/confirmacaoSolicitacao");
		
		return view;
	}
}
