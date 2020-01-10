package fr.gtm.projetTest;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.gtm.projet.destination_mock.DAO.DestinationMockDao;
import fr.gtm.projet.destination_mock.entities.Destination;
import fr.gtm.projet.destination_mock.entities.Formule;
import fr.gtm.projet.destination_mock.service.DestinationService;

public class DestinationServiceTest {

@Test
public void testDestinationService() {
DestinationService ds= new DestinationService();
assertNotNull(ds);
}

@Test
public void testGetAllDestinations() {
Destination d1 = new Destination("Paris");
Destination d2 = new Destination("Lyon");
DestinationService ds= new DestinationService();
ds.getDao().creer(d1);
ds.getDao().creer(d2);
assertEquals(ds.getDao().findAllDestinations(),ds.getAllDestinations());
}

@Test
public void testGetFormules() {
Destination d1 = new Destination("Paris");
Formule f1 = new Formule();
Formule f2 = new Formule();
DestinationService ds= new DestinationService();
assertEquals(0,d1.getFormules().size());
d1.addFormule(f1);
d1.addFormule(f2);
ds.getFormules(d1);
assertEquals(2, d1.getFormules().size());

}

@Test
public void testGetDestinationById() {
Destination d1 = new Destination("Paris");
Destination d2 = new Destination("Lyon");
DestinationService ds= new DestinationService();
ds.getDao().creer(d1);
ds.getDao().creer(d2);
Long a = 2L, b=3L;
assertNotNull(ds.getDao().findDestinationById(a));
assertNotNull(ds.getDestinationById(a));
assertEquals(ds.getDao().findDestinationById(a),ds.getDestinationById(a));
}

@Test
public void testGetFormuleById() {
Formule f1 = new Formule();
Formule f2 = new Formule();
DestinationService ds= new DestinationService();
ds.getDao().creer(f1);
ds.getDao().creer(f2);

Long a = 2L, b=3L;
assertNotNull(ds.getDao().findFormuleById(a));
assertNotNull(ds.getFormuleById(a));
assertEquals(ds.getDao().findFormuleById(a),ds.getFormuleById(a));
}

}
