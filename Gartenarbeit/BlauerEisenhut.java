public final class BlauerEisenhut extends Pflanze {

  public BlauerEisenhut() {
    super(Integer.MAX_VALUE, 1, 1);
  }

  @Override
  public void schneiden(int x) {
    if (x < 0) return;
    this.laenge = 1;
  }
}
