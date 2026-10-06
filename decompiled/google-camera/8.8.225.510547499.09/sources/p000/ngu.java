package p000;

import java.util.AbstractMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import p021j$.util.function.BiPredicate$CC;
import p021j$.util.stream.Stream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ngu implements AutoCloseable {
    /* JADX INFO: renamed from: d */
    public static ngu m17469d(Stream stream) {
        return new ngn(stream, igl.f30788u, ngl.f42222a, stream);
    }

    /* JADX INFO: renamed from: e */
    public static Map.Entry m17470e(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    /* JADX INFO: renamed from: a */
    public Stream mo17467a() {
        return mo17468b(ifs.f30686f);
    }

    /* JADX INFO: renamed from: b */
    public abstract Stream mo17468b(BiFunction biFunction);

    /* JADX INFO: renamed from: c */
    public final ngu m17471c(final Predicate predicate) {
        predicate.getClass();
        return m17469d(mo17467a().filter(new gfw(new BiPredicate() { // from class: ngm
            public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
                return BiPredicate$CC.$default$and(this, biPredicate);
            }

            public final /* synthetic */ BiPredicate negate() {
                return BiPredicate$CC.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public final /* synthetic */ BiPredicate m17466or(BiPredicate biPredicate) {
                return BiPredicate$CC.$default$or(this, biPredicate);
            }

            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return predicate.test(obj2);
            }
        }, 16)));
    }
}
