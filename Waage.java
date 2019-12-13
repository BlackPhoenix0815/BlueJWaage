
public class Waage
{
   private double Weight;
   private double height;
    public Waage()
    {
        
    }

    public void weigh(double WeightX){
        
       Weight = WeightX; 
        
        
    }
    public void howHeigh(double heightX){
        
       height = heightX; 
        
        
    }
    public void show()
    {
      System.out.println("Youre weight is: "+Weight+" kg");
      System.out.println("You are "+height+" cm heigh");
        
        
    }
}
