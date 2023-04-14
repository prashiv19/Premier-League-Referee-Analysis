package repo.co3201;

import org.springframework.data.jpa.repository.JpaRepository;

import model.co3201.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}//finduser repo