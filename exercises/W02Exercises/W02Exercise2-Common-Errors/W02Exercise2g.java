// class W02Exercise2g {
//     public static void main(String[] args) {
    
//         int a = 1000000;
//         int b = a / 0;
//         System.out.println("value of variable b: " + b);
//     }
// }

// running the codes will produce a runtime error, which cannot be detected during compilation but execution
// in this case the error is zeero division
// so let's change the value for b from 0 to 1 to eliminate the error 

class W02Exercise2g {
    public static void main(String[] args) {
    
        int a = 1000000;
        int b = a / 1;
        System.out.println("value of variable b: " + b);
    }
}
 