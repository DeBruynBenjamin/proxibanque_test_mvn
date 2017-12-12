package fr.proxibanque.proxibanquev2.dao;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestClientDao.class, TestConseillerDao.class, TestVirementDao.class })
public class AllTestsDao {

}
