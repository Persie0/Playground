package p000;

import androidx.compose.runtime.snapshots.C0285a;

/* JADX INFO: loaded from: classes.dex */
public final class cba extends jc9 {

    /* JADX INFO: renamed from: e */
    public final jc9 f9853e;

    /* JADX INFO: renamed from: f */
    public final boolean f9854f;

    /* JADX INFO: renamed from: g */
    public final boolean f9855g;

    /* JADX INFO: renamed from: h */
    public vi3 f9856h;

    /* JADX INFO: renamed from: i */
    public final long f9857i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cba(jc9 jc9Var, vi3 vi3Var, boolean z, boolean z2) {
        vi3 vi3VarMo3163e;
        super(0L, C0285a.f3799e);
        wx8 wx8Var = nc9.f52600a;
        this.f9853e = jc9Var;
        this.f9854f = z;
        this.f9855g = z2;
        this.f9856h = nc9.m17359k(vi3Var, (jc9Var == null || (vi3VarMo3163e = jc9Var.mo3163e()) == null) ? nc9.f52609j.f60419e : vi3VarMo3163e, z);
        this.f9857i = r46.m20393t();
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: c */
    public final void mo3162c() {
        jc9 jc9Var;
        this.f45418c = true;
        if (!this.f9855g || (jc9Var = this.f9853e) == null) {
            return;
        }
        jc9Var.mo3162c();
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: d */
    public final C0285a mo3581d() {
        return m4495v().mo3581d();
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: e */
    public final vi3 mo3163e() {
        return this.f9856h;
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: f */
    public final boolean mo3164f() {
        return m4495v().mo3164f();
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: g */
    public final long mo3582g() {
        return m4495v().mo3582g();
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
        m4495v().mo3168m();
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: n */
    public final void mo3169n(ph9 ph9Var) {
        m4495v().mo3169n(ph9Var);
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: u */
    public final jc9 mo3170u(vi3 vi3Var) {
        vi3 vi3VarM17359k = nc9.m17359k(vi3Var, this.f9856h, true);
        return !this.f9854f ? nc9.m17355g(m4495v().mo3170u(null), vi3VarM17359k, true) : m4495v().mo3170u(vi3VarM17359k);
    }

    /* JADX INFO: renamed from: v */
    public final jc9 m4495v() {
        jc9 jc9Var = this.f9853e;
        return jc9Var == null ? nc9.f52609j : jc9Var;
    }
}
