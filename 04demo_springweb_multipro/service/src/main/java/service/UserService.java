package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserDao;

@Service
public class UserService {

    @Autowired
    private UserDao userRepository;

    public String getUser(Long id){
        return userRepository.getUser(id);
    }
}