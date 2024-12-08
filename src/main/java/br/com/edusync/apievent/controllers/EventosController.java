package br.com.edusync.apievent.controllers;

import br.com.edusync.apievent.models.Evento;
import br.com.edusync.apievent.services.EventoService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/eventos")
@RestController
public class EventosController {

    @Autowired
    private EventoService service;

    @PostMapping(value = "/novo")
    @Operation(summary = "NOVO EVENTO", description = "ADICIONA UM NOVO EVENTO")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK - EVENTO ENCONTRADO"),
            @ApiResponse(responseCode = "404", description = "ERRO - EVENTO NÃO ENCONTRADO"),
            @ApiResponse(responseCode = "500", description = "ERRO INESPERADO")
    })
    public ResponseEntity novoEvento(@RequestBody Evento evento) {
        service.adicionar(evento);
        return new ResponseEntity(evento, HttpStatus.CREATED);
    }

    @GetMapping
    @Operation(summary = "LISTA TODOS OS EVENTOS", description = "API QUE LISTA TODOS OS EVENTOS, SEM APLICAR NENHUM FILTRO")
    public ResponseEntity listartodos() {
        return new ResponseEntity(service.listarTudo(), HttpStatus.OK);
    }

    @GetMapping(value = "/{codigo}")
    @Operation(summary = "OBTER EVENTO", description = "DADO UM CÓDIGO DO EVENTO, RECUPERA AS SUAS INFORMAÇÕES")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK - EVENTO ENCONTRADO"),
            @ApiResponse(responseCode = "404", description = "ERRO - EVENTO NÃO ENCONTRADO"),
            @ApiResponse(responseCode = "500", description = "ERRO INESPERADO")
    })
    public ResponseEntity listarporcodigo(@PathVariable Integer codigo) {
         return new ResponseEntity(service.buscarPorCogido(codigo), HttpStatus.OK);
    }

    @PutMapping(value = "/{codigo}")
    @Operation(summary = "ALTERAR", description = "ALTERA DADOS DO EVENTO")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK - EVENTO ENCONTRADO"),
            @ApiResponse(responseCode = "404", description = "ERRO - EVENTO NÃO ENCONTRADO"),
            @ApiResponse(responseCode = "500", description = "ERRO INESPERADO")
    })
    public ResponseEntity alterar(@PathVariable Integer codigo, @RequestBody Evento evento) {
        service.update(codigo, evento);
        return new ResponseEntity(evento, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{codigo}")
    @Operation(summary = "REMOVER", description = "DELETA O EVENTO SELECIONADO")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK - EVENTO ENCONTRADO"),
            @ApiResponse(responseCode = "404", description = "ERRO - EVENTO NÃO ENCONTRADO"),
            @ApiResponse(responseCode = "500", description = "ERRO INESPERADO")
    })
    public ResponseEntity remover (@PathVariable Integer codigo) {
        service.remover(codigo);
        return new ResponseEntity(HttpStatus.OK);
    }


}
