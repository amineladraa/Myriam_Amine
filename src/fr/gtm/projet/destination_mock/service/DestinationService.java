package fr.gtm.projet.destination_mock.service;

import fr.gtm.projet.destination_mock.DAO.DestinationDao;
import fr.gtm.projet.destination_mock.DAO.DestinationMockDao;
import fr.gtm.projet.destination_mock.entities.Destination;

import fr.gtm.projet.destination_mock.entities.Formule;

 

import java.util.List;

 
/**
 * 
 * @author Amine et Myriam
 * 
 * Classe publique donnant les méthodes services pour acceder aux 2 packetages DAO et entités
 *
 */
public class DestinationService {

private DestinationMockDao dao = new DestinationMockDao();



       public DestinationMockDao getDao() {
return dao;
}






public void setDao(DestinationMockDao dao) {
this.dao = dao;
}






public DestinationService() {

             // TODO Auto-generated constructor stub

       }

 

     
   

       public  List<Destination> getAllDestinations () {

            return dao.findAllDestinations();

             }

       
     

       public List<Formule> getFormules (Destination destination){

             return destination.getFormules();

       }

     

       public Destination getDestinationById(Long id) {
 
      return dao.findDestinationById(id);
   
       }

     

       public Formule getFormuleById (Long id) {

      return dao.findFormuleById(id);

       }

}
