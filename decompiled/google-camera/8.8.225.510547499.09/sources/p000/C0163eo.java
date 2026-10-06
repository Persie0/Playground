package p000;

import android.view.View;

/* JADX INFO: renamed from: eo */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0163eo extends agb {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ LayoutInflaterFactory2C0179fd f14803a;

    public C0163eo(LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd) {
        this.f14803a = layoutInflaterFactory2C0179fd;
    }

    @Override // p000.agb, p000.aga
    /* JADX INFO: renamed from: a */
    public final void mo571a() {
        this.f14803a.f21381p.setAlpha(1.0f);
        this.f14803a.f21352K.m2596q(null);
        this.f14803a.f21352K = null;
    }

    @Override // p000.agb, p000.aga
    /* JADX INFO: renamed from: b */
    public final void mo572b() {
        this.f14803a.f21381p.setVisibility(0);
        if (this.f14803a.f21381p.getParent() instanceof View) {
            aff.m467c((View) this.f14803a.f21381p.getParent());
        }
    }
}
