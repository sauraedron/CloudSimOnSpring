package com.abac.cloudsim.API;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abac.cloudsim.ConfigurationContainer;
import com.abac.cloudsim.VMConfigurationHolder;

@RestController
public class Bandwidth {
	@RequestMapping("/resources/bandwidth")
	public long GetRemainingBandwidth()
	{
		long bandwidthToBeUsed= 0;
		if(ConfigurationContainer.ValueHolder.vmConfigurations!=null)
		{
			for(int i=0; i<ConfigurationContainer.ValueHolder.vmConfigurations.size(); i++)
			{
				VMConfigurationHolder config = ConfigurationContainer.ValueHolder.vmConfigurations.get(i);
				bandwidthToBeUsed+=(config.getVmBandWidth());
			}
		}	
		
		int dcbw = ConfigurationContainer.DataCenter.getDataCenterBandwidth();
		return ConfigurationContainer.DataCenter.getDataCenterBandwidth() - bandwidthToBeUsed;
	}

}
