package PaymentMethod;

public class PaypalPayment extends Payment {
  private String paypalAccount;
  
  public PaypalPayment(double paymentAmount, String currency, String paypalAccount) {
    super(paymentAmount, currency);
    this.paypalAccount = paypalAccount;
  }
  
  public String getPaypalAccount() {
    return paypalAccount;
  }
  
  public void setPaypalAccount(String paypalAccount) {
    this.paypalAccount = paypalAccount;
  }
  
  @Override
  public String getPaymentInfo() {
    return "Paypal Payment: " + getPaymentAmount() + " " + getCurrency() + 
           ", Paypal Account: " + paypalAccount;
  }
}

  
