public final class Lorbeerkirsche extends Rosengewaechs {

  public Lorbeerkirsche() {
    super(20, 2, 1, 3);
  }

  @Override
  public void schneiden(int x) {
    if (x < 0) return;
    this.laenge = Math.max(0, this.laenge - (x / 2));
  }
}
