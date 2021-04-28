package br.com.cod3r.mediator.translate.model;

public enum Language {
	PORTUGUESE("PT"),
	ENGLISH("EN");

	String abreviation;

	Language(String abreviation){
		this.abreviation = abreviation;
	}

	public String getAbreviation(){
		return this.abreviation;
	}
}
