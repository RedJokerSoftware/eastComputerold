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

import br.com.east.eastComputer.models.pedido;
import br.com.east.eastComputer.models.produto;
import br.com.east.eastComputer.repository.PedidoRepository;
import br.com.east.eastComputer.repository.ProdutoRepository;



@Controller
public class PedidoController {
	@Autowired
	private PedidoRepository pedidorep;
	@Autowired
	private ProdutoRepository produtorep;
	
	//ir para o carrinho de compras
	
	@RequestMapping(value = "/fazerPedido", method=RequestMethod.GET)
	public String form() {
		
		return "pedido/formPedido";
	}
	
	//cadastrar um pedido
	@RequestMapping(value = "/fazerPedido", method=RequestMethod.POST)
	public String form(@Valid pedido pedido, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
		attributes.addFlashAttribute("mensagem","Erro nos campos.");
		return "redirect:/fazerPedido";
		}
		pedidorep.save(pedido);
		attributes.addFlashAttribute("mensagem","pronto. Seu pedido foi cadastrado.");
		return "redirect:/pedido/pedidoFeito";
	}

}
