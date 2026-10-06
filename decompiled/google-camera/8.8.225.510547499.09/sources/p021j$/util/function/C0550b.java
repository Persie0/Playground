package p021j$.util.function;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.function.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0550b implements BiPredicate, Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f33247a;

    public /* synthetic */ C0550b(Object obj) {
        this.f33247a = obj;
    }

    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return BiPredicate$CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ BiPredicate negate() {
        return BiPredicate$CC.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public final /* synthetic */ BiPredicate m12579or(BiPredicate biPredicate) {
        return BiPredicate$CC.$default$or(this, biPredicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return !((Predicate) this.f33247a).test(obj);
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    /* JADX INFO: renamed from: negate, reason: collision with other method in class */
    public final /* synthetic */ Predicate m19851negate() {
        return Predicate$CC.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public final /* synthetic */ Predicate m12580or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        return !((BiPredicate) this.f33247a).test(obj, obj2);
    }
}
