/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateprojeto;

import Entidades.*;
import java.util.List;
import metodos.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author gabri
 */
public class HibernateProjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         EntityManagerFactory emf= Persistence.createEntityManagerFactory("HibernateProjetoPU");
        EntityManager em= emf.createEntityManager();
        
        
     //CONSULTA HQL
     String Consulta="from Autores autor";
     Query q= em.createQuery(Consulta);
     List<Object> resultado= q.getResultList();
     
     for(int i=0; i<= resultado.size()-1; i++){
         Autores autor=(Autores)resultado.get(i);
         System.out.println("SQL: "+ autor.codigo_autor);
     }
        
      
    
   //POPULAR TABELA AUTORES   
  
    Autores aut1= new Autores();
    AutoresMet autMet1= new AutoresMet();
    aut1.codigo_autor=1;
    aut1.nome_autor="Clarice Linspector";
    aut1.email="claricelinspecotr@gmaiil.com"; 
    autMet1.criar(aut1);
        
    Autores aut2= new Autores();
    AutoresMet autMet2= new AutoresMet();
    aut2.codigo_autor=2;
    aut2.nome_autor="Carlos Drummond";
    aut2.email="carlosdrummond@gmail.com"; 
    autMet2.criar(aut2);
    
    Autores aut3= new Autores();
    AutoresMet autMet3= new AutoresMet();
    aut3.codigo_autor=3;
    aut3.nome_autor="Fernando Pessoa";
    aut3.email="fernandopessoa@gmail.com"; 
    autMet3.criar(aut3);
    
    Autores aut4= new Autores();
    AutoresMet autMet4= new AutoresMet();
    aut4.codigo_autor=4;
    aut4.nome_autor="Machado de Assis";
    aut4.email=""; 
    autMet4.criar(aut4);
    
    Autores aut5= new Autores();
    AutoresMet autMet5= new AutoresMet();
    aut5.codigo_autor=5;
    aut5.nome_autor="William Shakespeare";
    aut5.email="william@gmail.com"; 
    autMet5.criar(aut5);
    
    
    
    //POPULAR TABELA EDITORA
    Editora edt1= new Editora();
    EditoraMet edtMet1= new EditoraMet();
    edt1.codigo_editora=1;
    edt1.nome_editora="Rocco";
    edt1.Livro=1;
    edtMet1.criar(edt1);
    
    Editora edt2= new Editora();
    EditoraMet edtMet2= new EditoraMet();
    edt2.codigo_editora=2;
    edt2.nome_editora="COMPANHIA DAS LETRAS";
    edt2.Livro=2;
    edtMet2.criar(edt2);
    
    Editora edt3= new Editora();
    EditoraMet edtMet3= new EditoraMet();
    edt3.codigo_editora=3;
    edt3.nome_editora="Principis - Livraria Livrossinos";
    edt3.Livro=3;
    edtMet3.criar(edt3);
    
    Editora edt4= new Editora();
    EditoraMet edtMet4= new EditoraMet();
    edt4.codigo_editora=4;
    edt4.nome_editora="Oxford University Press";
    edt4.Livro=4;
    edtMet4.criar(edt4);
    
    Editora edt25= new Editora();
    EditoraMet edtMet25= new EditoraMet();
    edt25.codigo_editora=25;
    edt25.nome_editora="W. W. Norton & Company";
    edt25.Livro=5;
    edtMet25.criar(edt25);
    
    
    
    //POPULAR TABELA LIVROS
    Livros lv1= new Livros();
    LivrosMet lvMet1= new LivrosMet();
    lv1.Isbn=1;
    lv1.edicao="1";
    lv1.custo=100;
    lv1.titulo="A hora da estrela";
    lv1.editora=1;
    lv1.autor=1;
    lvMet1.criar(lv1);
    
    Livros lv2= new Livros();
    LivrosMet lvMet2= new LivrosMet();
    lv2.Isbn=2;
    lv2.edicao="2";
    lv2.custo=150;
    lv2.titulo="A rosa do povo";
    lv2.editora=2;
    lv2.autor=2;
    lvMet2.criar(lv2);
    
     Livros lv3= new Livros();
    LivrosMet lvMet3= new LivrosMet();
    lv3.Isbn=3;
    lv3.edicao="3";
    lv3.custo=200;
    lv3.titulo="Livro do desassossego";
    lv3.editora=3;
    lv3.autor=3;
    lvMet3.criar(lv3);
    
     Livros lv4= new Livros();
    LivrosMet lvMet4= new LivrosMet();
    lv4.Isbn=4;
    lv4.edicao="4";
    lv4.custo=250;
    lv4.titulo="Memórias Póstumas de Brás Cubas";
    lv4.editora=4;
    lv4.autor=4;
    lvMet4.criar(lv4);
    
    Livros lv5= new Livros();
    LivrosMet lvMet5= new LivrosMet();
    lv5.Isbn=25;
    lv5.edicao="25";
    lv5.custo=300;
    lv5.titulo="The Norton Shakespeare";
    lv5.editora=25;
    lv5.autor=5;
    lvMet5.criar(lv5);
    
    try{
    em.persist(aut1);
    em.persist(aut2);
    em.persist(autMet3);
    em.persist(autMet4);
    em.persist(autMet5);
    
    em.persist(edtMet1);
    em.persist(edtMet2);
    em.persist(edtMet3);
    em.persist(edtMet4);
    em.persist(edtMet25);
    
    em.persist(lvMet1);
    em.persist(lvMet2);
    em.persist(lvMet3);
    em.persist(lvMet4);
    em.persist(lvMet5);

    em.getTransaction().commit();     
    }catch(Exception e){
        em.getTransaction().rollback();
    
    }
    
    
   }
   
}
