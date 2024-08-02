package test02;

public class Product {
	public String productId;
	public String productName;
	public int price;
	public int quantity;
	

	


	public Product(String productId, String productName, int price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}



	public void printProductInfo() {
		System.out.println("상품ID :" + productId);
		System.out.println("상품 이름 :" + productName);
		System.out.println("상품 가격 :" + price);
		System.out.println("재고 수량 :" + quantity);
		
	}



	public void updatePrice(int price) {
		System.out.println("키보드 가격 수정 됨");
		this.price = price;
		
	}



	public void addStock(int quantity) {
		System.out.println("키보드 15개 재고 추가 됨");
		this.quantity += quantity;
		
	}



	
		
		
	
	

	

}
