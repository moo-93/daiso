package daisoTest;

public class TestDTO {

	private String item_name;
	private int price;
	private int balance;
	private String ColName;
	private String Colpri;
	private String ColBal;

	/*	   public TestDTO(String item_name, int price, int balance) {
	      this.item_name = item_name;
	      this.price = price;
	      this.balance = balance;
	   }

	 */	   public int getBalance() {
		 return balance;
	 }
	 public String getItem_name() {
		 return item_name;
	 }
	 public int getPrice() {
		 return price;
	 }
	 public void setItem_name(String item_name) {
		 this.item_name = item_name;
	 }
	 public void setPrice(int price) {
		 this.price = price;
	 }
	 public void setBalance(int balance) {
		 this.balance = balance;
	 }
	 public void setColName(String name) {
		 this.ColName=name;
	 }
	 public void setColPri(String price) {
		 this.Colpri=price;
	 }
	 public void setColBal(String bal) {
		 this.ColBal=bal;
	 }
	 public String getColName() {
		 return ColName;
	 }
	 public String getColpri() {
		 return Colpri;
	 }
	 public String getColBal() {
		 return ColBal;
	 }
}
