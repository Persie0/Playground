package p000;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class h87 implements dy5 {

    /* JADX INFO: renamed from: a */
    public final int f41971a;

    /* JADX INFO: renamed from: b */
    public final String f41972b;

    /* JADX INFO: renamed from: c */
    public final String f41973c;

    /* JADX INFO: renamed from: d */
    public final int f41974d;

    /* JADX INFO: renamed from: e */
    public final int f41975e;

    /* JADX INFO: renamed from: f */
    public final int f41976f;

    /* JADX INFO: renamed from: g */
    public final int f41977g;

    /* JADX INFO: renamed from: h */
    public final byte[] f41978h;

    public h87(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f41971a = i;
        this.f41972b = str;
        this.f41973c = str2;
        this.f41974d = i2;
        this.f41975e = i3;
        this.f41976f = i4;
        this.f41977g = i5;
        this.f41978h = bArr;
    }

    /* JADX INFO: renamed from: d */
    public static h87 m13141d(k47 k47Var) {
        int iM14829m = k47Var.m14829m();
        String strM11402l = ez5.m11402l(k47Var.m14840x(k47Var.m14829m(), StandardCharsets.US_ASCII));
        String strM14840x = k47Var.m14840x(k47Var.m14829m(), StandardCharsets.UTF_8);
        int iM14829m2 = k47Var.m14829m();
        int iM14829m3 = k47Var.m14829m();
        int iM14829m4 = k47Var.m14829m();
        int iM14829m5 = k47Var.m14829m();
        int iM14829m6 = k47Var.m14829m();
        byte[] bArr = new byte[iM14829m6];
        k47Var.m14827k(bArr, 0, iM14829m6);
        return new h87(iM14829m, strM11402l, strM14840x, iM14829m2, iM14829m3, iM14829m4, iM14829m5, bArr);
    }

    @Override // p000.dy5
    /* JADX INFO: renamed from: b */
    public final void mo4207b(su5 su5Var) {
        su5Var.m21744a(this.f41971a, this.f41978h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h87.class != obj.getClass()) {
            return false;
        }
        h87 h87Var = (h87) obj;
        return this.f41971a == h87Var.f41971a && this.f41972b.equals(h87Var.f41972b) && this.f41973c.equals(h87Var.f41973c) && this.f41974d == h87Var.f41974d && this.f41975e == h87Var.f41975e && this.f41976f == h87Var.f41976f && this.f41977g == h87Var.f41977g && Arrays.equals(this.f41978h, h87Var.f41978h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f41978h) + ((((((((ux5.m22980c(ux5.m22980c((527 + this.f41971a) * 31, this.f41972b, 31), this.f41973c, 31) + this.f41974d) * 31) + this.f41975e) * 31) + this.f41976f) * 31) + this.f41977g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f41972b + ", description=" + this.f41973c;
    }
}
