package dk;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: dk.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5196a {

    /* JADX INFO: renamed from: a */
    public final String f33238a;

    /* JADX INFO: renamed from: b */
    public final double f33239b;

    /* JADX INFO: renamed from: c */
    public final double f33240c;

    /* JADX INFO: renamed from: d */
    public final int f33241d;

    /* JADX INFO: renamed from: e */
    public final int f33242e;

    /* JADX INFO: renamed from: f */
    public final int f33243f;

    /* JADX INFO: renamed from: g */
    public final boolean f33244g;

    public C5196a(String str, double d10, double d11, int i10, int i11, int i12, boolean z10, int i13) {
        i12 = (i13 & 32) != 0 ? 0 : i12;
        z10 = (i13 & 64) != 0 ? false : z10;
        C5207g.m11111f(str, "key");
        this.f33238a = str;
        this.f33239b = d10;
        this.f33240c = d11;
        this.f33241d = i10;
        this.f33242e = i11;
        this.f33243f = i12;
        this.f33244g = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5196a)) {
            return false;
        }
        C5196a c5196a = (C5196a) obj;
        return C5207g.m11106a(this.f33238a, c5196a.f33238a) && Double.compare(this.f33239b, c5196a.f33239b) == 0 && Double.compare(this.f33240c, c5196a.f33240c) == 0 && this.f33241d == c5196a.f33241d && this.f33242e == c5196a.f33242e && this.f33243f == c5196a.f33243f && this.f33244g == c5196a.f33244g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f33243f, C0009a.m16d(this.f33242e, C0009a.m16d(this.f33241d, C0141b.m609e(this.f33240c, C0141b.m609e(this.f33239b, this.f33238a.hashCode() * 31, 31), 31), 31), 31), 31);
        boolean z10 = this.f33244g;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iM16d + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LanguageGoal(key=");
        sb2.append(this.f33238a);
        sb2.append(", progress=");
        sb2.append(this.f33239b);
        sb2.append(", goal=");
        sb2.append(this.f33240c);
        sb2.append(", title=");
        sb2.append(this.f33241d);
        sb2.append(", progressColor=");
        sb2.append(this.f33242e);
        sb2.append(", numberOfFields=");
        sb2.append(this.f33243f);
        sb2.append(", isMini=");
        return C0166e.m769p(sb2, this.f33244g, ")");
    }
}
