package Deneme1gaugeandjunit;

public class KureninAlaniveHacmi {
    public double yaricap=1.0;
    public double pisayisi=3.14;
    public int kureninAlani(int yaricap){
        int Pisayisi=(int) pisayisi;
        return 4*yaricap*yaricap*Pisayisi;
    }
    public double kureninAlani(double yaricap){
        this.yaricap=yaricap;
        return 4*this.yaricap*this.yaricap*pisayisi;
    }
    public double kureninAlani(){
        return 4*this.yaricap*this.yaricap*pisayisi;
    }
    public int kureninHacmi(int yaricap){
        int Pisayisi=(int) pisayisi;
        return 4*yaricap*yaricap*yaricap*Pisayisi/3;
    }
    public double kureninHacmi(double yaricap){
        this.yaricap=yaricap;
        return 4*this.yaricap*this.yaricap*this.yaricap*pisayisi/3;
    }
    public double kureninHacmi(){
        return 4*this.yaricap*this.yaricap*this.yaricap*pisayisi/3;
    }
}
