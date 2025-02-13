package com.estudos.agendamento_de_notificacao.controller;

import com.estudos.agendamento_de_notificacao.bussiness.AgendamentoService;
import com.estudos.agendamento_de_notificacao.controller.dto.in.AgendamentoRecord;
import com.estudos.agendamento_de_notificacao.controller.dto.out.AgendamentoRecordOut;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/agendamento")
public class AgendamentoController {

    private final AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<AgendamentoRecordOut> gravarAgendamentos(@RequestBody AgendamentoRecord agendamento){
        return ResponseEntity.ok(agendamentoService.gravarAgendamento(agendamento));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AgendamentoRecordOut> buscarAgendamentoPorId(@PathVariable("id") Long id){
        return ResponseEntity.ok(agendamentoService.buscarAgendamentoPorId(id));
    }

    @DeleteMapping("/{id}")
    public   ResponseEntity<String> cancelarAgendamento(@PathVariable("id") Long id) {
        agendamentoService.cancelarAgendamento(id);
        return ResponseEntity.ok("Status atualizado com sucesso!");
    }




}
