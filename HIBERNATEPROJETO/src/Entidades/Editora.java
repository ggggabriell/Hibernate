/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.persistence.CascadeType;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 *
 * @author gabri
 */
@Entity
@Table(name="Editora")
public class Editora {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="codigo")
       public int codigo_editora;

    @Column(name="nome", length=100,nullable=false)
       public String nome_editora;
    
    @Column(name="Livro")
    public int Livro;

    public int getCodigo_editora() {
        return codigo_editora;
    }

    public void setCodigo_editora(int codigo_editora) {
        this.codigo_editora = codigo_editora;
    }

    public String getNome_editora() {
        return nome_editora;
    }

    public void setNome_editora(String nome_editora) {
        this.nome_editora = nome_editora;
    }
    
    public int getLivro() {
        return Livro;
    }

    public void setLivro(int Livro) {
        this.Livro = Livro;
    }
    
    public Editora(){}
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Livro")
    private Livros Livro;
  
    
}
