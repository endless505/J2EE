package com.sptpc.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sptpc.domain.College;

@Repository
public interface CollegeMapper {
	
	public List<College> findAllCollege();
	
}
