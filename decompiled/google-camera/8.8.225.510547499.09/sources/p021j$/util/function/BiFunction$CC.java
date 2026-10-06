package p021j$.util.function;

import java.util.function.BiFunction;
import java.util.function.Function;
import p021j$.util.concurrent.C0542t;

/* JADX INFO: renamed from: j$.util.function.BiFunction$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class BiFunction$CC<T, U, R> {
    public static BiFunction $default$andThen(BiFunction biFunction, Function function) {
        function.getClass();
        return new C0542t(biFunction, function);
    }
}
