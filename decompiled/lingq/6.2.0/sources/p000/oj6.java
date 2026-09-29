package p000;

import androidx.compose.runtime.snapshots.C0285a;

/* JADX INFO: loaded from: classes.dex */
public final class oj6 extends jc9 {

    /* JADX INFO: renamed from: e */
    public final vi3 f54465e;

    /* JADX INFO: renamed from: f */
    public final jc9 f54466f;

    public oj6(long j, C0285a c0285a, vi3 vi3Var, jc9 jc9Var) {
        super(j, c0285a);
        this.f54465e = vi3Var;
        this.f54466f = jc9Var;
        jc9Var.mo3166k();
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: c */
    public final void mo3162c() {
        jc9 jc9Var = this.f54466f;
        if (this.f45418c) {
            return;
        }
        if (this.f45417b != jc9Var.mo3582g()) {
            m14391a();
        }
        jc9Var.mo3167l();
        this.f45418c = true;
        synchronized (nc9.f52602c) {
            m14394o();
        }
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: e */
    public final vi3 mo3163e() {
        return this.f54465e;
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
        AbstractC3695vr.m23487E();
        throw null;
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: l */
    public final void mo3167l() {
        AbstractC3695vr.m23487E();
        throw null;
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
        return new oj6(this.f45417b, this.f45416a, nc9.m17359k(vi3Var, this.f54465e, true), this.f54466f);
    }
}
