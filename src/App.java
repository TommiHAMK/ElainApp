public class App {
    public static void main(String[] args) throws Exception {
        Koira koira1 = new Koira();
        koira1.liiku();
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
}

class Lintu extends Elain {
    public String laji;
}
