public class Train {
  private int tripId;
  private int arrivalTime;
  private int departureTime;
  private int stopId;
  private int stopSequence;
  private int pickupType;
  private int dropOffType;
  private float shapeDistTraveled;
  
  public Train (int tripId, int arrivalTime, int departureTime, int stopId, int stopSequence, int pickupType, int dropOffType, float shapeDistTraveled){
    this.tripId = tripId;
    this.arrivalTime = arrivalTime;
    this.departureTime = departureTime;
    this.stopId = stopId;
    this.stopSequence = stopSequence;
    this.pickupType = pickupType;
    this.dropOffType = dropOffType;
    this.shapeDistTraveled = shapeDistTraveled;
  }
  public int getTripId() { 
    return tripId;
  }
  public int getArrivalTime() { 
    return arrivalTime; 
  }
  public int getDepartureTime() { 
    return departureTime;
  }
  public int getStopId() {
    return stopId;
  }
  public int getStopSequence() { 
    return stopSequence;
  }
  public int getPickupType() { 
    return pickupType;
  }
  public int getDropOffType() {
    return dropOffType;
  }
  public float getShapeDistTraveled() { 
    return shapeDistTraveled;
  }
}