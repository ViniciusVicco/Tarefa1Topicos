package br.unitins.topicos1.application;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Util {
	public static void addMessage(String value) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(value));
		
	}
}
