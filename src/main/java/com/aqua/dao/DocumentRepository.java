package com.aqua.dao;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.aqua.model.tnvbpm_envio_doc_original;

public interface DocumentRepository extends CrudRepository<tnvbpm_envio_doc_original, Long> {

	List<tnvbpm_envio_doc_original> findAll();
	
	List<tnvbpm_envio_doc_original> findByidInstancia(Long idInstancia);

	// custom query example and return a stream
    @Query("select c from tnvbpm_envio_doc_original c where c.rut = :rut")
    Stream<tnvbpm_envio_doc_original> findByRutReturnStream(@Param("rut") String rut);
}
