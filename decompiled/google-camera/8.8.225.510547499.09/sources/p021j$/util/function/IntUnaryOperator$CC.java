package p021j$.util.function;

import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: j$.util.function.IntUnaryOperator$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class IntUnaryOperator$CC {
    public static IntUnaryOperator $default$andThen(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2) {
        intUnaryOperator2.getClass();
        return new C0554f(intUnaryOperator, intUnaryOperator2, 1);
    }

    public static IntUnaryOperator $default$compose(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2) {
        intUnaryOperator2.getClass();
        return new C0554f(intUnaryOperator, intUnaryOperator2, 0);
    }
}
