package entita;

import java.sql.Date;

public class ContrattoClub {

	private Date DataInizio;
	private Date DataFine;
	private double StipendioAtletaStagione;
	private String BonusStagione;
	private double GuadagnoBonus;
	private String VincoloContrattuale;
	
	public Date getDataInizio() {
		return DataInizio;
	}
	
	public void setDataInizio(Date dataInizio) {
		DataInizio = dataInizio;
	}
	
	public Date getDataFine() {
		return DataFine;
	}
	
	public void setDataFine(Date dataFine) {
		DataFine = dataFine;
	}
	
	public double getStipendioAtletaStagione() {
		return StipendioAtletaStagione;
	}
	
	public void setStipendioAtletaStagione(double stipendioAtletaStagione) {
		StipendioAtletaStagione = stipendioAtletaStagione;
	}
	
	public String getBonusStagione() {
		return BonusStagione;
	}
	
	public void setBonusStagione(String bonusStagione) {
		BonusStagione = bonusStagione;
	}
	
	public double getGuadagnoBonus() {
		return GuadagnoBonus;
	}
	
	public void setGuadagnoBonus(double guadagnoBonus) {
		GuadagnoBonus = guadagnoBonus;
	}
	
	public String getVincoloContrattuale() {
		return VincoloContrattuale;
	}
	
	public void setVincoloContrattuale(String vincoloContrattuale) {
		VincoloContrattuale = vincoloContrattuale;
	}
	
	
}
