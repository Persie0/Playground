package p096ei;

import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: ei.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5409b {

    /* JADX INFO: renamed from: a */
    public final String f33828a;

    /* JADX INFO: renamed from: b */
    public final int f33829b;

    /* JADX INFO: renamed from: c */
    public final int f33830c;

    /* JADX INFO: renamed from: d */
    public final int f33831d;

    public C5409b(String str, int i10, int i11, int i12) {
        C5207g.m11111f(str, "language");
        this.f33828a = str;
        this.f33829b = i10;
        this.f33830c = i11;
        this.f33831d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5409b)) {
            return false;
        }
        C5409b c5409b = (C5409b) obj;
        return C5207g.m11106a(this.f33828a, c5409b.f33828a) && this.f33829b == c5409b.f33829b && this.f33830c == c5409b.f33830c && this.f33831d == c5409b.f33831d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33831d) + C0009a.m16d(this.f33830c, C0009a.m16d(this.f33829b, this.f33828a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserMilestoneStats(language=");
        sb2.append(this.f33828a);
        sb2.append(", knownWords=");
        sb2.append(this.f33829b);
        sb2.append(", lingqs=");
        sb2.append(this.f33830c);
        sb2.append(", dailyScore=");
        return C0166e.m768o(sb2, this.f33831d, ")");
    }
}
