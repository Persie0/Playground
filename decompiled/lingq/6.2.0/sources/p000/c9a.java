package p000;

/* JADX INFO: loaded from: classes.dex */
public final class c9a implements in1 {

    /* JADX INFO: renamed from: b */
    public static final p58 f9771b = new p58(17);

    /* JADX INFO: renamed from: a */
    public final nn1 f9772a;

    public c9a(nn1 nn1Var) {
        this.f9772a = nn1Var;
    }

    @Override // p000.kn1
    public final Object fold(Object obj, zi3 zi3Var) {
        return zi3Var.invoke(obj, this);
    }

    @Override // p000.kn1
    public final in1 get(jn1 jn1Var) {
        return eh0.m11141v(this, jn1Var);
    }

    @Override // p000.in1
    public final jn1 getKey() {
        return f9771b;
    }

    @Override // p000.kn1
    public final kn1 minusKey(jn1 jn1Var) {
        return eh0.m11107D(this, jn1Var);
    }

    @Override // p000.kn1
    public final kn1 plus(kn1 kn1Var) {
        return eh0.m11113J(this, kn1Var);
    }
}
