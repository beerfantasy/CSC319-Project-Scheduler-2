/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Natnaree
 */
import java.util.ArrayList;
import scheduler.*;

public class FitnessClubProblem extends Problem {
    public FitnessClubProblem(){ }
    
    public void init(){
        ArrayList<Activity> exercises = new ArrayList();

        exercises.add(new Activity ("A00", 8.0, 10.0, 15.0, 25.0));
        exercises.add(new Activity ("A01", 8.0, 10.0, 15.0, 25.0));
        exercises.add(new Activity ("A02", 8.0, 10.0, 15.0, 25.0));
        exercises.add(new Activity ("A03", 25.0, 30.0, 35.0, 40.0));
        exercises.add(new Activity ("A04", 30.0, 35.0, 40.0, 45.0));
        exercises.add(new Activity ("A05", 35.0, 40.0, 45.0, 50.0));
        exercises.add(new Activity ("A06", 40.0, 45.0, 50.0, 55.0));

        Task task1 = new Task();
        task1.addActivity(exercises.get(0));
        task1.addActivity(exercises.get(1));
        task1.addActivity(exercises.get(2));
        task1.addActivity(exercises.get(3));
        task1.addActivity(exercises.get(4));
        task1.addActivity(exercises.get(5));
        task1.addActivity(exercises.get(6));
        this.addTask(task1);
        
        exercises.add(new Activity ("A10", 10.0, 10.0, 15.0, 20.0));
        exercises.add(new Activity ("A11", 10.0, 15.0, 20.0, 25.0));
        exercises.add(new Activity ("A12", 15.0, 20.0, 25.0, 30.0));
        exercises.add(new Activity ("A13", 20.0, 25.0, 30.0, 35.0));
        exercises.add(new Activity ("A14", 28.0, 30.0, 35.0, 60.0));
        exercises.add(new Activity ("A15", 28.0, 30.0, 35.0, 60.0));
        exercises.add(new Activity ("A16", 28.0, 30.0, 35.0, 60.0));
        
        Task task2 = new Task();
        task2.addActivity(exercises.get(7));
        task2.addActivity(exercises.get(8));
        task2.addActivity(exercises.get(9));
        task2.addActivity(exercises.get(10));
        task2.addActivity(exercises.get(11));
        task2.addActivity(exercises.get(12));
        task2.addActivity(exercises.get(13));
        this.addTask(task2);
        
        Resource athlete1 = new Resource("athlete1");
        athlete1.addTask(task1);
        this.addResource(athlete1); //resource 1
        
        Resource athlete2 = new Resource("athlete2");
        athlete2.addTask(task2);
        this.addResource(athlete2); // resource 2
        
        Resource m1 = new Resource("m1");
        m1.addActivity(exercises.get(0));
        m1.addActivity(exercises.get(7));
        this.addResource(m1); // resource 3
        
        Resource m2 = new Resource("m2");
        m2.addActivity(exercises.get(1));
        m2.addActivity(exercises.get(8));
        this.addResource(m2); // resource 4
        
        Resource m3 = new Resource("m3");
        m3.addActivity(exercises.get(2));
        m3.addActivity(exercises.get(9));
        this.addResource(m3); // resource 5
        
        Resource m4 = new Resource("m4");
        m4.addActivity(exercises.get(3));
        m4.addActivity(exercises.get(10));
        this.addResource(m4); // respurce 6
        
        Resource m5 = new Resource("m5");
        m5.addActivity(exercises.get(4));
        m5.addActivity(exercises.get(11));
        this.addResource(m5); // resource 7
        
        Resource m6 = new Resource("m6");
        m6.addActivity(exercises.get(5));
        m6.addActivity(exercises.get(12));
        this.addResource(m6); // resource 8
        
        Resource m7 = new Resource("m7");
        m7.addActivity(exercises.get(6));
        m7.addActivity(exercises.get(13));
        this.addResource(m7); // resource 9

    }
    
}
