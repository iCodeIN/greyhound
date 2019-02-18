package greyhound.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import greyhound.model.Result;

@Component
public class GreyHoundClientImpl {

	@Autowired
	private RestTemplate restTemplate;
	private String url = "https://pegasus.greyhound.com/busTracker/dispatch/driverBusAssignment";

	public Result getDriverBusAssignment() {
		Result result = restTemplate.getForObject(url, Result.class);
		return result;
	}

}
