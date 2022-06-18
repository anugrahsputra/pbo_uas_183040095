public class LingkaranImpl implements Lingkaran {
  private double jariJari;

  public LingkaranImpl(double jariJari) {
    this.jariJari = jariJari;
  }

  public double hitungLuasLingkaran() {
    return Math.PI * jariJari * jariJari;
  }
}