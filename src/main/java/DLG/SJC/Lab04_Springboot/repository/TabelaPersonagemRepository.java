package DLG.SJC.Lab04_Springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import DLG.SJC.Lab04_Springboot.entity.TabelaPersonagem;


//É no repository que sera evetua as consultas no banco

public interface TabelaPersonagemRepository extends JpaRepository <TabelaPersonagem,Long> {
    

}
