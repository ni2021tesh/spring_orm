package info.niteshjha.springlearning.bootstrap;

import info.niteshjha.springlearning.model.Venue;
import info.niteshjha.springlearning.repository.VenueDaoImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-orm.xml");
        VenueDaoImpl bean = applicationContext.getBean(VenueDaoImpl.class);
        bean.getAllVenue().forEach(System.out::println);
        Venue venue = new Venue();
        venue.setName("Hibernate Testing with spring");
        venue.setCity("Hibernate");
        venue.setCountry("Hibernate");
        venue.setState("Maharashtra");
        venue.setBookedBy("Nitesh");
        venue.setBookedFor("Nitesh");
      //  bean.insertVenue(venue);
        Venue venueById = bean.getVenueById(21);
        venueById.setBookedBy("Nitesh Surendra Nishikant Jha");
        bean.updateVenue(venueById);


        bean.deleteVenue(venueById);
    }
}
