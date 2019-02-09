package info.niteshjha.springlearning.repository;

import info.niteshjha.springlearning.model.Venue;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

@Data
@Slf4j
public class VenueDaoImpl implements VenueDao {

    private HibernateTemplate hibernateTemplate;

    @Override
    public void insertVenue(final Venue venue) {
        log.info("Inserting into venue .......");
        this.hibernateTemplate.save(venue);
    }       

    @Override
    public boolean deleteVenue(final Venue venue) {
        log.info("deleting the venue object with id ::" + venue.getId());
        this.hibernateTemplate.delete(venue);
        log.info("deleted Successfully");
        return true;

    }

    @Override
    public boolean updateVenue(final Venue venue) {
        log.info("update the venue object with id ::" + venue.getId());
        this.hibernateTemplate.update(venue);
        log.info("Updated Successfully");
        return true;
    }

    @Override
    public List<Venue> getAllVenue() {
        log.info("Getting All Venues..");
        return this.hibernateTemplate.loadAll(Venue.class);
    }

    @Override
    public Venue getVenueById(final int id) {
        return hibernateTemplate.get(Venue.class, id);
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }
}
