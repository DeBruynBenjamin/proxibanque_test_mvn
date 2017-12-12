package com.gtm.metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Compte {
	
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	
	
	
	
	
	
}
