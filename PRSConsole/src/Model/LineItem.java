package Model;

public class LineItem {
	private int identity;
	private int lineitemRequest;
	private int lineitemProduct;
	private int quantity;
	
	public LineItem() {
		super();
	}

	public LineItem(int identity, int lineitemRequest, int lineitemProduct, int quantity) {
		super();
		this.identity = identity;
		this.lineitemRequest = lineitemRequest;
		this.lineitemProduct = lineitemProduct;
		this.quantity = quantity;
	}

	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

	public int getLineitemRequest() {
		return lineitemRequest;
	}

	public void setLineitemRequest(int lineitemRequest) {
		this.lineitemRequest = lineitemRequest;
	}

	public int getLineitemProduct() {
		return lineitemProduct;
	}

	public void setLineitemProduct(int lineitemProduct) {
		this.lineitemProduct = lineitemProduct;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "LineItem [identity=" + identity + ", lineitemRequest=" + lineitemRequest + ", lineitemProduct="
				+ lineitemProduct + ", quantity=" + quantity + "]";
	}
	
	
	

}
/*

Create Table LineItem
(
Id			int Primary key Identity(1,1),
RequestId	int Constraint fk_LineItem_Request References Request(Id) not null,
ProductId	int  Constraint fk_LineItem_Product References Product(Id) not null,
Quantity	int not null

)
* 
* */