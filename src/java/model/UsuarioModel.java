/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Usuarios;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;


public class UsuarioModel {
    /*El metodo getALL obtiene todos los datos de la base de datos*/
    public List<Usuarios> getAll() {
        List<Usuarios> lst = new ArrayList<Usuarios>();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            lst = s.createCriteria(Usuarios.class).list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        return lst;
    }

    public void create(Usuarios p) {
        //El metodo create.- Crea un nuevo usuario 
        List<Usuarios> lst = new ArrayList<Usuarios>();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.save(p);
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }

    }

    public void remove(Usuarios p) {
        //El metodo remuve.- Borra un usuario 
        List<Usuarios> lst = new ArrayList<Usuarios>();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.delete(p);
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }

    }

    public void update(Usuarios p) {
        //El metodo update.- Actualiza un usuario 
        List<Usuarios> lst = new ArrayList<Usuarios>();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.update(p);
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }

    }

    public void edit(Usuarios p) {
        //El metodo update.- edita un usuario 
        List<Usuarios> lst = new ArrayList<Usuarios>();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.update(p);
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }

    }

    public Usuarios getUsuario(int id) {
        //El metodo getUsuaario.- Obtiene un usuario de la base de datos
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Usuarios p = new Usuarios();

        try {
            s.beginTransaction();
            p = (Usuarios) s.get(Usuarios.class, id);
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        return p;
    }
}
