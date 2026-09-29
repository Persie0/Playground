package kotlin.time;

import p000.h74;
import p000.wfb;

/* JADX INFO: renamed from: kotlin.time.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3206b implements h74 {

    /* JADX INFO: renamed from: a */
    public final long f47739a;

    /* JADX INFO: renamed from: b */
    public final int f47740b;

    public C3206b(int i, long j) {
        this.f47739a = j;
        this.f47740b = i;
    }

    @Override // p000.h74
    public final Instant toInstant() {
        long j = Instant.f47731c.f47733a;
        long j2 = this.f47739a;
        if (j2 >= j && j2 <= Instant.f47732d.f47733a) {
            return wfb.m23920o(j2, this.f47740b);
        }
        throw new InstantFormatException("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
    }
}
