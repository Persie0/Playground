package p000;

/* JADX INFO: loaded from: classes.dex */
public final class k9a {

    /* JADX INFO: renamed from: b */
    public static final long f46915b = omd.m18157m(0.5f, 0.5f);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f46916c = 0;

    /* JADX INFO: renamed from: a */
    public final long f46917a;

    /* JADX INFO: renamed from: a */
    public static final boolean m15025a(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: b */
    public static String m15026b(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k9a) {
            return this.f46917a == ((k9a) obj).f46917a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f46917a);
    }

    public final String toString() {
        return m15026b(this.f46917a);
    }
}
