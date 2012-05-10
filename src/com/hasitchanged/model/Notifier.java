package com.hasitchanged.model;

import java.io.Serializable;

public class Notifier implements Serializable {
	
	private static final long serialVersionUID = -5658248113302705325L;
			
	private String targetUrl;
	private String targetString;
	private Integer frequency;
	private VerificationRule rule;

	public Notifier() {}
	
	public Notifier(String targetUrl, String targetString, Integer frequency, VerificationRule rule) {
		this.targetUrl = targetUrl;
		this.targetString = targetString;
		this.frequency = frequency;
		this.rule = rule;
	}
	
	public String getTargetUrl() {
		return targetUrl;
	}
	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}
	public String getTargetString() {
		return targetString;
	}
	public void setTargetString(String targetString) {
		this.targetString = targetString;
	}
	public Integer getFrequency() {
		return frequency;
	}
	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}
	public VerificationRule getRule() {
		return rule;
	}
	public void setRule(VerificationRule rule) {
		this.rule = rule;
	}
}
