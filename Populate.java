import java.io.*;
import java.util.*;
public static ArrayList<Train> populate(String stopTimes){
  StdIn.setFile(stopTimes);
  String skipLine = StdIn.readString();
  ArrayList<Train> list = new ArrayList<Train>();
  for (int i = 0; StdIn.readInt() != null; i++){
    int tripId = StdIn.readInt();
    
    int hr = StdIn.readInt() * 3600;
    int min = StdIn.readInt() * 60;
    int sec = StdIn.readInt();
    int arrivalInSec = hr + min + sec;
   // int totalTimeInSec = sum(Pablo, arrivalInSec);
   // Time arrivalTime = new Time(totalTimeInSec);

    int hr2 = StdIn.readInt() * 3600;
    int min2 = StdIn.readInt() * 60;
    int sec2 = StdIn.readInt();
    int departureTime = hr2 + min2 + sec2;
    //int totalTimeInSec = sum(Pablo, arrivalInSec);
    //Time arrivalTime = new Time(totalTimeInSec);

    int stopId = StdIn.readInt();
    int stopSequence = Std.readInt();
    int pickupType = Std.readInt();
    int dropOffType = Std.readInt();
    float shapeDistTraveled = Std.readFloat();
    
    Train t = new Train(tripId, arrivalTime, departureTime, stopId, stopSequence, pickupType, dropOffType, shapeDistTraveled);
    list.add(t);
    }
  return list;
}}