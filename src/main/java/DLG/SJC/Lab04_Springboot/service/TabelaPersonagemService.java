package DLG.SJC.Lab04_Springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DLG.SJC.Lab04_Springboot.entity.TabelaPersonagem;
import DLG.SJC.Lab04_Springboot.repository.TabelaPersonagemRepository;

@Service
public class TabelaPersonagemService implements ITabelaPersonagem {

    @Autowired
    private TabelaPersonagemRepository tabelaRepository;

    //Cadastro
    public TabelaPersonagem novaTabela(TabelaPersonagem tabela) {
        if(tabela == null ||
                tabela.getnome() == null ||
                tabela.getclasse() == null) {
            throw new IllegalArgumentException("Nome e classe inválidos!");
        }
        
        return tabelaRepository.save(tabela);
    }



    //Listar
    public List<TabelaPersonagem> buscarTodos() {
        return tabelaRepository.findAll();
    }

    //BuscarPorId
    public TabelaPersonagem buscarPorId(Long id) {
        Optional<TabelaPersonagem> tabelarr = tabelaRepository.findById(id);
        if(tabelarr.isPresent()) {
            return tabelarr.get();
        }
        throw new IllegalArgumentException("Id inválido!");
    }

    
}