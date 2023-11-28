package masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.utilMenu;

abstract class IterativeMenu extends QuitMenu{

    public IterativeMenu(String title) {
        super(title);
    }

    public void interact(){
        this.addOptions();
        do {
            this.interact_();
        } while (!this.isExecutedquitOption());
    }
}
