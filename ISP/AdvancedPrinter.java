package ISP;

// Implementação para AdvancedPrinter
class AdvancedPrinter implements MultifunctionPrinter {
    @Override
    public void print() {
        System.out.println("Printing in advanced mode");
    }

    @Override
    public void scan() {
        System.out.println("Scanning in advanced mode");
    }

    @Override
    public void fax() {
        System.out.println("Faxing in advanced mode");
    }

    @Override
    public void copy() {
        System.out.println("Copying in advanced mode");
    }
}
