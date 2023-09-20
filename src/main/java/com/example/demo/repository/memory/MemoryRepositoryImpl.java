package com.example.demo.repository.memory;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemoryRepositoryImpl implements MemoryRepositoryCustom{
    private final JPAQueryFactory jpaQueryFactory;
}
