
public class GiftBasket {
	
	private int id; 
	private string type; 
	private float cost; 
	
	public GiftBasket() {
		super();
		this.id = 0;
		this.type = " ";
		this.cost = 0; 
		
	}
 


	public void Bus(int id, String type, float cost) {
		super();
		this.id = id;
		this.type = type;
		this.cost = cost; 
	}



	public int getid() {
		return id;
	}



	public void setid(int id) {
		this.id = id;
	}



	public String gettype() {
		return type;
	}



	public void settype(String type) {
		this.type = type;
	}

	public int getcost() {
		return cost;
	}



	public void setcost(int cost) {
		this.cost = cost; 
	}

	@Override
	public String toString() {
		return "GiftBasket [id=" + id + ", type=" + type + ", cost=" + cost "]";
	}
	
	public void display() {
		System.out.println(toString());
	}
	
	

}
