/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Natnaree
 */
import java.util.*;
import scheduler.*;
public class main {
    public static void main (String[] args){
        // PostOfficeProblem
        Scheduler s1 = new Scheduler();
        Problem p1 = new PostOfficeProblem();
        
        p1.init();
        s1.setProblem(p1);
        
        System.out.println("-----------PostOfficeProblem-------------");
        System.out.println("-----------Before schedule-------------");
        for(int i = 0; i < 7; i++){
            System.out.println(p1.getActivity(0, i).toString());
        }
        System.out.println("------------------------");
        for(int i = 0; i < 7; i++){
            System.out.println(p1.getActivity(1, i).toString());
        }
        
        p1.getResource(0).schedule();
        p1.getResource(1).schedule();       
        s1.schedule(0.1);
        
        System.out.println("-----------After schedule-------------");
        System.out.println("------------------------");
        for(int i = 0; i < 7; i++){
            System.out.println(p1.getActivity(0, i).toString());
        }
        System.out.println("------------------------");
        for(int i = 0; i < 7; i++){
            System.out.println(p1.getActivity(1, i).toString());
        }
        
        
        
        // FitnessClubProblem
        Scheduler s2 = new Scheduler();
        Problem p2 = new FitnessClubProblem();
        
        p2.init();
        s2.setProblem(p2);
        
        // print resource
//        for(int i = 0; i < 9; i++){
//            System.out.println(p2.getResource(i).toString());
//        }
        
        System.out.println("-----------FitnessClub-------------");
        System.out.println("-----------Before Schedule-------------");
        for(int i = 0; i < 7; i++){
            System.out.println(p2.getActivity(0, i).toString());
        }
        System.out.println("------------------------");
        
        // schedule within same machine
        for(int i = 2; i < 9; i++){
            p2.getResource(i).schedule();
        }
        s2.setProblem(p2);
        s2.schedule(0.1);  
        // schedule among machine
        for(int i = 0; i < 2; i++){
            p2.getResource(i).schedule();
        }
        s2.setProblem(p2);
        s2.schedule(0.1);

        System.out.println("-----------After schedule-------------");
        for(int i = 0; i < 7; i++){
            System.out.println(p2.getActivity(0, i).toString());
        }
        for(int i = 0; i < 7; i++){
            System.out.println(p2.getActivity(1, i).toString());
        }
    }
}
