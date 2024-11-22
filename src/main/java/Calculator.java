public class Calculator {
    CalculatorService service;

    public Calculator(CalculatorService service){
        this.service = service;
    }
    public int perform(int i, int j){
        return service.add(i,j)*i; //5*2 -> 10
        //return (i+j)*i;
    }
}
