package org.hsnotebook.demo.oracle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OracleAreaRepository extends JpaRepository<OracleArea, Integer> {

}
