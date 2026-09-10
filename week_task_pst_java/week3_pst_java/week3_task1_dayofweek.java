class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Friday");
        map.put(2,"Saturday");
        map.put(3,"Sunday");
        map.put(4,"Monday");
        map.put(5,"Tuesday");
        map.put(6,"Wednesday");
        map.put(0,"Thursday");
        int[] months ={31,28,31,30,31,30,31,31,30,31,30,31};
        int total=(year-1970)*365;
        int count=0;
        for(int i =1971;i<year;i++){
            if(isLeap(i)){
                count++;
            }
        }
         total=total+count;
         for(int i=0;i<month-1;i++){
            total=total+months[i];
        }
        if(isLeap(year)&&month>2){
            total++;

        }
        total=total+day;
       

        int n= (total-1)%7;
        return map.get(n);

        
    }
    public boolean isLeap(int n){
        if((n%4==0&&n%100!=0)||n%400==0){
            return true;
        }
        return false;
    }
}