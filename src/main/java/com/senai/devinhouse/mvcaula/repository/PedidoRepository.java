package com.senai.devinhouse.mvcaula.repository;

import com.senai.devinhouse.mvcaula.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}

