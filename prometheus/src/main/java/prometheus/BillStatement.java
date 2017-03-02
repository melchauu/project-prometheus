package prometheus;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
public abstract class BillStatement {
	
	public Long id;
	public Date statementDate;
	public Date dueDate; 
	public String type;
	public Double amountDue;
	public Set<BillService> services;
	
	public BillStatement(){
		this.setServices(new HashSet<BillService>());
	}
	
	public BillStatement openStatement(){
		return null;
	}
	
	public boolean closeStatement(){
		return false;
	}
	
	public boolean saveStatement(){
		return false;
	}
	
	public boolean deleteStatement(){
		return false;
	}
	
	public Date getStatementDate() {
		return statementDate;
	}

	public void setStatementDate(Date statementDate) {
		this.statementDate = statementDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(Double amountDue) {
		this.amountDue = amountDue;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<BillService> getServices() {
		return services;
	}

	public void setServices(Set<BillService> services) {
		this.services = services;
	}
	public void addService(BillService service) {
		this.services.add(service);
	}

}
