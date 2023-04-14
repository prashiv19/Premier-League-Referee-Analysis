package service.co3201;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import repo.co3201.CommentRepository;
import repo.co3201.ThreadRepository;
import repo.co3201.UserRepository;
import model.co3201.Comment;
import model.co3201.Thread;
import model.co3201.User;

@Service
public class ForumService {
//service class for forums
    private ThreadRepository threadRepository;
    private CommentRepository commentRepository;
    private UserRepository userRepository;

    public ForumService(ThreadRepository threadRepository, CommentRepository commentRepository, UserRepository userRepository) {
        this.threadRepository = threadRepository;
        this.commentRepository = commentRepository;
        this.userRepository = userRepository;
    }

    public List<Thread> getAllThreads() {
        return threadRepository.findAll();
    }

    public Thread getThreadById(Long threadId) {
        return threadRepository.findById(threadId).orElse(null);
    }

    public void addThread(Thread thread, String username) {
        User user = userRepository.findByUsername(username);
        thread.setUser(user);
        thread.setCreatedAt(LocalDateTime.now());
        threadRepository.save(thread);
    }

    public void addComment(Long threadId, Comment comment, String username) {
        User user = userRepository.findByUsername(username);
        Thread thread = threadRepository.findById(threadId).orElse(null);
        comment.setThread(thread);
        comment.setUser(user);
        comment.setCreatedAt(LocalDateTime.now());
        commentRepository.save(comment);
    }
}

