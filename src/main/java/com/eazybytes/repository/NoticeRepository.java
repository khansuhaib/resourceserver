package com.eazybytes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eazybytes.model.Notice;

@Repository
public interface NoticeRepository extends CrudRepository<Notice, Long> {
	
//	@Query(value = "from Notice n where CURDATE() BETWEEN noticBegDt AND noticEndDt")
	@Query(value = "from Notice n where CURDATE() BETWEEN noticBegDt AND noticEndDt or 1=1")
	List<Notice> findAllActiveNotices();

}
