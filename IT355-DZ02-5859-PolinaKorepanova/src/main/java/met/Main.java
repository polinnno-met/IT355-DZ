package met;
import met.config.Config;
import met.model.JednakostranicniTrougao;
import met.model.Krug;
import met.model.Kvadrat;
import met.model.Oblik;
import met.service.OblikServis;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        OblikServis oblikServis = context.getBean(OblikServis.class);

        Oblik kvadrat = oblikServis.getKvadrat();
        Oblik krug = oblikServis.getKrug();
        Oblik trougao = oblikServis.getTrougao();

        System.out.println("Kvadrat (strana: " + ((Kvadrat)kvadrat).getStrana() + ") -- Obim: " + String.format("%.2f", kvadrat.obim()) + ", " +
                "Povrsina: " + String.format("%.2f", kvadrat.povrsina()));
        System.out.println("Krug (radius: " + ((Krug)krug).getRadius() + ") -- Obim: " + String.format("%.2f", krug.obim()) + ", " +
                "Povrsina: " + String.format("%.2f", krug.povrsina()));
        System.out.println("Trougao (strana:" + ((JednakostranicniTrougao)trougao).getStrana() + ") -- Obim: " + String.format("%.2f", trougao.obim()) + ", " +
                "Povrsina: " + String.format("%.2f", trougao.povrsina()));
    }
}
