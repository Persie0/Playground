package p000;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class irf implements hgp {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ irg f31860a;

    public irf(irg irgVar) {
        this.f31860a = irgVar;
    }

    @Override // p000.hgp
    /* JADX INFO: renamed from: a */
    public final void mo7757a() {
        if (TextUtils.isEmpty(this.f31860a.f31901y)) {
            return;
        }
        irg irgVar = this.f31860a;
        irgVar.mo11607g(irgVar.f31901y);
        this.f31860a.f31901y = null;
    }

    @Override // p000.hgp
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo7758b() {
    }

    @Override // p000.hgp
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo7759c() {
    }

    @Override // p000.hgp
    /* JADX INFO: renamed from: d */
    public final void mo7760d() {
        synchronized (this.f31860a.f31889m) {
            irg irgVar = this.f31860a;
            irgVar.f31901y = irgVar.f31900x;
        }
        this.f31860a.mo11606f();
    }

    @Override // p000.hgp
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void mo7761e() {
    }
}
