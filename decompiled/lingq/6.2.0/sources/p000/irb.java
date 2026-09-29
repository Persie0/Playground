package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class irb {

    /* JADX INFO: renamed from: a */
    public final Object f44464a;

    /* JADX INFO: renamed from: b */
    public final Object f44465b;

    /* JADX INFO: renamed from: c */
    public final Object f44466c;

    public irb(Object obj, Object obj2, Object obj3) {
        this.f44464a = obj;
        this.f44465b = obj2;
        this.f44466c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m14081a() {
        Object obj = this.f44464a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f44465b);
        return new IllegalArgumentException(AbstractC3393o1.m17739n(ux5.m23000w("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.f44466c)));
    }
}
