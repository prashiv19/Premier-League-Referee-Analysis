package repo.co3201;

import org.springframework.data.jpa.repository.JpaRepository;

import model.co3201.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
