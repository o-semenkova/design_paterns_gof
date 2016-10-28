package state;

/**
 * Created by osemenkova on 10/28/2016.
 */
public class GumballMachineTestDrive {

    public static void main(String[] args){
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("----------------------");

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("----------------------");

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("----------------------");

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("----------------------");

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("----------------------");
    }
}
