package com.abac.cloudsim;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Simulation {
	@RequestMapping("/sim/run")
	public String run()
	{
		return RunSimulation.run();
	}
}
