package com.task.devtaha.Repository;

import com.task.devtaha.model.User_Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository
        extends JpaRepository<User_Location,Integer> {
    User_Location getUser_LocationById(Integer id);
    User_Location getUserLocationByName(String name);

//    Integer getIdByName(String name);
}
