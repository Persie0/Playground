package p000;

import androidx.compose.p002ui.window.SecureFlagPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class ge2 {

    /* JADX INFO: renamed from: a */
    public final boolean f40621a;

    /* JADX INFO: renamed from: b */
    public final boolean f40622b;

    /* JADX INFO: renamed from: c */
    public final SecureFlagPolicy f40623c;

    /* JADX INFO: renamed from: d */
    public final boolean f40624d;

    /* JADX INFO: renamed from: e */
    public final boolean f40625e;

    /* JADX INFO: renamed from: f */
    public final String f40626f;

    /* JADX INFO: renamed from: g */
    public final int f40627g;

    public ge2(boolean z, boolean z2, boolean z3) {
        SecureFlagPolicy secureFlagPolicy = SecureFlagPolicy.Inherit;
        this.f40621a = z;
        this.f40622b = z2;
        this.f40623c = secureFlagPolicy;
        this.f40624d = z3;
        this.f40625e = true;
        this.f40626f = "";
        this.f40627g = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge2)) {
            return false;
        }
        ge2 ge2Var = (ge2) obj;
        return this.f40621a == ge2Var.f40621a && this.f40622b == ge2Var.f40622b && this.f40623c == ge2Var.f40623c && this.f40624d == ge2Var.f40624d && this.f40625e == ge2Var.f40625e && this.f40627g == ge2Var.f40627g;
    }

    public final int hashCode() {
        return (g9a.m12428e(g9a.m12428e((this.f40623c.hashCode() + g9a.m12428e(Boolean.hashCode(this.f40621a) * 31, 31, this.f40622b)) * 31, 31, this.f40624d), 31, this.f40625e) + this.f40627g) * 31;
    }

    public /* synthetic */ ge2(int i, boolean z, boolean z2) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0);
    }
}
