package com.abac.cloudsim.API;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abac.cloudsim.ConfigurationContainer;
import com.abac.cloudsim.VMConfigurationHolder;
@RestController
public class Storage {
	@RequestMapping("/resources/storage")
	public long GetRemainingStorage()
	{
		long storageToBeUsed= 0;
		if(ConfigurationContainer.ValueHolder.vmConfigurations!=null)
		{
			for(int i=0; i<ConfigurationContainer.ValueHolder.vmConfigurations.size(); i++)
			{
				VMConfigurationHolder config = ConfigurationContainer.ValueHolder.vmConfigurations.get(i);
				storageToBeUsed+=(config.getSize());
			}
		}	
		
		int dcStorage = ConfigurationContainer.DataCenter.getDataCenterStorage();
		return dcStorage - storageToBeUsed;
	}
}
