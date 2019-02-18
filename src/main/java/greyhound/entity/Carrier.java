package greyhound.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Carrier")
public class Carrier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	@Column(name = "version")
	private int version;

	public List<Driver> getDrivers() {
		return drivers;
	}

	public void setDrivers(List<Driver> drivers) {
		this.drivers = drivers;
	}

	@PrimaryKeyJoinColumn
	@Column(name = "carrier_name")
	private String carrierName;

	@OneToMany
	@JoinColumn(name = "carrier_id", referencedColumnName = "id")
	private List<Driver> drivers = new ArrayList<Driver>();
	
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
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

}
