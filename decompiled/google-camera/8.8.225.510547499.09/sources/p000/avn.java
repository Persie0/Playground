package p000;

import androidx.wear.widget.drawer.PageIndicatorView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class avn extends avi {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ PageIndicatorView f2541a;

    public avn(PageIndicatorView pageIndicatorView) {
        this.f2541a = pageIndicatorView;
    }

    @Override // p000.avi
    /* JADX INFO: renamed from: a */
    public final void mo2055a() {
        PageIndicatorView pageIndicatorView = this.f2541a;
        pageIndicatorView.f1768c = false;
        pageIndicatorView.animate().alpha(0.0f).setListener(null).setStartDelay(this.f2541a.f1766a).setDuration(this.f2541a.f1767b).start();
    }
}
