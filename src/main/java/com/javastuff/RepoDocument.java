package com.javastuff;

public class RepoDocument {
	
  private String idDoc;
  private Integer id;
  private byte[] contentBase64;
  private String estensione;
  private String url;
  
	public String getIdDoc() {
		return idDoc;
	}
	public void setIdDoc(String idDoc) {
		this.idDoc = idDoc;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public byte[] getContentBase64() {
		return contentBase64;
	}
	public void setContentBase64(byte[] contentBase64) {
		this.contentBase64 = contentBase64;
	}
	public String getEstensione() {
		return estensione;
	}
	public void setEstensione(String estensione) {
		this.estensione = estensione;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
