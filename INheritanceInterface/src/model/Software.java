package model;

public class Software extends product implements Printable{
	private String version;

	public Software(String code, String description, double price, String version) {
		super(code, description, price);
		this.version = version;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
			System.out.println(getDescription() + ", version " +version +" : "+getPrice());
	}





}
