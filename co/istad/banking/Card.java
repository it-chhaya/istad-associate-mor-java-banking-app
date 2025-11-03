package practice.co.istad.banking;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Card {

    private String pin;
    private LocalDate expirationDate;
    private BigDecimal overLimit;
    private String cardType;

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public BigDecimal getOverLimit() {
        return overLimit;
    }

    public void setOverLimit(BigDecimal overLimit) {
        this.overLimit = overLimit;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Card(String pin, LocalDate expirationDate, BigDecimal overLimit, String cardType) {
        this.pin = pin;
        this.expirationDate = expirationDate;
        this.overLimit = overLimit;
        this.cardType = cardType;
    }
}

