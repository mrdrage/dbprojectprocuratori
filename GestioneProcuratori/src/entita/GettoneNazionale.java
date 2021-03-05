package entita;

import java.sql.Date;

public class GettoneNazionale {


	private String Presenza;
	private Date Data;
	private double Gudagno;	
	
	public String getPresenza() {
		return Presenza;
	}
	
	public void setPresenza(String presenza) {
		Presenza = presenza;
	}
	
	public Date getData() {
		return Data;
	}
	
	public void setData(Date data) {
		Data = data;
	}
	
	public double getGudagno() {
		return Gudagno;
	}
	
	public void setGudagno(double gudagno) {
		Gudagno = gudagno;
	}
}
