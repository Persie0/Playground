package p000;

import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class agk extends agj {

    /* JADX INFO: renamed from: c */
    private acr f302c;

    /* JADX INFO: renamed from: f */
    private acr f303f;

    /* JADX INFO: renamed from: g */
    private acr f304g;

    public agk(ago agoVar, WindowInsets windowInsets) {
        super(agoVar, windowInsets);
        this.f302c = null;
        this.f303f = null;
        this.f304g = null;
    }

    @Override // p000.agh, p000.agm
    /* JADX INFO: renamed from: d */
    public ago mo584d(int i, int i2, int i3, int i4) {
        return ago.m601m(this.f297a.inset(i, i2, i3, i4));
    }

    @Override // p000.agm
    /* JADX INFO: renamed from: p */
    public acr mo596p() {
        if (this.f303f == null) {
            this.f303f = acr.m221d(this.f297a.getMandatorySystemGestureInsets());
        }
        return this.f303f;
    }

    @Override // p000.agm
    /* JADX INFO: renamed from: q */
    public acr mo597q() {
        if (this.f302c == null) {
            this.f302c = acr.m221d(this.f297a.getSystemGestureInsets());
        }
        return this.f302c;
    }

    @Override // p000.agm
    /* JADX INFO: renamed from: r */
    public acr mo598r() {
        if (this.f304g == null) {
            this.f304g = acr.m221d(this.f297a.getTappableElementInsets());
        }
        return this.f304g;
    }
}
