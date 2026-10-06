package p000;

import android.support.wearable.view.drawer.PageIndicatorView;

/* JADX INFO: renamed from: pc */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0898pc extends C0897pb {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ PageIndicatorView f47379a;

    public C0898pc(PageIndicatorView pageIndicatorView) {
        this.f47379a = pageIndicatorView;
    }

    @Override // p000.C0897pb
    /* JADX INFO: renamed from: a */
    public final void mo19286a() {
        PageIndicatorView pageIndicatorView = this.f47379a;
        pageIndicatorView.f1385c = false;
        pageIndicatorView.animate().alpha(0.0f).setListener(null).setStartDelay(this.f47379a.f1383a).setDuration(this.f47379a.f1384b).start();
    }
}
