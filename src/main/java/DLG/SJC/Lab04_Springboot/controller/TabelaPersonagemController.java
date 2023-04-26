package DLG.SJC.Lab04_Springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DLG.SJC.Lab04_Springboot.entity.TabelaPersonagem;
import DLG.SJC.Lab04_Springboot.service.ITabelaPersonagem;

@RestController
@CrossOrigin
@RequestMapping (value = "/personagem")
public class TabelaPersonagemController {

    @Autowired
    private ITabelaPersonagem service;

    @GetMapping(value = "/todos")
    public List<TabelaPersonagem> buscarTodos() {
        return service.buscarTodos();
    }

    @PostMapping (value ="/cadastro")
    public TabelaPersonagem novoTabela(@RequestBody TabelaPersonagem tabela) {
    return service.novaTabela(tabela);
    }
   
    @GetMapping (value = "/listar/{per_id}")
    public TabelaPersonagem buscarPorId(@PathVariable("per_id") Long id) {
        return service.buscarPorId(id);
    }


    
}