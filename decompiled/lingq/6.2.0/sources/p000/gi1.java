package p000;

import androidx.room.coroutines.C0744e;

/* JADX INFO: loaded from: classes2.dex */
public final class gi1 implements in1 {

    /* JADX INFO: renamed from: a */
    public final jn1 f40844a;

    /* JADX INFO: renamed from: b */
    public final C0744e f40845b;

    public gi1(jn1 jn1Var, C0744e c0744e) {
        c0744e.getClass();
        this.f40844a = jn1Var;
        this.f40845b = c0744e;
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
        return this.f40844a;
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
