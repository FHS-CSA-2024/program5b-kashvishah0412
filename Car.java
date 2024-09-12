
public class Car{

    private String carName;
    private int milesDriven;
    private int gallonsUsed;

    public Car() {
        this.carName = "";
        this.milesDriven = 0;
        this.gallonsUsed = 0;
    }

    public Car(String carName, int milesDriven, int gallonsUsed){
        this.carName = carName;
        this.milesDriven = milesDriven;
        this.gallonsUsed = gallonsUsed;
    }



    public String getCarName() {
        return carName;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getMilesDriven() {
        return milesDriven;
    }
    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }

    public int getGallonsUsed() {
        return gallonsUsed;
    }
    public void setGallonsUsed(int gallonsUsed) {
        this.gallonsUsed = gallonsUsed;
    }


    public double calculateAverage(){
        double mpg = (double) milesDriven/(double) gallonsUsed;
        return Math.round(mpg * 10.0)/10.0;
    }

    public String toString(){
        return carName + " averaged " + calculateAverage() + " mpg";

    }

}
