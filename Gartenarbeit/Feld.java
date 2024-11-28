public class Feld {

  public static Pflanze auswahl(PflanzenPaar pair) {
    return switch (pair) {
      case PflanzenPaar(Rosengewaechs x, _) -> {
        yield x;
      }
      case PflanzenPaar(_, Rosengewaechs x) -> {
        yield x;
      }
      case PflanzenPaar(BlauerEisenhut a, Salbei b) when b.getLaenge() >= 5 -> {
        yield a;
      }
      case PflanzenPaar(Salbei a, BlauerEisenhut b) when a.getLaenge() >= 5 -> {
        yield b;
      }
      default -> {
        yield pair.a();
      }
    };
  }

  public static void main(String[] args) {
    System.out.println("Start");
    Himbeere himbeere = new Himbeere();
    Lorbeerkirsche lorbeerkirsche = new Lorbeerkirsche();
    Salbei salbeiLang = new Salbei();
    lorbeerkirsche.waessern();
    lorbeerkirsche.schneiden(6);
    salbeiLang.waessern();
    salbeiLang.waessern();
    salbeiLang.waessern();
    salbeiLang.waessern();
    Salbei salbei = new Salbei();
    BlauerEisenhut blauerEisenhut = new BlauerEisenhut();
    blauerEisenhut.schneiden(1);

    PflanzenPaar pair1 = new PflanzenPaar(himbeere, salbei);
    PflanzenPaar pair2 = new PflanzenPaar(salbei, lorbeerkirsche);
    PflanzenPaar pair3 = new PflanzenPaar(lorbeerkirsche, blauerEisenhut);
    PflanzenPaar pair4 = new PflanzenPaar(salbeiLang, blauerEisenhut);
    PflanzenPaar pair5 = new PflanzenPaar(salbei, blauerEisenhut);

    System.out.println("Auswahl:" + auswahl(pair1) + ", Laenge:" + auswahl(pair1).getLaenge());
    System.out.println("Auswahl:" + auswahl(pair2) + ", Laenge:" + auswahl(pair2).getLaenge());
    System.out.println("Auswahl:" + auswahl(pair3) + ", Laenge:" + auswahl(pair3).getLaenge());
    System.out.println("Auswahl:" + auswahl(pair4) + ", Laenge:" + auswahl(pair4).getLaenge());
    System.out.println("Auswahl:" + auswahl(pair5) + ", Laenge:" + auswahl(pair5).getLaenge());
  }
}
