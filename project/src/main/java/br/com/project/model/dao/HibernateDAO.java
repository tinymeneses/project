/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.model.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;

/**
 *
 * @author Patrícia Meneses
 */
public class HibernateDAO<T> implements InterfaceDAO<T>, Serializable {

    //atributos 3
    private static final long serialVersionUID = 1L;
    private Class<T> classe;
    private Session session;

    public HibernateDAO(Class<T> classe, Session session) {
        super();
        this.classe = classe;
        this.session = session;
    }

    @Override
    public void save(T entity) {
        session.save(entity);
    }

    @Override
    public void update(T entity) {
        session.update(entity);
    }

    @Override
    public void remove(T entity) {
        session.delete(entity);
    }

    @Override
    public void merge(T entity) {
        session.merge(entity);
    }

    @Override
    public T getEntity(Serializable id) {
        T entity = (T) session.get(classe, id);
        return entity;
    }

    @Override
    public T getentityByDetachedCriteria(DetachedCriteria criteria) {
        T entity = (T) criteria.getExecutableCriteria(session).uniqueResult();
        return entity;
    }

    @Override
    public List<T> getListByDetachedCriteria(DetachedCriteria criteria) {
        return criteria.getExecutableCriteria(session).list();
    }
    
    
    @Override
    public List<T> getEntities() {
        List<T> entities = (List<T>)session.createCriteria(classe).list();
        return entities;
    }

    
    
}
