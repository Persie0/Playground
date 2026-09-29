package p036c0;

import androidx.activity.result.C0204c;
import p387t0.C9169u;

/* JADX INFO: renamed from: c0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1652h {

    /* JADX INFO: renamed from: a */
    public final long f9249a;

    /* JADX INFO: renamed from: b */
    public final long f9250b;

    /* JADX INFO: renamed from: c */
    public final long f9251c;

    /* JADX INFO: renamed from: d */
    public final long f9252d;

    public C1652h(long j10, long j11, long j12, long j13) {
        this.f9249a = j10;
        this.f9250b = j11;
        this.f9251c = j12;
        this.f9252d = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1652h)) {
            return false;
        }
        C1652h c1652h = (C1652h) obj;
        return C9169u.m17497c(this.f9249a, c1652h.f9249a) && C9169u.m17497c(this.f9250b, c1652h.f9250b) && C9169u.m17497c(this.f9251c, c1652h.f9251c) && C9169u.m17497c(this.f9252d, c1652h.f9252d);
    }

    public final int hashCode() {
        int i10 = C9169u.f47704g;
        return Long.hashCode(this.f9252d) + C0204c.m847f(this.f9251c, C0204c.m847f(this.f9250b, Long.hashCode(this.f9249a) * 31, 31), 31);
    }
}
