package com.sprigboot.mysql.springbootMysql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sprigboot.mysql.springbootMysql.model.Tutorial;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
	List<Tutorial> findByPublished(boolean published);

	List<Tutorial> findByTitleContaining(String title);
	
	@Query(value = "SELECT u FROM Tutorial u")
	List<Tutorial> findAllTutorialsWithPagination();
	
	
	@Query("SELECT c FROM Tutorial c WHERE c.title = :title")
	List<Tutorial> findByTitle(@Param("title") String title);

	
}