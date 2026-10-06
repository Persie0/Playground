package p000;

import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class nxb extends nwk {

    /* JADX INFO: renamed from: a */
    private static final Logger f44892a = Logger.getLogger(nxb.class.getName());

    /* JADX INFO: renamed from: e */
    public static final boolean f44893e = oag.f45122b;

    /* JADX INFO: renamed from: f */
    public liv f44894f;

    /* JADX INFO: renamed from: G */
    public static int m17962G(int i, nwr nwrVar) {
        return m17981Z(i) + m17963H(nwrVar);
    }

    /* JADX INFO: renamed from: H */
    public static int m17963H(nwr nwrVar) {
        return m17971P(nwrVar.mo17783d());
    }

    /* JADX INFO: renamed from: I */
    public static int m17964I(int i, int i2) {
        return m17981Z(i) + m17967L(i2);
    }

    @Deprecated
    /* JADX INFO: renamed from: J */
    static int m17965J(int i, nyw nywVar, nzm nzmVar) {
        int iMo17757G = ((nwc) nywVar).mo17757G(nzmVar);
        int iM17981Z = m17981Z(i);
        return iM17981Z + iM17981Z + iMo17757G;
    }

    /* JADX INFO: renamed from: K */
    public static int m17966K(int i, int i2) {
        return m17981Z(i) + m17967L(i2);
    }

    /* JADX INFO: renamed from: L */
    public static int m17967L(int i) {
        if (i >= 0) {
            return m17983ab(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: M */
    public static int m17968M(int i, long j) {
        return m17981Z(i) + m17985ad(j);
    }

    /* JADX INFO: renamed from: N */
    public static int m17969N(int i, nyh nyhVar) {
        return m17981Z(i) + m17970O(nyhVar);
    }

    /* JADX INFO: renamed from: O */
    public static int m17970O(nyh nyhVar) {
        int iMo18136N;
        if (nyhVar.f45019b != null) {
            iMo18136N = nyhVar.f45019b.mo17783d();
        } else {
            iMo18136N = nyhVar.f45018a != null ? nyhVar.f45018a.mo18136N() : 0;
        }
        return m17971P(iMo18136N);
    }

    /* JADX INFO: renamed from: P */
    public static int m17971P(int i) {
        return m17983ab(i) + i;
    }

    /* JADX INFO: renamed from: Q */
    public static int m17972Q(nyw nywVar) {
        return m17971P(nywVar.mo18136N());
    }

    /* JADX INFO: renamed from: R */
    static int m17973R(nyw nywVar, nzm nzmVar) {
        return m17971P(((nwc) nywVar).mo17757G(nzmVar));
    }

    /* JADX INFO: renamed from: S */
    public static int m17974S(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* JADX INFO: renamed from: T */
    public static int m17975T(int i, int i2) {
        return m17981Z(i) + m17976U(i2);
    }

    /* JADX INFO: renamed from: U */
    public static int m17976U(int i) {
        return m17983ab(m17986ae(i));
    }

    /* JADX INFO: renamed from: V */
    public static int m17977V(int i, long j) {
        return m17981Z(i) + m17978W(j);
    }

    /* JADX INFO: renamed from: W */
    public static int m17978W(long j) {
        return m17985ad(m17987af(j));
    }

    /* JADX INFO: renamed from: X */
    public static int m17979X(int i, String str) {
        return m17981Z(i) + m17980Y(str);
    }

    /* JADX INFO: renamed from: Y */
    public static int m17980Y(String str) {
        int length;
        try {
            length = oai.m18380b(str);
        } catch (oah e) {
            length = str.getBytes(nxz.f44985a).length;
        }
        return m17971P(length);
    }

    /* JADX INFO: renamed from: Z */
    public static int m17981Z(int i) {
        return m17983ab(oal.m18388c(i, 0));
    }

    /* JADX INFO: renamed from: aa */
    public static int m17982aa(int i, int i2) {
        return m17981Z(i) + m17983ab(i2);
    }

    /* JADX INFO: renamed from: ab */
    public static int m17983ab(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: ac */
    public static int m17984ac(int i, long j) {
        return m17981Z(i) + m17985ad(j);
    }

    /* JADX INFO: renamed from: ad */
    public static int m17985ad(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            j >>>= 14;
            i += 2;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* JADX INFO: renamed from: ae */
    public static int m17986ae(int i) {
        return (i >> 31) ^ (i + i);
    }

    /* JADX INFO: renamed from: af */
    public static long m17987af(long j) {
        return (j >> 63) ^ (j + j);
    }

    /* JADX INFO: renamed from: ag */
    public static nxb m17988ag(byte[] bArr) {
        return new nwz(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: ah */
    public static nxb m17989ah(OutputStream outputStream, int i) {
        return new nwy(outputStream, i);
    }

    /* JADX INFO: renamed from: at */
    public static int m17990at(int i) {
        return m17981Z(i) + 1;
    }

    /* JADX INFO: renamed from: au */
    public static int m17991au(int i) {
        return m17981Z(i) + 8;
    }

    /* JADX INFO: renamed from: av */
    public static int m17992av(int i) {
        return m17981Z(i) + 4;
    }

    /* JADX INFO: renamed from: aw */
    public static int m17993aw(int i) {
        return m17981Z(i) + 8;
    }

    /* JADX INFO: renamed from: ax */
    public static int m17994ax(int i) {
        return m17981Z(i) + 4;
    }

    /* JADX INFO: renamed from: ay */
    public static int m17995ay(int i) {
        return m17981Z(i) + 4;
    }

    /* JADX INFO: renamed from: az */
    public static int m17996az(int i) {
        return m17981Z(i) + 8;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo17929A(int i, int i2);

    /* JADX INFO: renamed from: B */
    public abstract void mo17930B(int i, int i2);

    /* JADX INFO: renamed from: C */
    public abstract void mo17931C(int i);

    /* JADX INFO: renamed from: D */
    public abstract void mo17932D(int i, long j);

    /* JADX INFO: renamed from: E */
    public abstract void mo17933E(long j);

    /* JADX INFO: renamed from: F */
    public abstract void mo17934F(byte[] bArr, int i);

    @Override // p000.nwk
    /* JADX INFO: renamed from: a */
    public abstract void mo17778a(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ai */
    public final void m17997ai() {
        if (mo17935b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: renamed from: aj */
    final void m17998aj(String str, oah oahVar) throws nxa {
        f44892a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", EArqVBjecl.VmfUVTRmrmLpFC, (Throwable) oahVar);
        byte[] bytes = str.getBytes(nxz.f44985a);
        try {
            int length = bytes.length;
            mo17931C(length);
            mo17778a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new nxa(e);
        }
    }

    /* JADX INFO: renamed from: ak */
    public final void m17999ak(int i, double d) {
        mo17950q(i, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: al */
    public final void m18000al(double d) {
        mo17951r(Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: am */
    public final void m18001am(int i, float f) {
        mo17948o(i, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: an */
    public final void m18002an(float f) {
        mo17949p(Float.floatToRawIntBits(f));
    }

    @Deprecated
    /* JADX INFO: renamed from: ao */
    public final void m18003ao(nyw nywVar) {
        nywVar.mo17764cy(this);
    }

    /* JADX INFO: renamed from: ap */
    public final void m18004ap(int i, int i2) {
        mo17930B(i, m17986ae(i2));
    }

    /* JADX INFO: renamed from: aq */
    public final void m18005aq(int i) {
        mo17931C(m17986ae(i));
    }

    /* JADX INFO: renamed from: ar */
    public final void m18006ar(int i, long j) {
        mo17932D(i, m17987af(j));
    }

    /* JADX INFO: renamed from: as */
    public final void m18007as(long j) {
        mo17933E(m17987af(j));
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo17935b();

    /* JADX INFO: renamed from: i */
    public abstract void mo17942i();

    /* JADX INFO: renamed from: j */
    public abstract void mo17943j(byte b);

    /* JADX INFO: renamed from: l */
    public abstract void mo17945l(int i, boolean z);

    /* JADX INFO: renamed from: m */
    public abstract void mo17946m(int i, nwr nwrVar);

    /* JADX INFO: renamed from: n */
    public abstract void mo17947n(nwr nwrVar);

    /* JADX INFO: renamed from: o */
    public abstract void mo17948o(int i, int i2);

    /* JADX INFO: renamed from: p */
    public abstract void mo17949p(int i);

    /* JADX INFO: renamed from: q */
    public abstract void mo17950q(int i, long j);

    /* JADX INFO: renamed from: r */
    public abstract void mo17951r(long j);

    /* JADX INFO: renamed from: s */
    public abstract void mo17952s(int i, int i2);

    /* JADX INFO: renamed from: t */
    public abstract void mo17953t(int i);

    /* JADX INFO: renamed from: u */
    public abstract void mo17954u(int i, nyw nywVar, nzm nzmVar);

    /* JADX INFO: renamed from: v */
    public abstract void mo17955v(nyw nywVar);

    /* JADX INFO: renamed from: w */
    public abstract void mo17956w(int i, nyw nywVar);

    /* JADX INFO: renamed from: x */
    public abstract void mo17957x(int i, nwr nwrVar);

    /* JADX INFO: renamed from: y */
    public abstract void mo17958y(int i, String str);

    /* JADX INFO: renamed from: z */
    public abstract void mo17959z(String str);
}
