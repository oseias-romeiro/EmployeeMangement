
package sistema;

import java.time.LocalDate;
import java.time.LocalDateTime;



public class Ponto extends Funcionario{
    private LocalDateTime logedIn;
    private LocalDateTime logedOut;
    private LocalDate date;
    

    public Ponto(){
        
    }
    public LocalDateTime getLogedIn() {
        return logedIn;
    }

    public void setLogedIn(LocalDateTime logedIn) {
        this.logedIn = logedIn;
    }

    public LocalDateTime getLogedOut() {
        return logedOut;
    }

    public void setLogedOut(LocalDateTime logedOut) {
        this.logedOut = logedOut;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    
    
}
