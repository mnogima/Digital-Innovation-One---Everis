package one.digitalinnovation;

public class Fila<T> {

    private No<T> refUltimoNo;

    public Fila() {
        this.refUltimoNo = null;
    }

    public boolean isEmpty(){
        return refUltimoNo == null? true : false;
    }

    public T first(){
        if(!isEmpty()){
            No primeiroNo = refUltimoNo;
            while(true){
                if(primeiroNo.getRefNo()!=null){
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    /*public void enqueue(No novoNo){
        novoNo.setRefNo(refUltimoNo);
        refUltimoNo = novoNo;
    }*/

    public void enqueue(T obj){
        No novoNo = new No(obj);
        novoNo.setRefNo(refUltimoNo);
        refUltimoNo = novoNo;
    }


    public T dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refUltimoNo;
            No noAuxiliar = refUltimoNo;
            while(true){
                if(primeiroNo.getRefNo()!=null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refUltimoNo;
        if(refUltimoNo != null){
            while(true){
                stringRetorno += "[No{objeto = " + noAuxiliar.getObject() + "}]--->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
