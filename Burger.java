import java.util.*;

public class Burger {
    private String nimi;
    private String saiaTüüp;
    private String lihaTüüp;
    private String ekstra;
    private double hind;

    public Burger( String initialName) {
        this.nimi = initialName;
        this.lihaTüüp = "";
        this.saiaTüüp = "";
        this.hind = 0;
    }
    public void setNimi(String newNimi) {
        this.nimi = newNimi;
    }
    public void lihaTüüp(String newLihaTüüp) {
        this.lihaTüüp = newLihaTüüp;
    }
    public void setSaiaTüüp(String newSaiaTüüp) {
        this.saiaTüüp = "teraleib";
    }
    public static void main(String[] args) {
        ArrayList<String> ekstra = new ArrayList<String>();
        ekstra.add("Peekon");
        ekstra.add("Salat");
        ekstra.add("Muna");
        ekstra.add("Tomat");
    }
    public void setHind(int newHind) {
        this.hind = newHind;
    }

}
