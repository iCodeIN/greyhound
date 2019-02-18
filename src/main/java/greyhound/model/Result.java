package greyhound.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {

	@JsonProperty("results")
	private List<DriverAssignment> driverAssignments;

	public List<DriverAssignment> getDriverAssignments() {
		return driverAssignments;
	}

	public void setDriverAssignments(List<DriverAssignment> driverAssignments) {
		this.driverAssignments = driverAssignments;
	}

}
