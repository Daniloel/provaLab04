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

import DLG.SJC.Lab04_Springboot.entity.TabelaTrabalho;
import DLG.SJC.Lab04_Springboot.service.ITabelaTrabalhoService;

@RestController
@CrossOrigin
@RequestMapping (value = "/trabalho")
public class TabelaTrabalhoController {

    @Autowired
    private ITabelaTrabalhoService service;

    @GetMapping
    public List<TabelaTrabalho> buscarTodos() {
        return service.buscarTodos();
    }

    @PostMapping
    public TabelaTrabalho novoTabela(@RequestBody TabelaTrabalho tabela) {
    return service.novaTabela(tabela);
    }
   
    @GetMapping (value ="/id/{tabela}")
    public TabelaTrabalho buscarPorId(@PathVariable("tabela") Long id) {
        return service.buscarPorId(id);
    }


    
}