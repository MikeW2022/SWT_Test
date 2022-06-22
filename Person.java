package swt_test;

/**
 *  @author Michael
 *  @version 1.0
 */

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
* class  Person
*/

public  class  Person {
    private String nachname;
    private String vorname;
    private String strasse;
    private String hausnummer;
    private String ort;
    private String plz;
    private String geschlecht;
    private String birthday;
    private String id;

/**
 * 
 */
    public Person() {}
    

    /**
     * @param nachname
     *          der nachname
     * @param vorname
     *          der vorname
     * @param strasse
     *          die strasse
     * @param hausnummer
     *          die hausnummer
     * @param ort
     *           der ort
     * @param plz
     *          die plz
     * @param geschlecht
     *          das geschlecht
     * @param id
     *          der ID         
     */
    public Person(String nachname, String vorname, String strasse, String hausnummer, String ort, String plz, String geschlecht, String id) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.strasse = strasse;
        this.ort = ort;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.geschlecht = geschlecht;
        this.geschlecht = id;
    }

    /**
     * 
     * @return nachname
     */
    public String getNachname() {
        return this.nachname;
    }

    /**
     * @param nachname  der nachname
     */
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    /**
     * @return vorname
     */
    public String getVorname() {
        return this.vorname;
    }

    /**
     * @param vorname   der vorname
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     * @return strasse
     */
    public String getStrasse() {
        return this.strasse;
    }

    /**
     * @param strasse   die strasse
     */
    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    /**
     * @return hausnummer
     */
    public String getHausnummer() {
        return this.hausnummer;
    }

    /**
     * @param hausnummer    die hausnummer
     */
    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    /**
     * @return plz
     */
    public String getOrt() {
        return this.ort;
    }

    /**
     * @param ort   der ort
     */
    public void setOrt(String ort) {
        this.ort = ort;
    }

    /**
     * @return plz
     */
    public String getPlz() {
        return this.plz;
    }

    /**
     * @param plz   die plz
     */
    public void setPlz(String plz) {
        this.plz = plz;
    }

    /**
     * @return geschlecht
     */
    public String getGeschlecht() {
        return this.geschlecht;
    }

    /**
     * @param geschlecht    das geschlecht
     */
    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    /**
     * 
     * @return birthday
     */
    public String getBirthday() {
        return this.birthday;
    }
    
    /**
     * @param birthday  der birthday
     */

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    
    /**
    * @return birthday
    */
   public String getId() {
       return this.id;
   }
   
   /**
    * @param birthday  der birthday
    */

   public void setId(String id) {
       this.birthday = id;
   }
    
    
    /**
     * @return Anrede
     */
    protected  String getAnrede() {
        return this.isWeiblich()?"Frau":"Herr";
    };
    
    /**
     * @return adresse
     */
    public String[] getAdresse() {
        String[] adresse = new String[4];
        adresse[0] = getAnrede();
        adresse[1] = " " + this.vorname + " " + this.nachname;
        adresse[2] = " " + this.strasse + " " + this.hausnummer;
        adresse[3] = " " + this.plz + " " + this.ort;
        return adresse;
    }
    
    /**
     * @return true if a female person 
     */
    public boolean isWeiblich() {
        if (this.geschlecht == "weiblich");
        return true;
    }

    /**
     * @param birthday     der birthday
     * @return year das year
     */
    protected int getYear(String birthday) {
       String a =  this.birthday.substring(this.birthday.length()-4);
       return  a.indexOf(a);
    }

    /**
     * @return age
     */
    protected int getAlter() {
       LocalDate date=   new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
       int year = date.getYear();
       return year - this.getYear(birthday);        
    }
    
}