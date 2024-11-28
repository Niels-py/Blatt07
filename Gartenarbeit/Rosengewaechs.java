public sealed class Rosengewaechs extends Pflanze permits Lorbeerkirsche, Himbeere {

  private int verbreitung;

  public Rosengewaechs(int maxLaenge, int wachstum, int laenge, int verbreitung) {
    super(maxLaenge, wachstum, laenge);
    this.verbreitung = verbreitung;
  }

  public int getVerbreitung() {
    return this.verbreitung;
  }

  @Override
  public void waessern() {
    int x = this.verbreitung + this.wachstum;
    this.laenge += this.laenge + x > maxLaenge ? 0 : x;
  }

  @Override
  public void schneiden(int x) {
    if (x < 0) return;
    this.laenge = 1;
  }
}
