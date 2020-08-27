package com.nirajan.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirajan.web.entity.EnquiryStatus;

@Repository
public interface EnquiryStatusRepository extends JpaRepository<EnquiryStatus,Integer>{
	
}