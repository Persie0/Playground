package p000;

/* JADX INFO: renamed from: c0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0830c0 implements in1 {

    /* JADX INFO: renamed from: a */
    public final jn1 f9216a;

    public AbstractC0830c0(jn1 jn1Var) {
        this.f9216a = jn1Var;
    }

    @Override // p000.kn1
    public final Object fold(Object obj, zi3 zi3Var) {
        return zi3Var.invoke(obj, this);
    }

    @Override // p000.kn1
    public /* bridge */ in1 get(jn1 jn1Var) {
        return eh0.m11141v(this, jn1Var);
    }

    @Override // p000.in1
    public final jn1 getKey() {
        return this.f9216a;
    }

    @Override // p000.kn1
    public /* bridge */ kn1 minusKey(jn1 jn1Var) {
        return eh0.m11107D(this, jn1Var);
    }

    @Override // p000.kn1
    public final /* bridge */ kn1 plus(kn1 kn1Var) {
        return eh0.m11113J(this, kn1Var);
    }
}
