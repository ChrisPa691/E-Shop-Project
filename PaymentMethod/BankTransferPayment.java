package PaymentMethod;

public class BankTransferPayment extends Payment {
  private String beneficiaryName;
  private String IBAN;
  private String bankName;
  private String accountNumber;
  
  public BankTransferPayment(double paymentAmount, String currency, String beneficiaryName, String IBAN, String bankName, String accountNumber) {
    super(paymentAmount, currency);
    this.beneficiaryName = beneficiaryName;
    this.IBAN = IBAN;
    this.bankName = bankName;
    this.accountNumber = accountNumber;
  }
  
  public String getBeneficiaryName() {
    return beneficiaryName;
  }
  
  public void setBeneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
  }
  
  public String getIBAN() {
    return IBAN;
  }
  
  public void setIBAN(String IBAN) {
    this.IBAN = IBAN;
  }
  
  public String getBankName() {
    return bankName;
  }
  
  public void setBankName(String bankName) {
    this.bankName = bankName;
  }
  
  public String getAccountNumber() {
    return accountNumber;
  }
  
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }
  
  @Override
  public String getPaymentInfo() {
    return "Bank Transfer Payment: " + getPaymentAmount() + " " + getCurrency() + 
           ", Beneficiary Name: " + beneficiaryName + ", IBAN: " + IBAN + 
           ", Bank Name: " + bankName + ", Account Number: " + accountNumber;
  }
}
