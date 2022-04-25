package empPayrollTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Emp_Test 
    extends TestCase
{
   
    public Emp_Test( String testName )
    {
        super( testName );
    }

   
    public static Test suite()
    {
        return new TestSuite( Emp_Test.class );
    }

   
    public void testApp()
    {
        assertTrue( true );
    }
}