package com.estudos.agendamento_de_notificacao.controller.dto.in;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;

public record AgendamentoRecord(String emailDestinatario,
                                String telefoneDestinatario,
                                @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
                                LocalDateTime dataHoraEnvio,
                                String mensagem){

}
