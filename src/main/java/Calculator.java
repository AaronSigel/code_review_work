public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int dif(int a, int b) {
        return a - b;
    }
    
    public int div(int a, int b) {
        return a / b;
    }
    
    public int times(int a, int b) {
        return a * b;
    }
    
    public int solver() {
        int sum = add(5, 3);
        int difference = dif(10, 2);
        int product = times(sum, difference);
        return div(product, 4);
    }
}
