package DLG.SJC.Lab04_Springboot.service;

import java.util.List;

import DLG.SJC.Lab04_Springboot.entity.TabelaTrabalho;

public interface ITabelaTrabalhoService {

    public List<TabelaTrabalho> buscarTodos();

    public TabelaTrabalho buscarPorId(Long id);
    
    public TabelaTrabalho novaTabela(TabelaTrabalho tabela);
    
}
