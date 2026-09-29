package com.bumptech.glide.load.data;

import android.support.v4.media.session.C0166e;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2100g extends FilterInputStream {

    /* JADX INFO: renamed from: c */
    public static final byte[] f10615c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: d */
    public static final int f10616d = 31;

    /* JADX INFO: renamed from: a */
    public final byte f10617a;

    /* JADX INFO: renamed from: b */
    public int f10618b;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C2100g(int i10, InputStream inputStream) {
        super(inputStream);
        if (i10 < -1 || i10 > 8) {
            throw new IllegalArgumentException(C0166e.m761g("Cannot add invalid orientation: ", i10));
        }
        this.f10617a = (byte) i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i10;
        int i11;
        int i12 = this.f10618b;
        if (i12 < 2 || i12 > (i11 = f10616d)) {
            i10 = super.read();
        } else {
            i10 = i12 == i11 ? this.f10617a : f10615c[i12 - 2] & 255;
        }
        if (i10 != -1) {
            this.f10618b++;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.f10618b;
        int i14 = f10616d;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f10617a;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int iMin = Math.min(i14 - i13, i11);
            System.arraycopy(f10615c, this.f10618b - 2, bArr, i10, iMin);
            i12 = iMin;
        }
        if (i12 > 0) {
            this.f10618b += i12;
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long jSkip = super.skip(j10);
        if (jSkip > 0) {
            this.f10618b = (int) (((long) this.f10618b) + jSkip);
        }
        return jSkip;
    }
}
