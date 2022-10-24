
import java.io.Serializable;


public class Statistics implements Serializable{
    private int nOfAbondonedGames; //yarıda bırakılan oyun sayısı
    private int nOfGamesLost; //kaybedilen oyun sayısı
    private int nOfGamesWon; //kazanılan oyun sayısı
    private double inHowManyLinesOnAverage; //ortalama kaç satırda bitirildi
    private int inHowManySeconds; //ortalama ne kadar saniyede bitirildi. Yazarken gerekli düzenlemeleri yapıyorum

    public int getnOfAbondonedGames() {
        return nOfAbondonedGames;
    }

    public void setnOfAbondonedGames(int nOfAbondonedGames) {
        this.nOfAbondonedGames = nOfAbondonedGames;
    }

    public int getnOfGamesLost() {
        return nOfGamesLost;
    }

    public void setnOfGamesLost(int nOfGamesLost) {
        this.nOfGamesLost = nOfGamesLost;
    }

    public int getnOfGamesWon() {
        return nOfGamesWon;
    }

    public void setnOfGamesWon(int nOfGamesWon) {
        this.nOfGamesWon = nOfGamesWon;
    }

    public double getInHowManyLinesOnAverage() {
        return inHowManyLinesOnAverage;
    }

    public void setInHowManyLinesOnAverage(double inHowManyLinesOnAverage) {
        this.inHowManyLinesOnAverage = inHowManyLinesOnAverage;
    }

    public int getinHowManySeconds() {
        return inHowManySeconds;
    }

    public void setinHowManySeconds(int inHowManySeconds) {
        this.inHowManySeconds = inHowManySeconds;
    }
    
    
}
