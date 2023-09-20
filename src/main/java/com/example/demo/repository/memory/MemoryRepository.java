package com.example.demo.repository.memory;

import com.example.demo.domain.Memory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface MemoryRepository extends JpaRepository<Memory, Long>, MemoryRepositoryCustom, QuerydslPredicateExecutor<Memory> {

}
