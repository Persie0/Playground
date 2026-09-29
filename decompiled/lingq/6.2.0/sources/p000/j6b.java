package p000;

/* JADX INFO: loaded from: classes.dex */
public final class j6b extends h6b {
    @Override // p000.h6b, p000.bca
    /* JADX INFO: renamed from: g */
    public final boolean mo3616g() {
        return (this.f41852a.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // p000.h6b, p000.bca
    /* JADX INFO: renamed from: h */
    public final void mo3617h(boolean z) {
        this.f41852a.setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    @Override // p000.h6b, p000.bca
    /* JADX INFO: renamed from: i */
    public final void mo3618i(boolean z) {
        this.f41852a.setSystemBarsAppearance(z ? 8 : 0, 8);
    }
}
