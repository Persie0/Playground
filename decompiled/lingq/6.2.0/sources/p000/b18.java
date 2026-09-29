package p000;

import androidx.compose.runtime.snapshots.C0285a;

/* JADX INFO: loaded from: classes.dex */
public final class b18 extends jc9 {

    /* JADX INFO: renamed from: e */
    public final vi3 f7763e;

    /* JADX INFO: renamed from: f */
    public int f7764f;

    public b18(long j, C0285a c0285a, vi3 vi3Var) {
        super(j, c0285a);
        this.f7763e = vi3Var;
        this.f7764f = 1;
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: c */
    public final void mo3162c() {
        if (this.f45418c) {
            return;
        }
        mo3167l();
        this.f45418c = true;
        synchronized (nc9.f52602c) {
            m14394o();
        }
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: e */
    public final vi3 mo3163e() {
        return this.f7763e;
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: f */
    public final boolean mo3164f() {
        return true;
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: i */
    public final vi3 mo3165i() {
        return null;
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: k */
    public final void mo3166k() {
        this.f7764f++;
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: l */
    public final void mo3167l() {
        int i = this.f7764f - 1;
        this.f7764f = i;
        if (i == 0) {
            m14391a();
        }
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: m */
    public final void mo3168m() {
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: n */
    public final void mo3169n(ph9 ph9Var) {
        wx8 wx8Var = nc9.f52600a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: u */
    public final jc9 mo3170u(vi3 vi3Var) {
        nc9.m17351c(this);
        return new oj6(this.f45417b, this.f45416a, nc9.m17359k(vi3Var, this.f7763e, true), this);
    }
}
