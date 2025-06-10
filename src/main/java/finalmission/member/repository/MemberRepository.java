package finalmission.member.repository;

import finalmission.member.model.Member;
import jakarta.validation.constraints.Email;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);

    Optional<Member> findByEmail(String email);
}
