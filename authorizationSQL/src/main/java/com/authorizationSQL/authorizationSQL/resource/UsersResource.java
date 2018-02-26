package com.authorizationSQL.authorizationSQL.resource;


import com.authorizationSQL.authorizationSQL.model.Users;
import com.authorizationSQL.authorizationSQL.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import userLogIn.UserLogIn;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@RestController
public class UsersResource {


    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value = "/all")

    public List<Users>  getAll(){
    return usersRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/api/auth")
    public ResponseEntity<Users> login(@RequestBody UserLogIn users){
try {
    Users tmp=usersRepository.findByName(users.getName());

    if (tmp.getName().equals(users.getName()) && tmp.getPassword().equals(users.getPassword())){
        return new ResponseEntity<>(tmp,HttpStatus.OK);
    }
    return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);

}catch (Exception e){
    return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
}
}



//    @PostMapping(value = "/load")
//    public List<Users> persist(@RequestBody final Users users){
//        usersRepository.save(users);
//        return usersRepository.findAll();
//    }
//
//    @RequestMapping(method = {RequestMethod.POST, }, value = "/api/add")
//    public ResponseEntity<Users> add(@RequestBody Users user){
//        usersRepository.save(user);
//        return new ResponseEntity<Users>(HttpStatus.OK);
//    }

//    @RequestMapping(method = RequestMethod.POST, value = "/api/auth")
//    if(userRepository.findById(users.getId()) == null){
//              return new ResponseEntity<Users>(HttpStatus.UNAUTHORIZED);
//        }
//
//        return new ResponseEntity<Users>(HttpStatus.OK);
//    }


}
