package greyhound.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Locations")
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	public List<Driver> getDrivers() {
		return drivers;
	}

	public void setDrivers(List<Driver> drivers) {
		this.drivers = drivers;
	}

	@Version
	private Long version;
	@Column(name = "location_id")
	private Long locationId;
	@Column(name = "location_name")
	private String locationName;
	
	@OneToMany
	@JoinColumn(name = "location_id", referencedColumnName = "location_id")
	private List<Driver> drivers = new ArrayList<Driver>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}
	public Long getLocationId() {
		return locationId;
	}
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

}
