/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 *
 * @author gabri
 */
@Entity
@Table(name="Livros")
public class Livros {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Isnb")
       public int Isbn;

    @Column(name="edicao", length=100,nullable=false)
       public String edicao;
    
    @Column(name="custo", length=100,nullable=false)
       public float custo;
    
    @Column(name="titulo", length=100,nullable=false)
       public String titulo;
    
    @Column(name="Editora", length=100, nullable=false)
       public int editora;
    
    @Column(name="Autor", length=100, nullable=false)
       public int autor;
    
    public int getIsbn() {
        return Isbn;
    }

    public void setIsbn(int Isbn) {
        this.Isbn = Isbn;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEditora() {
        return editora;
    }

    public void setEditora(int editora) {
        this.editora = editora;
    }

    public int getAutor() {
        return autor;
    }

    public void setAutor(int autor) {
        this.autor = autor;
    }
    
    @ManyToOne
    @JoinColumn(name="cod_editora")
    public Editora editoraa;
    
 
    @ManyToMany(mappedBy="cod_")
    public Autores autores;

   public Livros(){}
}
