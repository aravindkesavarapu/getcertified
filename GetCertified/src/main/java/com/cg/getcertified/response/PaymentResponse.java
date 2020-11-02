package com.cg.getcertified.response;

import com.cg.getcertified.entity.StudentBean;
import com.cg.getcertified.entity.TrainingPayment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@JsonInclude()
public class PaymentResponse {
	
	private boolean error;
	private String message;

	private TrainingPayment trainingPayment;
	
	private StudentBean student;
}
