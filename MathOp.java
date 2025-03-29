/* Create class MathOperations with two add() functions -- Method Overloading  */
/* One adds two integers, the other adds three integers */

class MathOp{
    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        MathOp mathop = new MathOp();
        System.out.println(mathop.add(2,5));
        System.out.println(mathop.add(2,5,3));
    }
}