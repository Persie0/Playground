package com.lingq.core.network.api.requests;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.n3c;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class RequestLessonUpdateStats {
    public static final C1571f0 Companion = new C1571f0();

    /* JADX INFO: renamed from: a */
    public final double f20395a;

    /* JADX INFO: renamed from: b */
    public final double f20396b;

    /* JADX INFO: renamed from: c */
    public final boolean f20397c;

    /* JADX INFO: renamed from: d */
    public final String f20398d;

    public /* synthetic */ RequestLessonUpdateStats(double d, double d2, int i, String str, boolean z) {
        if (4 != (i & 4)) {
            n3c.m17204b(i, 4, RequestLessonUpdateStats$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f20395a = 0.0d;
        } else {
            this.f20395a = d;
        }
        if ((i & 2) == 0) {
            this.f20396b = 0.0d;
        } else {
            this.f20396b = d2;
        }
        this.f20397c = z;
        if ((i & 8) == 0) {
            this.f20398d = null;
        } else {
            this.f20398d = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestLessonUpdateStats)) {
            return false;
        }
        RequestLessonUpdateStats requestLessonUpdateStats = (RequestLessonUpdateStats) obj;
        return Double.compare(this.f20395a, requestLessonUpdateStats.f20395a) == 0 && Double.compare(this.f20396b, requestLessonUpdateStats.f20396b) == 0 && this.f20397c == requestLessonUpdateStats.f20397c && fa4.m11650l(this.f20398d, requestLessonUpdateStats.f20398d);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(g9a.m12424a(this.f20396b, Double.hashCode(this.f20395a) * 31, 31), 31, this.f20397c);
        String str = this.f20398d;
        return iM12428e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestLessonUpdateStats(readTimes=");
        sb.append(this.f20395a);
        sb.append(", listenTimes=");
        sb.append(this.f20396b);
        sb.append(", automatic=");
        sb.append(this.f20397c);
        return AbstractC3393o1.m17739n(sb, ", creationDate=", this.f20398d, ")");
    }

    public RequestLessonUpdateStats(double d, double d2, boolean z, String str) {
        this.f20395a = d;
        this.f20396b = d2;
        this.f20397c = z;
        this.f20398d = str;
    }
}
