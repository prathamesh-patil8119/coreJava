class MathOperation{

    int add(int num1, int num2){
        return num1 + num2;
    }

    int substract(int num1, int num2){
        return num1 - num2;
    }

    int multiply(int num1, int num2){
        return num1 * num2;
    }

    int power(int num1, int num2){
        int pow = (int)Math.pow(num1,num2);
        return pow;
    }
}

class Assignment35{
    public static void main(String args[]){
        MathOperation o = new MathOperation();
        int addiction = o.add(2,5);
        System.out.println("Addition is = "+addiction);
        int substraction = o.substract(2,5);
        System.out.println("Substraction is = "+substraction);
        int multiplication = o.multiply(2,5);
        System.out.println("Multiplication is = "+multiplication);
        int powerr = o.power(2,5);
        System.out.println("Power is = "+powerr);
    }
}