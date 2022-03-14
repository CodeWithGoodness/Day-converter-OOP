public class Time
{
    int day;

    Time(int newDay){
        day = newDay;
    }

    int getHours(){
        return day * 24 ;
    }

    int getMin(){
        return day * 24 * 60;
    }

    int getSec(){
        return  day * 24 * 60 * 60;
    }

    void setDay(int newDay){
        day = newDay;
    }
}
