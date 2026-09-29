package p000;

import com.lingq.feature.onboarding.p014v2.PendingMiniLessonLingq;

/* JADX INFO: loaded from: classes3.dex */
public final class gv6 extends vv6 {

    /* JADX INFO: renamed from: a */
    public final PendingMiniLessonLingq f41395a;

    public gv6(PendingMiniLessonLingq pendingMiniLessonLingq) {
        pendingMiniLessonLingq.getClass();
        this.f41395a = pendingMiniLessonLingq;
    }

    /* JADX INFO: renamed from: a */
    public final PendingMiniLessonLingq m12917a() {
        return this.f41395a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gv6) && fa4.m11650l(this.f41395a, ((gv6) obj).f41395a);
    }

    public final int hashCode() {
        return this.f41395a.hashCode();
    }

    public final String toString() {
        return "MiniLessonLingqCreated(lingq=" + this.f41395a + ")";
    }
}
