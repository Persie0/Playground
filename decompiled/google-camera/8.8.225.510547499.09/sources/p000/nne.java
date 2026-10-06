package p000;

import java.math.RoundingMode;
import p021j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nne {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f43936a = 0;

    static {
        Instant.ofEpochMilli(Long.MAX_VALUE);
        Instant.ofEpochMilli(Long.MIN_VALUE);
        m17520b(Long.MAX_VALUE);
        m17520b(Long.MIN_VALUE);
        m17519a(Long.MAX_VALUE);
        m17519a(Long.MIN_VALUE);
        Instant.MIN.getEpochSecond();
        Instant.MAX.getEpochSecond();
    }

    /* JADX INFO: renamed from: a */
    public static Instant m17519a(long j) {
        return Instant.ofEpochSecond(kxk.m14997ao(j, 1000000000L, RoundingMode.FLOOR), kxk.m14993ak(j, 1000000000));
    }

    /* JADX INFO: renamed from: b */
    public static void m17520b(long j) {
        Instant.ofEpochSecond(kxk.m14997ao(j, 1000000L, RoundingMode.FLOOR), kxk.m14993ak(j, 1000000) * 1000);
    }
}
