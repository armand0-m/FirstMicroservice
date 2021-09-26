package com.tcs.firstMicro.model;

import java.io.Serializable;

public class ModelData implements Serializable{

	private static final long serialVersionUID = 6619704624624311131L;
	private int code;
	private String mensaje;
	private boolean status;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
