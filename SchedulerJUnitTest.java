/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scheduler;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Natnaree
 */
public class SchedulerJUnitTest {
    
   private PostOfficeProblem p;
    
   public SchedulerJUnitTest() {
   }
    
   @BeforeClass
   public static void setUpClass() {
      Scheduler s1 = new Scheduler();
      p = new PostOfficeProblem();
        
      p.init();
        
      p.getResource(0).schedule();
      p.getResource(1).schedule();
        
      s1.setProblem(p);
      s1.schedule(0.1);
        
        
   }
    
   @AfterClass
   public static void tearDownClass() {
   }
    
   @Before
   public void setUp() {
   }
    
   @After
   public void tearDown() {
   }
     
   @Test
   public void testResourceOne() {
      assertEquals(8.0, p.getActivity(0, 0).getActivation(), 0.9);
      assertEquals(13.0, p.getActivity(0, 1).getActivation(), 0.9);
      assertEquals(18.0, p.getActivity(0, 2).getActivation(), 0.9);
      assertEquals(23.0, p.getActivity(0, 3).getActivation(), 0.9);
      assertEquals(28.0, p.getActivity(0, 4).getActivation(), 0.9);
      assertEquals(33.0, p.getActivity(0, 5).getActivation(), 0.9);
      assertEquals(38.0, p.getActivity(0, 6).getActivation(), 0.9);
   }
    
   @Test
    public void testResourceTwo() {
      assertEquals(5.0, p.getActivity(1, 0).getActivation(), 0.9);
      assertEquals(14.0, p.getActivity(1, 1).getActivation(), 0.9);
      assertEquals(28.0, p.getActivity(1, 2).getActivation(), 0.9);
      assertEquals(43.0, p.getActivity(1, 3).getActivation(), 0.9);
      assertEquals(38.0, p.getActivity(1, 4).getActivation(), 0.9);
      assertEquals(33.0, p.getActivity(1, 5).getActivation(), 0.9);
      assertEquals(23.0, p.getActivity(1, 6).getActivation(), 0.9);
   }
}
