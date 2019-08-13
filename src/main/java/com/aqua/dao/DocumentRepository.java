package com.aqua.dao;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.aqua.model.Document;

public interface DocumentRepository extends CrudRepository<Document, Long> {

	List<Document> findAll();
	
	List<Document> findByidInstancia(Long idInstancia);

	// custom query example and return a stream
    @Query("select c from pkg_polizas_rv_instancias.tnvbpm_envio_doc_original c where c.rut = :rut")
    Stream<Document> findByRutReturnStream(@Param("rut") String rut);
}
