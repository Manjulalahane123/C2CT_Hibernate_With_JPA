package com.cg.placement.client;

import com.cg.placement.entities.Certificate;
import com.cg.placement.service.ICertificateService;
import com.cg.placement.service.CertificateServiceImpl;
public class Client 
{

	public static void main(String[] args) 
	{
		
		// CRUD operation calling activity
		ICertificateService service = new CertificateServiceImpl();
		Certificate certificate = new Certificate();
		
		
		// Create Operation
		certificate.setId(105);
		certificate.setYear(2020);
		certificate.setCollege("COPE");
		service.addCertificate(certificate);
		
		
		// Retrieve Operation
		/*certificate = service.searchCertificateById(100);
		System.out.print("Certificate_Id:"+certificate.getId());
		System.out.println(" Year:"+certificate.getYear());
		System.out.println(" College:"+certificate.getCollege()); 
		
		
		// Update Operation
		certificate = service.searchCertificateById(100);
		certificate.setCollege("Pillai");
		service.updateCertificate(certificate);
		
		certificate = service.searchCertificateById(100);
		System.out.print("ID:"+certificate.getId());
		System.out.println(" Year:"+certificate.getYear());
		System.out.println(" College:"+certificate.getCollege());
		
		
		// Delete Operation
		certificate = service.searchCertificateById(100);
		service.deleteCertificateById(0);*/
		System.out.println("End of program/Life cycle completed..."); 
		}
		}