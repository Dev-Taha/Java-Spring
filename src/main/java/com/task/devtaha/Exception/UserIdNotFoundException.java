package com.task.devtaha.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserIdNotFoundException extends RuntimeException {
    private String userid_notfound;
}