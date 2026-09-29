package p402u0;

/* JADX INFO: renamed from: u0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9359b {

    /* JADX INFO: renamed from: a */
    public static final long f48096a;

    /* JADX INFO: renamed from: b */
    public static final long f48097b;

    /* JADX INFO: renamed from: c */
    public static final long f48098c;

    /* JADX INFO: renamed from: d */
    public static final long f48099d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f48100e = 0;

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f48096a = (((long) 0) & 4294967295L) | j11;
        f48097b = (((long) 1) & 4294967295L) | j11;
        f48098c = j11 | (((long) 2) & 4294967295L);
        f48099d = (j10 & 4294967295L) | (((long) 4) << 32);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m17721a(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: b */
    public static String m17722b(long j10) {
        if (m17721a(j10, f48096a)) {
            return "Rgb";
        }
        if (m17721a(j10, f48097b)) {
            return "Xyz";
        }
        if (m17721a(j10, f48098c)) {
            return "Lab";
        }
        return m17721a(j10, f48099d) ? "Cmyk" : "Unknown";
    }
}
