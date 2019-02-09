package info.niteshjha.springlearning.repository;

import info.niteshjha.springlearning.model.Venue;

import java.util.List;

public interface VenueDao {
    public void insertVenue(final Venue venue);

    public boolean deleteVenue(final Venue venue);

    public boolean updateVenue(final Venue venue);

    public List<Venue> getAllVenue();

    public Venue getVenueById(final int id);
}
