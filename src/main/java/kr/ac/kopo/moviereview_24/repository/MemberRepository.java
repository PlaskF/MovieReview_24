package kr.ac.kopo.moviereview_24.repository;

import kr.ac.kopo.moviereview_24.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
