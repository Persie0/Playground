package p036c0;

import androidx.activity.result.C0204c;
import p387t0.C9169u;

/* JADX INFO: renamed from: c0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1645a {

    /* JADX INFO: renamed from: a */
    public final long f9202a;

    /* JADX INFO: renamed from: b */
    public final long f9203b;

    /* JADX INFO: renamed from: c */
    public final long f9204c;

    /* JADX INFO: renamed from: d */
    public final long f9205d;

    public C1645a(long j10, long j11, long j12, long j13) {
        this.f9202a = j10;
        this.f9203b = j11;
        this.f9204c = j12;
        this.f9205d = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C1645a)) {
            C1645a c1645a = (C1645a) obj;
            return C9169u.m17497c(this.f9202a, c1645a.f9202a) && C9169u.m17497c(this.f9203b, c1645a.f9203b) && C9169u.m17497c(this.f9204c, c1645a.f9204c) && C9169u.m17497c(this.f9205d, c1645a.f9205d);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = C9169u.f47704g;
        return Long.hashCode(this.f9205d) + C0204c.m847f(this.f9204c, C0204c.m847f(this.f9203b, Long.hashCode(this.f9202a) * 31, 31), 31);
    }
}
