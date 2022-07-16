package EXAMES.Exame2022.perg_Melga.model.fsm;

import EXAMES.Exame2022.perg_Melga.model.data.MelgaData;

class StatePronta extends MelgaAdapter {

   public StatePronta(MelgaContext context, MelgaData data) {
        super(context, data);
    }

    @Override
    public void descola() {
        context.changeState( new StateEmVoo(context, data));
    }

    @Override
    public void pica() {
        data.incrementaPicada();
        context.changeState(new StatePousada(context, data)); 
    }

    @Override
    public MelgaState getState() {
        return MelgaState.PRONTA;
    }
    
}