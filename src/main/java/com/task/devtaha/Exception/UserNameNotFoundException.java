package com.task.devtaha.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserNameNotFoundException extends RuntimeException{
    private String username_notfound;
}
