interface Time
{
 int getSeconds();
 int getMinutes();
 int getHours();
}

interface TotalTime
{
 int getTotalSeconds();
}


class TotalTimeAdapter implements Time
{
 private TotalTime totalTime;
 public TotalTimeAdapter(TotalTime totalTime)
 {
  this.totalTime = totalTime;
 }

 public int getSeconds()
 {
  return totalTime.getTotalSeconds() % 60; //seconds
 }

 public int getMinutes()
 {
  return (totalTime.getTotalSeconds() % (60*60)) / 60; //minutes
 }

 public int getHours()
 {
  return totalTime.getTotalSeconds() / (60*60); //hours
 }
}


class TimeAdapter implements TotalTime
{
 private Time time;
 public TimeAdapter(Time time)
 {
  this.time = time;
 }

 public int getTotalSeconds()
 {
  return time.getHours()*60*60+time.getMinutes()*60 + time.getSeconds();
 }
}



TotalTime totalTime = ... ; 
Time time = new TotalTimeAdapter(totalTime);
System.out.println(time.getHours()+":"+time.getMinutes()+":"+time.getSeconds());


Time time = ... ;
TotalTime totalTime = new TimeAdapter(time);
System.out.println(totalTime.getTotalSeconds());


// example InputStreamReader – it is a classic adapter. Converts type InputStream to type Reader.
