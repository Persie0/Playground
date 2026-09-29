package p444w0;

import androidx.activity.result.C0204c;
import dm.C5207g;
import p338qd.C8573r0;
import p375s0.C8944f;
import p385sf.C9000b;
import p387t0.C9170v;
import p387t0.InterfaceC9174z;
import p424v0.InterfaceC9621e;
import p470x1.C10020h;
import p470x1.C10022j;

/* JADX INFO: renamed from: w0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9789a extends AbstractC9790b {

    /* JADX INFO: renamed from: f */
    public final InterfaceC9174z f49888f;

    /* JADX INFO: renamed from: g */
    public final long f49889g;

    /* JADX INFO: renamed from: h */
    public final long f49890h;

    /* JADX INFO: renamed from: i */
    public final int f49891i;

    /* JADX INFO: renamed from: j */
    public final long f49892j;

    /* JADX INFO: renamed from: k */
    public float f49893k;

    /* JADX INFO: renamed from: l */
    public C9170v f49894l;

    public C9789a(InterfaceC9174z interfaceC9174z) {
        int i10;
        long j10 = C10020h.f50973b;
        long jM17236a = C9000b.m17236a(interfaceC9174z.mo17438b(), interfaceC9174z.mo17437a());
        this.f49888f = interfaceC9174z;
        this.f49889g = j10;
        this.f49890h = jM17236a;
        this.f49891i = 1;
        if (!(((int) (j10 >> 32)) >= 0 && C10020h.m18625a(j10) >= 0 && (i10 = (int) (jM17236a >> 32)) >= 0 && C10022j.m18628b(jM17236a) >= 0 && i10 <= interfaceC9174z.mo17438b() && C10022j.m18628b(jM17236a) <= interfaceC9174z.mo17437a())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.f49892j = jM17236a;
        this.f49893k = 1.0f;
    }

    @Override // p444w0.AbstractC9790b
    /* JADX INFO: renamed from: a */
    public final boolean mo2007a(float f3) {
        this.f49893k = f3;
        return true;
    }

    @Override // p444w0.AbstractC9790b
    /* JADX INFO: renamed from: b */
    public final boolean mo2008b(C9170v c9170v) {
        this.f49894l = c9170v;
        return true;
    }

    @Override // p444w0.AbstractC9790b
    /* JADX INFO: renamed from: c */
    public final long mo2009c() {
        return C9000b.m17259y(this.f49892j);
    }

    @Override // p444w0.AbstractC9790b
    /* JADX INFO: renamed from: d */
    public final void mo2010d(InterfaceC9621e interfaceC9621e) {
        C5207g.m11111f(interfaceC9621e, "<this>");
        InterfaceC9621e.m18093f0(interfaceC9621e, this.f49888f, this.f49889g, this.f49890h, 0L, C9000b.m17236a(C8573r0.m16710Y0(C8944f.m17177d(interfaceC9621e.mo12674d())), C8573r0.m16710Y0(C8944f.m17175b(interfaceC9621e.mo12674d()))), this.f49893k, null, this.f49894l, 0, this.f49891i, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9789a)) {
            return false;
        }
        C9789a c9789a = (C9789a) obj;
        if (!C5207g.m11106a(this.f49888f, c9789a.f49888f)) {
            return false;
        }
        int i10 = C10020h.f50974c;
        if ((this.f49889g == c9789a.f49889g) && C10022j.m18627a(this.f49890h, c9789a.f49890h)) {
            return this.f49891i == c9789a.f49891i;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f49888f.hashCode() * 31;
        int i10 = C10020h.f50974c;
        return Integer.hashCode(this.f49891i) + C0204c.m847f(this.f49890h, C0204c.m847f(this.f49889g, iHashCode, 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BitmapPainter(image=");
        sb2.append(this.f49888f);
        sb2.append(", srcOffset=");
        sb2.append((Object) C10020h.m18626b(this.f49889g));
        sb2.append(", srcSize=");
        sb2.append((Object) C10022j.m18629c(this.f49890h));
        sb2.append(", filterQuality=");
        int i10 = this.f49891i;
        boolean z10 = false;
        if (i10 == 0) {
            str = "None";
        } else {
            if (i10 == 1) {
                str = "Low";
            } else {
                if (i10 == 2) {
                    str = "Medium";
                } else {
                    if (i10 == 3) {
                        z10 = true;
                    }
                    str = z10 ? "High" : "Unknown";
                }
            }
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
