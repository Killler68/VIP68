package practices.annotations;

import java.beans.Transient;

@Deprecated
public class Start {

    @Deprecated
    @MyAnn("some") // value = "some"
    public Start() {

    }

    @Transient
    @Deprecated
    public void method(@Deprecated int i) {

        @Deprecated
        int j;
    }
}
