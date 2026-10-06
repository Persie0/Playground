package p021j$.util.function;

import java.util.function.BiPredicate;

/* JADX INFO: renamed from: j$.util.function.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0549a implements BiPredicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33244a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BiPredicate f33245b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BiPredicate f33246c;

    public /* synthetic */ C0549a(BiPredicate biPredicate, BiPredicate biPredicate2, int i) {
        this.f33244a = i;
        this.f33245b = biPredicate;
        this.f33246c = biPredicate2;
    }

    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        switch (this.f33244a) {
            case 0:
                break;
            default:
                break;
        }
        return BiPredicate$CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ BiPredicate negate() {
        switch (this.f33244a) {
            case 0:
                break;
            default:
                break;
        }
        return BiPredicate$CC.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public final /* synthetic */ BiPredicate m12578or(BiPredicate biPredicate) {
        switch (this.f33244a) {
            case 0:
                break;
            default:
                break;
        }
        return BiPredicate$CC.$default$or(this, biPredicate);
    }

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        int i = this.f33244a;
        BiPredicate biPredicate = this.f33246c;
        BiPredicate biPredicate2 = this.f33245b;
        switch (i) {
            case 0:
                return biPredicate2.test(obj, obj2) && biPredicate.test(obj, obj2);
            default:
                return biPredicate2.test(obj, obj2) || biPredicate.test(obj, obj2);
        }
    }
}
