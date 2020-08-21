/* 
 * Author: Giacomobono Matteo   id: 1081643
 * Section: Dataset Structure
 * Fuction: create the struct and assign the parameters.
 * 
 */

public class DatasetStructure {
	
	String file_name;
	String format ;
	long file_weight;
	
	public DatasetStructure(String name, String form, long weight) {
		super();
		file_name = name;
		format = form;
		file_weight = weight;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public long getFile_weight() {
		return file_weight;
	}

	public void setFile_weight(long file_weight) {
		this.file_weight = file_weight;
	}
	
	/*
	 * 
	 * Getter and Setter
	 * 
	 */
	
	
		
}
