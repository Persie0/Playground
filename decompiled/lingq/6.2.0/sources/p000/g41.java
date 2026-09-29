package p000;

import kotlinx.coroutines.AbstractC3208a;

/* JADX INFO: loaded from: classes.dex */
public final class g41 implements AutoCloseable, un1 {

    /* JADX INFO: renamed from: a */
    public final kn1 f40161a;

    public g41(kn1 kn1Var) {
        kn1Var.getClass();
        this.f40161a = kn1Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        AbstractC3208a.m15436c(this.f40161a, null);
    }

    @Override // p000.un1
    /* JADX INFO: renamed from: x */
    public final kn1 mo1309x() {
        return this.f40161a;
    }
}
