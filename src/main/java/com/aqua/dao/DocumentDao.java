package com.aqua.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aqua.model.Document;

@Repository
public interface DocumentDao extends JpaRepository<Document, Long> {

	/*List<tnvbpm_envio_doc_original> findAll();
	
	List<tnvbpm_envio_doc_original> findByidInstancia(Long idInstancia);

	// custom query example and return a stream
    @Query("select c from tnvbpm_envio_doc_original c where c.rut = :rut")
    Stream<tnvbpm_envio_doc_original> findByRutReturnStream(@Param("rut") String rut);*/
}
