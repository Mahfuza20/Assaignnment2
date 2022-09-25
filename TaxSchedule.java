public class TaxSchedule {
    public static double Schedule(double a, double salary){
        double tax;

        if(a == 1){
            if (salary >= 0 && salary <= 8000)
                tax = salary*(10/100);
            else if (salary >= 8000 && salary <= 32000)
                tax = 800 + (salary - 8000) * (15/100);
            else
                tax = 4400 + (salary - 16000) * (25/100);
        }
        else {
            if (salary >= 0 && salary <= 16000)
                tax = salary*(10/100);
            else if (salary >= 16000 && salary <= 64000)
                tax = 1600 + (salary - 16000) * (15/100);
            else
                tax = 8800 + (salary - 64000) * (25/100);
        }
        return tax;
    }
}
