package one.digitalinnovation;

public class Pilha {

    private No topo;


    public Pilha() {
        this.topo = null;
    }

    public void push(No novoNo){
        No noAuxiliar = topo;
        topo = novoNo;
        topo.setRefNo(noAuxiliar);

    }

    public No pop(){
        if(this.isEmpty() == false){
            No noPopped = topo;
            topo = topo.getRefNo();
            return noPopped;
        }
        return null;
    }

    public No top(){
        return topo;
    }

    public boolean isEmpty() {
        /*
        if(this.refNoEntradaPilha == null){
            return true;
        }
        return false;
         */
        return topo == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "---------------------\n";
        stringRetorno += "        Pilha\n";
        stringRetorno += "-----------------------\n";

        No noAuxiliar = topo;

        while (true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado = " +noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo(); //RefNo é o nome que está abaixo.
            }else{
                break;
            }
        }
        stringRetorno += "=========================\n";
        return stringRetorno;

    }
}
