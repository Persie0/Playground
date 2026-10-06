package p000;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ked {

    /* JADX INFO: renamed from: a */
    public byte[] f35712a = new byte[1];

    /* JADX INFO: renamed from: b */
    public int f35713b = 0;

    /* JADX INFO: renamed from: c */
    public int f35714c = 0;

    /* JADX INFO: renamed from: a */
    public final int m14012a() {
        return this.f35714c - this.f35713b;
    }

    /* JADX INFO: renamed from: b */
    public final void m14013b(int i) {
        byte[] bArr = this.f35712a;
        int length = bArr.length;
        int i2 = this.f35714c;
        if (length - i2 < i) {
            int i3 = this.f35713b;
            int i4 = i2 - i3;
            int i5 = i + i4;
            if (i5 > length || i5 <= (length >> 1)) {
                byte[] bArr2 = new byte[i5];
                if (i4 > 0) {
                    System.arraycopy(bArr, i3, bArr2, 0, i4);
                }
                this.f35712a = bArr2;
            } else if (i4 > 0) {
                System.arraycopy(bArr, i3, bArr, 0, i4);
            }
            this.f35713b = 0;
            this.f35714c = i4;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m14015d(int i) {
        int i2 = this.f35713b + i;
        if (i2 > this.f35714c) {
            throw new IllegalStateException("Byte queue is too short");
        }
        this.f35713b = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ByteDeque [ ");
        for (int i = 0; i <= this.f35712a.length; i++) {
            if (i == this.f35713b) {
                sb.append("{ ");
            }
            if (i == this.f35714c) {
                sb.append("} ");
            }
            byte[] bArr = this.f35712a;
            if (i < bArr.length) {
                sb.append(String.format("%02X ", Byte.valueOf(bArr[i])));
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public final void m14014c(OutputStream outputStream, int i) throws IOException {
        int i2 = this.f35713b;
        if (i2 + i > this.f35714c) {
            throw new IllegalStateException("Byte queue is too short");
        }
        outputStream.write(this.f35712a, i2, i);
        this.f35713b += i;
    }
}
