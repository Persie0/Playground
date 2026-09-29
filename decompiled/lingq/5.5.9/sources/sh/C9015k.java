package sh;

import p003a2.C0009a;

/* JADX INFO: renamed from: sh.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9015k {

    /* JADX INFO: renamed from: a */
    public final boolean f47241a;

    /* JADX INFO: renamed from: b */
    public final int f47242b;

    /* JADX INFO: renamed from: c */
    public final long f47243c;

    public C9015k(int i10, long j10, boolean z10) {
        this.f47241a = z10;
        this.f47242b = i10;
        this.f47243c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9015k)) {
            return false;
        }
        C9015k c9015k = (C9015k) obj;
        return this.f47241a == c9015k.f47241a && this.f47242b == c9015k.f47242b && this.f47243c == c9015k.f47243c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z10 = this.f47241a;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return Long.hashCode(this.f47243c) + C0009a.m16d(this.f47242b, r10 * 31, 31);
    }

    public final String toString() {
        return "PlayerServiceState(playWhenReady=" + this.f47241a + ", playbackState=" + this.f47242b + ", currentPosition=" + this.f47243c + ")";
    }
}
