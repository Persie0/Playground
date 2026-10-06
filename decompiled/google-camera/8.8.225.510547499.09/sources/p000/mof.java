package p000;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mof {

    /* JADX INFO: renamed from: a */
    public static final mof f41178a;

    /* JADX INFO: renamed from: b */
    private final UUID f41179b;

    /* JADX INFO: renamed from: c */
    private final AtomicLong f41180c;

    static {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            f41178a = new mof(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public mof(UUID uuid, long j) {
        this.f41179b = uuid;
        this.f41180c = new AtomicLong((j ^ 25214903917L) & 281474976710655L);
    }

    /* JADX INFO: renamed from: a */
    final long m16705a() {
        long j;
        long j2;
        long j3;
        do {
            j = this.f41180c.get();
            j2 = ((j * 25214903917L) + 11) & 281474976710655L;
            j3 = ((25214903917L * j2) + 11) & 281474976710655L;
        } while (!this.f41180c.compareAndSet(j, j3));
        return (((long) ((int) (j2 >>> 16))) << 32) + ((long) ((int) (j3 >>> 16)));
    }

    /* JADX INFO: renamed from: b */
    public final UUID m16706b() {
        return new UUID((m16705a() & (-61441)) ^ this.f41179b.getMostSignificantBits(), (m16705a() >>> 2) ^ this.f41179b.getLeastSignificantBits());
    }
}
