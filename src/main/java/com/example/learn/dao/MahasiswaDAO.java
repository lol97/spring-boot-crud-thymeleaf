/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.learn.dao;

import com.example.learn.model.Mahasiswa;
import com.example.learn.service.MahasiswaService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aglis
 */

@Service
public class MahasiswaDAO implements MahasiswaService{
    private EntityManagerFactory emf;
    
    @Override
    public List<Mahasiswa> ListMahasiswa() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("from Mahasiswa", Mahasiswa.class).getResultList();
    }
    
    @Autowired
    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

	@Override
	public Mahasiswa saveOrUpdate(Mahasiswa mahasiswa) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();;
		Mahasiswa saved = em.merge(mahasiswa);
		em.getTransaction().commit();
		return saved;
	}

    @Override
    public Mahasiswa getIdMahasiswa(Integer id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Mahasiswa.class, id);
    }

    @Override
    public void DeleteData(Integer id) {
        EntityManager em  = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(Mahasiswa.class, id));
        em.getTransaction().commit();
    }
}
