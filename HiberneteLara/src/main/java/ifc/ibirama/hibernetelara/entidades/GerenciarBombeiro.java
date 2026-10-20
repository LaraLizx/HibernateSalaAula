/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.hibernetelara.entidades;

import ifc.ibirama.hibernetelara.util.HibernateUtil;
import java.time.LocalDate;
import java.time.Month;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author aluno
 */
public class GerenciarBombeiro {
    public static void main(String[] args) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        System.out.println("conexão estabelecida");
        Bombeiro bombeiro01 = new Bombeiro();
        bombeiro01.setCpf("00000000011");
        bombeiro01.setNome("Sicrano de Oliveira");
        bombeiro01.setNomeGuerra("Oliveira");
        bombeiro01.setDataNascimento(LocalDate.of(2000, Month.NOVEMBER, 12));
        
        Transaction transacao = null;
        try{
            transacao = sessao.beginTransaction();
            sessao.persist(bombeiro01);
            transacao.commit();
            System.out.println("Bombeiro salvo");
            
        } catch(Exception erro){
        if(transacao != null){
            transacao.rollback();
        }
        }
        
        
        Bombeiro bombeiro = new Bombeiro();
        bombeiro.setCpf ("12345678");
        bombeiro.setDataNascimento (LocalDate.of(1990,2,2));
        bombeiro.setNome("Siclano Filho");
        bombeiro.setNomeGuerra("Silva");
        
        try{
            transacao = sessao.beginTransaction();
            
            sessao.persist(bombeiro);
            transacao.commit();
            System.out.println("Bombeiro 'Salvo'");
            sessao.close();
            
        }catch(Exception e){
            if (transacao != null ) {
                transacao.rollback();
            }
        }
        
        HibernateUtil.shutdown();
    }
}
