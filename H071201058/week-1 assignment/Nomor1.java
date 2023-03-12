class  Nomor1{
    public static void main(String[] args) {
        System.out.println(getNumByNim2("H071201055"));
    }

    // Sollution 1
    static int getNumByNim(String nim){
        String lastThree = nim.substring(nim.length()-3);
        int lastThreeInt = Integer.parseInt(lastThree);
        return ((lastThreeInt-1)%7)+1;
    }

    // Sollution 2
    static int getNumByNim2(String nim){
        String lastThree = "";
        for (int i=nim.length()-3; i < nim.length() ; i++){
            lastThree+= nim.charAt(i);
        }
        int lastThreeInt = Integer.parseInt(lastThree);
        System.out.println("last : "+ lastThree);
        return ((lastThreeInt-1)%7)+1;
    }
}

