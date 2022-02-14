package br.com.east.eastComputer.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.east.eastComputer.models.cpu;
import br.com.east.eastComputer.repository.CpuRepository;





@Controller
public class CpuController {
	
	@Autowired
	private CpuRepository cr;
	
	//entrar no form de cadastro de cpu
	
	@RequestMapping(value = "/cadastrarCpu", method=RequestMethod.GET)
	public ModelAndView form() {
		ModelAndView mv = new ModelAndView("produtos/CadastroCpu");
		return mv;
		
	}
	
	//cadastrar cpu
	@RequestMapping(value = "/cadastrarCpu", method=RequestMethod.POST)
	public String form(@Valid cpu cpu, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
		attributes.addFlashAttribute("mensagem",result.getAllErrors());
		return "redirect:/cadastrarCpu";
		}
		cr.save(cpu);
		attributes.addFlashAttribute("mensagem","cpu cadastrada com sucesso.");
		return "redirect:/cadastrarCpu";
	}
	
	//listar cpu
	
	@RequestMapping("/cpu")
	public ModelAndView listaCpu() {
		ModelAndView mv = new ModelAndView("produtos/listaCpu");
		Iterable<cpu> cpus = cr.findAll();
		mv.addObject("cpus", cpus);
		return mv;
	}
	
	//por nome da cpu
	@RequestMapping(value="/produtos/cpu/{codigo}")
	public ModelAndView detalhesCpu(@PathVariable("codigo") String nome) {
		cpu cpu=cr.findByNome(nome);
		ModelAndView mv = new ModelAndView("produtos/detalhesCpu");
		mv.addObject("cpu",cpu);
		
		
		return mv;
		
	}
	
	//deletar cpu
	@RequestMapping(value="/deletarCpu")
	public String deletarCpu(long id) {
		cpu cpu=cr.findByIdcpu(id);
		cr.delete(cpu);
		return "redirect:/cpu";
	}
	

	//chamar formulario edicao da cpu
@RequestMapping(value= "/editar-cpu", method=RequestMethod.GET)
public ModelAndView editarCpu(long id) {
	cpu cpu= cr.findByIdcpu(id);
	ModelAndView mv= new ModelAndView("produtos/update-cpu");
	mv.addObject("cpu",cpu);
	return mv;
	
}
		//atualizar cpu
@RequestMapping(value="/editar-cpu", method=RequestMethod.POST)
public String updateCpu(@Valid cpu cpu, BindingResult result,RedirectAttributes attributes) {
	cr.save(cpu);
	attributes.addFlashAttribute("mensagem","cpu alterada com sucesso.");
	long codigoLong=cpu.getIdcpu();
	String codigo = "" +codigoLong;
	return "redirect:/cpu";
	
}

}
