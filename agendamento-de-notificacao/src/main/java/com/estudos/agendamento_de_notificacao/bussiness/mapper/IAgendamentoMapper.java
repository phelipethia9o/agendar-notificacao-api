package com.estudos.agendamento_de_notificacao.bussiness.mapper;

import com.estudos.agendamento_de_notificacao.controller.dto.in.AgendamentoRecord;
import com.estudos.agendamento_de_notificacao.controller.dto.out.AgendamentoRecordOut;
import com.estudos.agendamento_de_notificacao.infrastructure.entities.Agendamento;
import org.mapstruct.Mapper;
import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IAgendamentoMapper {

    Agendamento paraEntity(AgendamentoRecord agendamento);

    AgendamentoRecordOut paraOut(Agendamento agendamento);
}

