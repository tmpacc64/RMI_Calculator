package rmi_calculator;
import java.rmi.*;
import java.rmi.server.*;
public class Calculator extends UnicastRemoteObject implements ICalculator {
    public Calculator() throws RemoteException {super();}
	@Override
    public double add(double x, double y) throws RemoteException {return x + y;}
	@Override
    public double sub(double x, double y) throws RemoteException {return x - y;}
    @Override
    public double mul(double x, double y) throws RemoteException {return x * y;}
	@Override
    public double div(double x, double y) throws RemoteException {return x / y;}
}
