package com.devsuperior.workshopcassandra.repositories;

import com.devsuperior.workshopcassandra.model.entities.Product;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import java.util.List;
import java.util.UUID;

public interface ProductRepository extends CassandraRepository<Product, UUID> {

    @AllowFiltering
    List<Product> findByDepartment(String department);

    //Testar antes no banco no prompt por conta do LIKE (índice) - Spring Collection - Cassandra aula 23
//CREATE CUSTOM INDEX products_description_idx ON products (description) USING 'org.apache.cassandra.index.sasi.SASIIndex' WITH OPTIONS = {'mode': 'CONTAINS', 'analyzer_class': 'org.apache.cassandra.index.sasi.analyzer.NonTokenizingAnalyzer','case_sensitive': 'false'};
//Após isso, permitiu no banco que o campo description seja buscado com o LIKE, pode fazer a consulta:
    @Query("SELECT * FROM products WHERE description LIKE :text")
    List<Product> findByDescription(String text);

}
