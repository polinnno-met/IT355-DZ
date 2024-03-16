package met.service;
import met.model.JednakostranicniTrougao;
import met.model.Krug;
import met.model.Kvadrat;
import met.model.Oblik;
import org.springframework.stereotype.Service;

@Service
public class OblikServis {
    private final Oblik kvadrat;
    private final Oblik krug;
    private final Oblik trougao;

    public OblikServis() {
        kvadrat = new Kvadrat(5);
        krug = new Krug(3);
        trougao = new JednakostranicniTrougao(4);
    }

    public Oblik getKvadrat() {
        return kvadrat;
    }

    public Oblik getKrug() {
        return krug;
    }

    public Oblik getTrougao() {
        return trougao;
    }
}
