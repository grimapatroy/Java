package masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.utilMenu;

abstract public class QuitMenu extends Menu {
    private  QuitOption quitOption;
    public QuitMenu(String title) {
        super(title);
        this.quitOption = new QuitOption();
    }

    protected boolean isExecutedquitOption() {
        return this.quitOption.isExecuted();
    }

    protected void showTitles() {
        if (!this.hasOption(this.quitOption)) {
            this.add(this.quitOption);
        }
        super.showTitles();
    }

}
