package okio;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p000.AbstractC3550rv;
import p000.C3386nv;
import p000.aj0;
import p000.te1;
import p000.ux5;
import p000.vyc;
import p000.wq1;
import p000.zt8;

/* JADX INFO: loaded from: classes.dex */
public final class SegmentedByteString extends ByteString {

    /* JADX INFO: renamed from: e */
    public final transient byte[][] f54517e;

    /* JADX INFO: renamed from: f */
    public final transient int[] f54518f;

    public SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.f54513d.f54514a);
        this.f54517e = bArr;
        this.f54518f = iArr;
    }

    private final Object writeReplace() {
        return m18092u();
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: a */
    public final String mo18075a() {
        throw null;
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: c */
    public final ByteString mo18077c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f54517e;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f54518f;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new ByteString(bArrDigest);
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: d */
    public final int mo18078d() {
        return this.f54518f[this.f54517e.length - 1];
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: e */
    public final String mo18079e() {
        return m18092u().mo18079e();
    }

    @Override // okio.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.mo18078d() == mo18078d() && mo18084l(0, byteString, mo18078d())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: f */
    public final int mo18080f(int i, byte[] bArr) {
        bArr.getClass();
        return m18092u().mo18080f(i, bArr);
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: h */
    public final byte[] mo18081h() {
        return m18091t();
    }

    @Override // okio.ByteString
    public final int hashCode() {
        int i = this.f54515b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f54517e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f54518f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f54515b = i3;
        return i3;
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: i */
    public final byte mo18082i(int i) {
        byte[][] bArr = this.f54517e;
        int length = bArr.length - 1;
        int[] iArr = this.f54518f;
        te1.m22001o(iArr[length], i, 1L);
        int iM23596c = vyc.m23596c(this, i);
        return bArr[iM23596c][(i - (iM23596c == 0 ? 0 : iArr[iM23596c - 1])) + iArr[bArr.length + iM23596c]];
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: j */
    public final int mo18083j(byte[] bArr) {
        bArr.getClass();
        return m18092u().mo18083j(bArr);
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: l */
    public final boolean mo18084l(int i, ByteString byteString, int i2) {
        byteString.getClass();
        if (i >= 0 && i <= mo18078d() - i2) {
            int i3 = i2 + i;
            int iM23596c = vyc.m23596c(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.f54518f;
                int i5 = iM23596c == 0 ? 0 : iArr[iM23596c - 1];
                int i6 = iArr[iM23596c] - i5;
                byte[][] bArr = this.f54517e;
                int i7 = iArr[bArr.length + iM23596c];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (byteString.mo18085m(i4, bArr[iM23596c], (i - i5) + i7, iMin)) {
                    i4 += iMin;
                    i += iMin;
                    iM23596c++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: m */
    public final boolean mo18085m(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i < 0 || i > mo18078d() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iM23596c = vyc.m23596c(this, i);
        while (i < i4) {
            int[] iArr = this.f54518f;
            int i5 = iM23596c == 0 ? 0 : iArr[iM23596c - 1];
            int i6 = iArr[iM23596c] - i5;
            byte[][] bArr2 = this.f54517e;
            int i7 = iArr[bArr2.length + iM23596c];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!te1.m21993g(bArr2[iM23596c], (i - i5) + i7, bArr, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iM23596c++;
        }
        return true;
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: n */
    public final String mo18086n(Charset charset) {
        charset.getClass();
        return m18092u().mo18086n(charset);
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: o */
    public final ByteString mo18087o(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = mo18078d();
        }
        if (i < 0) {
            C3386nv.m17624j(ux5.m22989l("beginIndex=", i, " < 0"));
            return null;
        }
        if (i2 > mo18078d()) {
            StringBuilder sbM22998u = ux5.m22998u("endIndex=", i2, " > length(");
            sbM22998u.append(mo18078d());
            sbM22998u.append(')');
            throw new IllegalArgumentException(sbM22998u.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            C3386nv.m17624j(wq1.m24115k("endIndex=", i2, i, " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == mo18078d()) {
            return this;
        }
        if (i == i2) {
            return ByteString.f54513d;
        }
        int iM23596c = vyc.m23596c(this, i);
        int iM23596c2 = vyc.m23596c(this, i2 - 1);
        byte[][] bArr = this.f54517e;
        byte[][] bArr2 = (byte[][]) AbstractC3550rv.m20832Z(bArr, iM23596c, iM23596c2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f54518f;
        if (iM23596c <= iM23596c2) {
            int i4 = iM23596c;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iM23596c2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iM23596c != 0 ? iArr2[iM23596c - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new SegmentedByteString(bArr2, iArr);
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: q */
    public final ByteString mo18088q() {
        return m18092u().mo18088q();
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: s */
    public final void mo18090s(aj0 aj0Var, int i) {
        int iM23596c = vyc.m23596c(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f54518f;
            int i3 = iM23596c == 0 ? 0 : iArr[iM23596c - 1];
            int i4 = iArr[iM23596c] - i3;
            byte[][] bArr = this.f54517e;
            int i5 = iArr[bArr.length + iM23596c];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            zt8 zt8Var = new zt8(bArr[iM23596c], i6, i6 + iMin, true);
            zt8 zt8Var2 = aj0Var.f722a;
            if (zt8Var2 == null) {
                zt8Var.f72159g = zt8Var;
                zt8Var.f72158f = zt8Var;
                aj0Var.f722a = zt8Var;
            } else {
                zt8 zt8Var3 = zt8Var2.f72159g;
                zt8Var3.getClass();
                zt8Var3.m25777b(zt8Var);
            }
            i2 += iMin;
            iM23596c++;
        }
        aj0Var.f723b += (long) i;
    }

    /* JADX INFO: renamed from: t */
    public final byte[] m18091t() {
        byte[] bArr = new byte[mo18078d()];
        byte[][] bArr2 = this.f54517e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f54518f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            AbstractC3550rv.m20827U(bArr2[i], i3, bArr, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public final String toString() {
        return m18092u().toString();
    }

    /* JADX INFO: renamed from: u */
    public final ByteString m18092u() {
        return new ByteString(m18091t());
    }
}
