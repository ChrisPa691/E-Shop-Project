package PaymentMethod;

public class CreditCardPayment extends Payment {
  private String cardNumber;
  private String cardHolderName;
  private String cvv;
  
  public CreditCardPayment(double paymentAmount, String currency, String cardNumber, String cardHolderName, String cvv) {
    super(paymentAmount, currency);
    this.cardNumber = cardNumber;
    this.cardHolderName = cardHolderName;
    if (cvv.length() == 3) {
      this.cvv = cvv;
    } else {
      throw new IllegalArgumentException("CVV must have 3 digits.");
    }
  }
  
  public String getCardNumber() {
    return cardNumber;
  }
  
  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }
  
  public String getCardHolderName() {
    return cardHolderName;
  }
  
  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }
  
  public String getCvv() {
    return cvv;
  }
  
  public void setCvv(String cvv) {
    if (cvv.length() == 3) {
      this.cvv = cvv;
    } else {
      throw new IllegalArgumentException("CVV must have 3 digits.");
    }
  }
  
  @Override
  public String getPaymentInfo() {
    return "Credit Card Payment: " + getPaymentAmount() + " " + getCurrency() + 
           ", Card Number: " + cardNumber + ", Card Holder Name: " + cardHolderName + ", CVV: " + cvv;
  }
}


