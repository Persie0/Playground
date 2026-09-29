package p000;

/* JADX INFO: loaded from: classes.dex */
public final class rn7 {

    /* JADX INFO: renamed from: a */
    public final boolean f59591a;

    /* JADX INFO: renamed from: b */
    public final boolean f59592b;

    /* JADX INFO: renamed from: c */
    public final sn7 f59593c;

    public rn7(boolean z, boolean z2, sn7 sn7Var) {
        this.f59591a = z;
        this.f59592b = z2;
        this.f59593c = sn7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn7)) {
            return false;
        }
        rn7 rn7Var = (rn7) obj;
        return this.f59591a == rn7Var.f59591a && this.f59592b == rn7Var.f59592b && this.f59593c.equals(rn7Var.f59593c);
    }

    public final int hashCode() {
        return this.f59593c.hashCode() + g9a.m12428e(Boolean.hashCode(this.f59591a) * 31, 31, this.f59592b);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("PromoBannerState(canShowBanner=", ", canShowPromoClose=", ", promoData=", this.f59591a, this.f59592b);
        sbM13357g.append(this.f59593c);
        sbM13357g.append(")");
        return sbM13357g.toString();
    }
}
