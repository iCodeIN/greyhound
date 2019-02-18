package greyhound.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "Driver")
public class Driver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	@Column(name = "version")
	private int version;
	@Column(name = "driver_id")
	private Long driverId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "middle_init")
	private String middleInitial;
	
	@ManyToOne(fetch = FetchType.EAGER, )
	@Cascade({CascadeType.ALL})
	private Carrier carrier;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@Cascade({CascadeType.ALL})
	private Location location;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Long getDriverId() {
		return driverId;
	}

	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}

	public Carrier getCarrier() {
		return carrier;
	}

	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Driver [id=" + id + ", version=" + version + ", driverId=" + driverId + ", carrier=" + carrier
				+ ", location=" + location + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

}
