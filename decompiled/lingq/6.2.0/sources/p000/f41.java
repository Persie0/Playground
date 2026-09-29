package p000;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class f41 implements un1, Closeable {

    /* JADX INFO: renamed from: a */
    public final kn1 f38387a;

    public f41(kn1 kn1Var) {
        kn1Var.getClass();
        this.f38387a = kn1Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        vz1.m23637j(this, null);
    }

    @Override // p000.un1
    /* JADX INFO: renamed from: x */
    public final kn1 mo1309x() {
        return this.f38387a;
    }
}
