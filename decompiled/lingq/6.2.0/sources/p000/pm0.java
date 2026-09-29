package p000;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes2.dex */
public final class pm0 extends p6d {

    /* JADX INFO: renamed from: a */
    public final Typeface f56439a;

    /* JADX INFO: renamed from: b */
    public final ck6 f56440b;

    /* JADX INFO: renamed from: c */
    public boolean f56441c;

    public pm0(ck6 ck6Var, Typeface typeface) {
        this.f56439a = typeface;
        this.f56440b = ck6Var;
    }

    @Override // p000.p6d
    /* JADX INFO: renamed from: b */
    public final void mo33b(int i) {
        if (this.f56441c) {
            return;
        }
        c51 c51Var = (c51) this.f56440b.f10194b;
        if (c51Var.m4325l(this.f56439a)) {
            c51Var.m4323j(false);
        }
    }

    @Override // p000.p6d
    /* JADX INFO: renamed from: c */
    public final void mo34c(Typeface typeface, boolean z) {
        if (this.f56441c) {
            return;
        }
        c51 c51Var = (c51) this.f56440b.f10194b;
        if (c51Var.m4325l(typeface)) {
            c51Var.m4323j(false);
        }
    }
}
