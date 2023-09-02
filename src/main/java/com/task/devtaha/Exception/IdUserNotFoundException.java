package com.task.devtaha.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class IdUserNotFoundException extends RuntimeException{
    private String id_notfound_Exception;
}
