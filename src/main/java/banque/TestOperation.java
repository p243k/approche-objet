package banque;

public abstract class TestOperation {
    public static void main(String[] args) {
        Operation[] operations = new Operation[5];
        operations[0] = new Credit("Juin", 50);
        operations[1] = new Debit("Mai", 50);
        operations[2] = new Credit("Mars", 50);
        operations[3] = new Debit("Avril", 50);

        for(Operation op : operations) {
            System.out.println("Operation réalisée : " + op.getType() +  ", réalisée en " + op.getDate() + "pour un montant de " + op.getMontant() + " €");
        }
    }
}
