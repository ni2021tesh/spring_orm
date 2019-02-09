package info.niteshjha.springlearning.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Venues")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Venue implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", length = 50)
    private int id;
    @Column(name = "NAME", length = 100)
    private String name;
    @Column(name = "CITY", length = 100)
    private String city;
    @Column(name = "COUNTRY", length = 100)
    private String country;
    @Column(name = "STATE", length = 100)
    private String state;
    @Column(name = "BOOKEDBY", length = 100)
    private String bookedBy;
    @Column(name = "BOOKEDFOR", length = 100)
    private String bookedFor;
}
