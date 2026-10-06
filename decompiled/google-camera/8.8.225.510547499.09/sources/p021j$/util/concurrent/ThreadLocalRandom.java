package p021j$.util.concurrent;

import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public class ThreadLocalRandom extends Random {

    /* JADX INFO: renamed from: d */
    private static final ThreadLocal f33192d;

    /* JADX INFO: renamed from: e */
    private static final AtomicInteger f33193e;

    /* JADX INFO: renamed from: f */
    private static final ThreadLocal f33194f;

    /* JADX INFO: renamed from: g */
    private static final AtomicLong f33195g;

    /* JADX INFO: renamed from: a */
    long f33196a;

    /* JADX INFO: renamed from: b */
    int f33197b;

    /* JADX INFO: renamed from: c */
    boolean f33198c = true;

    static {
        new ObjectStreamField("rnd", Long.TYPE);
        new ObjectStreamField("initialized", Boolean.TYPE);
        f33192d = new ThreadLocal();
        f33193e = new AtomicInteger();
        f33194f = new C0544v();
        f33195g = new AtomicLong(m12561e(System.currentTimeMillis()) ^ m12561e(System.nanoTime()));
        if (((Boolean) AccessController.doPrivileged(new C0545w())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j = ((long) seed[0]) & 255;
            for (int i = 1; i < 8; i++) {
                j = (j << 8) | (((long) seed[i]) & 255);
            }
            f33195g.set(j);
        }
    }

    ThreadLocalRandom() {
    }

    /* JADX INFO: renamed from: a */
    static final int m12557a(int i) {
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        ((ThreadLocalRandom) f33194f.get()).f33197b = i4;
        return i4;
    }

    /* JADX INFO: renamed from: b */
    static final int m12558b() {
        return ((ThreadLocalRandom) f33194f.get()).f33197b;
    }

    /* JADX INFO: renamed from: c */
    static final void m12559c() {
        int iAddAndGet = f33193e.addAndGet(-1640531527);
        if (iAddAndGet == 0) {
            iAddAndGet = 1;
        }
        long jM12561e = m12561e(f33195g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f33194f.get();
        threadLocalRandom.f33196a = jM12561e;
        threadLocalRandom.f33197b = iAddAndGet;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f33194f.get();
        if (threadLocalRandom.f33197b == 0) {
            m12559c();
        }
        return threadLocalRandom;
    }

    /* JADX INFO: renamed from: d */
    private static int m12560d(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        return (int) (((j2 ^ (j2 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    /* JADX INFO: renamed from: e */
    private static long m12561e(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    /* JADX INFO: renamed from: f */
    final long m12562f() {
        long j = this.f33196a - 7046029254386353131L;
        this.f33196a = j;
        return j;
    }

    @Override // java.util.Random
    protected final int next(int i) {
        return nextInt() >>> (32 - i);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return m12560d(m12562f()) < 0;
    }

    @Override // java.util.Random
    public final double nextDouble() {
        double dM12561e = m12561e(m12562f()) >>> 11;
        Double.isNaN(dM12561e);
        return dM12561e * 1.1102230246251565E-16d;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (m12560d(m12562f()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = f33192d;
        Double d = (Double) threadLocal.get();
        if (d != null) {
            threadLocal.set(null);
            return d.doubleValue();
        }
        while (true) {
            double dNextDouble = (nextDouble() * 2.0d) - 1.0d;
            double dNextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d2 = (dNextDouble2 * dNextDouble2) + (dNextDouble * dNextDouble);
            if (d2 < 1.0d && d2 != 0.0d) {
                double dSqrt = StrictMath.sqrt((StrictMath.log(d2) * (-2.0d)) / d2);
                threadLocal.set(Double.valueOf(dNextDouble2 * dSqrt));
                return dNextDouble * dSqrt;
            }
        }
    }

    @Override // java.util.Random
    public final int nextInt() {
        return m12560d(m12562f());
    }

    @Override // java.util.Random
    public final long nextLong() {
        return m12561e(m12562f());
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.f33198c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int iM12560d = m12560d(m12562f());
        int i2 = i - 1;
        if ((i & i2) == 0) {
            return iM12560d & i2;
        }
        while (true) {
            int i3 = iM12560d >>> 1;
            int i4 = i3 + i2;
            int i5 = i3 % i;
            if (i4 - i5 >= 0) {
                return i5;
            }
            iM12560d = m12560d(m12562f());
        }
    }
}
