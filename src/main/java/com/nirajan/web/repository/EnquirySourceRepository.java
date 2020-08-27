package com.nirajan.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirajan.web.entity.EnquirySources;

@Repository
public interface EnquirySourceRepository extends 
				JpaRepository<EnquirySources, Integer>{

}
