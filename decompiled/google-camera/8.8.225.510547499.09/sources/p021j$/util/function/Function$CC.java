package p021j$.util.function;

import java.util.function.Function;
import p021j$.desugar.sun.nio.p023fs.C0300n;

/* JADX INFO: renamed from: j$.util.function.Function$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Function$CC<T, R> {
    public static Function $default$andThen(Function function, Function function2) {
        function2.getClass();
        return new C0552d(function, function2, 0);
    }

    public static Function $default$compose(Function function, Function function2) {
        function2.getClass();
        return new C0552d(function, function2, 1);
    }

    public static <T> Function<T, T> identity() {
        return new C0300n();
    }
}
