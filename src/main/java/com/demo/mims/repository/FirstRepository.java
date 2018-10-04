package com.demo.mims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.mims.model.First;

@Repository
public interface FirstRepository extends JpaRepository<First, Long>{
	
}
