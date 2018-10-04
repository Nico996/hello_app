package com.globant.cartService.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.globant.cartService.entities.Item;

@Repository(value = "itemDao")

public class JPAItemDao implements ItemDao {
	
	 private EntityManager em = null;

	    /*
	     * Sets the entity manager.
	     */
	    @PersistenceContext
	    public void setEntityManager(EntityManager em) {
	        this.em = em;
	    }

	    @Transactional(readOnly = true)
	    @SuppressWarnings("unchecked")
	    public List<Item> getItemList() {
	        return em.createQuery("select i from Item i order by i.id").getResultList();
	    }

	    @Transactional(readOnly = false)
	    public void saveItem(Item item) {
	        em.merge(item);
	    }

}
