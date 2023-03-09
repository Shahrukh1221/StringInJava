class ImmVsMut{
    public static void main(String args[]){
        
        String immutableString = "Shahrukh";
        immutableString.concat(" Khan");
        System.out.println(immutableString);

        StringBuffer mutableString = new StringBuffer("Shahrukh");
        mutableString.append(" Khan");
        System.out.println(mutableString);

        

    }
}