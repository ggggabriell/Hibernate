/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import Entidades.Editora;
import javax.persistence.*;

/**
 *
 * @author gabri
 */

public class EditoraMet {
    private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("HIBERNATE");
    private static EntityManager em= emf.createEntityManager();
    
    
     public void criar(Editora edt){
        edt= new Editora(); 
        em.getTransaction().begin();
        em.persist(edt);
        em.getTransaction().commit();
    }
    
    public void excluir(Editora edt, int id){
        edt= em.find(Editora.class, id);
        em.getTransaction().begin();
        em.remove(edt);
        em.getTransaction().commit();
    }
    
    public void alterar(Editora edt, int id){
        edt= new Editora();
        em.getTransaction().begin();
        em.merge(edt);
        em.getTransaction().commit();
    }
    
    public void ler(Editora edt, int id){
        edt= em.find(Editora.class, id);
        System.out.println("Editora Código:"+edt.getCodigo_editora()+"\n"+"Nome: "+ edt.getNome_editora()+"\n"+"Livro: "+ edt.getLivro()+"\n");
          }
}
