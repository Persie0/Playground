package p000;

import com.google.android.gms.internal.measurement.AbstractC0961e;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzacy;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class hhb extends nhb {

    /* JADX INFO: renamed from: c */
    public final byte[] f42386c;

    /* JADX INFO: renamed from: d */
    public final int f42387d;

    /* JADX INFO: renamed from: e */
    public int f42388e;

    public hhb(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            C3386nv.m17626m(wq1.m24115k("Array range is invalid. Buffer.length=", length, i, ", offset=0, length="));
            throw null;
        }
        this.f42386c = bArr;
        this.f42388e = 0;
        this.f42387d = i;
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: c */
    public final void mo13255c(byte[] bArr, int i, int i2) throws zzacy {
        m13275w(bArr, i, i2);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: d */
    public final void mo13256d(int i, int i2) throws zzacy {
        mo13270r((i << 3) | i2);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: e */
    public final void mo13257e(int i, int i2) throws zzacy {
        mo13270r(i << 3);
        mo13269q(i2);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: f */
    public final void mo13258f(int i, int i2) throws zzacy {
        mo13270r(i << 3);
        mo13270r(i2);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: g */
    public final void mo13259g(int i, int i2) throws zzacy {
        mo13270r((i << 3) | 5);
        mo13271s(i2);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: h */
    public final void mo13260h(int i, long j) throws zzacy {
        mo13270r(i << 3);
        mo13272t(j);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: i */
    public final void mo13261i(int i, long j) throws zzacy {
        mo13270r((i << 3) | 1);
        mo13273u(j);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: j */
    public final void mo13262j(int i, boolean z) throws zzacy {
        mo13270r(i << 3);
        mo13268p(z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: k */
    public final void mo13263k(int i, String str) throws zzacy {
        mo13270r((i << 3) | 2);
        mo13274v(str);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: l */
    public final void mo13264l(int i, zzacr zzacrVar) throws zzacy {
        mo13270r((i << 3) | 2);
        mo13265m(zzacrVar);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: m */
    public final void mo13265m(zzacr zzacrVar) throws zzacy {
        mo13270r(zzacrVar.mo5422f());
        zzacrVar.mo5425i(this);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: n */
    public final void mo13266n(int i, byte[] bArr) throws zzacy {
        mo13270r(i);
        m13275w(bArr, 0, i);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: o */
    public final void mo13267o(bhb bhbVar) throws zzacy {
        whb whbVar = (whb) bhbVar;
        mo13270r(whbVar.m23968l());
        whbVar.m23961e(this);
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: p */
    public final void mo13268p(byte b) throws zzacy {
        int i = this.f42388e;
        try {
            int i2 = i + 1;
            try {
                this.f42386c[i] = b;
                this.f42388e = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new zzacy(i, this.f42387d, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: q */
    public final void mo13269q(int i) throws zzacy {
        if (i >= 0) {
            mo13270r(i);
        } else {
            mo13272t(i);
        }
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: r */
    public final void mo13270r(int i) throws zzacy {
        int i2;
        int i3 = this.f42388e;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.f42386c;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.f42388e = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzacy(i2, this.f42387d, 1, e);
                }
            }
            throw new zzacy(i2, this.f42387d, 1, e);
        }
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: s */
    public final void mo13271s(int i) throws zzacy {
        int i2 = this.f42388e;
        try {
            byte[] bArr = this.f42386c;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f42388e = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzacy(i2, this.f42387d, 4, e);
        }
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: t */
    public final void mo13272t(long j) throws zzacy {
        int i;
        int i2 = this.f42388e;
        byte[] bArr = this.f42386c;
        int i3 = this.f42387d;
        if (!nhb.f52743b || i3 - i2 < 10) {
            while ((j & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new zzacy(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new zzacy(i, i3, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                tjb.m22163k(bArr, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            tjb.m22163k(bArr, i2, (byte) j);
        }
        this.f42388e = i;
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: u */
    public final void mo13273u(long j) throws zzacy {
        int i = this.f42388e;
        try {
            byte[] bArr = this.f42386c;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.f42388e = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzacy(i, this.f42387d, 8, e);
        }
    }

    @Override // p000.nhb
    /* JADX INFO: renamed from: v */
    public final void mo13274v(String str) throws zzacy {
        int i = this.f42388e;
        try {
            int iM17434a = nhb.m17434a(str.length() * 3);
            int iM17434a2 = nhb.m17434a(str.length());
            byte[] bArr = this.f42386c;
            if (iM17434a2 != iM17434a) {
                mo13270r(AbstractC0961e.m5405b(str));
                int i2 = this.f42388e;
                this.f42388e = AbstractC0961e.m5406c(str, bArr, i2, bArr.length - i2);
            } else {
                int i3 = i + iM17434a2;
                this.f42388e = i3;
                int iM5406c = AbstractC0961e.m5406c(str, bArr, i3, bArr.length - i3);
                this.f42388e = i;
                mo13270r((iM5406c - i) - iM17434a2);
                this.f42388e = iM5406c;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new zzacy(e);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m13275w(byte[] bArr, int i, int i2) throws zzacy {
        try {
            System.arraycopy(bArr, i, this.f42386c, this.f42388e, i2);
            this.f42388e += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzacy(this.f42388e, this.f42387d, i2, e);
        }
    }

    /* JADX INFO: renamed from: x */
    public final int m13276x() {
        return this.f42387d - this.f42388e;
    }
}
