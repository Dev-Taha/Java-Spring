package com.task.devtaha.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ObjectNotFoundException extends RuntimeException{

    private String not_found_Object;
}
