package com.estudos.agendamento_de_notificacao.infrastructure.entities;


import com.estudos.agendamento_de_notificacao.infrastructure.enums.StatusNotificacaoEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Table(name = "agendamento")
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String emailDestinatario;
    private String telefoneDestinatario;
    private String mensagem;

    private LocalDateTime dataHoraEnvio;
    private LocalDateTime dataHoraAgendamento;
    private LocalDateTime dataHoraModificacao;
    private StatusNotificacaoEnum statusNotificacao;


    @PrePersist
    private void prePersist(){

        dataHoraAgendamento = LocalDateTime.now();
        statusNotificacao = StatusNotificacaoEnum.AGENDADO;


    }
}
