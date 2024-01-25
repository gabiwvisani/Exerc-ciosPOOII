package ISP;

// Implementação para EconomicPrinter
class EconomicPrinter implements MultifunctionPrinter {
    @Override
    public void print() {
        System.out.println("Printing in economic mode");
    }

    @Override
    public void scan() {
        System.out.println("Scanning in economic mode");
    }

    @Override
    public void fax() {
        System.out.println("Faxing in economic mode");
    }

    @Override
    public void copy() {
        System.out.println("Copying in economic mode");
    }
}
