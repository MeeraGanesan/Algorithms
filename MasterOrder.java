 
import java.util.*; 
public class MasterOrder
{
    private ArrayList<CookieOrder> orders;


    public MasterOrder()
    {
        orders=new ArrayList<CookieOrder>();
    }
    public void addOrder(CookieOrder theOrder)
    {
        orders.add(theOrder);
    }
    public int getTotalBoxes()
    {
        int sum=0;
        for (CookieOrder C: orders)
        {
            sum=sum+C.getNumBoxes();
        }
        return sum;
    }
    public int removeVariety(String cookieVar)
    {
            int sum2=0;
        for (int i=0;i<orders.size();i++)
        {
            if (orders.get(i).getVariety().equals(cookieVar))
            {
                sum2=sum2+orders.get(i).getNumBoxes();
                System.out.println("Variety removed = " + (orders.get(i).getVariety()));
                orders.remove(i);

                
            }
        }
        return sum2;
    }    
    public void display()
    {
        for (int i=0;i<orders.size();i++)
        {
            System.out.println(orders.get(i).getVariety());
            System.out.println(orders.get(i).getNumBoxes());
        }
    }
    public void main()
    {
       Scanner SC=new Scanner(System.in);
       MasterOrder goodies=new MasterOrder();
       goodies.addOrder(new CookieOrder("Chocolate Chip",1));
       goodies.addOrder(new CookieOrder("Shortbread",5));
       goodies.addOrder(new CookieOrder("Macaroon",2));
       goodies.addOrder(new CookieOrder("Chocolate Chip",3));
       while(true)
       {
       System.out.println("1)Remove order 2)Total boxes 3)Display 4)Quit");
       int choice=SC.nextInt();
       if (choice==4)
       break;
       else
       {
           switch(choice)
           {
               case 1:
               System.out.println("Enter what is to be removed");
               String removevar=SC.next();
               int count= goodies.removeVariety(removevar);
               System.out.println("Cookies removed = " + count);
               break;
               case 2:
              
               System.out.println("No of boxes="+ goodies.getTotalBoxes());
               
               break;
               case 3:
               goodies.display();
               break;
            }
        }
    }
}
}
                
                
           