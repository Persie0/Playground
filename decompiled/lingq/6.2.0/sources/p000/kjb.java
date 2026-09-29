package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class kjb {

    /* JADX INFO: renamed from: a */
    public final Object f47410a;

    /* JADX INFO: renamed from: b */
    public final Object f47411b;

    /* JADX INFO: renamed from: c */
    public final Object f47412c;

    public kjb(Object obj, Object obj2, Object obj3) {
        this.f47410a = obj;
        this.f47411b = obj2;
        this.f47412c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m15276a() {
        Object obj = this.f47410a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f47411b);
        return new IllegalArgumentException(AbstractC3393o1.m17739n(ux5.m23000w("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.f47412c)));
    }
}
