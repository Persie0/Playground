package p000;

import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class agi extends agh {

    /* JADX INFO: renamed from: c */
    private acr f301c;

    public agi(ago agoVar, WindowInsets windowInsets) {
        super(agoVar, windowInsets);
        this.f301c = null;
    }

    @Override // p000.agm
    /* JADX INFO: renamed from: j */
    public final acr mo590j() {
        if (this.f301c == null) {
            this.f301c = acr.m220c(this.f297a.getStableInsetLeft(), this.f297a.getStableInsetTop(), this.f297a.getStableInsetRight(), this.f297a.getStableInsetBottom());
        }
        return this.f301c;
    }

    @Override // p000.agm
    /* JADX INFO: renamed from: k */
    public ago mo591k() {
        return ago.m601m(this.f297a.consumeStableInsets());
    }

    @Override // p000.agm
    /* JADX INFO: renamed from: l */
    public ago mo592l() {
        return ago.m601m(this.f297a.consumeSystemWindowInsets());
    }

    @Override // p000.agm
    /* JADX INFO: renamed from: m */
    public boolean mo593m() {
        return this.f297a.isConsumed();
    }
}
