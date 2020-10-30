package guru.springframework.msscbrewery.web.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice extends ResponseEntityExceptionHandler {

   /* @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity handleRunTimeException(MethodArgumentNotValidException e) {
        return new ResponseEntity(e.getMessage() + e.getStackTrace().toString(), HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(BindException.class)
    public ResponseEntity<List> handleBindException(BindException e){
        return new ResponseEntity(e.getAllErrors(),HttpStatus.BAD_REQUEST);
    }
*/
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        return this.handleExceptionInternal(ex, "blah blah blah", headers, status, request);

        // return super.handleMethodArgumentNotValid(ex, headers, status, request);
    }
}
