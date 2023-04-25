package DLG.SJC.Lab04_Springboot.entity;



import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table (name ="tra_tabela")
public class TabelaTrabalho {
    
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name ="tra_id")
 private Long traId;

 @Column (name ="tra_titulo")
 private String traTitulo;

 @Column (name="tra_descricao")
 private String traDescricao;

 @Column (name ="tra_grupo")
 private String traGrupo;

 @Column (name ="tra_nota")
 private int traNota;
 
 @Column (name ="tra_data_hora_entrega")
 private LocalDateTime dataHora;

 @Column (name ="tra_Justificativa")
 private String traJustificativa ;





 //Metodo construstro pq criei um fora do padrão

 public TabelaTrabalho (){

 }


//Metodo construtor
 public TabelaTrabalho(Long traId, String traTitulo, String traDescricao, String traGrupo, int traNota, LocalDateTime dataHora,
        String traJustificativa) {
    this.traId = traId;
    this.traTitulo = traTitulo;
    this.traDescricao = traDescricao;
    this.traGrupo = traGrupo;
    this.traNota = traNota;
    this.dataHora = dataHora;
    this.traJustificativa = traJustificativa;
}

// Geters and seters
public Long getTraId() {
    return traId;
}

public void setTraId(Long traId) {
    this.traId = traId;
}

public String getTraTitulo() {
    return traTitulo;
}

public void setTraTitulo(String traTitulo) {
    this.traTitulo = traTitulo;
}

public String getTraDescricao() {
    return traDescricao;
}

public void setTraDescricao(String traDescricao) {
    this.traDescricao = traDescricao;
}

public String getTraGrupo() {
    return traGrupo;
}

public void setTraGrupo(String traGrupo) {
    this.traGrupo = traGrupo;
}

public int getTraNota() {
    return traNota;
}

public void setTraNota(int traNota) {
    this.traNota = traNota;
}

public LocalDateTime getDataHora() {
    return dataHora;
}

public void setDataHora(LocalDateTime dataHora) {
    this.dataHora = dataHora;
}

public String getTraJustificativa() {
    return traJustificativa;
}

public void setTraJustificativa(String traJustificativa) {
    this.traJustificativa = traJustificativa;
}


}