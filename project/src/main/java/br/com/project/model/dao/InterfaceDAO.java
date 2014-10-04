/*
 ESSA CLASSE SERÁ USADA POR TODAS AS CLASSES QUE ACESSAREM O BANCO DE DADOS
ENTRETANTO ESSA CLASSE SERÁ GENERICA, POR ISSO SERÁ UMA SÓ PARA TODAS
 */

package br.com.project.model.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;

/**
 *
 * @author Patrícia Meneses
 */
public interface InterfaceDAO<T> {
  
    //METODOS
    void save (T entity);
    void update (T entity);
    void remove (T entity);
    void merge (T entity);
    T getEntity (Serializable id);
    T getentityByDetachedCriteria(DetachedCriteria criteria);
    List<T> getEntities();
    List<T> getListByDetachedCriteria(DetachedCriteria criteria);
    
    
}
