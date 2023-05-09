package com.rajesh.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.rajesh.finance.model.Results;
import com.rajesh.finance.service.FinanceService;
/**
 * Controller class 
 * @author Rajesh Kumar
 * @version 1.0, June 30,2016
 * @since 1.0
 *
 */
@Controller
@RequestMapping("/v1/finance")
public class FinanceController {

	@Autowired
	private FinanceService financeService;

	/**
	 * This method is to call finance service
	 * @param String
	 * @return Results Object.
	 */
	@RequestMapping(value="/stockdetails")
	@ResponseBody
	public Results fetch(@RequestParam String company){
		Results result = financeService.findFinance(company);
		System.out.println("Price in controller:"+ result.getRow().getPrice());
		return result;
	}
}
