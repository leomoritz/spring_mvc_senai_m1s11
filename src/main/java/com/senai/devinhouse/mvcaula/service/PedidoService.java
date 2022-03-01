package com.senai.devinhouse.mvcaula.service;

import com.senai.devinhouse.mvcaula.model.Pedido;
import com.senai.devinhouse.mvcaula.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public List<Pedido> listaPedido(){
        return repository.findAll();
    }

    public Pedido adicionarPedido(Pedido pedido){
        return repository.save(pedido);
    }

}
