package p000;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nfk {

    /* JADX INFO: renamed from: a */
    public final String f42185a;

    /* JADX INFO: renamed from: b */
    public final char[] f42186b;

    /* JADX INFO: renamed from: c */
    final int f42187c;

    /* JADX INFO: renamed from: d */
    final int f42188d;

    /* JADX INFO: renamed from: e */
    final int f42189e;

    /* JADX INFO: renamed from: f */
    final int f42190f;

    /* JADX INFO: renamed from: g */
    public final byte[] f42191g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f42192h;

    /* JADX INFO: renamed from: i */
    public final boolean f42193i;

    /* JADX WARN: Illegal instructions before constructor call */
    public nfk(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            boolean z = true;
            lku.m15671y(c < 128, "Non-ASCII character: %s", c);
            if (bArr[c] != -1) {
                z = false;
            }
            lku.m15671y(z, "Duplicate character: %s", c);
            bArr[c] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }

    /* JADX INFO: renamed from: a */
    final char m17446a(int i) {
        return this.f42186b[i];
    }

    /* JADX INFO: renamed from: b */
    final int m17447b(char c) throws nfm {
        if (c > 127) {
            throw new nfm("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        byte b = this.f42191g[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new nfm("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        throw new nfm("Unrecognized character: " + c);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17448c(char c) {
        byte[] bArr = this.f42191g;
        return c < bArr.length && bArr[c] != -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nfk) {
            nfk nfkVar = (nfk) obj;
            if (this.f42193i == nfkVar.f42193i && Arrays.equals(this.f42186b, nfkVar.f42186b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f42186b) + (true != this.f42193i ? 1237 : 1231);
    }

    public final String toString() {
        return this.f42185a;
    }

    public nfk(String str, char[] cArr, byte[] bArr, boolean z) {
        this.f42185a = str;
        cArr.getClass();
        this.f42186b = cArr;
        try {
            int length = cArr.length;
            int iM14999aq = kxk.m14999aq(length, RoundingMode.UNNECESSARY);
            this.f42188d = iM14999aq;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iM14999aq);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.f42189e = i;
            this.f42190f = iM14999aq >> iNumberOfTrailingZeros;
            this.f42187c = length - 1;
            this.f42191g = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f42190f; i2++) {
                zArr[kxk.m14998ap(i2 * 8, this.f42188d, RoundingMode.CEILING)] = true;
            }
            this.f42192h = zArr;
            this.f42193i = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }
}
