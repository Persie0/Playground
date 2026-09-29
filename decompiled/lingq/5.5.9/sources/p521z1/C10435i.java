package p521z1;

import androidx.compose.p017ui.window.SecureFlagPolicy;
import dm.C5207g;

/* JADX INFO: renamed from: z1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C10435i {

    /* JADX INFO: renamed from: a */
    public final boolean f52271a;

    /* JADX INFO: renamed from: b */
    public final boolean f52272b;

    /* JADX INFO: renamed from: c */
    public final boolean f52273c;

    /* JADX INFO: renamed from: d */
    public final SecureFlagPolicy f52274d;

    /* JADX INFO: renamed from: e */
    public final boolean f52275e;

    /* JADX INFO: renamed from: f */
    public final boolean f52276f;

    /* JADX INFO: renamed from: g */
    public final boolean f52277g;

    public C10435i() {
        this(false, true, true, SecureFlagPolicy.Inherit, true, true, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C10435i(boolean z10, int i10) {
        boolean z11 = (i10 & 1) != 0 ? false : z10;
        boolean z12 = (i10 & 2) != 0;
        boolean z13 = (i10 & 4) != 0;
        SecureFlagPolicy secureFlagPolicy = (i10 & 8) != 0 ? SecureFlagPolicy.Inherit : null;
        boolean z14 = (i10 & 16) != 0;
        boolean z15 = (i10 & 32) != 0;
        C5207g.m11111f(secureFlagPolicy, "securePolicy");
        this(z11, z12, z13, secureFlagPolicy, z14, z15, false);
    }

    public C10435i(boolean z10, boolean z11, boolean z12, SecureFlagPolicy secureFlagPolicy, boolean z13, boolean z14, boolean z15) {
        C5207g.m11111f(secureFlagPolicy, "securePolicy");
        this.f52271a = z10;
        this.f52272b = z11;
        this.f52273c = z12;
        this.f52274d = secureFlagPolicy;
        this.f52275e = z13;
        this.f52276f = z14;
        this.f52277g = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10435i)) {
            return false;
        }
        C10435i c10435i = (C10435i) obj;
        return this.f52271a == c10435i.f52271a && this.f52272b == c10435i.f52272b && this.f52273c == c10435i.f52273c && this.f52274d == c10435i.f52274d && this.f52275e == c10435i.f52275e && this.f52276f == c10435i.f52276f && this.f52277g == c10435i.f52277g;
    }

    public final int hashCode() {
        boolean z10 = this.f52272b;
        return Boolean.hashCode(this.f52277g) + ((Boolean.hashCode(this.f52276f) + ((Boolean.hashCode(this.f52275e) + ((this.f52274d.hashCode() + ((Boolean.hashCode(this.f52273c) + ((Boolean.hashCode(z10) + ((Boolean.hashCode(this.f52271a) + (Boolean.hashCode(z10) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
