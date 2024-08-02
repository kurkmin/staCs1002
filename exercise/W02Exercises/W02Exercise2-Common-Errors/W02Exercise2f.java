// class W02Exercise2f {
//     public static void main(String[] args) {
    
//         int a = 1000000;
//         int b = 1000000;
//         int c = a * b;
//         System.out.println("a * b = " + c);
//     }
// }

// the output is -727379968 
// it is because int uses 32 bits memory size 
// since the sqaure of 1000000 exceeds int memory size 
// integer overflow occurs so better to use long type  

class W02Exercise2f {
    public static void main(String[] args) {
    
        long a = 1000000;
        long b = 1000000;
        long c = a * b;
        System.out.println("a * b = " + c);
    }
}

