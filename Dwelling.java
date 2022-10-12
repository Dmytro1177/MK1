package MK1;

public abstract class Dwelling implements DescriptionOfDwelling{
    final float nightTariff = 0.84f;
    final float dailyTariff = 1.68f;
    @Override
    public abstract void DwellingInfo(int nightUse, int dailyUse);
}
