package org.oasis.cart.util;


import org.oasis.cart.dto.response.ApiResponse;
import org.springframework.http.ResponseEntity;

public class ResponseUtil {

    public static <T>ResponseEntity<ApiResponse<T>> getSuccessResponse(T data){
        return null;
    }
}
