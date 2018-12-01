import java.util.Scanner;
interface RealEstate{
     int type ();
    int price ();
}


public class java18_task_1 implements RealEstate {
/*
-Interface -
Flat ,House,Studio
 -object (Agent) /method ask for price (Real estate property)

--Main


 */
private int price;
private int type ;
private String name;

//Mark: -Constructor
public java18_task_1(String name){
        this.name= name;
}

//Mark: -setters
public void setPrice (int price){
    this.price=price;
}

    public void setType (int type){
        this.type=type;
    }

    public void setName (String name ){
        this.name=name;
    }

    //Mark :-getters


    public String getName() { return name; }

    public String;

    int type() {
    return type;
}


    @Override
    int price () { return price; }


    public static void main (String []args){

        Scanner reader=new Scanner(System.in);
    }

}
