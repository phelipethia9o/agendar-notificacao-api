package com.estudos.agendamento_de_notificacao.controller.dto.out;

import com.estudos.agendamento_de_notificacao.infrastructure.enums.StatusNotificacaoEnum;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record AgendamentoRecordOut(Long id,
                                   String emailDestinatario,
                                   String telefoneDestinatario,
                                   String mensagem,
                                   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
                                    LocalDateTime dataHoraEnvio,
                                   StatusNotificacaoEnum statusNotificacao) {
}
