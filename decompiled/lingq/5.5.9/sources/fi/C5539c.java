package fi;

import android.support.v4.media.C0141b;
import dm.C5207g;

/* JADX INFO: renamed from: fi.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5539c {

    /* JADX INFO: renamed from: a */
    public final String f34251a;

    /* JADX INFO: renamed from: b */
    public final double f34252b;

    /* JADX INFO: renamed from: c */
    public final double f34253c;

    /* JADX INFO: renamed from: d */
    public final double f34254d;

    public C5539c() {
        this("", 0.0d, 0.0d, 0.0d);
    }

    public C5539c(String str, double d10, double d11, double d12) {
        C5207g.m11111f(str, "title");
        this.f34251a = str;
        this.f34252b = d10;
        this.f34253c = d11;
        this.f34254d = d12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5539c)) {
            return false;
        }
        C5539c c5539c = (C5539c) obj;
        return C5207g.m11106a(this.f34251a, c5539c.f34251a) && Double.compare(this.f34252b, c5539c.f34252b) == 0 && Double.compare(this.f34253c, c5539c.f34253c) == 0 && Double.compare(this.f34254d, c5539c.f34254d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f34254d) + C0141b.m609e(this.f34253c, C0141b.m609e(this.f34252b, this.f34251a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ChallengeUserProgress(title=" + this.f34251a + ", progress=" + this.f34252b + ", actual=" + this.f34253c + ", target=" + this.f34254d + ")";
    }
}
