package com.aqua.services;

import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aqua.dao.DocumentDao;
import com.aqua.model.Document;

@Service
public class DocumentService{
	
	//@Autowired
	 //DataSource dataSource;
	 
	 @Autowired
	 DocumentDao documentDao;

	 
	 public List<Document> getAllDocuments() {
	        return this.documentDao.findAll();
	    }
	 
	 public Document addDocument(Document user) {
	        return this.documentDao.save(user);
	    }

	    public Optional<Document> getDocumentById(Long id) {
	        return this.documentDao.findById(id);
	    }

	    public Document updateDocument(Document user) {
	        return this.documentDao.save(user);
	    }

	    public void deleteDocumentById(Long id) {
	        this.documentDao.deleteById(id);
	    }

	    public void deleteAllDocuments() {
	        this.documentDao.deleteAll();
	    }
	    
	 

	 /*
	  public List<tnvbpm_envio_doc_original> findAll(){
		 
		 List<tnvbpm_envio_doc_original> listaDocument = new ArrayList<tnvbpm_envio_doc_original>();
		 
		 System.out.println("\n1.findAll()...");
	        for (tnvbpm_envio_doc_original document : documentDao.findAll()) {
	        	System.out.println(document);
	        	listaDocument.add(document);
	        }
		 
		return listaDocument;
		 
	 } 
	 
	 public List<tnvbpm_envio_doc_original> findByidInstancia(Long id){
		 
		 List<tnvbpm_envio_doc_original> listaDocument = new ArrayList<tnvbpm_envio_doc_original>();
		 
		 System.out.println("\n2.findByidInstancia(Long idinstancia)...");
	        for (tnvbpm_envio_doc_original document : documentDao.findByidInstancia(1212L)) {
	            System.out.println(document);
	            listaDocument.add(document);
	        }
		 
		return listaDocument;
		 
	 }

	 public List<tnvbpm_envio_doc_original> findByRutReturnStream(String rut){
		 List<tnvbpm_envio_doc_original> listaDocument = new ArrayList<tnvbpm_envio_doc_original>();
		 System.out.println("\n4.findByEmailReturnStream(@Param(\"rut\") String rut)...");
	        try (Stream<tnvbpm_envio_doc_original> stream = documentDao.findByRutReturnStream("25257268-6")) {
	            stream.forEach(x -> System.out.println(x));
	        }
		 return listaDocument;
	 }*/

}
