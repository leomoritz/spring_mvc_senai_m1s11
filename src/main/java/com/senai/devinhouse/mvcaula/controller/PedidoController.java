package com.senai.devinhouse.mvcaula.controller;

import com.senai.devinhouse.mvcaula.model.Pedido;
import com.senai.devinhouse.mvcaula.service.PedidoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/pedido")
public class PedidoController {

    private PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @GetMapping("/todos")
    public String listaPedidos(Model model){
        List<Pedido> listaPedido = service.listaPedido();
        model.addAllAttributes(listaPedido);
        return "pedido";
    }

}
