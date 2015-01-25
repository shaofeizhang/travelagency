package models;
import java.math.BigDecimal;
import java.util.*;
import javax.persistence.*;
import play.data.format.*;
import play.data.validation.*;
import play.db.jpa.*;

/**
 * plane entity managed by JPA
 */

@Entity
public class plane {

    @Id
    public int plane_id;

    @ManyToOne
    public destination destination;

    @ManyToOne
    public depart depart;

    @Constraints.Required
    public String airline;

    @Constraints.Required
    public String flight_number;

    @Constraints.Required
    @Formats.DateTime(pattern="dd/mm/yyyy")
    public Date departure_date;

    @Constraints.Required
    public BigDecimal flight_price;


}