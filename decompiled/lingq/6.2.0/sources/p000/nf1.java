package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nf1 implements hz6, in1 {

    /* JADX INFO: renamed from: b */
    public static final ho5 f52669b = new ho5(9);

    /* JADX INFO: renamed from: a */
    public final tj3 f52670a;

    public nf1(tj3 tj3Var) {
        this.f52670a = tj3Var;
    }

    @Override // p000.kn1
    public final Object fold(Object obj, zi3 zi3Var) {
        return zi3Var.invoke(obj, this);
    }

    @Override // p000.hz6
    /* JADX INFO: renamed from: g */
    public final List mo12104g(Integer num) {
        return this.f52670a.m22090H();
    }

    @Override // p000.kn1
    public final /* bridge */ in1 get(jn1 jn1Var) {
        return eh0.m11141v(this, jn1Var);
    }

    @Override // p000.in1
    public final jn1 getKey() {
        return f52669b;
    }

    @Override // p000.hz6
    /* JADX INFO: renamed from: h */
    public final boolean mo12105h() {
        return this.f52670a.f62368C;
    }

    @Override // p000.kn1
    public final /* bridge */ kn1 minusKey(jn1 jn1Var) {
        return eh0.m11107D(this, jn1Var);
    }

    @Override // p000.kn1
    public final /* bridge */ kn1 plus(kn1 kn1Var) {
        return eh0.m11113J(this, kn1Var);
    }
}
