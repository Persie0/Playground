package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class dpi extends dpe {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ dpj f12209a;

    public dpi(dpj dpjVar) {
        this.f12209a = dpjVar;
    }

    @Override // p000.dpe
    /* JADX INFO: renamed from: a */
    public void mo6542a() {
        this.f12209a.f12214e.mo3415bf(false);
        if (this.f12209a.f12210a.getAlpha() != 0.0f) {
            this.f12209a.f12212c.reverse();
        }
    }

    @Override // p000.dpe
    /* JADX INFO: renamed from: c */
    public void mo6544c(boolean z) {
        this.f12209a.f12214e.mo3415bf(false);
        if (!z) {
            this.f12209a.f12210a.setAlpha(0.0f);
            this.f12209a.f12212c.cancel();
        } else if (this.f12209a.f12210a.getAlpha() != 0.0f) {
            this.f12209a.f12212c.reverse();
        }
    }

    @Override // p000.dpe
    /* JADX INFO: renamed from: d */
    public void mo6545d(boolean z, boolean z2) {
        this.f12209a.m6546i(false, z2);
    }

    @Override // p000.dpe, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f12209a.f12210a.setVisibility(0);
        this.f12209a.f12211b.setEnabled(true);
        this.f12209a.f12214e.mo3415bf(true);
    }

    @Override // p000.dpe, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        this.f12209a.f12211b.setEnabled(false);
    }
}
