package org.hsnotebook.demo.mysql;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MySqlAreaRepository extends JpaRepository<MySqlArea, String> {
	
	Page<MySqlArea> findByOrderByParentIdAscSortAsc(Pageable pageable);
	
}
