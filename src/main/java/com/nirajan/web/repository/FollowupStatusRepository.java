package com.nirajan.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirajan.web.entity.FollowupStatus;

@Repository
public interface FollowupStatusRepository extends JpaRepository<FollowupStatus, Integer> {

}
