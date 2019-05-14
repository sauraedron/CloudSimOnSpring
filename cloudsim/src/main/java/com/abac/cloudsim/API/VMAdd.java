package com.abac.cloudsim.API;
import java.util.LinkedList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abac.cloudsim.CloudletConfigurationHolder;
import com.abac.cloudsim.ConfigurationContainer;
import com.abac.cloudsim.VMConfigurationHolder;

import RequestStructures.VMRequest;

import com.abac.cloudsim.ConfigurationContainer.ValueHolder;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;




@RestController
public class VMAdd {
	

	static int counter=1;
	@RequestMapping("/vm/add")
	@ResponseStatus(code=HttpStatus.OK)
	public int getVMId(@RequestBody VMRequest req)
	{
		//Begin VM Configurations
		int vmbw = req.bandwidth;
		int vmMips = 1000;
		int vmPesNumber=req.processors;
		int vmRam=512;
		int vmSize = req.storage;
		String Vmm="Xen";
		/*
		 * //End VM Configurations
		
		
		//To be commented once all is spearted
		//Begin Cloudlet configurations
		int cloudletId = counter*4;
		int cloudletLength = 40000	;
		int cloudletPesNumber = 1;
		int cloudletFileSize = 300;
		int cloudletOutputSize = 300;
		
		//End CLoudlet Configurations
		

		 */
		

		int vmId=counter++;
//		CloudletConfigurationHolder cloudConfig = new CloudletConfigurationHolder(cloudletPesNumber, cloudletLength,cloudletFileSize, cloudletOutputSize, vmId);		
//		ValueHolder.addCloudletConfiguration(cloudConfig);
//		
		VMConfigurationHolder reqa = new VMConfigurationHolder(vmbw,vmMips,vmPesNumber,vmRam,vmSize,Vmm, vmId);
		ValueHolder.addVMConfiguration(reqa);
		
		//We are persisting values to an Static Member
		
		
		
		
		return vmId;				
	}

}