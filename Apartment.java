package MK1;

public class Apartment extends Dwelling{
    public void DwellingInfo(int nightUse, int dailyUse){
        float payable =this.dailyTariff*dailyUse+this.nightTariff*nightUse;
    System.out.println( "Денний тариф: "+this.dailyTariff+"грн \n"+
            "Нічний тариф: "+this.nightTariff+"грн\n"+
            "Денне споживання: "+dailyUse+"кВт\n"+
            "Нічне споживання: "+nightUse+"кВт\n"+
            "Нараховано до сплати за місяць: "+payable+"грн\n"+
            "_________________________________________________\n");
    }
}
