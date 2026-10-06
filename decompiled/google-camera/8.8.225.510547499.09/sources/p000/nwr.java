package p000;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class nwr implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final nwr f44839b = new nwq(nxz.f44986b);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c */
    public int f44840c = 0;

    /* JADX INFO: renamed from: q */
    static int m17796q(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }

    /* JADX INFO: renamed from: s */
    public static nwr m17797s(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (nwr) it.next();
        }
        int i2 = i >>> 1;
        nwr nwrVarM17797s = m17797s(it, i2);
        nwr nwrVarM17797s2 = m17797s(it, i - i2);
        if (Integer.MAX_VALUE - nwrVarM17797s.mo17783d() < nwrVarM17797s2.mo17783d()) {
            throw new IllegalArgumentException("ByteString would be too long: " + nwrVarM17797s.mo17783d() + "+" + nwrVarM17797s2.mo17783d());
        }
        int[] iArr = nzl.f45075a;
        if (nwrVarM17797s2.mo17783d() == 0) {
            return nwrVarM17797s;
        }
        if (nwrVarM17797s.mo17783d() == 0) {
            return nwrVarM17797s2;
        }
        int iMo17783d = nwrVarM17797s.mo17783d() + nwrVarM17797s2.mo17783d();
        if (iMo17783d < 128) {
            return nzl.m18267g(nwrVarM17797s, nwrVarM17797s2);
        }
        if (nwrVarM17797s instanceof nzl) {
            nzl nzlVar = (nzl) nwrVarM17797s;
            if (nzlVar.f45078f.mo17783d() + nwrVarM17797s2.mo17783d() < 128) {
                return new nzl(nzlVar.f45077e, nzl.m18267g(nzlVar.f45078f, nwrVarM17797s2));
            }
            if (nzlVar.f45077e.mo17785f() > nzlVar.f45078f.mo17785f() && nzlVar.f45079g > nwrVarM17797s2.mo17785f()) {
                return new nzl(nzlVar.f45077e, new nzl(nzlVar.f45078f, nwrVarM17797s2));
            }
        }
        if (iMo17783d >= nzl.m18266c(Math.max(nwrVarM17797s.mo17785f(), nwrVarM17797s2.mo17785f()) + 1)) {
            return new nzl(nwrVarM17797s, nwrVarM17797s2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        lij.m15428ak(nwrVarM17797s, arrayDeque);
        lij.m15428ak(nwrVarM17797s2, arrayDeque);
        nwr nzlVar2 = (nwr) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            nzlVar2 = new nzl((nwr) arrayDeque.pop(), nzlVar2);
        }
        return nzlVar2;
    }

    /* JADX INFO: renamed from: t */
    public static nwr m17798t(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        m17796q(0, iRemaining, byteBuffer.remaining());
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr);
        return new nwq(bArr);
    }

    /* JADX INFO: renamed from: u */
    public static nwr m17799u(byte[] bArr) {
        return m17800v(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: v */
    public static nwr m17800v(byte[] bArr, int i, int i2) {
        m17796q(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new nwq(bArr2);
    }

    /* JADX INFO: renamed from: w */
    public static nwr m17801w(String str) {
        return new nwq(str.getBytes(nxz.f44985a));
    }

    /* JADX INFO: renamed from: x */
    static nwr m17802x(byte[] bArr) {
        return new nwq(bArr);
    }

    /* JADX INFO: renamed from: z */
    static void m17803z(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    /* JADX INFO: renamed from: A */
    public final byte[] m17804A() {
        int iMo17783d = mo17783d();
        if (iMo17783d == 0) {
            return nxz.f44986b;
        }
        byte[] bArr = new byte[iMo17783d];
        mo17784e(bArr, 0, 0, iMo17783d);
        return bArr;
    }

    @Deprecated
    /* JADX INFO: renamed from: B */
    public final void m17805B(byte[] bArr, int i, int i2) {
        m17796q(0, i2, mo17783d());
        m17796q(i, i + i2, bArr.length);
        if (i2 > 0) {
            mo17784e(bArr, 0, i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract byte mo17780a(int i);

    /* JADX INFO: renamed from: b */
    public abstract byte mo17781b(int i);

    /* JADX INFO: renamed from: d */
    public abstract int mo17783d();

    /* JADX INFO: renamed from: e */
    protected abstract void mo17784e(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: f */
    protected abstract int mo17785f();

    /* JADX INFO: renamed from: h */
    public abstract boolean mo17787h();

    public final int hashCode() {
        int iMo17788i = this.f44840c;
        if (iMo17788i == 0) {
            int iMo17783d = mo17783d();
            iMo17788i = mo17788i(iMo17783d, 0, iMo17783d);
            if (iMo17788i == 0) {
                iMo17788i = 1;
            }
            this.f44840c = iMo17788i;
        }
        return iMo17788i;
    }

    /* JADX INFO: renamed from: i */
    protected abstract int mo17788i(int i, int i2, int i3);

    /* JADX INFO: renamed from: j */
    protected abstract int mo17789j(int i, int i2, int i3);

    /* JADX INFO: renamed from: k */
    public abstract nwr mo17790k(int i, int i2);

    /* JADX INFO: renamed from: l */
    public abstract nww mo17791l();

    /* JADX INFO: renamed from: m */
    protected abstract String mo17792m(Charset charset);

    /* JADX INFO: renamed from: n */
    public abstract ByteBuffer mo17793n();

    /* JADX INFO: renamed from: o */
    public abstract void mo17794o(nwk nwkVar);

    /* JADX INFO: renamed from: p */
    public abstract boolean mo17795p();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public nwo iterator() {
        return new nwl(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo17783d());
        objArr[2] = mo17783d() <= 50 ? lij.m15427aj(this) : lij.m15427aj(mo17790k(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* JADX INFO: renamed from: y */
    public final String m17807y() {
        return mo17783d() == 0 ? "" : mo17792m(nxz.f44985a);
    }
}
