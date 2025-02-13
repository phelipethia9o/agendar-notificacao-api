package com.estudos.agendamento_de_notificacao.bussiness.mapper;

import com.estudos.agendamento_de_notificacao.controller.dto.in.AgendamentoRecord;
import com.estudos.agendamento_de_notificacao.controller.dto.out.AgendamentoRecordOut;
import com.estudos.agendamento_de_notificacao.infrastructure.entities.Agendamento;
import com.estudos.agendamento_de_notificacao.infrastructure.enums.StatusNotificacaoEnum;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-12T20:14:57-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class IAgendamentoMapperImpl implements IAgendamentoMapper {

    @Override
    public Agendamento paraEntity(AgendamentoRecord agendamento) {
        if ( agendamento == null ) {
            return null;
        }

        Agendamento.AgendamentoBuilder agendamento1 = Agendamento.builder();

        agendamento1.emailDestinatario( agendamento.emailDestinatario() );
        agendamento1.telefoneDestinatario( agendamento.telefoneDestinatario() );
        agendamento1.dataHoraEnvio( agendamento.dataHoraEnvio() );

        return agendamento1.build();
    }

    @Override
    public AgendamentoRecordOut paraOut(Agendamento agendamento) {
        if ( agendamento == null ) {
            return null;
        }

        Long id = null;
        String emailDestinatario = null;
        String telefoneDestinatario = null;
        LocalDateTime dataHoraEnvio = null;
        StatusNotificacaoEnum statusNotificacao = null;

        id = agendamento.getId();
        emailDestinatario = agendamento.getEmailDestinatario();
        telefoneDestinatario = agendamento.getTelefoneDestinatario();
        dataHoraEnvio = agendamento.getDataHoraEnvio();
        statusNotificacao = agendamento.getStatusNotificacao();

        String mensagem = null;

        AgendamentoRecordOut agendamentoRecordOut = new AgendamentoRecordOut( id, emailDestinatario, telefoneDestinatario, mensagem, dataHoraEnvio, statusNotificacao );

        return agendamentoRecordOut;
    }
}
