package com.task.devtaha.Service;

import com.task.devtaha.Exception.*;
import com.task.devtaha.Repository.UserRepository;
import com.task.devtaha.model.User_Location;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User_Location> getUser(){
        return userRepository.findAll();
    }

    public User_Location addUser(User_Location user) {
        return userRepository.save(user);
    }

    public String deleteUser(Integer id) {
        User_Location user_id = userRepository.getUser_LocationById(id);
        if (user_id != null){
            userRepository.delete(user_id);
            return "user location deleted Successfully !";
        }
        throw new IdUserNotFoundException("sorry this user with ID: { "+id+" } is not exist !!");
    }

    public User_Location updateUser(Integer id, User_Location user) {
        User_Location user_location = userRepository
                .getUser_LocationById(id);

        if (user_location != null){
            user_location.setRole(user.getRole());
            user_location.setExclude(user.getExclude());
            user_location.setName(user.getName());
            user_location.setLatitude(user.getLatitude());
            user_location.setLongitude(user.getLongitude());

            userRepository.save(user_location);
            return user;
        }
        throw new ObjectNotFoundException("Sorry this user is not exits !!");
    }

    public User_Location getUserByName(String name) {
        User_Location username = userRepository.getUserLocationByName(name);
        if (username != null){
            return username;
        }
        throw new UserNameNotFoundException("Sorry USERNAME: { "+name+" } is not exits !!");
    }

    public User_Location getUserById(Integer id) {
        User_Location user_id = userRepository.getUser_LocationById(id);
        if (user_id != null){
            return user_id;
        }
        throw new UserwithIdNotFoundException("Sorry this Id : {"+id+"} is not exist !!");
    }

    //TODO: complete handling exception
    public Integer getIdByName(String name) {
        User_Location user = userRepository.getUserLocationByName(name);
        if (user.getName() == null) {
            throw new UserIdNotFoundException("Sorry user_id for this: "+name+ " not found !!");
        }
        return user.getId();
    }
}