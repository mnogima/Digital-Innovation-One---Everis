package one.digitalinnovation;

public class No<T> {

    private T object;   //object será o conteúdo do nó.
    private No<T> refNo;


    public No() {
    }

    public No(T object) {
        this.refNo = null;
        this.object = object;
    }


    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }



}
