package inheritance;

public class DriverCar {

    public static void main(String[] args) {

        Car car = new Kwid();
        if(car instanceof Car){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

}
