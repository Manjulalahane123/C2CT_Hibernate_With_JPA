package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.repository.JPAUtil;
import com.cg.placement.entities.Certificate;

public class CertificateRepositoryImpl implements ICertificateRepository
{
	
	//Step 1 : Start JPA Lifecycle;
	private EntityManager entityManager;
	
	public CertificateRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	//Create Operation - in Repository;
	@Override
	public Certificate addCertificate(Certificate certificate) {
		entityManager.persist(certificate);
		return certificate;
	}

	//Update 
	@Override
	public Certificate updateCertificate(Certificate certificate) {
		entityManager.merge(certificate);
		return certificate;
	}

	//
	@Override
	public Certificate searchCertificate(int id) {
		Certificate certificate = entityManager.find(Certificate.class, id);
		return certificate;
	}

	//
	@Override
	public Certificate deleteCertificate(int id) {
		Certificate certificate = entityManager.find(Certificate.class, id);
		entityManager.remove(certificate);
		return certificate;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

}
