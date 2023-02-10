class input{
    public static void main(String args[]) throws java.io.IOException{
        byte Value[] = new byte[256];
        
        System.out.print("Enter Value:");
        System.in.read(Value);
        
        String newValue = new String(Value).trim();
        
        System.out.print(newValue);
    }
}