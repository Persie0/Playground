package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class a36 {

    /* JADX INFO: renamed from: a */
    public final long f179a;

    public /* synthetic */ a36(long j) {
        this.f179a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ a36 m68a(long j) {
        return new a36(j);
    }

    /* JADX INFO: renamed from: b */
    public static long m69b(long j, long j2) {
        return ((j & 2147483647L) << 1) | 1 | (((long) ((((short) Float.intBitsToFloat((int) (j2 & 4294967295L))) & 65535) | (((short) Float.intBitsToFloat((int) (j2 >> 32))) << 16))) << 32);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m70c(long j) {
        return (j & 1) != 0;
    }

    /* JADX INFO: renamed from: d */
    public static final long m71d(long j) {
        int i = (int) (j >>> 32);
        return (((long) Float.floatToRawIntBits((short) (i & 65535))) & 4294967295L) | (Float.floatToRawIntBits((short) (i >>> 16)) << 32);
    }

    /* JADX INFO: renamed from: e */
    public static final long m72e(long j) {
        return (j >> 1) & 2147483647L;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a36) {
            return this.f179a == ((a36) obj).f179a;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long m73f() {
        return this.f179a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f179a);
    }

    public final String toString() {
        return "IndirectPointerEventData(packedValue=" + this.f179a + ')';
    }
}
