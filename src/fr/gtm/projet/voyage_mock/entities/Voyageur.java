package fr.gtm.projet.voyage_mock.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * 
 * @author Amine et Myriam
 *
 */
public class Voyageur {
	
	private String civilite;
	private String nom;
	private String prenom;
	private Date dateNaisance;
	private String numero;
	private Long id;
	List<Long> idVoyages=new ArrayList<Long>() ;
	
	
public void addIdVoyage(Long idVoyage) {
		
			idVoyages.add(idVoyage);
		}
	
	

	public List<Long> getIdVoyages() {
		return idVoyages;
	}


	public void setIdVoyages(List<Long> idVoyages) {
		this.idVoyages = idVoyages;
	}


	public String getCivilite() {
		return civilite;                                                                                    
	}                                                                                      


	public void setCivilite(String civilite) {  
		this.civilite = civilite;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public Date getDateNaisance() {
		return dateNaisance;
	}


	public void setDateNaisance(Date dateNaisance) {
		this.dateNaisance = dateNaisance;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Voyageur(String nom) {
		this.nom = nom;

	}

	
}

