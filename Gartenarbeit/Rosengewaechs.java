public sealed class Rosengewaechs extends Pflanze permits Lorbeerkirsche, Himbeere {

  protected int verbreitung;

  public Rosengewaechs(int maxLaenge, int wachstum, int laenge, int verbreitung) {
    super(maxLaenge, wachstum, laenge);
    this.verbreitung = verbreitung;
  }

  public int getVerbreitung() {
    return this.verbreitung;
  }

  @Override
  public void waessern() {
    int x = this.verbreitung * this.wachstum;
    this.laenge = Math.min(this.laenge + x, this.maxLaenge);
  }

  @Override
  public void schneiden(int x) {
    if (x < 0) return;
    this.laenge = Math.min(this.laenge, 1);
  }
}
