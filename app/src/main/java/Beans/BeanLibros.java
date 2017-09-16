package Beans;

/**
 * Created by Bryan on 09/09/2017.
 */
public class BeanLibros {
    private String  ISBN, TIT_LIB, NOMB_AUT, GNR_LIB, NOM_EDIT;
    private Number NUM_EDICION, NUM_PAG;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTIT_LIB() {
        return TIT_LIB;
    }

    public void setTIT_LIB(String TIT_LIB) {
        this.TIT_LIB = TIT_LIB;
    }

    public String getNOMB_AUT() {
        return NOMB_AUT;
    }

    public void setNOMB_AUT(String NOMB_AUT) {
        this.NOMB_AUT = NOMB_AUT;
    }

    public String getGNR_LIB() {
        return GNR_LIB;
    }

    public void setGNR_LIB(String GNR_LIB) {
        this.GNR_LIB = GNR_LIB;
    }

    public String getNOM_EDIT() {
        return NOM_EDIT;
    }

    public void setNOM_EDIT(String NOM_EDIT) {
        this.NOM_EDIT = NOM_EDIT;
    }

    public Number getNUM_EDICION() {
        return NUM_EDICION;
    }

    public void setNUM_EDICION(Number NUM_EDICION) {
        this.NUM_EDICION = NUM_EDICION;
    }

    public Number getNUM_PAG() {
        return NUM_PAG;
    }

    public void setNUM_PAG(Number NUM_PAG) {
        this.NUM_PAG = NUM_PAG;
    }

    public BeanLibros(String ISBN, String TIT_LIB, String NOMB_AUT, String GNR_LIB, String NOM_EDIT, Number NUM_EDICION, Number NUM_PAG) {
        this.ISBN = ISBN;
        this.TIT_LIB = TIT_LIB;
        this.NOMB_AUT = NOMB_AUT;
        this.GNR_LIB = GNR_LIB;
        this.NOM_EDIT = NOM_EDIT;
        this.NUM_EDICION = NUM_EDICION;
        this.NUM_PAG = NUM_PAG;
    }

    @Override
    public String toString() {
        return "BeanLibros{" +
                "ISBN='" + ISBN + '\'' +
                ", TIT_LIB='" + TIT_LIB + '\'' +
                ", NOMB_AUT='" + NOMB_AUT + '\'' +
                ", GNR_LIB='" + GNR_LIB + '\'' +
                ", NOM_EDIT='" + NOM_EDIT + '\'' +
                ", NUM_EDICION=" + NUM_EDICION +
                ", NUM_PAG=" + NUM_PAG +
                '}';
    }
}
