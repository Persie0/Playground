package p000;

import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;

/* JADX INFO: renamed from: fn */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0189fn extends agb {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0192fq f22763a;

    public C0189fn(C0192fq c0192fq) {
        this.f22763a = c0192fq;
    }

    @Override // p000.agb, p000.aga
    /* JADX INFO: renamed from: a */
    public final void mo571a() {
        View view;
        C0192fq c0192fq = this.f22763a;
        if (c0192fq.f23163k && (view = c0192fq.f23158f) != null) {
            view.setTranslationY(0.0f);
            this.f22763a.f23155c.setTranslationY(0.0f);
        }
        this.f22763a.f23155c.setVisibility(8);
        this.f22763a.f23155c.m1041a(false);
        C0192fq c0192fq2 = this.f22763a;
        c0192fq2.f23165m = null;
        InterfaceC0198fw interfaceC0198fw = c0192fq2.f23161i;
        if (interfaceC0198fw != null) {
            interfaceC0198fw.mo7669a(c0192fq2.f23160h);
            c0192fq2.f23160h = null;
            c0192fq2.f23161i = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f22763a.f23154b;
        if (actionBarOverlayLayout != null) {
            aff.m467c(actionBarOverlayLayout);
        }
    }
}
