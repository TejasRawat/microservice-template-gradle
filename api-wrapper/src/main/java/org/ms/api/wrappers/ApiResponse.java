package org.ms.api.wrappers;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.ms.api.exception.ApiError;

import java.util.List;

@SuperBuilder
@Data
@NoArgsConstructor
public class ApiResponse<T> {

    private T payload;
    private List<ApiError> errors;

}
