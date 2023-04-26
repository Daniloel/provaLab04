package DLG.SJC.Lab04_Springboot.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="per_personagem")
public class TabelaPersonagem {
    
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name ="per_id")
 private Long id;

 @Column (name ="per_nome")
 private String nome;

 @Column (name="per_classe")
 private String classe;

 @Column (name ="per_data_hora_criacao")
 private LocalDateTime data_hora_criacao;

 @Column (name ="per_inteligencia")
 private Integer inteligencia;
 
 @Column (name ="per_forca")
 private Integer forca ;

 @Column (name ="per_saude")
 private Integer saude ;

 @Column (name ="per_taxa_critica")
 private Float taxa_critica ;

public TabelaPersonagem(Long per_id, String per_nome, String per_classe, LocalDateTime per_data_hora_criacao,
Integer per_inteligencia, Integer per_forca, Integer per_saude, Float per_taxa_critica) {
    this.id = id;
    this.nome = nome;
    this.classe = classe;
    this.data_hora_criacao = data_hora_criacao;
    this.inteligencia = inteligencia;
    this.forca = forca;
    this.saude = saude;
    this.taxa_critica = taxa_critica;
}

public TabelaPersonagem() {

};

public Long getid() {
    return id;
}

public void setid(Long id) {
    this.id = id;
}

public String getnome() {
    return nome;
}

public void setnome(String nome) {
    this.nome = nome;
}

public String getclasse() {
    return classe;
}

public void setclasse(String classe) {
    this.classe = classe;
}

public LocalDateTime getdata_hora_criacao() {
    return data_hora_criacao;
}

public void setdata_hora_criacao(LocalDateTime data_hora_criacao) {
    this.data_hora_criacao = data_hora_criacao;
}

public Integer getinteligencia() {
    return inteligencia;
}

public void setinteligencia(Integer inteligencia) {
    this.inteligencia = inteligencia;
}

public Integer getforca() {
    return forca;
}

public void setPer_forca(Integer forca) {
    this.forca = forca;
}

public Integer getPer_saude() {
    return saude;
}

public void setsaude(Integer saude) {
    this.saude = saude;
}

public Float gettaxa_critica() {
    return taxa_critica;
}

public void settaxa_critica(Float taxa_critica) {
    this.taxa_critica = taxa_critica;
}

}