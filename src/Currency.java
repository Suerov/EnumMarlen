

public enum Currency {
    USD("American currency","$"),
    EUR(" Australia currency","₽"),
    RUB("Russian Rub"," €"),
    JPY("Japanese currrency","¥");

    private String Name;
    private String   Simbol;




    Currency(String name, String simbol) {
        Name = name;
        Simbol = simbol;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSimbol() {
        return Simbol;
    }

    public void setSimbol(String simbol) {
        Simbol = simbol;
    }

    @Override
    public String toString() {
        return "Name:" + Name + "\n" +
                "Simbol:" + Simbol ;
    }
}
