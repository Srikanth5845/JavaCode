package classnotes;

import java.util.Date;

public class date {
	 public static void main(String[] args) 
     {
             
             Date d1=new Date();
             System.out.println(d1.getTime());
            
             Date d2=new Date(d1.getTime());
             System.out.println(d2);
             String dateformat1=        d2.toString();
             String date=        dateformat1.substring(8, 10);
             System.out.println(date);
             String month=dateformat1.substring(4, 7);
             System.out.println(month);
             String year=dateformat1.substring(dateformat1.length()-4);
             System.out.println(year);
             String hour=dateformat1.substring(11,13);
             String min=dateformat1.substring(14,16);
             String second=dateformat1.substring(17,19);        
     /*        System.out.println("MOnth->"+month );
             System.out.println("Year->"+year );
             System.out.println("Date->"+date);
             System.out.println("Hour->"+hour );
             System.out.println("Minute->"+min );
             System.out.println("Second->"+second );
*/
             //DD/MM/YYYY
             //DD-MM-YYYY
             
             String format1=date.concat(month).concat(year);
             System.out.println(format1);
             String format2=date.concat("/").concat(month).concat("/").concat(year);
             System.out.println(format2);
             String format3=        date.concat("-").concat(month).concat("-").concat(year);
             System.out.println(format3);
     }
}


