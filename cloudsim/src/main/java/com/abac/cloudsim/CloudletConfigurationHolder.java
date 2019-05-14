package com.abac.cloudsim;

public class CloudletConfigurationHolder {
	int vmId;
	int position=0;
	int pes;
	int length;
	int fileSize;
	int outputsize;
	String UtilizationModel;
	public CloudletConfigurationHolder(int pes, int lenghth, int fileSize, int outputSize, int vmId)
	{
		this.vmId = vmId;
		UtilizationModel="";
		this.pes = pes;
		this.length = lenghth;
		this.fileSize = fileSize;
		this.outputsize = outputSize;
	}

}