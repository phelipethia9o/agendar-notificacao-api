package com.estudos.agendamento_de_notificacao.infrastructure.repositories;

import com.estudos.agendamento_de_notificacao.infrastructure.entities.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
