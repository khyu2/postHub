package study.posthub.domain.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.posthub.domain.member.entity.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByEmail(String email);
}
