package com.task.devtaha.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserwithIdNotFoundException extends RuntimeException{
    private String user_id_not_found_exception;
}
