package p000;

import androidx.room.coroutines.C0741b;

/* JADX INFO: loaded from: classes.dex */
public final class z47 implements in1 {

    /* JADX INFO: renamed from: b */
    public static final p58 f70896b = new p58(14);

    /* JADX INFO: renamed from: a */
    public final C0741b f70897a;

    public z47(C0741b c0741b) {
        this.f70897a = c0741b;
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
        return f70896b;
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
