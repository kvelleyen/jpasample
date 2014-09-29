

import java.sql.Date;
import java.util.Collection;

public interface Services {
	
	public void creatEvent (String lieu, Date date, Collection<Voiture> voitures);
	public void creatVoiture (int nbPlace, Collection<Evenement> events, Personne chauffeur, Collection<Personne> passagers);
	public void creatPersonne (Collection<Voiture> driveOf, Collection<Voiture> passengerOf);
	
	public void getDriver ();
	
}

