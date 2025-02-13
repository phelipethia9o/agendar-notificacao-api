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
<<<<<<< HEAD

=======
    private String mensagem;
>>>>>>> feature/busca_agendamentos

    private LocalDateTime dataHoraEnvio;
    private LocalDateTime dataHoraAgendamento;
    private LocalDateTime dataHoraModificacao;

    private StatusNotificacaoEnum statusNotificacao;

<<<<<<< HEAD
    private String mensagem;
=======

>>>>>>> feature/busca_agendamentos

    @PrePersist
    private void prePersist(){

        dataHoraAgendamento = LocalDateTime.now();
<<<<<<< HEAD
        statusNotificacao = StatusNotificacaoEnum.CANCELADO;
=======
        statusNotificacao = StatusNotificacaoEnum.AGENDADO;
>>>>>>> feature/busca_agendamentos

    }
}
