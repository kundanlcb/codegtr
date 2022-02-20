package com.sangh.codegtr.repo;

import com.sangh.codegtr.entity.Village;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VillageRepo extends JpaRepository<Village,Long> {
}
