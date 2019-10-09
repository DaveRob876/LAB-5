
public class GiftList {
	private Node head;
	
	   
	   public GiftList() {
		   this.head = head ;
	   }
	   
	   public boolean isEmpty() {
		   if(head == null) {
			   return true;
		   }else {
			   return false;
		   }
	   
}
	   public boolean addGiftBasketToEnd(GiftBasket giftbasket) {
		   if(isFull()) {
			   System.out.println("List is full, unable to back");
			   return false;
		   }else {
			   Node nextItem = new Node();
			   nextItem.setData(giftbasket);
			   if(isEmpty()) {
				   head = nextItem;
			   }else {
				   Node current = head;
				   while(current.getNext()!=null) {
					   current = current.getNext();
				   }
				   current.setNext(nextItem);
			   }
			   return true;
		   }
		   }
	   public static void main(String[] args) {
		    GiftList giftlist =  new GiftList(); 
		    GiftList giftlista = new GiftList(a, "valentine",6500); 
		    GiftList giftlistb = new GiftList(b, "bithrday",10000); 
		    GiftList giftlistc = new GiftList(c, "graduation",15000); 
		    
		    GiftList.addGiftListBasketToEnd(giftbasketa);
		    GiftList.addGiftListBasketToEnd(giftbasketa);
		    GiftList.addGiftListBasketToEnd(giftbasketa);
		    
		    giftlist.showAllGiftBasket(); 
		    
		    
		    
		    
		  } 
	   
	  
	   
}

