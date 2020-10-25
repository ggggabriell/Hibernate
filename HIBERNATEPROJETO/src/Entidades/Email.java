/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.persistence.*;
/**
 *
 * @author gabri
 */

@Entity
@Table(name="Email")
public class Email {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int Cod_Email;
    
    @Column(name="Email")
    public String Email; 
    
    @Column(name="codigo_autor")
    public int codigo_autor;

    public int getCod_Email() {
        return Cod_Email;
    }

    public void setCod_Email(int Cod_Email) {
        this.Cod_Email = Cod_Email;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getCodigo_autor() {
        return codigo_autor;
    }

    public void setCodigo_autor(int codigo_autor) {
        this.codigo_autor = codigo_autor;
    }
    
}
