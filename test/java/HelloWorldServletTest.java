// HelloWorldServletTest.java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldServletTest {

    @Test
    public void testHelloWorldServlet() {
        HelloWorldServlet servlet = new HelloWorldServlet();
        assertEquals("Hello, World!", servlet.getMessage());
    }

    @Test
    public void testUpperCaseMessage() {
        HelloWorldServlet servlet = new HelloWorldServlet();
        assertEquals("HELLO, WORLD!", servlet.getMessage().toUpperCase());
    }

    @Test
    public void testCustomMessage() {
        HelloWorldServlet servlet = new HelloWorldServlet();
        servlet.setMessage("Custom Message");
        assertEquals("Custom Message", servlet.getMessage());
    }

    @Test
    public void testEmptyMessage() {
        HelloWorldServlet servlet = new HelloWorldServlet();
        servlet.setMessage("");
        assertEquals("", servlet.getMessage());
    }
}
