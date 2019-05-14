package com.abac.cloudsim.API;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abac.cloudsim.ConfigurationContainer;
import com.abac.cloudsim.VMConfigurationHolder;

import RequestStructures.VMRequest;

@RestController
public class VMDelete {
	@RequestMapping("vm/delete")
	public String deleteVm(@RequestBody int vmId)
	{
		int index = -1;
		if(ConfigurationContainer.ValueHolder.vmConfigurations!=null)
		{
			for(int i=0; i<ConfigurationContainer.ValueHolder.vmConfigurations.size(); i++)
			{
				VMConfigurationHolder config = ConfigurationContainer.ValueHolder.vmConfigurations.get(i);
				if(config.getVmId()==vmId)
				{
					index = i;
					break;
				}
			}
		}
		if(index!=-1)
		{
			ConfigurationContainer.ValueHolder.vmConfigurations.remove(index);
			return "Success";
		}
		else
		{
			return "NOT FOUND";
		}
	}

}
