package p000;

import p021j$.time.Duration;
import p021j$.time.temporal.ChronoUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nnd {

    /* JADX INFO: renamed from: a */
    public static final Duration f43933a;

    /* JADX INFO: renamed from: b */
    public static final double f43934b;

    /* JADX INFO: renamed from: c */
    public static final Duration f43935c;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(Long.MIN_VALUE);
        f43933a = durationOfSeconds;
        f43934b = durationOfSeconds.getSeconds();
        f43935c = Duration.ofSeconds(Long.MAX_VALUE, 999999999L);
        Duration.ofMillis(Long.MAX_VALUE);
        Duration.ofMillis(Long.MIN_VALUE);
        m17518b(Long.MAX_VALUE);
        m17518b(Long.MIN_VALUE);
        Duration.ofNanos(Long.MAX_VALUE);
        Duration.ofNanos(Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: a */
    public static long m17517a(Duration duration) {
        return duration.getSeconds() < -9223372036854L ? kxk.m14994al(kxk.m14995am(duration.getSeconds() + 1, 1000000L), (duration.getNano() / 1000) - 1000000) : kxk.m14994al(kxk.m14995am(duration.getSeconds(), 1000000L), duration.getNano() / 1000);
    }

    /* JADX INFO: renamed from: b */
    public static void m17518b(long j) {
        Duration.m12236of(j, ChronoUnit.MICROS);
    }
}
