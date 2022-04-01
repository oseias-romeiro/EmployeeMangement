
package sistema;

import java.time.LocalDateTime;


public class Ponto {
    private LocalDateTime logedIn;
    private LocalDateTime logedOut;

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
    
    
}
