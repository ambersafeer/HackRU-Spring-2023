import java.io.*;
public class Update{
  
}
public static ArrayList<Train> update(ArrayList<Train> list, String waitTime){
  StdIn.setFile(waitTime);
  int arrivalTime = 0;
  int departureTime = 0;

  for (int i = 0; i < list.size(); i++){
    if(i+1 != null){
      Train choochoo = list.get(i);
      Train choochoo2 = list.get(i+1);
      int departureTime = choochoo.getDepartureTime;
      int arrivalTime = choochoo2.getArrivalTime;
      int waitTime = StdIn.readInt();

      departureTime = departureTime + waitTime;
      arrivalTime = arrivalTime + waitTime;

      choochoo.getDepartureTime = departureTime;
      choochoo2.getArrivalTime = arrivalTime;

      list.set(i, choochoo);
      list.set(i+1, choochoo2);
    }    
    else{
      Train choochoo = list.get(i);
      int departureTime = choochoo.getDepartureTime;
      departureTime = departureTime + waitTime;
      choochoo.getDepartureTime = departureTime;
      list.set(i, choochoo);
    }
  }
}