package GunAbstractclass;

import java.util.Objects;

public class ShotgunsObject extends GunsObject{
private String shotgun_model;
private String price_gun;
//private String Lower_Rail_Name;
    public ShotgunsObject() {
    }


    public ShotgunsObject(String shotgun_model,String price_gun
//            , String Lower_Rail_Name
    ) {
        this.shotgun_model = shotgun_model;
        this.price_gun=price_gun;
//        this.Lower_Rail_Name=Lower_Rail_Name;
    }
    public String getShotgun_model() {
        return shotgun_model;
    }
    public void setShotgun_model(String shotgun_model) {
        this.shotgun_model = shotgun_model;
    }
    public String getPrice_gun() {
        return price_gun;
    }
    public void setPrice_gun(String price_gun) {
        this.price_gun = price_gun;
    }
//    public String getLower_Rail_Name() {
//        return Lower_Rail_Name;
//    }
//    public void setLower_Rail_Name(String lower_Rail_Name) {
//        this.Lower_Rail_Name = lower_Rail_Name;
//    }
    @Override
    public double getPower() {
        if(shotgun_model=="Model 680"){
            return 8;
        }else if(shotgun_model=="R9-0"){
            return 7;
        }else if(shotgun_model=="Haur 77"){
            return 6;
        }else if(shotgun_model=="Gallo SA12"){
            return 9;
        }else {
            return 0;
        }
    }

    @Override
    public boolean getSound() {
        return true;
    }

    @Override
    public double getAccuracy() {
        switch (shotgun_model) {
            case "Model 680":
                return 4;
            case "R9-0":
                return 5;
            case "Haur 77":
                return 5;
            case "Gallo SA12":
                return 3;
            default:
                return 0;
        }
    }

    @Override
    public double getRecoil_control() {
        switch (shotgun_model) {
            case "Model 680":
                return 3;
            case "R9-0":
                return 5;
            case "Haur 77":
                return 5;
            case "Gallo SA12":
                return 6;
            default:
                return 0;
        }
    }


    @Override
    public double getWeight() {
        if(Objects.equals(shotgun_model, "Model 680")){
            return 3;
        }else if(Objects.equals(shotgun_model, "R9-0")){
            return 5;
        }else if(Objects.equals(shotgun_model, "Haur 77")){
            return 5;
        }else if(Objects.equals(shotgun_model, "Gallo SA12")){
            return 6;
        }else {
            return 0;
        }
    }

    @Override
    public double getMagizine() {
        if(Objects.equals(shotgun_model, "Model 680")){
            return 5;
        }else if(Objects.equals(shotgun_model, "R9-0")){
            return 6;
        }else if(Objects.equals(shotgun_model, "Haur 77")){
            return 9;
        }else if(Objects.equals(shotgun_model, "Gallo SA12")){
            return 7;
        }else {
            return 0;
        }
    }

    @Override
    public double getFire_rate() {
        if(Objects.equals(shotgun_model, "Model 680")){
            return 2;
        }else if(Objects.equals(shotgun_model, "R9-0")){
            return 2;
        }else if(Objects.equals(shotgun_model, "Haur 77")){
            return 4;
        }else if(Objects.equals(shotgun_model, "Gallo SA12")){
            return 2;
        }else {
            return 0;
        }
    }

    @Override
    public String getLower_Rail() {
       return "Cannot equip";
    }

    @Override
    public String getMagazines() {
        return "Cannot equip";
    }

    @Override
    public String getMuzzle() {
        return "Cannot equip";
    }

    @Override
    public String getSights() {
        return "Cannot equip";
    }

    @Override
    public String getStocks() {
        return "Cannot equip";
    }
    @Override
    public String getTotal() {
        return getPrice_gun();
    }
    public void printToal() {
        System.out.println("The gun is  " + getShotgun_model() +
                " and the price is " + getPrice_gun()
                +"have Power"+getPower()+"/10"
                +"have Accuracy"+getAccuracy()+"/10"
                +"have Recoil control"+getRecoil_control()+"/10"
                +"have Weight"+getWeight()+"/10"
                +"have Magizine"+getMagizine()+"/10"
                +"have Fire rate"+getFire_rate()+"/10"
                +"and the equip you choose"+getLower_Rail()+getMagazines()+getMuzzle()+getSights()+getStocks()+getTotal());
    }
    @Override
    public String toString() {
        return "The gun is  " + getShotgun_model()
                +" and the price is " + getPrice_gun()
                +"have Power"+getPower()+"/10"
                +"have Accuracy"+getAccuracy()+"/10"
                +"have Recoil control"+getRecoil_control()+"/10"
                +"have Weight"+getWeight()+"/10"
                +"have Magizine"+getMagizine()+"/10"
                +"have Fire rate"+getFire_rate()+"/10"
                +"and the equip you choose Lower Rail"+getLower_Rail()
                +"Magazines"+getMagazines()
                +"Muzzle"+getMuzzle()
                +"Sights"+getSights()
                +"Sights"+getStocks()
                +"Total price"+getTotal();
    }
}
