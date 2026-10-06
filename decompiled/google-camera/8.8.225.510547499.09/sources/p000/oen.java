package p000;

import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oen implements oeh {

    /* JADX INFO: renamed from: a */
    private final byte[] f45761a;

    /* JADX INFO: renamed from: b */
    private int f45762b;

    /* JADX INFO: renamed from: c */
    private int f45763c;

    public oen(byte[] bArr) {
        this.f45761a = bArr;
    }

    @Override // p000.oeh
    /* JADX INFO: renamed from: a */
    public final synchronized int mo18407a(byte[] bArr, int i, int i2) {
        lku.m15670x(65536 - i >= i2, "Buffer length too small.");
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f45762b;
        int length = this.f45761a.length;
        if (i3 == length) {
            return 0;
        }
        int iMin = Math.min(i2, length - i3);
        for (int i4 = 0; i4 < iMin; i4++) {
            byte[] bArr2 = this.f45761a;
            int i5 = this.f45762b;
            bArr[i + i4] = bArr2[i5];
            this.f45762b = i5 + 1;
        }
        return iMin;
    }

    @Override // p000.oeh
    /* JADX INFO: renamed from: b */
    public final synchronized long mo18408b() {
        return this.f45763c;
    }

    @Override // p000.oeh
    /* JADX INFO: renamed from: c */
    public final synchronized long mo18409c() {
        return this.f45762b;
    }

    @Override // p000.oeh, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
    }

    @Override // p000.oeh
    /* JADX INFO: renamed from: d */
    public final synchronized long mo18410d() {
        return this.f45761a.length;
    }

    @Override // p000.oeh
    /* JADX INFO: renamed from: e */
    public final synchronized void mo18411e() {
        this.f45763c = this.f45762b;
    }

    @Override // p000.oeh
    /* JADX INFO: renamed from: f */
    public final synchronized void mo18412f() {
        this.f45762b = this.f45763c;
    }

    @Override // p000.oeh
    /* JADX INFO: renamed from: g */
    public final synchronized boolean mo18413g() {
        return this.f45762b < this.f45761a.length;
    }

    @Override // p000.oeh
    /* JADX INFO: renamed from: h */
    public final synchronized void mo18414h(long j) {
        this.f45762b = (int) (((long) this.f45762b) + Math.min(j, this.f45761a.length - this.f45762b));
    }

    public oen(String str) {
        try {
            this.f45761a = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
