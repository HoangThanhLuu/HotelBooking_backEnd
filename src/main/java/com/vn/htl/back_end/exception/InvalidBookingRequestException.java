package com.vn.htl.back_end.exception;
/**
 * @author Simpson Alfred
 */

public class InvalidBookingRequestException extends RuntimeException {
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}