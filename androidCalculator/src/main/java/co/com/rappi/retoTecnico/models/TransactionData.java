package co.com.rappi.retoTecnico.models;

import lombok.Data;

@Data
public class TransactionData {

    private int firstNum;
    private int secondNum;
    private String sign;
    private int result;
}
