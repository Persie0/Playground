package p000;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class rld {

    /* JADX INFO: renamed from: c */
    public static final rld f59517c;

    /* JADX INFO: renamed from: a */
    public final UUID f59518a;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f59519b;

    static {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            f59517c = new rld(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public rld(UUID uuid, long j) {
        this.f59518a = uuid;
        this.f59519b = new AtomicLong((j ^ 25214903917L) & 281474976710655L);
    }

    /* JADX INFO: renamed from: a */
    public final long m20711a() {
        AtomicLong atomicLong;
        long j;
        long j2;
        long j3;
        do {
            atomicLong = this.f59519b;
            j = atomicLong.get();
            j2 = ((j * 25214903917L) + 11) & 281474976710655L;
            j3 = ((25214903917L * j2) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j, j3));
        return (((long) ((int) (j2 >>> 16))) << 32) + ((long) ((int) (j3 >>> 16)));
    }

    /* JADX INFO: renamed from: b */
    public final UUID m20712b() {
        long jM20711a = m20711a() & (-61441);
        long jM20711a2 = m20711a() >>> 2;
        UUID uuid = this.f59518a;
        return new UUID(jM20711a ^ uuid.getMostSignificantBits(), jM20711a2 ^ uuid.getLeastSignificantBits());
    }
}
