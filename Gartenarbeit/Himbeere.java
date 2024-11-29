public final class Himbeere extends Rosengewaechs {

  public Himbeere() {
    super(10, 1, 1, 2);
  }

  /*
   * Methods
   */
  @Override
  public void schneiden(int x) {
    if (x < 0) return;
    this.laenge = Math.max(0, this.laenge - x);
  }
}
