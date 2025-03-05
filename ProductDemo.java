class Product
{
int pcode;
String pname;
double price;
Product(int a,String b,double c)
{
pcode=a;
pname=b;
price=c;
}
void display()
{
System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
}
}
class ProductDemo
{
static void findLowest(Product p1,Product p2,Product p3)
{
if(p1.price<=p2.price&&p1.price<=p3.price)
{
System.out.println("Product1 has low price");
}
else if(p2.price<=p1.price&&p2.price<=p3.price)
{
System.out.println("Product2 has low price");
}
else
{
System.out.println("Product3 has low price");
}
}
public static void main(String args[])
{
Product obj1=new Product(1,"Product1",10000);
Product obj2=new Product(2,"Product2",5000);
Product obj3=new Product(3,"Product3",8000);
System.out.println("\nProduct_code\tProduct_name\tProduct_price");
obj1.display();
obj2.display();
obj3.display();
findLowest(obj1,obj2,obj3);
}
}
