package com.abac.cloudsim;

public class VMConfigurationHolder {
	int vmId=0;
	int mapToVm;
	int vmMips;
	int vmSize;
	int vmRam;
	long vmBw;
	int vmPesNumber;
	String vmm;
	
	//Getters
	public int getVmId()
	{
		return this.vmId;
	}
	public int getMips()
	{
		return this.vmMips;
	}
	public int getSize()
	{
		return this.vmSize;
	}
	public int getRam()
	{
		return this.vmRam;
	}
	public long getVmBandWidth()
	{
		return this.vmBw;
	}
	public int getProcessingElements()
	{
		return this.vmPesNumber;
	}
	
	
	public VMConfigurationHolder(int bw, int mips,int pesNumber, int ram,int size,String vmm, int position)
	{
		this.vmId = position;				
		this.vmBw = bw;
		this.vmMips = mips;
		this.vmPesNumber = pesNumber;
		this.vmm = vmm;
		this.vmRam = ram;
		this.vmSize  = size;
		this.mapToVm= 1;
	}

}