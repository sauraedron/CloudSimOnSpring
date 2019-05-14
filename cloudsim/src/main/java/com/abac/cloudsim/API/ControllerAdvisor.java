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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;




@RestController
public class ControllerAdvisor {
	
	@ResponseBody @RequestMapping("/description")
	public String getDescription(@RequestBody VMRequest req){
	    return req.processors+"-"+req.bandwidth+"--"+req.storage;
	}



}