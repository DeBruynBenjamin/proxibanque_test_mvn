package fr.proxibanque.proxibanquev2.dao;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

import fr.proxibanque.proxibanquev2.domaine.Client;
import fr.proxibanque.proxibanquev2.domaine.ClientEntreprise;
import fr.proxibanque.proxibanquev2.domaine.Conseiller;
import fr.proxibanque.proxibanquev2.domaine.Virement;

public class TestVirementDao {
	
	VirementDao virementDao;
	Connection cnx;
	
	@Before
	public void initialisation() {
		virementDao = new VirementDao();
	}
	
	@Test
	//Vérifier la connection à la base
	public void testConnection(){
		cnx =Dao.seConnecter();
		assertNotNull(cnx);
	}
}
