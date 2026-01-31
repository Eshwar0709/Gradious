class Vehicle{
    public void start_engine(){
        System.out.println("Start the Vehicle's Engine");
    }
    public void stop_engine(){
        System.out.println("Stop the Vehicle's Engine");
    }
    public void display_info(){
        System.out.println("Vehicle Information");
    }
}
class Car extends Vehicle{
    public int number_of_doors;
    @Override
    public void start_engine(){
        System.out.println("The Car is Starting");
    }
    @Override
    public void stop_engine(){
        System.out.println("The Car is going to Stop");
    }
    @Override
    public void display_info(){
        System.out.println("Car Information");
        System.out.println("Number of Doors in the Car: "+number_of_doors);
    }
}
class Bicycle extends Vehicle{
    public String type;
    @Override
    public void start_engine(){
        System.out.println("The Bicycle is Starting");
    }
    @Override
    public void stop_engine(){
        System.out.println("The Bicycle is going to Stop");
    }
    @Override
    public void display_info(){
        System.out.println("Bicycle Information");
        System.out.println("Bicycle Type: "+type);
    }
}
public class Polymorphism{
    public static void main(String[] args){
        Car a=new Car();
        a.number_of_doors=4;
        a.start_engine();
        a.stop_engine();
        a.display_info();
        
        System.out.println();
        
        Bicycle b=new Bicycle();
        b.type="Road";
        b.start_engine();
        b.stop_engine();
        b.display_info();
    }
}
