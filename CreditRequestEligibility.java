package com.fusionx.loan.credit_request_eligibility.model;

/**
 * CreditRequestEligibility Service
 * @author MahinsaA
 * @Date     08-04-2019
 * 
 ********************************************************************************************************
 *  ###   Date         Story Point   Task No    Author       Description
 *-------------------------------------------------------------------------------------------------------
 *    1   08-04-2019    FX-327                  MahinsaA      Created
 *    
 ********************************************************************************************************
 */

import java.io.Serializable;

import javax.persistence.Entity;
import javax.transaction.Transactional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;


public class CreditRequestEligibility implements Serializable {

	private String loanInstallmentAmount;

	private String loanMainIncome;
	
	private String loanOtherIncome;
	
	private String loanTakeHomePercentage;
	
	private String loanDeductionAmount;
	
	private String loanOtherLiabilityAmount;
	

	public String getLoanInstallmentAmount() {
		return loanInstallmentAmount;
	}

	public void setLoanInstallmentAmount(String loanInstallmentAmount) {
		this.loanInstallmentAmount = loanInstallmentAmount;
	}

	public String getLoanMainIncome() {
		return loanMainIncome;
	}

	public void setLoanMainIncome(String loanMainIncome) {
		this.loanMainIncome = loanMainIncome;
	}

	public String getLoanOtherIncome() {
		return loanOtherIncome;
	}

	public void setLoanOtherIncome(String loanOtherIncome) {
		this.loanOtherIncome = loanOtherIncome;
	}

	public String getLoanTakeHomePercentage() {
		return loanTakeHomePercentage;
	}

	public void setLoanTakeHomePercentage(String loanTakeHomePercentage) {
		this.loanTakeHomePercentage = loanTakeHomePercentage;
	}

	public String getLoanDeductionAmount() {
		return loanDeductionAmount;
	}

	public void setLoanDeductionAmount(String loanDeductionAmount) {
		this.loanDeductionAmount = loanDeductionAmount;
	}

	public String getLoanOtherLiabilityAmount() {
		return loanOtherLiabilityAmount;
	}

	public void setLoanOtherLiabilityAmount(String loanOtherLiabilityAmount) {
		this.loanOtherLiabilityAmount = loanOtherLiabilityAmount;
	}

	public CreditRequestEligibility() {
		
	}
	
	@JsonCreator
	public CreditRequestEligibility(@JsonProperty("loanInstallmentAmount") String loanInstallmentAmount,@JsonProperty("loanMainIncome") String loanMainIncome,
			 @JsonProperty("loanOtherIncome") String loanOtherIncome, @JsonProperty("loanTakeHomePercentage") String loanTakeHomePercentage,
			 @JsonProperty("loanDeductionAmount") String loanDeductionAmount,@JsonProperty("loanOtherLiabilityAmount") String loanOtherLiabilityAmount) {
		this.loanInstallmentAmount=loanInstallmentAmount;
		this.loanMainIncome = loanMainIncome;
		this.loanOtherIncome = loanOtherIncome;
		this.loanTakeHomePercentage = loanTakeHomePercentage;
		this.loanDeductionAmount = loanDeductionAmount;
		this.loanOtherLiabilityAmount = loanOtherLiabilityAmount;
	}

}
