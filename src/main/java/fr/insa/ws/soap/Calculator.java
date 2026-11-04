package fr.insa.ws.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(serviceName="Calculator")
public class Calculator {

    @WebMethod(operationName="Add")
    public int add(@WebParam(name="intA") int A, @WebParam(name="intB") int B) {
        return A + B;
    }

    @WebMethod(operationName="Subtract")
    public int subtract(@WebParam(name="intA") int A, @WebParam(name="intB") int B) {
        return A - B;
    }

    @WebMethod(operationName="Multiply")
    public int multiply(@WebParam(name="intA") int A, @WebParam(name="intB") int B) {
        return A * B;
    }

    @WebMethod(operationName="Divide")
    public int divide(@WebParam(name="intA") int A, @WebParam(name="intB") int B) {
        return A / B;
    }

}
