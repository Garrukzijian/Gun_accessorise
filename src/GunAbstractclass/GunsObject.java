package GunAbstractclass;

public abstract class GunsObject {
    private String color="white";
//    private boolean sound=true;
//    private String price;
//    private String type;
//    private String power;
//    private String accuracy;
//    private String recoil_control;
//    private String weight;
//    private String magizine;
//    private String fire_rate;
//    private String lower_Rail;
//    private String magazines;
//    private String muzzle;
//    private String sights;
//    private String stocks;


    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GunsObject() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GunsObject(String color
//                          boolean sound, String type,String power,String accuracy,
//                             String recoil_control,String weight,String magizine, String fire_rate
//                         ,String lower_Rail,String magazines,String muzzle,String sights,String stocks
                        ) {
        dateCreated = new java.util.Date();
        this.color=color;
//        this.power=power;
//        this.accuracy=accuracy;
//        this.recoil_control=recoil_control;
//        this.weight=weight;
//        this.magizine=magizine;
//        this.fire_rate=fire_rate;
//        this.lower_Rail=lower_Rail;
//        this.magazines=magazines;
//        this.muzzle=muzzle;
//        this.sights=sights;
//        this.stocks=stocks;
//        this.sound=sound;
//        this.type = type;
    }

    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }
//    public String getPower() {
//        return power;
//    }
//
//    public void setPower(String power) {
//        this.power = power;
//    }
//    public String getAccuracy() {
//         return accuracy;
//    }
//    public void setAccuracy(String accuracy) {
//        this.accuracy = accuracy;
//    }
//    public String getRecoil_control() {
//        return recoil_control;
//    }
//    public void setRecoil_control(String recoil_control) {
//        this.recoil_control = recoil_control;
//    }
//    public String getWeight() {
//        return weight;
//    }
//    public void setWeight(String weight) {
//        this.weight = weight;
//    }
//    public String getMagizine() {
//        return magizine;
//    }
//
//    public void setMagizine(String magizine) {
//        this.magizine = magizine;
//    }
//    public String getFire_rate() {
//        return fire_rate;
//    }
//
//    public void setFire_rate(String fire_rate) {
//        this.fire_rate = fire_rate;
//    }
//    public String getLower_Rail() {
//        return lower_Rail;
//    }
//
//    public void setLower_Rail(String lower_Rail) {
//        this.lower_Rail = lower_Rail;
//    }
//    public String getMagazines() {
//        return magazines;
//    }
//
//    public void setMagazines(String magazines) {
//        this.magazines = magazines;
//    }
//    public String getMuzzle() {
//        return muzzle;
//    }
//
//    public void setMuzzle(String muzzle) {
//        this.muzzle = muzzle;
//    }
//    public String getSights() {
//        return sights;
//    }
//
//    public void setSights(String sights) {
//        this.sights = sights;
//    }
//    public String getStocks() {
//        return stocks;
//    }
//
//    public void setStocks(String stocks) {
//        this.stocks = stocks;
//    }
//    public boolean isSound() {
//        return sound;
//    }
//
//    public void setSound(boolean sound) {
//        this.sound = sound;
//    }
//    public String getPrice() {
//        return price;
//    }
//    public void setPrice(String price) {
//        this.price = price;
//    }
//
//    public String getType() {
//        return type;
//    }
//    public void setType(String type) {
//        this.type = type;
//    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

//    @Override
//    public String toString() {
//        return "Gun is on " + dateCreated + ": " +  +
//                " and filled: " + sound;
//    }

    public abstract double getPower();
    public abstract boolean getSound();
    public abstract double getAccuracy();
    public abstract double getRecoil_control();
    public abstract double getWeight();
    public abstract double getMagizine();
    public abstract double getFire_rate();
    public abstract String getLower_Rail();
    public abstract String getMagazines();
    public abstract String getMuzzle();
    public abstract String getSights();
    public abstract String getStocks();
    public abstract String getTotal();
    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color;
    }

}
