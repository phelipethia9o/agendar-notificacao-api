package com.estudos.agendamento_de_notificacao.bussiness;


import com.estudos.agendamento_de_notificacao.bussiness.mapper.IAgendamentoMapper;
import com.estudos.agendamento_de_notificacao.controller.dto.in.AgendamentoRecord;
import com.estudos.agendamento_de_notificacao.controller.dto.out.AgendamentoRecordOut;

import com.estudos.agendamento_de_notificacao.infrastructure.entities.Agendamento;
import com.estudos.agendamento_de_notificacao.infrastructure.enums.StatusNotificacaoEnum;
import com.estudos.agendamento_de_notificacao.infrastructure.exceptions.NotFoundException;
import com.estudos.agendamento_de_notificacao.infrastructure.repositories.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@RequiredArgsConstructor
@Service
public class AgendamentoService {

    private final AgendamentoRepository repository;
    private final IAgendamentoMapper agendamentoMapper;

    public AgendamentoRecordOut gravarAgendamento(AgendamentoRecord agendamento){
        return agendamentoMapper.paraOut(
                repository.save(
                        agendamentoMapper.paraEntity(agendamento)));
    }

    public AgendamentoRecordOut buscarAgendamentoPorId(Long id){
        return agendamentoMapper.paraOut(
                repository.findById(id).orElseThrow(
                        () -> new NotFoundException("Agendamento não encontrado!")));

    }

    public AgendamentoRecordOut cancelarAgendamento(Long id) {
        Agendamento agendamento = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Agendamento não encontrado!"));

        agendamento.setDataHoraModificacao(LocalDateTime.now());
        agendamento.setStatusNotificacao(StatusNotificacaoEnum.CANCELADO);

        repository.save(agendamento);

        return agendamentoMapper.paraOut(agendamento);
    }

}
