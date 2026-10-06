package p000;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bqc {

    /* JADX INFO: renamed from: b */
    public ByteBuffer f4158b;

    /* JADX INFO: renamed from: c */
    public bqb f4159c;

    /* JADX INFO: renamed from: a */
    public final byte[] f4157a = new byte[256];

    /* JADX INFO: renamed from: d */
    public int f4160d = 0;

    /* JADX INFO: renamed from: a */
    public final int m2906a() {
        try {
            return this.f4158b.get() & 255;
        } catch (Exception e) {
            this.f4159c.f4145b = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m2907b() {
        return this.f4158b.getShort();
    }

    /* JADX INFO: renamed from: c */
    public final void m2908c() {
        int iM2906a = m2906a();
        this.f4160d = iM2906a;
        if (iM2906a <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                int i2 = this.f4160d;
                if (i >= i2) {
                    return;
                }
                int i3 = i2 - i;
                this.f4158b.get(this.f4157a, i, i3);
                i += i3;
            } catch (Exception e) {
                this.f4159c.f4145b = 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2909d() {
        int iM2906a;
        do {
            iM2906a = m2906a();
            this.f4158b.position(Math.min(this.f4158b.position() + iM2906a, this.f4158b.limit()));
        } while (iM2906a > 0);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2910e() {
        return this.f4159c.f4145b != 0;
    }

    /* JADX INFO: renamed from: f */
    public final int[] m2911f(int i) {
        int[] iArr;
        byte[] bArr = new byte[i * 3];
        try {
            this.f4158b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                try {
                    int i5 = i4 + 1;
                    int i6 = i5 + 1;
                    int i7 = i2 + 1;
                    iArr[i2] = ((bArr[i3] & 255) << 16) | (-16777216) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                    i3 = i6;
                    i2 = i7;
                } catch (BufferUnderflowException e) {
                    this.f4159c.f4145b = 1;
                    return iArr;
                }
            }
        } catch (BufferUnderflowException e2) {
            iArr = null;
        }
        return iArr;
    }
}
