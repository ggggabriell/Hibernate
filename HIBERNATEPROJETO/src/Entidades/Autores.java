/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author gabri
 */
@Entity
@Table(name="Autores")
public class Autores {
     @Id
       @GeneratedValue(strategy=GenerationType.IDENTITY)
       public int codigo_autor;

   
       @Column(name="nome", length=100,nullable=false)
       public String nome_autor;
       
       @Column(name="email")
       public String email;

    public int getCodigo_autor() {
        return codigo_autor;
    }

    public void setCodigo_autor(int codigo_autor) {
        this.codigo_autor = codigo_autor;
    }

    public String getNome_autor() {
        return nome_autor;
    }

    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
     
     
    @OneToMany(
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    @JoinColumn(name = "Email")
    public List<Email> email = new ArrayList();

    
    
  
   
 }
    

