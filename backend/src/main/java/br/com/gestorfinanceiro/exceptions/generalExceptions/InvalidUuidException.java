package br.com.gestorfinanceiro.exceptions.generalExceptions;

public class InvalidUuidException extends RuntimeException {
    public InvalidUuidException() {
        super("O UUID não pode ser nulo ou vazio");
    }
}
