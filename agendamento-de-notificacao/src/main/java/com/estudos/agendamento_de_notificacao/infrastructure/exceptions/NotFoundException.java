package com.estudos.agendamento_de_notificacao.infrastructure.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
