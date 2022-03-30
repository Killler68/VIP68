package generics.example;

public class GenericStorage<A, B, C, D> {

    private A item1;
    private B item2;
    private C item3;
    private D item4;

    //region A
    public A getItem1() {
        return item1;
    }

    public void setItem1(A item1) {
        this.item1 = item1;
    }
    //endregion
    
    //region B
    public B getItem2() {
        return item2;
    }

    public void setItem2(B item2) {
        this.item2 = item2;
    }
    //endregion

    //region C
    public C getItem3() {
        return item3;
    }

    public void setItem3(C item3) {
        this.item3 = item3;
    }
    //endregion

    //region D
    public D getItem4() {
        return item4;
    }

    public void setItem4(D item4) {
        this.item4 = item4;
    }
    //endregion
}
