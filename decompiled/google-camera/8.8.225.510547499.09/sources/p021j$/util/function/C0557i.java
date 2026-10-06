package p021j$.util.function;

import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.function.i */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0557i implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33263a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Predicate f33264b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Predicate f33265c;

    public /* synthetic */ C0557i(Predicate predicate, Predicate predicate2, int i) {
        this.f33263a = i;
        this.f33264b = predicate;
        this.f33265c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f33263a) {
            case 0:
                break;
            default:
                break;
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f33263a) {
            case 0:
                break;
            default:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public final /* synthetic */ Predicate m12585or(Predicate predicate) {
        switch (this.f33263a) {
            case 0:
                break;
            default:
                break;
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.f33263a;
        Predicate predicate = this.f33265c;
        Predicate predicate2 = this.f33264b;
        switch (i) {
            case 0:
                return predicate2.test(obj) && predicate.test(obj);
            default:
                return predicate2.test(obj) || predicate.test(obj);
        }
    }
}
