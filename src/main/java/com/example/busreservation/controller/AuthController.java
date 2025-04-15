package com.example.busreservation.controller;

import com.example.busreservation.entities.AppUser;
import com.example.busreservation.models.AuthResponseModel;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

//    @Value("${app.jwtExpirationInMs}")
//    private Long expiration;
//
//    @Autowired
//    AuthenticationManager authenticationManager;
//
//    @Autowired
//    private JwtTokenProvider jwtTokenProvider;
//
//    @PostMapping("/login")
//    public ResponseEntity<AuthResponseModel> login(@RequestBody AppUser user){
//        final AuthResponseModel authResponseModel;
//        final Authentication authentication =authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
//                user.getUserName(),user.getPassword()
//        ));
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        String token =jwtTokenProvider.generateToken(authentication);
//        authResponseModel =new AuthResponseModel(
//                HttpStatus.OK.value(),
//                "Succesfully logged in",
//                token,
//                System.currentTimeMillis(),
//                expiration
//        );
//        return ResponseEntity.ok(authResponseModel);
//
//    }

}
