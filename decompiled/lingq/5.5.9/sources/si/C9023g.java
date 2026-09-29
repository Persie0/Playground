package si;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: si.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C9023g {

    /* JADX INFO: renamed from: a */
    public final double f47253a;

    /* JADX INFO: renamed from: b */
    public final double f47254b;

    /* JADX INFO: renamed from: c */
    public final String f47255c;

    /* JADX INFO: renamed from: d */
    public final int f47256d;

    /* JADX INFO: renamed from: e */
    public final int f47257e;

    public C9023g(double d10, double d11, String str, int i10) {
        C5207g.m11111f(str, "title");
        this.f47253a = d10;
        this.f47254b = d11;
        this.f47255c = str;
        this.f47256d = i10;
        this.f47257e = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9023g)) {
            return false;
        }
        C9023g c9023g = (C9023g) obj;
        return Double.compare(this.f47253a, c9023g.f47253a) == 0 && Double.compare(this.f47254b, c9023g.f47254b) == 0 && C5207g.m11106a(this.f47255c, c9023g.f47255c) && this.f47256d == c9023g.f47256d && this.f47257e == c9023g.f47257e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f47257e) + C0009a.m16d(this.f47256d, C0166e.m758d(this.f47255c, C0141b.m609e(this.f47254b, Double.hashCode(this.f47253a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ChallengeGoal(progress=" + this.f47253a + ", goal=" + this.f47254b + ", title=" + this.f47255c + ", progressColor=" + this.f47256d + ", numberOfFields=" + this.f47257e + ")";
    }
}
