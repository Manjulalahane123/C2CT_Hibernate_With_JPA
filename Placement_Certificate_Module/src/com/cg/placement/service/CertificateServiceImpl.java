package com.cg.placement.service;

import com.cg.placement.entities.Certificate;
import com.cg.placement.repository.ICertificateRepository;
import com.cg.placement.repository.CertificateRepositoryImpl;

public class CertificateServiceImpl  implements ICertificateService
{

	private ICertificateRepository dao;
	
	public CertificateServiceImpl() {
		
		dao = new CertificateRepositoryImpl();
	}

	@Override
	public Certificate addCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificateById(int id) {
		Certificate certificate = dao.searchCertificate(id);
		return certificate;
		
	}

	@Override
	public Certificate deleteCertificateById(int id) {
		Certificate certificate = dao.deleteCertificate(id);
		return certificate;
	}
	
}