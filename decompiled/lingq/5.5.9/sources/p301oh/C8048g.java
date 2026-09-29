package p301oh;

import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: oh.g */
/* JADX INFO: loaded from: classes.dex */
public final class C8048g {

    /* JADX INFO: renamed from: a */
    public final String f43728a;

    /* JADX INFO: renamed from: b */
    public final int f43729b;

    /* JADX INFO: renamed from: c */
    public final int f43730c;

    /* JADX INFO: renamed from: d */
    public final int f43731d;

    public C8048g(String str, int i10, int i11, int i12) {
        C5207g.m11111f(str, "title");
        this.f43728a = str;
        this.f43729b = i10;
        this.f43730c = i11;
        this.f43731d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8048g)) {
            return false;
        }
        C8048g c8048g = (C8048g) obj;
        return C5207g.m11106a(this.f43728a, c8048g.f43728a) && this.f43729b == c8048g.f43729b && this.f43730c == c8048g.f43730c && this.f43731d == c8048g.f43731d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43731d) + C0009a.m16d(this.f43730c, C0009a.m16d(this.f43729b, this.f43728a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StreakEntry(title=");
        sb2.append(this.f43728a);
        sb2.append(", lingqsCreated=");
        sb2.append(this.f43729b);
        sb2.append(", dailyGoal=");
        sb2.append(this.f43730c);
        sb2.append(", activityLevelId=");
        return C0166e.m768o(sb2, this.f43731d, ")");
    }
}
