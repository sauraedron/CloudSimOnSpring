package com.abac.cloudsim;

import java.util.LinkedList;
import java.util.List;

public class ConfigurationContainer {
	public static class DataCenter
	{
		static int pe_perHosts = 16;
		static int num_hosts=2;
		public static int dataCenterMips= 1005; //Million Instruction Per Second of host in datacenter
		public static int hostMemRam = 32768; // 32 GB; // The RAM Capacity of host machine
		public static int hostStorage = 8388608; //8TB; // hostStorage
		static int dcBw = 30720; //30GB; //Bandwidth of datacenter
		public static String arch = "x86";
		public static String os = "Linux";
		public static String vmm = "Xen";
		public static double 	TimeZone = 10.0;
		public static double cost = 3.0; // the cost of using processing in this resource;
		public static double costPerMem = 0.05; // the cost of using memory in this resource;
		public static double costPerStorage = 0.001; // the cost of using storage in this resource;
		public static double costPerBw = 0.0; // the cost of using bw in this resource;
		
		//getters
		/*
		 * Note : Any DataCenter resources will be Number of hosts x  Resource for each host
		 */
		public static int getProcessingElements()
		{
			return num_hosts * pe_perHosts;
		}
		public static int getDataCenterMIPS()
		{
			return num_hosts * dataCenterMips;
		}
		public static int getDataCenterRam()
		{
			return num_hosts * hostMemRam;
		}
		public static int getDataCenterStorage()
		{
			return num_hosts * DataCenter.hostStorage;
		}
		public static int getDataCenterBandwidth()
		{
			return num_hosts * DataCenter.dcBw;
		}
		
	}
	public static class ValueHolder
	{
		static int num_users=1;
		static int num_DataCenterCount=1;
		
        static int vmCounter=0;

        static int containerCounter=0;
		public static List<VMConfigurationHolder> vmConfigurations;
        public static List<CloudletConfigurationHolder> cloudletConfigurations;
        public static void addVMConfiguration(VMConfigurationHolder v)
        {
//            v.position=++vmCounter;
            if(vmConfigurations==null)
            {
                vmConfigurations = new LinkedList<VMConfigurationHolder>();
            }
            vmConfigurations.add(v);
            
        }

        public static void addCloudletConfiguration(CloudletConfigurationHolder v)
        {
            v.position = ++containerCounter;
            if(cloudletConfigurations==null)
            {
                cloudletConfigurations = new LinkedList<CloudletConfigurationHolder>();
            }
            cloudletConfigurations.add(v);
        }
	}


}