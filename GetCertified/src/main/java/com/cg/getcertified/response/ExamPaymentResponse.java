package com.cg.getcertified.response;

import java.util.List;

import com.cg.getcertified.entity.ExamPayment;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExamPaymentResponse {

	private boolean error;
	private String message;
	
	private ExamPayment examPayment;
	
	private List<ExamPayment> examPaymentList;
	
}
