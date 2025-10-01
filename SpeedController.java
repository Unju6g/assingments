class SpeedController {
    
    public void checkSpeed(int speed) {
        if (speed > 100) {
           
            throw new ArithmeticException("Speed limit exceeded!");
        } else {
            System.out.println("Speed is normal.");
        }
    }

    public static void main(String[] args) {
        SpeedController sc = new SpeedController();

        try {
            
            sc.checkSpeed(80);

            sc.checkSpeed(120);

        } catch (ArithmeticException e) {
        
            System.out.println("Error: " + e.getMessage());
        }
    }
}
