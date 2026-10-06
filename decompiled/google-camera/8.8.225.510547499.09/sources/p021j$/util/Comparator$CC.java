package p021j$.util;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: j$.util.Comparator$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Comparator$CC<T> {
    public static <T, U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T, ? extends U> function) {
        function.getClass();
        return new C0547e(1, function);
    }

    public static <T> Comparator<T> comparingInt(ToIntFunction<? super T> toIntFunction) {
        toIntFunction.getClass();
        return new C0547e(0, toIntFunction);
    }
}
