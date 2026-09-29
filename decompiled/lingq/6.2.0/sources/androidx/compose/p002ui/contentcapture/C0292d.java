package androidx.compose.p002ui.contentcapture;

import p000.fa4;
import p000.jh9;
import p000.ux5;

/* JADX INFO: renamed from: androidx.compose.ui.contentcapture.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C0292d {

    /* JADX INFO: renamed from: a */
    public final int f3842a;

    /* JADX INFO: renamed from: b */
    public final long f3843b;

    /* JADX INFO: renamed from: c */
    public final ContentCaptureEventType f3844c;

    /* JADX INFO: renamed from: d */
    public final jh9 f3845d;

    public C0292d(int i, long j, ContentCaptureEventType contentCaptureEventType, jh9 jh9Var) {
        this.f3842a = i;
        this.f3843b = j;
        this.f3844c = contentCaptureEventType;
        this.f3845d = jh9Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m1339a() {
        return this.f3842a;
    }

    /* JADX INFO: renamed from: b */
    public final jh9 m1340b() {
        return this.f3845d;
    }

    /* JADX INFO: renamed from: c */
    public final ContentCaptureEventType m1341c() {
        return this.f3844c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0292d)) {
            return false;
        }
        C0292d c0292d = (C0292d) obj;
        return this.f3842a == c0292d.f3842a && this.f3843b == c0292d.f3843b && this.f3844c == c0292d.f3844c && fa4.m11650l(this.f3845d, c0292d.f3845d);
    }

    public final int hashCode() {
        int iHashCode = (this.f3844c.hashCode() + ux5.m22981d(this.f3843b, Integer.hashCode(this.f3842a) * 31, 31)) * 31;
        jh9 jh9Var = this.f3845d;
        return iHashCode + (jh9Var == null ? 0 : jh9Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f3842a + ", timestamp=" + this.f3843b + ", type=" + this.f3844c + ", structureCompat=" + this.f3845d + ')';
    }
}
