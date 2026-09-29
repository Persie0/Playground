package p367rh;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import dm.C5207g;

/* JADX INFO: renamed from: rh.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8790d {

    /* JADX INFO: renamed from: a */
    public final String f46629a;

    /* JADX INFO: renamed from: b */
    public final String f46630b;

    /* JADX INFO: renamed from: c */
    public final String f46631c;

    /* JADX INFO: renamed from: d */
    public final String f46632d;

    /* JADX INFO: renamed from: e */
    public final double f46633e;

    /* JADX INFO: renamed from: f */
    public final double f46634f;

    /* JADX INFO: renamed from: g */
    public final double f46635g;

    public /* synthetic */ C8790d(String str, String str2, String str3, String str4, double d10) {
        this(str, str2, str3, str4, 0.0d, d10, 0.0d);
    }

    public C8790d(String str, String str2, String str3, String str4, double d10, double d11, double d12) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "challengeCode");
        C5207g.m11111f(str4, "title");
        this.f46629a = str;
        this.f46630b = str2;
        this.f46631c = str3;
        this.f46632d = str4;
        this.f46633e = d10;
        this.f46634f = d11;
        this.f46635g = d12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8790d)) {
            return false;
        }
        C8790d c8790d = (C8790d) obj;
        return C5207g.m11106a(this.f46629a, c8790d.f46629a) && C5207g.m11106a(this.f46630b, c8790d.f46630b) && C5207g.m11106a(this.f46631c, c8790d.f46631c) && C5207g.m11106a(this.f46632d, c8790d.f46632d) && Double.compare(this.f46633e, c8790d.f46633e) == 0 && Double.compare(this.f46634f, c8790d.f46634f) == 0 && Double.compare(this.f46635g, c8790d.f46635g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f46635g) + C0141b.m609e(this.f46634f, C0141b.m609e(this.f46633e, C0166e.m758d(this.f46632d, C0166e.m758d(this.f46631c, C0166e.m758d(this.f46630b, this.f46629a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ChallengeStats(language=" + this.f46629a + ", challengeCode=" + this.f46630b + ", code=" + this.f46631c + ", title=" + this.f46632d + ", progress=" + this.f46633e + ", actual=" + this.f46634f + ", target=" + this.f46635g + ")";
    }
}
