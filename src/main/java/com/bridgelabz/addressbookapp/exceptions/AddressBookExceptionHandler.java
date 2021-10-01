package com.bridgelabz.addressbookapp.exceptions;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bridgelabz.addressbookapp.model.Response;

public class AddressBookExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Response> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
		List<ObjectError> errorList = exception.getBindingResult().getAllErrors();
		List<String> errMsg = errorList.stream().map(objErr -> objErr.getDefaultMessage()).collect(Collectors.toList());
		Response resDTO = new Response("Exception while processing rest request", errMsg);
		return new ResponseEntity<Response>(resDTO, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(AddressBookException.class)
	public ResponseEntity<Response> handleEmployeePayrollException(AddressBookException exception){
		Response resDTO = new Response("Exception while processing REST request", exception.getMessage());
		return new ResponseEntity<Response>(resDTO,HttpStatus.BAD_REQUEST);
	}

}
