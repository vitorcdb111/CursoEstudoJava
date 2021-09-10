package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	/**
	 * 
	 * AULA DE ENCAPSULAMENTO
	 * Criando um construtor para evitar de iniciar o produto com valores vazios
	 * 
	 */
	//criando o construtor
	public Product(String name, double price, int quantity)
	{
		//atribuindo o nome declarado ao nome do objeto
		//para isso usamos o this
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	 }
	
	//exemplo de sobrecarga
	public Product(String name, double price)
	{
		this.name = name;
		this.price = price;
		quantity = 0; //java faz automatico - opcional
		
	}
	
	//é possivel tb deixar o construtor padrao q ele continua funcionando
	public Product()
	{
		
	}		
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	//comecar com letra minuscula
	public double TotalValueInStock()
	{
		double total;
		
		total = price * quantity;
		
		return total;
	}	
	
	public void AddProducts(int add)
	{
		/**
		 * Poderia passar na funcao o nome quantity 
		 * p resolver a ambiguidade bastaria usar a palavra this
		 * this.quantity -= quantity
		 *
		 */
		
		quantity += add;
	}
	
	public void RemoveProducts(int remove)
	{
		quantity -= remove;
	}
	
	public String toString()
	{
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", TotalValueInStock());
			
	}
	

}
