package src;

    public class BlockExecution {

        // Static Block
        static {
            System.out.println("Static block executed.");
        }
    
        // Non-Static Block
        {
            System.out.println("Non-static block executed.");
        }
    
        // Constructor
        public BlockExecution() {
            System.out.println("Constructor executed.");
        }
    
        public static void main(String[] args) {
            System.out.println("Main method starts.");
            
            // Creating the first object
            BlockExecution obj1 = new BlockExecution();
    
            // Creating the second object
            BlockExecution obj2 = new BlockExecution();
    
            System.out.println("Main method ends.");
        }   
}
