package greyhound.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/*{"oper_nbr":69,"carrier_cd":"GLX ","last_name":"GARCIA","first_name":"ABEL"
 * ,"middle_init":null,"home_loc_6":910327,"home_loc_3":"NLX","oper_class":"T"}
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DriverAssignment {

	@JsonProperty("oper_nbr")
	private Long driverId;
	@JsonProperty("carrier_cd")
	private String carrierId;
	@JsonProperty("first_name")
	private String firstName;
	@JsonProperty("last_name")
	private String lastName;
	@JsonProperty("middle_init")
	private String middleInitial;
	@JsonProperty("home_loc_6")
	private Long homeLocation;
	@JsonProperty("home_loc_3")
	private String homeLocation3;
	@JsonProperty("oper_class")
	private String operClass;

	public Long getDriverId() {
		return driverId;
	}

	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}

	public String getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
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

	public Long getHomeLocation() {
		return homeLocation;
	}

	public void setHomeLocation(Long homeLocation) {
		this.homeLocation = homeLocation;
	}

	public String getHomeLocation3() {
		return homeLocation3;
	}

	public void setHomeLocation3(String homeLocation3) {
		this.homeLocation3 = homeLocation3;
	}

	public String getOperClass() {
		return operClass;
	}

	public void setOperClass(String operClass) {
		this.operClass = operClass;
	}

	@Override
	public String toString() {
		return "DriverAssignment [driverId=" + driverId + ", carrierId=" + carrierId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", middleInitial=" + middleInitial + ", homeLocation=" + homeLocation
				+ ", homeLocation3=" + homeLocation3 + ", operClass=" + operClass + "]";
	}

}
