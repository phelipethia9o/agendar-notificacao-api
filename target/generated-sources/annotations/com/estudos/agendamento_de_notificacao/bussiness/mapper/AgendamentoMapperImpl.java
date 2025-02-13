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
    date = "2025-02-12T19:49:47-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class AgendamentoMapperImpl implements AgendamentoMapper {

    @Override
    public Agendamento paraEntity(AgendamentoRecord agendamento) {
        if ( agendamento == null ) {
            return null;
        }

        Agendamento agendamento1 = new Agendamento();

        return agendamento1;
    }

    @Override
    public AgendamentoRecordOut paraOut(Agendamento agendamento) {
        if ( agendamento == null ) {
            return null;
        }

        Long id = null;
        String emailDestinatario = null;
        String telefoneDestinatario = null;
        String mensagem = null;
        LocalDateTime dataHoraEnvio = null;
        StatusNotificacaoEnum statusNotificacao = null;

        AgendamentoRecordOut agendamentoRecordOut = new AgendamentoRecordOut( id, emailDestinatario, telefoneDestinatario, mensagem, dataHoraEnvio, statusNotificacao );

        return agendamentoRecordOut;
    }
}
