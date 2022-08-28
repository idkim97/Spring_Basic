package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // save: 회원을 저장소에 저장
    Optional<Member> findById(Long id); // id로 멤버찾기
    Optional<Member> findByName(String name); // name으로 멤버찾기
    List<Member> findAll(); // 모든 회원 리스트 찾기
}
