package ClassiDAO;

import entita.Procuratori;

import java.util.List;

public interface ProcuratoriDAO {
	
	boolean TrovaProcuratore(String CodiceFiscale);
	Procuratori getInfoProcuratore (String CodiceFiscale);
    List<Procuratori> getProcuratori ();
}
