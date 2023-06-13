class Garden {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        plant1.name = "Storczyk";
        plant1.description = "odzaj bylin należących do rodziny " +
                "storczykowatych. W zależności od ujęcia systematycznego" +
                " klasyfikowanych jest do tego rodzaju od 17 " +
                "do 33 gatunków, przy czym większa liczba podawana jest w " +
                "starszych klasyfikacjach. Po odkryciu, w końcu lat 90.";
        plant1.waterConsumption = 0.1;

        Plant plant2 = new Plant();
        plant2.name = "Kaktus";
        plant2.description = "odzina sukulentów łodygowych, należąca do rzędu goździkowców. Należy do niej, w " +
                "zależności od systemu klasyfikacyjnego, od 24 do 220 rodzajów, a w ich ramach od 1500 do 2000 " +
                "gatunków. Występują głównie na kontynentach amerykańskich, skąd pochodzą.";
        plant2.waterConsumption = 0.05;

        Plant plant3 = new Plant();
        plant3.name = "Dzbanecznik";
        plant3.description = "rodzaj roślin mięsożernych z monotypowej rodziny dzbanecznikowatych Nepenthaceae. " +
                "Obejmuje co najmniej 168 gatunków. Większość z nich występuje w południowo-wschodniej Azji, ale " +
                "zasięg rodzaju rozciąga się od Madagaskaru po zachodnią Oceanię";
        plant3.waterConsumption = 0.3;

        double dailyWaterConsumption = plant1.waterConsumption +
                plant2.waterConsumption +
                plant3.waterConsumption;
        double weeklyWaterConsumption = dailyWaterConsumption * 7;
        double yearlyWaterConsumption = dailyWaterConsumption * 365;

        System.out.println("Dzienne zapotrzebowanie na wodę: " + dailyWaterConsumption + "l");
        System.out.println("Tygodniowe zapotrzebowanie na wodę: " + weeklyWaterConsumption + "l");
        System.out.println("Roczne zapotrzebowanie na wodę: " + yearlyWaterConsumption + "l");
    }
}