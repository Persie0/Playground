package p000;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class h62 implements iy2 {

    /* JADX INFO: renamed from: b */
    public final h02 f41831b;

    /* JADX INFO: renamed from: c */
    public final long f41832c;

    /* JADX INFO: renamed from: d */
    public long f41833d;

    /* JADX INFO: renamed from: f */
    public int f41835f;

    /* JADX INFO: renamed from: g */
    public int f41836g;

    /* JADX INFO: renamed from: e */
    public byte[] f41834e = new byte[65536];

    /* JADX INFO: renamed from: a */
    public final byte[] f41830a = new byte[4096];

    static {
        qu5.m20178a("media3.extractor");
    }

    public h62(h02 h02Var, long j, long j2) {
        this.f41831b = h02Var;
        this.f41833d = j;
        this.f41832c = j2;
    }

    @Override // p000.iy2
    /* JADX INFO: renamed from: a */
    public final boolean mo13074a(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.f41836g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.f41834e, 0, bArr, i, iMin);
            m13087q(iMin);
        }
        int iM13084n = iMin;
        while (iM13084n < i2 && iM13084n != -1) {
            iM13084n = m13084n(bArr, i, i2, iM13084n, z);
        }
        if (iM13084n != -1) {
            this.f41833d += (long) iM13084n;
        }
        return iM13084n != -1;
    }

    @Override // p000.iy2
    /* JADX INFO: renamed from: c */
    public final boolean mo13075c(int i, boolean z) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f41836g, i);
        m13087q(iMin);
        int iM13084n = iMin;
        while (iM13084n < i && iM13084n != -1) {
            byte[] bArr = this.f41830a;
            iM13084n = m13084n(bArr, -iM13084n, Math.min(i, bArr.length + iM13084n), iM13084n, z);
        }
        if (iM13084n != -1) {
            this.f41833d += (long) iM13084n;
        }
        return iM13084n != -1;
    }

    @Override // p000.iy2
    /* JADX INFO: renamed from: d */
    public final boolean mo13076d(byte[] bArr, int i, int i2, boolean z) {
        if (!m13081j(i2, z)) {
            return false;
        }
        System.arraycopy(this.f41834e, this.f41835f - i2, bArr, i, i2);
        return true;
    }

    @Override // p000.iy2
    /* JADX INFO: renamed from: e */
    public final long mo13077e() {
        return this.f41833d + ((long) this.f41835f);
    }

    @Override // p000.iy2
    /* JADX INFO: renamed from: f */
    public final void mo13078f(int i) throws EOFException, InterruptedIOException {
        m13081j(i, false);
    }

    @Override // p000.iy2
    /* JADX INFO: renamed from: g */
    public final int mo13079g(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        h62 h62Var;
        int iMin;
        m13083m(i2);
        int i3 = this.f41836g;
        int i4 = this.f41835f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            h62Var = this;
            iMin = h62Var.m13084n(this.f41834e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            h62Var.f41836g += iMin;
        } else {
            h62Var = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(h62Var.f41834e, h62Var.f41835f, bArr, i, iMin);
        h62Var.f41835f += iMin;
        return iMin;
    }

    @Override // p000.iy2
    public final long getLength() {
        return this.f41832c;
    }

    @Override // p000.iy2
    public final long getPosition() {
        return this.f41833d;
    }

    @Override // p000.iy2
    /* JADX INFO: renamed from: i */
    public final void mo13080i() {
        this.f41835f = 0;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m13081j(int i, boolean z) throws EOFException, InterruptedIOException {
        m13083m(i);
        int iM13084n = this.f41836g - this.f41835f;
        while (iM13084n < i) {
            h62 h62Var = this;
            int i2 = i;
            boolean z2 = z;
            iM13084n = h62Var.m13084n(this.f41834e, this.f41835f, i2, iM13084n, z2);
            if (iM13084n == -1) {
                return false;
            }
            h62Var.f41836g = h62Var.f41835f + iM13084n;
            this = h62Var;
            i = i2;
            z = z2;
        }
        this.f41835f += i;
        return true;
    }

    @Override // p000.iy2
    /* JADX INFO: renamed from: k */
    public final void mo13082k(int i) throws EOFException, InterruptedIOException {
        mo13075c(i, false);
    }

    /* JADX INFO: renamed from: m */
    public final void m13083m(int i) {
        int i2 = this.f41835f + i;
        byte[] bArr = this.f41834e;
        if (i2 > bArr.length) {
            this.f41834e = Arrays.copyOf(this.f41834e, uma.m22812g(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m13084n(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.f41831b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p000.iy2
    /* JADX INFO: renamed from: o */
    public final void mo13085o(byte[] bArr, int i, int i2) {
        mo13076d(bArr, i, i2, false);
    }

    @Override // p000.iy2
    /* JADX INFO: renamed from: p */
    public final int mo13086p() throws EOFException, InterruptedIOException {
        h62 h62Var;
        int iMin = Math.min(this.f41836g, 1);
        m13087q(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f41830a;
            h62Var = this;
            iMin = h62Var.m13084n(bArr, 0, Math.min(1, bArr.length), 0, true);
        } else {
            h62Var = this;
        }
        if (iMin != -1) {
            h62Var.f41833d += (long) iMin;
        }
        return iMin;
    }

    /* JADX INFO: renamed from: q */
    public final void m13087q(int i) {
        int i2 = this.f41836g - i;
        this.f41836g = i2;
        this.f41835f = 0;
        byte[] bArr = this.f41834e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f41834e = bArr2;
    }

    @Override // p000.h02
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        h62 h62Var;
        int i3 = this.f41836g;
        int iM13084n = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.f41834e, 0, bArr, i, iMin);
            m13087q(iMin);
            iM13084n = iMin;
        }
        if (iM13084n == 0) {
            h62Var = this;
            iM13084n = h62Var.m13084n(bArr, i, i2, 0, true);
        } else {
            h62Var = this;
        }
        if (iM13084n != -1) {
            h62Var.f41833d += (long) iM13084n;
        }
        return iM13084n;
    }

    @Override // p000.iy2
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        mo13074a(bArr, i, i2, false);
    }
}
