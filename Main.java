import java.io.*;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    StdIn.setFile(stop_times);
    ArrayList<Train> list = populate(stop_times);
    StdIn.setFile(waittime);
    list = update(list, waittime);
    
    try {  
      FileWriter myWriter = new FileWriter("updated.txt");
      for(int i = 0; i < list.size(); i++){
        Train x = list.get(i);
        int arrivalTime = x.getArrivalTime();
        int hr = arrivalTime/3600;
        int remainingM = arrivalTime%3600;//remaining min in sec
        int min = remainingM/60;
        int sec = min / 60;
        
        int departureTime = x.getDepartureTime();
        int hr2 = departureTime/3600;
        int remainingM2 = departureTime%3600;//remaining min in sec
        int min2 = remainingM2/60;
        int sec2 = min2 / 60;

        float shapeDistTraveled = x.getShapeDistTraveled();
        myWriter.write(x.getTripId() + "," + hr + ":" + min ":" + sec + "," + hr2 + ":" + min2 ":" + sec2 + "," + x.getStopId() + "," + x.getStopSequence() + "," + x.getPickupType() + "," + x.getDropOffType() + "," + x.getShapeDistTraveled());
        myWriter.close();
      }
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  }
}