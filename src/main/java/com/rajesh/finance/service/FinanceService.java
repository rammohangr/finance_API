package com.rajesh.finance.service;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rajesh.finance.model.FinanceObj;
import com.rajesh.finance.model.Results;

/**
 * Service class 
 * @author Rajesh Kumar
 * @version 1.0, June 30,2016
 * @since 1.0
 *
 */
@Service
public class FinanceService {

	/**
	 * This method call the yahoo finance web service and get the data
	 * corresponding to the given company symbol
	 * 
	 * @param String
	 * @return Results Object
	 */
	public Results findFinance(String symbol){
		
		System.out.println("service method to find stock details of" + symbol);
		RestTemplate restTemplate = new RestTemplate();
		
		String query = "";
		
		try{
		
			query = "http://query.yahooapis.com/v1/public/yql?q=" 
					+ URLEncoder.encode("select * from csv where url='http://download.finance.yahoo.com/d/quotes.csv?s="
				+ symbol + "&f=sl1d1t1c1ohgv&e=.csv' and columns='symbol,price,date,time,change,previousClose,high,low,volume'", "UTF-8") + "&format=json";
			
			System.out.println("Invoking finance service with url:"+ query);
		}catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}

		URI financeURL = null;
		try{
		  financeURL = new URI(query);
		}catch(URISyntaxException e){
			e.printStackTrace();
		}
		FinanceObj queryResults = restTemplate.getForObject(financeURL, FinanceObj.class);
	
		System.out.println("Result for Finance are:"+ queryResults);
		System.out.println("Detailed Row:"+ queryResults.getQuery().getResults().getRow());
		
		return queryResults.getQuery().getResults();
	}
}
