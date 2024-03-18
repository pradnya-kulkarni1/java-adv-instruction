package Model;

public class Product {
	private int id;
	private int vendorId;
	private String partNumber;
	private String Name;
	private double price;
	private String unit;
	private String photopath;
	
	public Product() {
		super();
	}

	public Product(int id, int vendorId, String partNumber, String name, double price, String unit, String photopath) {
		super();
		this.id = id;
		this.vendorId = vendorId;
		this.partNumber = partNumber;
		Name = name;
		this.price = price;
		this.unit = unit;
		this.photopath = photopath;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getPhotopath() {
		return photopath;
	}

	public void setPhotopath(String photopath) {
		this.photopath = photopath;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", vendorId=" + vendorId + ", partNumber=" + partNumber + ", Name=" + Name
				+ ", price=" + price + ", unit=" + unit + ", photopath=" + photopath + "]";
	}
	
	
	
	

}
/*
 * CREATE TABLE Product (

ID			Int				Primary key Identity(1,1),

VendorID	int				not null Constraint fk_product_vendor References Vendor(id),

PartNumber	Varchar(50)		not Null Unique,
Name		Varchar (150)	Not Null,
Price		Decimal (10,2)	Not NUll,
Unit		Varchar(255)	Not Null,
PhotoPath	Varchar(255)	Null -- URL 

)
 * 
 */