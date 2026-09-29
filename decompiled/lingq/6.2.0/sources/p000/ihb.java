package p000;

import com.google.android.gms.internal.measurement.AbstractC0961e;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzacy;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class ihb extends nhb {

    /* JADX INFO: renamed from: c */
    public final byte[] f44123c;

    /* JADX INFO: renamed from: d */
    public final int f44124d;

    /* JADX INFO: renamed from: e */
    public int f44125e;

    /* JADX INFO: renamed from: f */
    public final OutputStream f44126f;

    public ihb(OutputStream outputStream, int i) {
        if (outputStream == null) {
            C3386nv.m17635v("out");
            throw null;
        }
        this.f44126f = outputStream;
        if (i < 0) {
            C3386nv.m17626m("bufferSize must be >= 0");
            throw null;
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.f44123c = bArr;
        this.f44124d = bArr.length;
    }

    /* JADX INFO: renamed from: A */
    public final void m13924A(int i) throws IOException {
        if (this.f44124d - this.f44125e < i) {
            m13925B();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m13925B() throws IOException {
        this.f44126f.write(this.f44123c, 0, this.f44125e);
        this.f44125e = 0;
    }

    /* JADX INFO: renamed from: C */
    public final void m13926C() throws IOException {
        if (this.f44125e > 0) {
            m13925B();
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m13927D(int i) {
        boolean z = nhb.f52743b;
        byte[] bArr = this.f44123c;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.f44125e;
                if (i2 == 0) {
                    this.f44125e = i3 + 1;
                    tjb.m22163k(bArr, i3, (byte) i);
                    return;
                } else {
                    this.f44125e = i3 + 1;
                    tjb.m22163k(bArr, i3, (byte) (i | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.f44125e;
                if (i4 == 0) {
                    this.f44125e = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.f44125e = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: c */
    public final void mo13255c(byte[] bArr, int i, int i2) throws IOException {
        m13931z(bArr, i, i2);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: d */
    public final void mo13256d(int i, int i2) throws IOException {
        mo13270r((i << 3) | i2);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: e */
    public final void mo13257e(int i, int i2) throws IOException {
        m13924A(20);
        m13927D(i << 3);
        if (i2 >= 0) {
            m13927D(i2);
        } else {
            m13928w(i2);
        }
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: f */
    public final void mo13258f(int i, int i2) throws IOException {
        m13924A(20);
        m13927D(i << 3);
        m13927D(i2);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: g */
    public final void mo13259g(int i, int i2) throws IOException {
        m13924A(14);
        m13927D((i << 3) | 5);
        m13929x(i2);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: h */
    public final void mo13260h(int i, long j) throws IOException {
        m13924A(20);
        m13927D(i << 3);
        m13928w(j);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: i */
    public final void mo13261i(int i, long j) throws IOException {
        m13924A(18);
        m13927D((i << 3) | 1);
        m13930y(j);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: j */
    public final void mo13262j(int i, boolean z) throws IOException {
        m13924A(11);
        m13927D(i << 3);
        int i2 = this.f44125e;
        this.f44123c[i2] = z ? (byte) 1 : (byte) 0;
        this.f44125e = i2 + 1;
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: k */
    public final void mo13263k(int i, String str) throws IOException {
        mo13270r((i << 3) | 2);
        mo13274v(str);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: l */
    public final void mo13264l(int i, zzacr zzacrVar) throws IOException {
        mo13270r((i << 3) | 2);
        mo13265m(zzacrVar);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: m */
    public final void mo13265m(zzacr zzacrVar) throws IOException {
        mo13270r(zzacrVar.mo5422f());
        zzacrVar.mo5425i(this);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: n */
    public final void mo13266n(int i, byte[] bArr) throws IOException {
        mo13270r(i);
        m13931z(bArr, 0, i);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: o */
    public final void mo13267o(bhb bhbVar) throws IOException {
        whb whbVar = (whb) bhbVar;
        mo13270r(whbVar.m23968l());
        whbVar.m23961e(this);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: p */
    public final void mo13268p(byte b) throws IOException {
        if (this.f44125e == this.f44124d) {
            m13925B();
        }
        int i = this.f44125e;
        this.f44123c[i] = b;
        this.f44125e = i + 1;
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: q */
    public final void mo13269q(int i) throws IOException {
        if (i >= 0) {
            mo13270r(i);
        } else {
            mo13272t(i);
        }
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: r */
    public final void mo13270r(int i) throws IOException {
        m13924A(5);
        m13927D(i);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: s */
    public final void mo13271s(int i) throws IOException {
        m13924A(4);
        m13929x(i);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: t */
    public final void mo13272t(long j) throws IOException {
        m13924A(10);
        m13928w(j);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: u */
    public final void mo13273u(long j) throws IOException {
        m13924A(8);
        m13930y(j);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: v */
    public final void mo13274v(String str) throws IOException {
        int length = str.length() * 3;
        int iM17434a = nhb.m17434a(length);
        int i = iM17434a + length;
        int i2 = this.f44124d;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int iM5406c = AbstractC0961e.m5406c(str, bArr, 0, length);
            mo13270r(iM5406c);
            m13931z(bArr, 0, iM5406c);
            return;
        }
        if (i > i2 - this.f44125e) {
            m13925B();
        }
        int iM17434a2 = nhb.m17434a(str.length());
        int i3 = this.f44125e;
        byte[] bArr2 = this.f44123c;
        try {
            if (iM17434a2 == iM17434a) {
                int i4 = i3 + iM17434a2;
                this.f44125e = i4;
                int iM5406c2 = AbstractC0961e.m5406c(str, bArr2, i4, i2 - i4);
                this.f44125e = i3;
                m13927D((iM5406c2 - i3) - iM17434a2);
                this.f44125e = iM5406c2;
            } else {
                int iM5405b = AbstractC0961e.m5405b(str);
                m13927D(iM5405b);
                this.f44125e = AbstractC0961e.m5406c(str, bArr2, this.f44125e, iM5405b);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzacy(e);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m13928w(long j) {
        boolean z = nhb.f52743b;
        byte[] bArr = this.f44123c;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = (int) j;
                int i2 = this.f44125e;
                if (j2 == 0) {
                    this.f44125e = i2 + 1;
                    tjb.m22163k(bArr, i2, (byte) i);
                    return;
                } else {
                    this.f44125e = i2 + 1;
                    tjb.m22163k(bArr, i2, (byte) (i | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i3 = (int) j;
                int i4 = this.f44125e;
                if (j3 == 0) {
                    this.f44125e = i4 + 1;
                    bArr[i4] = (byte) i3;
                    return;
                } else {
                    this.f44125e = i4 + 1;
                    bArr[i4] = (byte) (i3 | 128);
                    j >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m13929x(int i) {
        int i2 = this.f44125e;
        byte[] bArr = this.f44123c;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f44125e = i2 + 4;
    }

    /* JADX INFO: renamed from: y */
    public final void m13930y(long j) {
        int i = this.f44125e;
        byte[] bArr = this.f44123c;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.f44125e = i + 8;
    }

    /* JADX INFO: renamed from: z */
    public final void m13931z(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f44125e;
        int i4 = this.f44124d;
        int i5 = i4 - i3;
        byte[] bArr2 = this.f44123c;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f44125e += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        this.f44125e = i4;
        m13925B();
        int i7 = i2 - i5;
        if (i7 > i4) {
            this.f44126f.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f44125e = i7;
        }
    }
}
