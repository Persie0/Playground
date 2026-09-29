package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: renamed from: uu */
/* JADX INFO: loaded from: classes.dex */
public final class C3661uu implements InterfaceC3624tu, InterfaceC3735wu {

    /* JADX INFO: renamed from: a */
    public final float f64352a;

    /* JADX INFO: renamed from: b */
    public final boolean f64353b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3698vu f64354c;

    /* JADX INFO: renamed from: d */
    public final float f64355d;

    public C3661uu(float f, boolean z, InterfaceC3698vu interfaceC3698vu) {
        this.f64352a = f;
        this.f64353b = z;
        this.f64354c = interfaceC3698vu;
        this.f64355d = f;
    }

    @Override // p000.InterfaceC3624tu
    /* JADX INFO: renamed from: a */
    public final float mo9967a() {
        return this.f64355d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3661uu)) {
            return false;
        }
        C3661uu c3661uu = (C3661uu) obj;
        return xj2.m24560b(this.f64352a, c3661uu.f64352a) && this.f64353b == c3661uu.f64353b && fa4.m11650l(this.f64354c, c3661uu.f64354c);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(Float.hashCode(this.f64352a) * 31, 31, this.f64353b);
        InterfaceC3698vu interfaceC3698vu = this.f64354c;
        return iM12428e + (interfaceC3698vu == null ? 0 : interfaceC3698vu.hashCode());
    }

    @Override // p000.InterfaceC3624tu
    /* JADX INFO: renamed from: j */
    public final void mo9968j(fb2 fb2Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int iMo916w0 = fb2Var.mo916w0(this.f64352a);
        boolean z = this.f64353b && layoutDirection == LayoutDirection.Rtl;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int iMax = Math.max(0, i - iArr[i3]);
                iArr2[i4] = iMax;
                iMin = Math.min(iMo916w0, iMax);
                i = iArr2[i4] - iMin;
                i3++;
                i4++;
            }
            i2 = i + iMin;
        } else {
            int length2 = iArr.length;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i5 < length2) {
                int i9 = iArr[i5];
                int iMin2 = Math.min(i6, i - i9);
                iArr2[i8] = iMin2;
                int iMin3 = Math.min(iMo916w0, (i - iMin2) - i9);
                int i10 = iArr2[i8] + i9 + iMin3;
                i5++;
                i7 = iMin3;
                i6 = i10;
                i8++;
            }
            i2 = i - (i6 - i7);
        }
        InterfaceC3698vu interfaceC3698vu = this.f64354c;
        if (interfaceC3698vu == null || i2 <= 0) {
            return;
        }
        int iMo12753b = interfaceC3698vu.mo12753b(i2, layoutDirection);
        if (z) {
            iMo12753b -= i2;
        }
        if (iMo12753b != 0) {
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + iMo12753b;
            }
        }
    }

    @Override // p000.InterfaceC3735wu
    /* JADX INFO: renamed from: k */
    public final void mo10843k(fb2 fb2Var, int i, int[] iArr, int[] iArr2) {
        mo9968j(fb2Var, i, iArr, LayoutDirection.Ltr, iArr2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f64353b ? "" : "Absolute");
        sb.append("Arrangement#spacedAligned(");
        sb.append((Object) xj2.m24561c(this.f64352a));
        sb.append(", ");
        sb.append(this.f64354c);
        sb.append(')');
        return sb.toString();
    }
}
