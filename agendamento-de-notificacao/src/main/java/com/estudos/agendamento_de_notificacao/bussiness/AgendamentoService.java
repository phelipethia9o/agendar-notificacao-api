package com.estudos.agendamento_de_notificacao.bussiness;


import com.estudos.agendamento_de_notificacao.bussiness.mapper.IAgendamentoMapper;
import com.estudos.agendamento_de_notificacao.controller.dto.in.AgendamentoRecord;
import com.estudos.agendamento_de_notificacao.controller.dto.out.AgendamentoRecordOut;

import com.estudos.agendamento_de_notificacao.infrastructure.exceptions.NotFoundException;
import com.estudos.agendamento_de_notificacao.infrastructure.repositories.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
                        () -> new NotFoundException("Id não encontrado!")));

    }



}
