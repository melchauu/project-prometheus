package prometheus;

public class UtilBreakdown {
	public UtilType type;
	public Double usage; 
	public Double ratePer;
	public String unit;
	private Double amountDuePerType;
	
	public UtilBreakdown(){
		
	}
	
	public UtilBreakdown(UtilType type){
		super();
		this.type = type;
	}
	
	public UtilBreakdown(UtilType type, Double usage, Double ratePer, String unit) {
		super();
		this.type = type;
		this.usage = usage;
		this.ratePer = ratePer;
		this.unit = unit;
		this.updateAmountDue();
	}
	
	public UtilType getType() {
		return type;
	}

	public void setType(UtilType type) {
		this.type = type;
	}

	public Double getUsage() {
		return usage;
	}

	public void setUsage(Double usage) {
		this.usage = usage;
		updateAmountDue();
	}

	public Double getRatePer() {
		return ratePer;
	}

	public void setRatePer(Double ratePer) {
		this.ratePer = ratePer;
		updateAmountDue();
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Double getAmountDuePerType() {
		return amountDuePerType;
	}

	public void updateAmountDue(){
		this.amountDuePerType= usage * ratePer;
	}

}
