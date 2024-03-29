package com.tripleD.app.dto;

import java.util.List;

/**
 *
 * @author CHICHI Hamza
 *
 */
public class TraceDTO {

	private String methodName;
	private List<String> input;
	private String output;

	public TraceDTO() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder audit = new StringBuilder(",\n  { methodName : ");
		audit.append(this.methodName).toString();
		for (String i : this.input) {
			audit.append(",\n  ").append(i);
		}
		return audit.append(",\n  output: ").append(this.output).append(" }").toString();
	}

	public String getMethodName() {
		return this.methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public List<String> getInput() {
		return this.input;
	}

	public void setInput(List<String> input) {
		this.input = input;
	}

	public String getOutput() {
		return this.output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

}
