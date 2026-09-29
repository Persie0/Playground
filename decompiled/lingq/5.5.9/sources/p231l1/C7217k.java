package p231l1;

import ae.C0062b;

/* JADX INFO: renamed from: l1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C7217k {

    /* JADX INFO: renamed from: b */
    public static final long f40596b = C0062b.m384q(0, 0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f40597c = 0;

    /* JADX INFO: renamed from: a */
    public final long f40598a;

    public /* synthetic */ C7217k(long j10) {
        this.f40598a = j10;
    }

    /* JADX INFO: renamed from: a */
    public static final int m14539a(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* JADX INFO: renamed from: b */
    public static final int m14540b(long j10) {
        int i10 = (int) (j10 >> 32);
        return i10 > m14539a(j10) ? i10 : m14539a(j10);
    }

    /* JADX INFO: renamed from: c */
    public static final int m14541c(long j10) {
        int iM14539a = (int) (j10 >> 32);
        if (iM14539a > m14539a(j10)) {
            iM14539a = m14539a(j10);
        }
        return iM14539a;
    }

    /* JADX INFO: renamed from: d */
    public static String m14542d(long j10) {
        return "TextRange(" + ((int) (j10 >> 32)) + ", " + m14539a(j10) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7217k) {
            return this.f40598a == ((C7217k) obj).f40598a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40598a);
    }

    public final String toString() {
        return m14542d(this.f40598a);
    }
}
