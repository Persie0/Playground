package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ph3 {

    /* JADX INFO: renamed from: a */
    public final String f56213a;

    /* JADX INFO: renamed from: b */
    public final String f56214b;

    /* JADX INFO: renamed from: c */
    public final String f56215c;

    /* JADX INFO: renamed from: d */
    public final boolean f56216d;

    /* JADX INFO: renamed from: e */
    public final String f56217e;

    /* JADX INFO: renamed from: f */
    public final List f56218f;

    /* JADX INFO: renamed from: g */
    public final boolean f56219g;

    public ph3(String str, String str2, String str3, boolean z, String str4, List list, boolean z2) {
        str4.getClass();
        this.f56213a = str;
        this.f56214b = str2;
        this.f56215c = str3;
        this.f56216d = z;
        this.f56217e = str4;
        this.f56218f = list;
        this.f56219g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph3)) {
            return false;
        }
        ph3 ph3Var = (ph3) obj;
        return this.f56213a.equals(ph3Var.f56213a) && this.f56214b.equals(ph3Var.f56214b) && this.f56215c.equals(ph3Var.f56215c) && this.f56216d == ph3Var.f56216d && fa4.m11650l(this.f56217e, ph3Var.f56217e) && this.f56218f.equals(ph3Var.f56218f) && this.f56219g == ph3Var.f56219g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f56219g) + ux5.m22979b(ux5.m22980c(g9a.m12428e(ux5.m22980c(ux5.m22980c(this.f56213a.hashCode() * 31, this.f56214b, 31), this.f56215c, 31), 31, this.f56216d), this.f56217e, 31), 31, this.f56218f);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("FreeTrialComputedValues(priceYear=", this.f56213a, ", priceMonth=", this.f56214b, ", priceYearFull=");
        ux5.m22976C(this.f56215c, ", isLoading=", ", offer=", sbM23000w, this.f56216d);
        hn1.m13366p(this.f56217e, ", steps=", ", isPromo=", sbM23000w, this.f56218f);
        return AbstractC3393o1.m17740o(sbM23000w, this.f56219g, ")");
    }
}
