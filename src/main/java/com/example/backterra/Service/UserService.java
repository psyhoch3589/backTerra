package com.example.backterra.Service;



import com.example.backterra.Entity.user.User;
import com.example.backterra.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repo;

    @Autowired
    public UserService(UserRepository repo) {
        this.repo = repo;
    }
    public User save(User u){
        return repo.save(u);
    }
    public User findByEmailAndPassword(String email, String password){
        return repo.findByEmailAndPassword(email,password);
    }

}
