package com.aqua.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aqua.model.Document;
import com.aqua.services.DocumentService;

@RestController
@RequestMapping("/documents")
public class DocumentsController {
	
	@Autowired
	DocumentService documentService;
	
	/*@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<tnvbpm_envio_doc_original> findAll(){
		return documentService.findAll();
	} 
	
	@RequestMapping(value = "/allbyid", method = RequestMethod.GET)
	public List<tnvbpm_envio_doc_original> findByidInstancia(Long id){
		return documentService.findByidInstancia(id);
	} 
	
	@RequestMapping(value = "/allbyrut", method = RequestMethod.GET)
	public List<tnvbpm_envio_doc_original> findByRutReturnStream(String rut){
		return documentService.findByRutReturnStream(rut);
	}*/ 
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Document> getAllDocuments() {
        return this.documentService.getAllDocuments();
    }


    @RequestMapping(value = "/adddocument", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Document addDocument(@RequestBody Document document) {
        return this.documentService.addDocument(document);
    }


    @RequestMapping(value = "/updateuser", method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Document updateDocument(@RequestBody Document document) {
        return this.documentService.updateDocument(document);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Document> getDocument(@PathVariable Long id) {
        return this.documentService.getDocumentById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.DELETE)
    public void deleteAllDocuments() {
        this.documentService.deleteAllDocuments();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteDocument(@PathVariable Long id) {
        this.documentService.deleteDocumentById(id);
    }
	
	
}


