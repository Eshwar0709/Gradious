class Product{
    public Product(){
        
    }
    public String review;
    public void ProductInfo(){
        System.out.println("Electronic and Clothing Review: "+review);
    }
}

class Electronics extends Product{
    private double warrantyPeriod;
    private String ElectronicMaterial;
    
    public void setWarrantyPeriod(double warrantyPeriod){
        this.warrantyPeriod=warrantyPeriod;
    }
    public void setElectronicMaterial(String ElectronicMaterial){
        this.ElectronicMaterial=ElectronicMaterial;
    }
    
    public double getWarrantyPeriod(){
        return this.warrantyPeriod;
    }
    public String getElectronicMaterial(){
        return this.ElectronicMaterial;
    }
    
    @Override
    public void ProductInfo(){
        System.out.println("Info from Electronics");
        System.out.println("Warranty Period: "+getWarrantyPeriod());
        System.out.println("Electronic Material: "+getElectronicMaterial());
        System.out.println("\n");
    }
}
class Clothing extends Product{
    private double size;
    private String material;
    
    public void setSize(double size){
        this.size=size;
    }
    public void setMaterial(String material){
        this.material=material;
    }
    
    public double getSize(){
        return this.size;
    }
    public String getMaterial(){
        return this.material;
    }
    
    @Override
    public void ProductInfo(){
        System.out.println("Info from Clothing");
        System.out.println("Size: "+getSize());
        System.out.println("Material: "+getMaterial());
        System.out.println("\n");
    }
}
public class Product_Information 
{
	public static void main(String[] args) {
		Electronics p1=new Electronics();
		p1.setWarrantyPeriod(5.2);
		p1.setElectronicMaterial("Wired");
		p1.ProductInfo();
		
		Clothing c1=new Clothing();
		c1.setSize(12.5);
		c1.setMaterial("Cotton");
		c1.ProductInfo();
		
	}
}
