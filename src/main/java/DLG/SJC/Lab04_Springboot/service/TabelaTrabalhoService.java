package DLG.SJC.Lab04_Springboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DLG.SJC.Lab04_Springboot.entity.TabelaTrabalho;
import DLG.SJC.Lab04_Springboot.repository.TabelaTrabalhoRepository;

import java.util.Optional;



@Service
public class TabelaTrabalhoService implements ITabelaTrabalhoService {

    @Autowired
    private TabelaTrabalhoRepository tabelaRepository;

    //Cadastro
    public TabelaTrabalho novaTabela(TabelaTrabalho tabela) {
        if(tabela == null ||
                tabela.getTraTitulo() == null ||
                tabela.getTraId() == null) {
            throw new IllegalArgumentException("Nome e senha inválidos!");
        }
        
        return tabelaRepository.save(tabela);
    }



    //Listar
    public List<TabelaTrabalho> buscarTodos() {
        return tabelaRepository.findAll();
    }

    //BuscarPorId
    public TabelaTrabalho buscarPorId(Long id) {
        Optional<TabelaTrabalho> tabelarr = tabelaRepository.findById(id);
        if(tabelarr.isPresent()) {
            return tabelarr.get();
        }
        throw new IllegalArgumentException("Id inválido!");
    }

    
}
