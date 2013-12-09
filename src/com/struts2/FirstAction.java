package com.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class FirstAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String operand1;
	private String operand3;

	public String execute() throws Exception {
//		if (getSum() >= 0) {
//			return "positive";
//		} else {
			return "negative";
//		}
	}

	public String getOperand1() {
		System.out.println("getOperand1");
		return operand1;
	}

	public void setOperand1(String operand1) {
		System.out.println("setOperand1");
		this.operand1 = operand1;
	}

	public String getOperand2() {
		System.out.println("getOperand2");
		return operand3;
	}

	public void setOperand2(String operand2) {
		System.out.println("setOperand2");
		this.operand3 = operand2;
	}

	public String getSum() {
		return operand1 + operand3; // 计算两个整数的代码数和
	}
}
