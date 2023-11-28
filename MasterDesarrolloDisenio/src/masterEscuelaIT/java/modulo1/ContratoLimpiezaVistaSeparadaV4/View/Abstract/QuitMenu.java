package masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.Abstract;


import masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.Model.QuitOption;

public abstract class QuitMenu extends Menu {
    private QuitOption quitOption;
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
