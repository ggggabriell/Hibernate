/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import javax.persistence.*;
import Entidades.Autores;
/**
 *
 * @author gabri
 */
public class AutoresMet {
    private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("HIBERNATE");
    private static EntityManager em= emf.createEntityManager();
    
    
    public void criar(Autores autor){
        autor= new Autores(); 
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
    }
    
    public void excluir(Autores autor, int id){
        autor= em.find(Autores.class, id);
        em.getTransaction().begin();
        em.remove(autor);
        em.getTransaction().commit();
    }
    
    public void alterar(Autores autor, int id){
        autor= new Autores();
        em.getTransaction().begin();
        em.merge(autor);
        em.getTransaction().commit();
    }
    
    public void ler(Autores autor, int id){
        autor= em.find(Autores.class, id);
        System.out.println("Autor Código:"+autor.getCodigo_autor()+"\n"+"Nome: "+ autor.getNome_autor()+"\n"+"Email: "+ autor.getEmail()+"\n");
          }
  
}
