package DLG.SJC.Lab04_Springboot.service;

import java.util.List;

import DLG.SJC.Lab04_Springboot.entity.TabelaPersonagem;

public interface ITabelaPersonagem {


    public List<TabelaPersonagem> buscarTodos();

    public TabelaPersonagem buscarPorId(Long id);
    
    public TabelaPersonagem novaTabela(TabelaPersonagem tabela);
    
}
