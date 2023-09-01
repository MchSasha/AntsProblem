package hrlink;

import junit.framework.TestCase;

public class TaskTest extends TestCase {

    public void testSolve1() {
        assertEquals(2, new Task().solve(4, 1, 3));
    }
    public void testSolve2() {
        assertEquals(3, new Task().solve(4, 4, 1));
    }
    public void testSolve3() {
        assertEquals(1, new Task().solve(4, 4, 3));
    }
    public void testSolve4() {
        assertEquals(2, new Task().solve(3, 3, 1));
    }
}