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
public class SchedulerJUnitTestTest {
    
   private PostOfficeProblem p;
    
   public SchedulerJUnitTestTest() {
   }
    
   @BeforeClass
    private static void setUpClass() {
      Scheduler s1 = new Scheduler();
      p = new PostOfficeProblem();
        
      p.init();
        
      p.getResource(0).schedule();
      p.getResource(1).schedule();
        
      s1.setProblem(p);
      s1.schedule(0.1);
        
        
   }
    
   @AfterClass
    private static void tearDownClass() {
   }
    
   @Before
    private void setUp() {
   }
    
   @After
    private void tearDown() {
   }
     
   @Test
    private void testResourceOne() {
      assertEquals(8.0, p.getActivity(0, 0).getActivationTime(), 0.9);
      assertEquals(13.0, p.getActivity(0, 1).getActivationTime(), 0.9);
      assertEquals(18.0, p.getActivity(0, 2).getActivationTime(), 0.9);
      assertEquals(23.0, p.getActivity(0, 3).getActivationTime(), 0.9);
      assertEquals(28.0, p.getActivity(0, 4).getActivationTime(), 0.9);
      assertEquals(33.0, p.getActivity(0, 5).getActivationTime(), 0.9);
      assertEquals(38.0, p.getActivity(0, 6).getActivationTime(), 0.9);
   }
    
   @Test
    private void testResourceTwo() {
      assertEquals(5.0, p.getActivity(1, 0).getActivationTime(), 0.9);
      assertEquals(14.0, p.getActivity(1, 1).getActivationTime(), 0.9);
      assertEquals(28.0, p.getActivity(1, 2).getActivationTime(), 0.9);
      assertEquals(43.0, p.getActivity(1, 3).getActivationTime(), 0.9);
      assertEquals(38.0, p.getActivity(1, 4).getActivationTime(), 0.9);
      assertEquals(33.0, p.getActivity(1, 5).getActivationTime(), 0.9);
      assertEquals(23.0, p.getActivity(1, 6).getActivationTime(), 0.9);
   }
}
