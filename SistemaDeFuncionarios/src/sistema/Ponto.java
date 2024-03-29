
package sistema;

import java.time.LocalDate;
import java.time.LocalTime;



public class Ponto{
    private LocalTime logedIn;
    private LocalTime logedOut;
    private LocalDate date;
    private int id;
    

    public Ponto(){
        
    }
    public LocalTime getLogedIn() {
        return logedIn;
    }

    public void setLogedIn(LocalTime logedIn) {
        this.logedIn = logedIn;
    }

    public LocalTime getLogedOut() {
        return logedOut;
    }

    public void setLogedOut(LocalTime logedOut) {
        this.logedOut = logedOut;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
