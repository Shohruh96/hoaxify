package uz.shohruh.hoaxify.controller;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import uz.shohruh.hoaxify.entity.User;
import uz.shohruh.hoaxify.entity.Views;
import uz.shohruh.hoaxify.error.ApiError;
import uz.shohruh.hoaxify.shared.CurrentUser;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @PostMapping("/api/1.0/login")
    @JsonView(Views.Base.class)
    User handleLogin(@CurrentUser User loggedInUser){
        return loggedInUser;
    }

//    @ExceptionHandler({AccessDeniedException.class})
//    @ResponseStatus(HttpStatus.UNAUTHORIZED)
//    ApiError handleAccessDeniedException(){
//        return new ApiError(401, "Access error", "/api/1.0/login");
//    }
}
