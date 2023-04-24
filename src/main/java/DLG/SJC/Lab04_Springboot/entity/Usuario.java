package DLG.SJC.Lab04_Springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="usr_usuario")
public class Usuario {
   
@Column(name ="usr_id")    
private Long id;

@Column(name ="usr_nome")
private String nome;

@Column(name ="usr_senha")
private int senha;

public Usuario(String nome, int senha) {
    this.nome = nome;
    this.senha = senha;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getSenha() {
    return senha;
}

public void setSenha(int senha) {
    this.senha = senha;
}

public Usuario(){
    //Não faz nada mas precios dela pois tem outro metodo contrutor com o metodo padrao alterado
}


}

