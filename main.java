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
        Scheduler s1 = new Scheduler();
        PostOfficeProblem p1 = new PostOfficeProblem();
        
        p1.init();
        
        s1.setProblem(p1);
        s1.schedule(0.1);
        
        for(int i = 0; i < 7; i++){
            System.out.println(p1.getActivity(0, i).toString());
        }
        System.out.println("------------------------");
        System.out.println("------------------------");
        
//        System.out.println("------------------------");
//        System.out.println("----------test----------");
//        //p1.getActivity(0, 0).update(0.1);        
//        System.out.println(p1.getActivity(0, 0).toString());
//        System.out.println("------------------------");
        
        p1.getResource(0).schedule();
        p1.getResource(1).schedule();
        
        for(int i = 0; i < 7; i++){
            System.out.println(p1.getActivity(0, i).toString());
        }
        System.out.println("------------------------");
        for(int i = 0; i < 7; i++){
            System.out.println(p1.getActivity(1, i).toString());
        }
        
        
    }
}
