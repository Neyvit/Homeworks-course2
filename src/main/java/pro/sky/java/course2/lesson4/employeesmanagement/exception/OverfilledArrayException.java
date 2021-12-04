package pro.sky.java.course2.lesson4.employeesmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class OverfilledArrayException  extends RuntimeException{
}