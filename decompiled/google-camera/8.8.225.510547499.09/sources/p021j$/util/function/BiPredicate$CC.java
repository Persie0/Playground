package p021j$.util.function;

import java.util.function.BiPredicate;

/* JADX INFO: renamed from: j$.util.function.BiPredicate$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class BiPredicate$CC<T, U> {
    public static BiPredicate $default$and(BiPredicate biPredicate, BiPredicate biPredicate2) {
        biPredicate2.getClass();
        return new C0549a(biPredicate, biPredicate2, 0);
    }

    public static BiPredicate $default$negate(BiPredicate biPredicate) {
        return new C0550b(biPredicate);
    }

    public static BiPredicate $default$or(BiPredicate biPredicate, BiPredicate biPredicate2) {
        biPredicate2.getClass();
        return new C0549a(biPredicate, biPredicate2, 1);
    }
}
