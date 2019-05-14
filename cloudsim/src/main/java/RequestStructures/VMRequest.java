package RequestStructures;

public class VMRequest {
	public int processors;
	public int bandwidth;
	public int storage;
	public VMRequest(int processors, int bandwidth, int storage) {
		super();
		this.processors = processors;
		this.bandwidth = bandwidth;
		this.storage = storage;
	}
	public VMRequest() {
		super();
	}
	

}
