package state;

/**
 * Created by osemenkova on 10/28/2016.
 */
public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    public void ejectQuarter() {
        System.out.println("Sorry, you are already turned the crank");
    }

    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    public void dispense() {
//        System.out.println("A gumball comes rolling out the slot");
//        gumballMachine.setCount(gumballMachine.getCount() - 1);
//        if(gumballMachine.getCount() == 0){
//            System.out.println("Oops, out of gumballs!");
//            gumballMachine.setState(gumballMachine.getSoldOutState());
//        }else{
//            gumballMachine.setState(gumballMachine.getHasQuarterState());
//        }
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            System.out.println("Ooops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
