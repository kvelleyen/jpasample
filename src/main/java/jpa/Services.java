package jpa;


import java.sql.Date;
import java.util.Collection;

public interface Services {
	
	public void creatEvent (String lieu, Date date, Collection<Voiture> voitures);
	public void creatVoiture (int nbPlace, Collection<Evenement> events, Personne chauffeur, Collection<Personne> passagers);
	public void creatPersonne (Collection<Voiture> driveOf, Collection<Voiture> passengerOf);
	
	public void removePersonne (int idPersonne);
	public void removeVoiture (int idVoiture);
	public void removeEvent (int idEvent);

	public Collection<Evenement> getAllEvent();
	public Collection<Personne> getAllPersonne();
	public Collection<Voiture> getAllVoiture();
	
	public Personne getDriver (int idVoit);
	public Collection<Personne> getPassengers (int idVoit);
	public Collection<Voiture> getCarsDrive (int idPersonnne);
	public Collection<Voiture> getCarsPassing (int idPersonne);
	
	public Collection<Voiture> getCarsByEvent (int idEvent);
	public Collection<Evenement> getEventsByCar (int idVoiture);
	
}

