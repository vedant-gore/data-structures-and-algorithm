class numberOfSeniorCitizensCharacterArithmetic {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String detail:details){
            if((((detail.charAt(11)-'0')*10) + (detail.charAt(12)-'0'))>60) count++;
        } 
        return count;
    }
}
