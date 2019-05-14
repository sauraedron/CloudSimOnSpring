package RequestStructures;

public class TaskStructure {
	public int processors;
	public int taskLength;
	public int fileSize;
	public int outputSize;
	public int vmIdToMap;
	public TaskStructure() {
		super();
	}
	public TaskStructure(int processors, int taskLength, int fileSize, int outputSize, int vmId) {
		super();
		this.processors = processors;
		this.taskLength = taskLength;
		this.fileSize = fileSize;
		this.outputSize = outputSize;
		this.vmIdToMap = vmId;
				
	}
	

}
