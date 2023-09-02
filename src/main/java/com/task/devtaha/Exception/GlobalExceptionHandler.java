package com.task.devtaha.Exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<?> handleException(IllegalStateException exp){
        return ResponseEntity
                .badRequest()
                .body(exp.getMessage());
    }

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<?> handleException(ObjectNotFoundException exp){
        return ResponseEntity
                .badRequest()
                .body(exp.getNot_found_Object());
    }

    @ExceptionHandler(UserNameNotFoundException.class)
    public ResponseEntity<?> handleException(UserNameNotFoundException exp){
        return ResponseEntity
                .badRequest()
                .body(exp.getUsername_notfound());
    }

    @ExceptionHandler(IdUserNotFoundException.class)
    public ResponseEntity<?> handleException(IdUserNotFoundException exp){
        return ResponseEntity
                .badRequest()
                .body(exp.getId_notfound_Exception());
    }

    @ExceptionHandler(UserwithIdNotFoundException.class)
    public ResponseEntity<?> handleException(UserwithIdNotFoundException exp){
        return ResponseEntity
                .badRequest()
                .body(exp.getUser_id_not_found_exception());
    }

    @ExceptionHandler(UserIdNotFoundException.class)
    public ResponseEntity<?> handleException(UserIdNotFoundException exp){
        return ResponseEntity
                .badRequest()
                .body(exp.getUserid_notfound());
    }


}
