package p021j$.util.function;

import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.function.Predicate$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Predicate$CC<T> {
    public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
        predicate2.getClass();
        return new C0557i(predicate, predicate2, 0);
    }

    public static Predicate $default$negate(Predicate predicate) {
        return new C0550b(predicate);
    }

    public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
        predicate2.getClass();
        return new C0557i(predicate, predicate2, 1);
    }
}
