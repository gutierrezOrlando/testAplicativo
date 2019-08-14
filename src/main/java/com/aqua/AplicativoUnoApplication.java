package com.aqua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AplicativoUnoApplication{ //implements CommandLineRunner{
	
	 /*@Autowired
	 DataSource dataSource;
	 
	 @Autowired
	 DocumentRepository documentRepository;*/

	public static void main(String[] args){
		SpringApplication.run(AplicativoUnoApplication.class, args);
	}

	/*@Transactional(readOnly = true)
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("############## DATASOURCE = " + dataSource);
		
		System.out.println("\n1.findAll()...");
        for (tnvbpm_envio_doc_original document : documentRepository.findAll()) {
            System.out.println(document);
        }

        System.out.println("\n2.findByidInstancia(Long idinstancia)...");
        for (tnvbpm_envio_doc_original document : documentRepository.findByidInstancia(1212L)) {
            System.out.println(document);
        }
        
     // For Stream, need @Transactional
        System.out.println("\n4.findByEmailReturnStream(@Param(\"rut\") String rut)...");
        try (Stream<tnvbpm_envio_doc_original> stream = documentRepository.findByRutReturnStream("25257268-6")) {
            stream.forEach(x -> System.out.println(x));
        }

        System.out.println("Done!");

        wait(0);
		
	}*/

}
