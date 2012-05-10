package com.hasitchanged.model;

public enum VerificationRule {

	EXISTS,
	DOES_NOT_EXIST;

	public static VerificationRule parseVerificationRule(String ruleStr) {
		ruleStr = ruleStr.toUpperCase();
		for(VerificationRule verificationRule : VerificationRule.values()){
			if(ruleStr.equals(verificationRule.name().toUpperCase())){
				return verificationRule;
			} 
		}
		return VerificationRule.EXISTS;
	}
}
