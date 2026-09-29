package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class zq6 extends m88 {

    /* JADX INFO: renamed from: c */
    public final m88 f71973c;

    /* JADX INFO: renamed from: d */
    public final e18 f71974d;

    /* JADX INFO: renamed from: e */
    public IOException f71975e;

    public zq6(m88 m88Var) {
        this.f71973c = m88Var;
        this.f71974d = new e18(new bd0(this, m88Var.mo3003e()));
    }

    @Override // p000.m88
    /* JADX INFO: renamed from: b */
    public final long mo3001b() {
        return this.f71973c.mo3001b();
    }

    @Override // p000.m88
    /* JADX INFO: renamed from: c */
    public final xv5 mo3002c() {
        return this.f71973c.mo3002c();
    }

    @Override // p000.m88, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f71973c.close();
    }

    @Override // p000.m88
    /* JADX INFO: renamed from: e */
    public final hj0 mo3003e() {
        return this.f71974d;
    }
}
