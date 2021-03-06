package com.abac.cloudsim.API;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemainigResources {
	@RequestMapping("/get/resources")
	public String getRemainingResources()
	{
		Bandwidth bw = new Bandwidth();
		long lBw = bw.GetRemainingBandwidth();
		
		Storage str = new Storage();
		long lStr = str.GetRemainingStorage();
		
		ProcessorElements pe = new ProcessorElements();
		long  iPe = pe.GetRemainingPe();
		
		String Json = String.format("{\"pe_remain\" : %d , \"bw_remain\": %d , \"storage_remain\": %d}",iPe,lBw, lStr);
		
		return Json;
	}

}
