package p000;

import java.security.SecureRandom;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mrt extends Random {

    /* JADX INFO: renamed from: a */
    private final boolean f41484a = true;

    /* JADX INFO: renamed from: a */
    static final SecureRandom m16833a() {
        return (SecureRandom) mru.f41486b.get();
    }

    @Override // java.util.Random
    protected final int next(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return m16833a().nextBoolean();
    }

    @Override // java.util.Random
    public final void nextBytes(byte[] bArr) {
        m16833a().nextBytes(bArr);
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return m16833a().nextDouble();
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return m16833a().nextFloat();
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        return m16833a().nextGaussian();
    }

    @Override // java.util.Random
    public final int nextInt() {
        return m16833a().nextInt();
    }

    @Override // java.util.Random
    public final long nextLong() {
        return m16833a().nextLong();
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.f41484a) {
            throw new UnsupportedOperationException("Setting the seed on a thread-local Random object is not permitted");
        }
        super.setSeed(j);
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        return m16833a().nextInt(i);
    }
}
