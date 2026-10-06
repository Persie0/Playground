package p021j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.Comparator$-EL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Comparator$EL {
    public static Comparator reversed(Comparator comparator) {
        return Collections.reverseOrder(comparator);
    }

    public static Comparator thenComparing(Comparator comparator, Function function) {
        Comparator comparatorComparing = Comparator$CC.comparing(function);
        comparatorComparing.getClass();
        return new C0546d(comparator, comparatorComparing);
    }
}
