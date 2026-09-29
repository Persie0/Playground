package p000;

import kotlin.AbstractC3193b;

/* JADX INFO: loaded from: classes.dex */
public final class qi0 extends s60 {

    /* JADX INFO: renamed from: a */
    public sm0 f57800a;

    /* JADX INFO: renamed from: b */
    public vi3 f57801b;

    @Override // p000.s60
    /* JADX INFO: renamed from: a */
    public final void mo10450a() {
        this.f57801b = null;
        this.f57800a = null;
    }

    @Override // p000.s60
    /* JADX INFO: renamed from: b */
    public final void mo10451b(Throwable th) {
        sm0 sm0Var = this.f57800a;
        if (sm0Var != null) {
            sm0Var.resumeWith(AbstractC3193b.m15358a(th));
        }
    }
}
