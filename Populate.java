import java.io.*;
import java.util.*;
public class Populate{
  public static ArrayList<Train> populate(String stopTimes){
    System.setOut(new PrintStream(new File("output.txt")));
    String skipLine = StdIn.readString();
    ArrayList<Train> list = new ArrayList<Train>();
    while(StdIn.hasNextLine()){
      int tripId = StdIn.readInt();
    
      int hr = StdIn.readInt() * 3600;
      int min = StdIn.readInt() * 60;
      int sec = StdIn.readInt();
      int arrivalInSec = hr + min + sec;

      int hr2 = StdIn.readInt() * 3600;
      int min2 = StdIn.readInt() * 60;
      int sec2 = StdIn.readInt();
      int departureTime = hr2 + min2 + sec2;
    
    int stopId = StdIn.readInt();
    int stopSequence = StdIn.readInt();
    int pickupType = StdIn.readInt();
    int dropOffType = StdIn.readInt();
    float shapeDistTraveled = StdIn.readFloat();
    
    Train t = new Train(tripId, arrivalInSec, departureTime, stopId, stopSequence, pickupType, dropOffType, shapeDistTraveled);
    list.add(t);
    }
  return list;
}
}
}
