public sealed class Pflanze permits BlauerEisenhut, Salbei, Rosengewaechs {

  protected int maxLaenge;
  protected int wachstum;
  protected int laenge;

  public Pflanze(int maxLaenge, int wachstum, int laenge) {
    this.maxLaenge = maxLaenge;
    this.wachstum = wachstum;
    this.laenge = laenge > maxLaenge ? 0 : laenge;
  }

  public final int getMaxLaenge() {
    return this.maxLaenge;
  }

  public final int getWachstum() {
    return this.wachstum;
  }

  public final int getLaenge() {
    return this.laenge;
  }

  public void waessern() {
    this.laenge = Math.min(this.laenge + this.wachstum, this.maxLaenge);
  }

  public void schneiden(int x) {
    if (x < 0) return;
    this.laenge = Math.max(0, this.laenge - x);
  }
}
