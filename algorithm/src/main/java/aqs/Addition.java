package aqs;

/**
 * @author mawei
 * @date 5/13/21
 */
public class Addition implements Operation {
    @Override
    public int apply(int a, int b) {
        return a + b;
    }
}
