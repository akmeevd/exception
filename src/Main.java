import Transport.Bus;
import Transport.Car;
import Transport.MotorCar;

public class Main {


    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        System.out.println(Data.inputData("akmeev", "akmeev", "akmeev"));
        MotorCar motorCar = new MotorCar("KIA", "RIO", 2.0);
        MotorCar motorCar2 = new MotorCar("Skoda", "Rapid", 2.0);
        Bus bus = new Bus("some", "some", 9.0);
        Car car = new Car("some", "some", 3.0);
        Car car2 = new Car("some", "some", 3.0);
        motorCar.performDiagnostic();
        System.out.println(motorCar.isDiagnostic());
        Driver driver = new Driver("paul", true, 2010, Driver.Category.B);





    }
}