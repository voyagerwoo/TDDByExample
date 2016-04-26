/**
 * Created by wymstar on 4/27/16.
 */
public abstract class Money {
  protected int amount;

  public boolean equals(Object object) {
    Money money = (Money) object;
    return this.amount == money.amount
            && this.getClass().equals(money.getClass());
  }

  static Dollar dollar(int amount) {
    return new Dollar(amount);
  }

  abstract Money times(int multiplier) ;

  public static Franc franc(int amount) {
    return new Franc(amount);
  }
}