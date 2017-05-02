package scheduler;

import java.util.*;

public class Resource {
  class CompareActivity implements Comparator {

       
        public int compare(Activity a1, Activity a2) {
            return a1.activationTime()-a2.activationTime(); //To change body of generated methods, choose Tools | Templates.
        }
    // YOUR CODE here

        @Override
        public int compare(Object o1, Object o2) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

  }

  private String name;
  private ArrayList activities = new ArrayList();
  private double gain = 0.1;

  public Resource(String name) {
    this.name = name;
  }

  public String getName() { return name; }

  public void addActivity(Activity activity) {
    activities.add(activity);
  }

  public void addTask(Task task) {
    Iterator iterator = task.getActivities();
    Activity activity;
    while(iterator.hasNext())
      activities.add( (Activity) iterator.next() );
  }

  public void setGain(double gain) {
    this.gain = gain;
  }

  public void reset() {
    Iterator iterator = activities.iterator();
    Activity activity;
    while(iterator.hasNext()) {
      activity = (Activity) iterator.next();
      activity.reset();
    }
  }

  public void schedule() {
    // updates the activationTime of each activity
    for(int i=0; i < activities.size(); i++)
      ((Activity) activities.get(i)).update(gain);

    // sorts the list of activities for activationTime
    Collections.sort(activities, new CompareActivity());

    // evaluates the new completionTime of each activity
    Activity previous = (Activity) activities.get(0);
    for(int i=1; i < activities.size(); i++) {
      Activity activity = (Activity) activities.get(i);
      activity.serialize(previous);
      previous = activity;
    }
  }

  public double getPerformance() {
    double performance = 0.0;
    for(int i=0; i < activities.size(); i++) {
      Activity activity = (Activity) activities.get(i);
      performance += activity.getPerformance();
    }
    return performance;
  }

  public void store() {
    for(int i=0; i < activities.size(); i++) {
      Activity activity = (Activity) activities.get(i);
      activity.store();
    }
  }

  public void restore() {
    for(int i=0; i < activities.size(); i++) {
      Activity activity = (Activity) activities.get(i);
      activity.restore();
    }
  }

  public String toString() {
    String result = "\nResource " + name;
    for(int i=0; i < activities.size(); i++)
      result = result.concat("\n   "+((Activity) activities.get(i)).toString());
    return result;
  }
}
