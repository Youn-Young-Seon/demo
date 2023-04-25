package com.example.demo.domain.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    @Query("select m from Member m where m.memberId = :memberId")
    public Optional<Member> loginMember(@Param("memberId") String memberId);

    @Query("select m from Member m where m.sessionId = :sessionId")
    public Member findBySessionId(@Param("sessionId") String sessionId);
}
