public class App {
    public static void main(String[] args) throws Exception {
        Koira koira1 = new Koira();
        koira1.paino = 5;
        koira1.rotu = "Mäyräkoira";
        koira1.liiku();

        Lintu lintu1 = new Lintu();
        lintu1.laji = "Kirjosieppo";
        lintu1.liiku();
    }
}

class Elain {
    public int paino;

    public void liiku()
    {
        System.out.println("Eläin liikkuu");
    }
}

class Koira extends Elain {
    public String rotu;

    @Override
    public void liiku()
    {
        System.out.println("Koira juoksee");
    }
}

class Lintu extends Elain {
    public String laji;

    @Override 
    public void liiku()
    {
        System.out.println("Lintu lentää");
    }
}
