package p000;

import android.view.View;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzaeg;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzaew;
import com.google.android.gms.internal.measurement.zzagm;
import java.lang.reflect.Array;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class k80 {

    /* JADX INFO: renamed from: a */
    public int f46843a;

    /* JADX INFO: renamed from: b */
    public int f46844b;

    /* JADX INFO: renamed from: c */
    public int f46845c;

    /* JADX INFO: renamed from: d */
    public Object f46846d;

    public k80(int i, int i2) {
        this.f46846d = new ztb[i];
        for (int i3 = 0; i3 < i; i3++) {
            ((ztb[]) this.f46846d)[i3] = new ztb(((i2 + 4) * 17) + 1, 1);
        }
        this.f46845c = i2 * 17;
        this.f46844b = i;
        this.f46843a = -1;
    }

    /* JADX INFO: renamed from: A */
    public static final void m14951A(int i) throws zzaeh {
        if ((i & 7) == 0) {
            return;
        }
        uk9.m22782q("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: B */
    public static k80 m14952B(ghb ghbVar) {
        k80 k80Var = ghbVar.f40837c;
        return k80Var != null ? k80Var : new k80(ghbVar);
    }

    /* JADX INFO: renamed from: z */
    public static final void m14953z(int i) throws zzaeh {
        if ((i & 3) == 0) {
            return;
        }
        uk9.m22782q("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: C */
    public int m14954C() {
        int iMo5380l = this.f46845c;
        if (iMo5380l != 0) {
            this.f46843a = iMo5380l;
            this.f46845c = 0;
        } else {
            iMo5380l = ((ghb) this.f46846d).mo5380l();
            this.f46843a = iMo5380l;
        }
        if (iMo5380l == 0 || iMo5380l == this.f46844b) {
            return Integer.MAX_VALUE;
        }
        return iMo5380l >>> 3;
    }

    /* JADX INFO: renamed from: D */
    public int m14955D() {
        return this.f46843a;
    }

    /* JADX INFO: renamed from: E */
    public double m14956E() throws zzaeg {
        m14998u(1);
        return ((ghb) this.f46846d).mo5383o();
    }

    /* JADX INFO: renamed from: F */
    public float m14957F() throws zzaeg {
        m14998u(5);
        return ((ghb) this.f46846d).mo5384p();
    }

    /* JADX INFO: renamed from: G */
    public long m14958G() throws zzaeg {
        m14998u(0);
        return ((ghb) this.f46846d).mo5385q();
    }

    /* JADX INFO: renamed from: H */
    public long m14959H() throws zzaeg {
        m14998u(0);
        return ((ghb) this.f46846d).mo5386r();
    }

    /* JADX INFO: renamed from: I */
    public int m14960I() throws zzaeg {
        m14998u(0);
        return ((ghb) this.f46846d).mo5387s();
    }

    /* JADX INFO: renamed from: J */
    public long m14961J() throws zzaeg {
        m14998u(1);
        return ((ghb) this.f46846d).mo5388t();
    }

    /* JADX INFO: renamed from: K */
    public int m14962K() throws zzaeg {
        m14998u(5);
        return ((ghb) this.f46846d).mo5389u();
    }

    /* JADX INFO: renamed from: L */
    public boolean m14963L() throws zzaeg {
        m14998u(0);
        return ((ghb) this.f46846d).mo5390v();
    }

    /* JADX INFO: renamed from: M */
    public String m14964M() throws zzaeg {
        m14998u(2);
        return ((ghb) this.f46846d).mo5391w();
    }

    /* JADX INFO: renamed from: N */
    public String m14965N() throws zzaeg {
        m14998u(2);
        return ((ghb) this.f46846d).mo5392x();
    }

    /* JADX INFO: renamed from: O */
    public void m14966O(bhb bhbVar, fjb fjbVar, phb phbVar) throws zzaeh {
        m14998u(2);
        m14999v(bhbVar, fjbVar, phbVar);
    }

    /* JADX INFO: renamed from: P */
    public void m14967P(bhb bhbVar, fjb fjbVar, phb phbVar) throws zzaeg {
        m14998u(3);
        m15000w(bhbVar, fjbVar, phbVar);
    }

    /* JADX INFO: renamed from: Q */
    public zzacr m14968Q() {
        m14998u(2);
        return ((ghb) this.f46846d).mo5393y();
    }

    /* JADX INFO: renamed from: R */
    public int m14969R() throws zzaeg {
        m14998u(0);
        return ((ghb) this.f46846d).mo5360A();
    }

    /* JADX INFO: renamed from: S */
    public int m14970S() throws zzaeg {
        m14998u(0);
        return ((ghb) this.f46846d).mo5361B();
    }

    /* JADX INFO: renamed from: T */
    public int m14971T() throws zzaeg {
        m14998u(5);
        return ((ghb) this.f46846d).mo5362C();
    }

    /* JADX INFO: renamed from: U */
    public long m14972U() throws zzaeg {
        m14998u(1);
        return ((ghb) this.f46846d).mo5363D();
    }

    /* JADX INFO: renamed from: V */
    public int m14973V() throws zzaeg {
        m14998u(0);
        return ((ghb) this.f46846d).mo5364E();
    }

    /* JADX INFO: renamed from: W */
    public long m14974W() throws zzaeg {
        m14998u(0);
        return ((ghb) this.f46846d).mo5365F();
    }

    /* JADX INFO: renamed from: X */
    public void m14975X(mib mibVar) throws zzaeh {
        int iMo5380l;
        ghb ghbVar = (ghb) this.f46846d;
        int i = this.f46843a & 7;
        if (i == 1) {
            do {
                mibVar.add(Double.valueOf(ghbVar.mo5383o()));
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l = ghbVar.mo5380l();
                }
            } while (iMo5380l == this.f46843a);
            this.f46845c = iMo5380l;
            return;
        }
        if (i != 2) {
            fg2.m11817c();
            return;
        }
        int iMo5360A = ghbVar.mo5360A();
        m14951A(iMo5360A);
        int iMo5377e = ghbVar.mo5377e() + iMo5360A;
        do {
            mibVar.add(Double.valueOf(ghbVar.mo5383o()));
        } while (ghbVar.mo5377e() < iMo5377e);
    }

    /* JADX INFO: renamed from: Y */
    public void m14976Y(mib mibVar) throws zzaeh {
        int iMo5380l;
        ghb ghbVar = (ghb) this.f46846d;
        int i = this.f46843a & 7;
        if (i == 2) {
            int iMo5360A = ghbVar.mo5360A();
            m14953z(iMo5360A);
            int iMo5377e = ghbVar.mo5377e() + iMo5360A;
            do {
                mibVar.add(Float.valueOf(ghbVar.mo5384p()));
            } while (ghbVar.mo5377e() < iMo5377e);
            return;
        }
        if (i != 5) {
            fg2.m11817c();
            return;
        }
        do {
            mibVar.add(Float.valueOf(ghbVar.mo5384p()));
            if (ghbVar.mo5376d()) {
                return;
            } else {
                iMo5380l = ghbVar.mo5380l();
            }
        } while (iMo5380l == this.f46843a);
        this.f46845c = iMo5380l;
    }

    /* JADX INFO: renamed from: Z */
    public void m14977Z(mib mibVar) throws zzaeh {
        int iMo5380l;
        int iMo5380l2;
        ghb ghbVar = (ghb) this.f46846d;
        boolean z = mibVar instanceof pib;
        int i = this.f46843a;
        if (z) {
            pib pibVar = (pib) mibVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    fg2.m11817c();
                    return;
                }
                int iMo5377e = ghbVar.mo5377e() + ghbVar.mo5360A();
                do {
                    pibVar.m19184i(ghbVar.mo5385q());
                } while (ghbVar.mo5377e() < iMo5377e);
                m15002y(iMo5377e);
                return;
            }
            do {
                pibVar.m19184i(ghbVar.mo5385q());
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l2 = ghbVar.mo5380l();
                }
            } while (iMo5380l2 == this.f46843a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    fg2.m11817c();
                    return;
                }
                int iMo5377e2 = ghbVar.mo5377e() + ghbVar.mo5360A();
                do {
                    mibVar.add(Long.valueOf(ghbVar.mo5385q()));
                } while (ghbVar.mo5377e() < iMo5377e2);
                m15002y(iMo5377e2);
                return;
            }
            do {
                mibVar.add(Long.valueOf(ghbVar.mo5385q()));
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l = ghbVar.mo5380l();
                }
            } while (iMo5380l == this.f46843a);
            iMo5380l2 = iMo5380l;
        }
        this.f46845c = iMo5380l2;
    }

    /* JADX INFO: renamed from: a */
    public void m14978a(int i) {
        int[] iArr = (int[]) this.f46846d;
        int i2 = this.f46844b;
        iArr[i2] = i;
        int i3 = this.f46845c & (i2 + 1);
        this.f46844b = i3;
        int i4 = this.f46843a;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            int[] iArr2 = new int[i6];
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy((int[]) this.f46846d, 0, iArr2, i5, this.f46843a);
            this.f46846d = iArr2;
            this.f46843a = 0;
            this.f46844b = length;
            this.f46845c = i6 - 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m14979b() {
        View view = (View) this.f46846d;
        int top = this.f46845c - (view.getTop() - this.f46843a);
        WeakHashMap weakHashMap = dta.f36217a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f46844b));
    }

    /* JADX INFO: renamed from: c */
    public ztb m14980c() {
        return ((ztb[]) this.f46846d)[this.f46843a];
    }

    /* JADX INFO: renamed from: d */
    public byte[][] m14981d(int i, int i2) {
        int i3 = this.f46844b * i2;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i3, this.f46845c * i);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i3 - i4) - 1;
            byte[] bArr2 = (byte[]) ((ztb[]) this.f46846d)[i4 / i2].f72162c;
            int length = bArr2.length * i;
            byte[] bArr3 = new byte[length];
            for (int i6 = 0; i6 < length; i6++) {
                bArr3[i6] = bArr2[i6 / i];
            }
            bArr[i5] = bArr3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: e */
    public void m14982e(mib mibVar) throws zzaeh {
        int iMo5380l;
        int iMo5380l2;
        ghb ghbVar = (ghb) this.f46846d;
        boolean z = mibVar instanceof pib;
        int i = this.f46843a;
        if (z) {
            pib pibVar = (pib) mibVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    fg2.m11817c();
                    return;
                }
                int iMo5377e = ghbVar.mo5377e() + ghbVar.mo5360A();
                do {
                    pibVar.m19184i(ghbVar.mo5386r());
                } while (ghbVar.mo5377e() < iMo5377e);
                m15002y(iMo5377e);
                return;
            }
            do {
                pibVar.m19184i(ghbVar.mo5386r());
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l2 = ghbVar.mo5380l();
                }
            } while (iMo5380l2 == this.f46843a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    fg2.m11817c();
                    return;
                }
                int iMo5377e2 = ghbVar.mo5377e() + ghbVar.mo5360A();
                do {
                    mibVar.add(Long.valueOf(ghbVar.mo5386r()));
                } while (ghbVar.mo5377e() < iMo5377e2);
                m15002y(iMo5377e2);
                return;
            }
            do {
                mibVar.add(Long.valueOf(ghbVar.mo5386r()));
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l = ghbVar.mo5380l();
                }
            } while (iMo5380l == this.f46843a);
            iMo5380l2 = iMo5380l;
        }
        this.f46845c = iMo5380l2;
    }

    /* JADX INFO: renamed from: f */
    public void m14983f(mib mibVar) throws zzaeh {
        int iMo5380l;
        int iMo5380l2;
        ghb ghbVar = (ghb) this.f46846d;
        boolean z = mibVar instanceof xhb;
        int i = this.f46843a;
        if (z) {
            xhb xhbVar = (xhb) mibVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    fg2.m11817c();
                    return;
                }
                int iMo5377e = ghbVar.mo5377e() + ghbVar.mo5360A();
                do {
                    xhbVar.m24523h(ghbVar.mo5387s());
                } while (ghbVar.mo5377e() < iMo5377e);
                m15002y(iMo5377e);
                return;
            }
            do {
                xhbVar.m24523h(ghbVar.mo5387s());
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l2 = ghbVar.mo5380l();
                }
            } while (iMo5380l2 == this.f46843a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    fg2.m11817c();
                    return;
                }
                int iMo5377e2 = ghbVar.mo5377e() + ghbVar.mo5360A();
                do {
                    mibVar.add(Integer.valueOf(ghbVar.mo5387s()));
                } while (ghbVar.mo5377e() < iMo5377e2);
                m15002y(iMo5377e2);
                return;
            }
            do {
                mibVar.add(Integer.valueOf(ghbVar.mo5387s()));
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l = ghbVar.mo5380l();
                }
            } while (iMo5380l == this.f46843a);
            iMo5380l2 = iMo5380l;
        }
        this.f46845c = iMo5380l2;
    }

    /* JADX INFO: renamed from: g */
    public void m14984g(mib mibVar) throws zzaeh {
        int iMo5380l;
        int iMo5380l2;
        ghb ghbVar = (ghb) this.f46846d;
        boolean z = mibVar instanceof pib;
        int i = this.f46843a;
        if (z) {
            pib pibVar = (pib) mibVar;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    fg2.m11817c();
                    return;
                }
                int iMo5360A = ghbVar.mo5360A();
                m14951A(iMo5360A);
                int iMo5377e = ghbVar.mo5377e() + iMo5360A;
                do {
                    pibVar.m19184i(ghbVar.mo5388t());
                } while (ghbVar.mo5377e() < iMo5377e);
                return;
            }
            do {
                pibVar.m19184i(ghbVar.mo5388t());
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l2 = ghbVar.mo5380l();
                }
            } while (iMo5380l2 == this.f46843a);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    fg2.m11817c();
                    return;
                }
                int iMo5360A2 = ghbVar.mo5360A();
                m14951A(iMo5360A2);
                int iMo5377e2 = ghbVar.mo5377e() + iMo5360A2;
                do {
                    mibVar.add(Long.valueOf(ghbVar.mo5388t()));
                } while (ghbVar.mo5377e() < iMo5377e2);
                return;
            }
            do {
                mibVar.add(Long.valueOf(ghbVar.mo5388t()));
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l = ghbVar.mo5380l();
                }
            } while (iMo5380l == this.f46843a);
            iMo5380l2 = iMo5380l;
        }
        this.f46845c = iMo5380l2;
    }

    /* JADX INFO: renamed from: h */
    public void m14985h(mib mibVar) throws zzaeh {
        int iMo5380l;
        int iMo5380l2;
        ghb ghbVar = (ghb) this.f46846d;
        boolean z = mibVar instanceof xhb;
        int i = this.f46843a;
        if (z) {
            xhb xhbVar = (xhb) mibVar;
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo5360A = ghbVar.mo5360A();
                m14953z(iMo5360A);
                int iMo5377e = ghbVar.mo5377e() + iMo5360A;
                do {
                    xhbVar.m24523h(ghbVar.mo5389u());
                } while (ghbVar.mo5377e() < iMo5377e);
                return;
            }
            if (i2 != 5) {
                fg2.m11817c();
                return;
            }
            do {
                xhbVar.m24523h(ghbVar.mo5389u());
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l2 = ghbVar.mo5380l();
                }
            } while (iMo5380l2 == this.f46843a);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iMo5360A2 = ghbVar.mo5360A();
                m14953z(iMo5360A2);
                int iMo5377e2 = ghbVar.mo5377e() + iMo5360A2;
                do {
                    mibVar.add(Integer.valueOf(ghbVar.mo5389u()));
                } while (ghbVar.mo5377e() < iMo5377e2);
                return;
            }
            if (i3 != 5) {
                fg2.m11817c();
                return;
            }
            do {
                mibVar.add(Integer.valueOf(ghbVar.mo5389u()));
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l = ghbVar.mo5380l();
                }
            } while (iMo5380l == this.f46843a);
            iMo5380l2 = iMo5380l;
        }
        this.f46845c = iMo5380l2;
    }

    /* JADX INFO: renamed from: i */
    public void m14986i(mib mibVar) throws zzaeh {
        int iMo5380l;
        ghb ghbVar = (ghb) this.f46846d;
        int i = this.f46843a & 7;
        if (i == 0) {
            do {
                mibVar.add(Boolean.valueOf(ghbVar.mo5390v()));
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l = ghbVar.mo5380l();
                }
            } while (iMo5380l == this.f46843a);
            this.f46845c = iMo5380l;
            return;
        }
        if (i != 2) {
            fg2.m11817c();
            return;
        }
        int iMo5377e = ghbVar.mo5377e() + ghbVar.mo5360A();
        do {
            mibVar.add(Boolean.valueOf(ghbVar.mo5390v()));
        } while (ghbVar.mo5377e() < iMo5377e);
        m15002y(iMo5377e);
    }

    /* JADX INFO: renamed from: j */
    public void m14987j(mib mibVar, boolean z) throws zzaeg {
        int iMo5380l;
        ghb ghbVar = (ghb) this.f46846d;
        if ((this.f46843a & 7) != 2) {
            fg2.m11817c();
            return;
        }
        do {
            mibVar.add(z ? m14965N() : m14964M());
            if (ghbVar.mo5376d()) {
                return;
            } else {
                iMo5380l = ghbVar.mo5380l();
            }
        } while (iMo5380l == this.f46843a);
        this.f46845c = iMo5380l;
    }

    /* JADX INFO: renamed from: k */
    public void m14988k(mib mibVar, fjb fjbVar, phb phbVar) throws zzaeh {
        int iMo5380l;
        int i = this.f46843a;
        if ((i & 7) != 2) {
            fg2.m11817c();
            return;
        }
        do {
            whb whbVarZza = fjbVar.zza();
            m14999v(whbVarZza, fjbVar, phbVar);
            fjbVar.mo11892a(whbVarZza);
            mibVar.add(whbVarZza);
            ghb ghbVar = (ghb) this.f46846d;
            if (ghbVar.mo5376d() || this.f46845c != 0) {
                return;
            } else {
                iMo5380l = ghbVar.mo5380l();
            }
        } while (iMo5380l == i);
        this.f46845c = iMo5380l;
    }

    /* JADX INFO: renamed from: l */
    public void m14989l(mib mibVar, fjb fjbVar, phb phbVar) throws zzaeg {
        int iMo5380l;
        int i = this.f46843a;
        if ((i & 7) != 3) {
            fg2.m11817c();
            return;
        }
        do {
            whb whbVarZza = fjbVar.zza();
            m15000w(whbVarZza, fjbVar, phbVar);
            fjbVar.mo11892a(whbVarZza);
            mibVar.add(whbVarZza);
            ghb ghbVar = (ghb) this.f46846d;
            if (ghbVar.mo5376d() || this.f46845c != 0) {
                return;
            } else {
                iMo5380l = ghbVar.mo5380l();
            }
        } while (iMo5380l == i);
        this.f46845c = iMo5380l;
    }

    /* JADX INFO: renamed from: m */
    public void m14990m(mib mibVar) throws zzaeg {
        int iMo5380l;
        if ((this.f46843a & 7) != 2) {
            fg2.m11817c();
            return;
        }
        do {
            mibVar.add(m14968Q());
            ghb ghbVar = (ghb) this.f46846d;
            if (ghbVar.mo5376d()) {
                return;
            } else {
                iMo5380l = ghbVar.mo5380l();
            }
        } while (iMo5380l == this.f46843a);
        this.f46845c = iMo5380l;
    }

    /* JADX INFO: renamed from: n */
    public void m14991n(mib mibVar) throws zzaeh {
        int iMo5380l;
        int iMo5380l2;
        ghb ghbVar = (ghb) this.f46846d;
        boolean z = mibVar instanceof xhb;
        int i = this.f46843a;
        if (z) {
            xhb xhbVar = (xhb) mibVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    fg2.m11817c();
                    return;
                }
                int iMo5377e = ghbVar.mo5377e() + ghbVar.mo5360A();
                do {
                    xhbVar.m24523h(ghbVar.mo5360A());
                } while (ghbVar.mo5377e() < iMo5377e);
                m15002y(iMo5377e);
                return;
            }
            do {
                xhbVar.m24523h(ghbVar.mo5360A());
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l2 = ghbVar.mo5380l();
                }
            } while (iMo5380l2 == this.f46843a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    fg2.m11817c();
                    return;
                }
                int iMo5377e2 = ghbVar.mo5377e() + ghbVar.mo5360A();
                do {
                    mibVar.add(Integer.valueOf(ghbVar.mo5360A()));
                } while (ghbVar.mo5377e() < iMo5377e2);
                m15002y(iMo5377e2);
                return;
            }
            do {
                mibVar.add(Integer.valueOf(ghbVar.mo5360A()));
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l = ghbVar.mo5380l();
                }
            } while (iMo5380l == this.f46843a);
            iMo5380l2 = iMo5380l;
        }
        this.f46845c = iMo5380l2;
    }

    /* JADX INFO: renamed from: o */
    public void m14992o(mib mibVar) throws zzaeh {
        int iMo5380l;
        int iMo5380l2;
        ghb ghbVar = (ghb) this.f46846d;
        boolean z = mibVar instanceof xhb;
        int i = this.f46843a;
        if (z) {
            xhb xhbVar = (xhb) mibVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    fg2.m11817c();
                    return;
                }
                int iMo5377e = ghbVar.mo5377e() + ghbVar.mo5360A();
                do {
                    xhbVar.m24523h(ghbVar.mo5361B());
                } while (ghbVar.mo5377e() < iMo5377e);
                m15002y(iMo5377e);
                return;
            }
            do {
                xhbVar.m24523h(ghbVar.mo5361B());
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l2 = ghbVar.mo5380l();
                }
            } while (iMo5380l2 == this.f46843a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    fg2.m11817c();
                    return;
                }
                int iMo5377e2 = ghbVar.mo5377e() + ghbVar.mo5360A();
                do {
                    mibVar.add(Integer.valueOf(ghbVar.mo5361B()));
                } while (ghbVar.mo5377e() < iMo5377e2);
                m15002y(iMo5377e2);
                return;
            }
            do {
                mibVar.add(Integer.valueOf(ghbVar.mo5361B()));
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l = ghbVar.mo5380l();
                }
            } while (iMo5380l == this.f46843a);
            iMo5380l2 = iMo5380l;
        }
        this.f46845c = iMo5380l2;
    }

    /* JADX INFO: renamed from: p */
    public void m14993p(mib mibVar) throws zzaeh {
        int iMo5380l;
        int iMo5380l2;
        ghb ghbVar = (ghb) this.f46846d;
        boolean z = mibVar instanceof xhb;
        int i = this.f46843a;
        if (z) {
            xhb xhbVar = (xhb) mibVar;
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo5360A = ghbVar.mo5360A();
                m14953z(iMo5360A);
                int iMo5377e = ghbVar.mo5377e() + iMo5360A;
                do {
                    xhbVar.m24523h(ghbVar.mo5362C());
                } while (ghbVar.mo5377e() < iMo5377e);
                return;
            }
            if (i2 != 5) {
                fg2.m11817c();
                return;
            }
            do {
                xhbVar.m24523h(ghbVar.mo5362C());
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l2 = ghbVar.mo5380l();
                }
            } while (iMo5380l2 == this.f46843a);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iMo5360A2 = ghbVar.mo5360A();
                m14953z(iMo5360A2);
                int iMo5377e2 = ghbVar.mo5377e() + iMo5360A2;
                do {
                    mibVar.add(Integer.valueOf(ghbVar.mo5362C()));
                } while (ghbVar.mo5377e() < iMo5377e2);
                return;
            }
            if (i3 != 5) {
                fg2.m11817c();
                return;
            }
            do {
                mibVar.add(Integer.valueOf(ghbVar.mo5362C()));
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l = ghbVar.mo5380l();
                }
            } while (iMo5380l == this.f46843a);
            iMo5380l2 = iMo5380l;
        }
        this.f46845c = iMo5380l2;
    }

    /* JADX INFO: renamed from: q */
    public void m14994q(mib mibVar) throws zzaeh {
        int iMo5380l;
        int iMo5380l2;
        ghb ghbVar = (ghb) this.f46846d;
        boolean z = mibVar instanceof pib;
        int i = this.f46843a;
        if (z) {
            pib pibVar = (pib) mibVar;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    fg2.m11817c();
                    return;
                }
                int iMo5360A = ghbVar.mo5360A();
                m14951A(iMo5360A);
                int iMo5377e = ghbVar.mo5377e() + iMo5360A;
                do {
                    pibVar.m19184i(ghbVar.mo5363D());
                } while (ghbVar.mo5377e() < iMo5377e);
                return;
            }
            do {
                pibVar.m19184i(ghbVar.mo5363D());
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l2 = ghbVar.mo5380l();
                }
            } while (iMo5380l2 == this.f46843a);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    fg2.m11817c();
                    return;
                }
                int iMo5360A2 = ghbVar.mo5360A();
                m14951A(iMo5360A2);
                int iMo5377e2 = ghbVar.mo5377e() + iMo5360A2;
                do {
                    mibVar.add(Long.valueOf(ghbVar.mo5363D()));
                } while (ghbVar.mo5377e() < iMo5377e2);
                return;
            }
            do {
                mibVar.add(Long.valueOf(ghbVar.mo5363D()));
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l = ghbVar.mo5380l();
                }
            } while (iMo5380l == this.f46843a);
            iMo5380l2 = iMo5380l;
        }
        this.f46845c = iMo5380l2;
    }

    /* JADX INFO: renamed from: r */
    public void m14995r(mib mibVar) throws zzaeh {
        int iMo5380l;
        int iMo5380l2;
        ghb ghbVar = (ghb) this.f46846d;
        boolean z = mibVar instanceof xhb;
        int i = this.f46843a;
        if (z) {
            xhb xhbVar = (xhb) mibVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    fg2.m11817c();
                    return;
                }
                int iMo5377e = ghbVar.mo5377e() + ghbVar.mo5360A();
                do {
                    xhbVar.m24523h(ghbVar.mo5364E());
                } while (ghbVar.mo5377e() < iMo5377e);
                m15002y(iMo5377e);
                return;
            }
            do {
                xhbVar.m24523h(ghbVar.mo5364E());
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l2 = ghbVar.mo5380l();
                }
            } while (iMo5380l2 == this.f46843a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    fg2.m11817c();
                    return;
                }
                int iMo5377e2 = ghbVar.mo5377e() + ghbVar.mo5360A();
                do {
                    mibVar.add(Integer.valueOf(ghbVar.mo5364E()));
                } while (ghbVar.mo5377e() < iMo5377e2);
                m15002y(iMo5377e2);
                return;
            }
            do {
                mibVar.add(Integer.valueOf(ghbVar.mo5364E()));
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l = ghbVar.mo5380l();
                }
            } while (iMo5380l == this.f46843a);
            iMo5380l2 = iMo5380l;
        }
        this.f46845c = iMo5380l2;
    }

    /* JADX INFO: renamed from: s */
    public void m14996s(mib mibVar) throws zzaeh {
        int iMo5380l;
        int iMo5380l2;
        ghb ghbVar = (ghb) this.f46846d;
        boolean z = mibVar instanceof pib;
        int i = this.f46843a;
        if (z) {
            pib pibVar = (pib) mibVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    fg2.m11817c();
                    return;
                }
                int iMo5377e = ghbVar.mo5377e() + ghbVar.mo5360A();
                do {
                    pibVar.m19184i(ghbVar.mo5365F());
                } while (ghbVar.mo5377e() < iMo5377e);
                m15002y(iMo5377e);
                return;
            }
            do {
                pibVar.m19184i(ghbVar.mo5365F());
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l2 = ghbVar.mo5380l();
                }
            } while (iMo5380l2 == this.f46843a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    fg2.m11817c();
                    return;
                }
                int iMo5377e2 = ghbVar.mo5377e() + ghbVar.mo5360A();
                do {
                    mibVar.add(Long.valueOf(ghbVar.mo5365F()));
                } while (ghbVar.mo5377e() < iMo5377e2);
                m15002y(iMo5377e2);
                return;
            }
            do {
                mibVar.add(Long.valueOf(ghbVar.mo5365F()));
                if (ghbVar.mo5376d()) {
                    return;
                } else {
                    iMo5380l = ghbVar.mo5380l();
                }
            } while (iMo5380l == this.f46843a);
            iMo5380l2 = iMo5380l;
        }
        this.f46845c = iMo5380l2;
    }

    /* JADX INFO: renamed from: t */
    public void m14997t(zzaew zzaewVar, sq5 sq5Var, phb phbVar) throws zzaeg {
        int i;
        int i2;
        m14998u(2);
        ghb ghbVar = (ghb) this.f46846d;
        int iMo5373a = ghbVar.mo5373a(ghbVar.mo5360A());
        Object obj = sq5Var.f61250d;
        Object objM15001x = "";
        Object objM15001x2 = obj;
        while (true) {
            try {
                int iM14954C = m14954C();
                if (iM14954C == Integer.MAX_VALUE || ghbVar.mo5376d()) {
                    break;
                }
                boolean zMo5382n = false;
                if (iM14954C == 1) {
                    objM15001x = m15001x((zzagm) sq5Var.f61248b, null, null);
                } else if (iM14954C != 2) {
                    try {
                        if (!((ghbVar.mo5376d() || (i2 = this.f46843a) == this.f46844b) ? false : ghbVar.mo5382n(i2))) {
                            throw new zzaeh("Unable to parse map entry.");
                        }
                    } catch (zzaeg e) {
                        if (!ghbVar.mo5376d() && (i = this.f46843a) != this.f46844b) {
                            zMo5382n = ghbVar.mo5382n(i);
                        }
                        if (!zMo5382n) {
                            throw new zzaeh("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    objM15001x2 = m15001x((zzagm) sq5Var.f61249c, obj.getClass(), phbVar);
                }
            } catch (Throwable th) {
                ghbVar.mo5374b(iMo5373a);
                throw th;
            }
        }
        zzaewVar.put(objM15001x, objM15001x2);
        ghbVar.mo5374b(iMo5373a);
    }

    /* JADX INFO: renamed from: u */
    public void m14998u(int i) throws zzaeg {
        if ((this.f46843a & 7) == i) {
            return;
        }
        fg2.m11817c();
    }

    /* JADX INFO: renamed from: v */
    public void m14999v(Object obj, fjb fjbVar, phb phbVar) throws zzaeh {
        ghb ghbVar = (ghb) this.f46846d;
        int iMo5360A = ghbVar.mo5360A();
        if (ghbVar.f40835a + ghbVar.f40836b >= 100) {
            uk9.m22782q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return;
        }
        int iMo5373a = ghbVar.mo5373a(iMo5360A);
        ghbVar.f40835a++;
        fjbVar.mo11897f(obj, this, phbVar);
        ghbVar.mo5381m(0);
        ghbVar.f40835a--;
        ghbVar.mo5374b(iMo5373a);
    }

    /* JADX INFO: renamed from: w */
    public void m15000w(Object obj, fjb fjbVar, phb phbVar) {
        int i = this.f46844b;
        this.f46844b = ((this.f46843a >>> 3) << 3) | 4;
        try {
            fjbVar.mo11897f(obj, this, phbVar);
            if (this.f46843a != this.f46844b) {
                throw new zzaeh("Failed to parse the message.");
            }
            this.f46844b = i;
        } catch (Throwable th) {
            this.f46844b = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: x */
    public Object m15001x(zzagm zzagmVar, Class cls, phb phbVar) throws zzaeh {
        zzagm zzagmVar2 = zzagm.zza;
        switch (zzagmVar.ordinal()) {
            case 0:
                return Double.valueOf(m14956E());
            case 1:
                return Float.valueOf(m14957F());
            case 2:
                return Long.valueOf(m14959H());
            case 3:
                return Long.valueOf(m14958G());
            case 4:
                return Integer.valueOf(m14960I());
            case 5:
                return Long.valueOf(m14961J());
            case 6:
                return Integer.valueOf(m14962K());
            case 7:
                return Boolean.valueOf(m14963L());
            case 8:
                return m14965N();
            case 9:
            default:
                C3386nv.m17626m("unsupported field type.");
                return null;
            case 10:
                m14998u(2);
                fjb fjbVarM4784a = cjb.f10181c.m4784a(cls);
                whb whbVarZza = fjbVarM4784a.zza();
                m14999v(whbVarZza, fjbVarM4784a, phbVar);
                fjbVarM4784a.mo11892a(whbVarZza);
                return whbVarZza;
            case 11:
                return m14968Q();
            case 12:
                return Integer.valueOf(m14969R());
            case 13:
                return Integer.valueOf(m14970S());
            case 14:
                return Integer.valueOf(m14971T());
            case 15:
                return Long.valueOf(m14972U());
            case 16:
                return Integer.valueOf(m14973V());
            case 17:
                return Long.valueOf(m14974W());
        }
    }

    /* JADX INFO: renamed from: y */
    public void m15002y(int i) throws zzaeh {
        if (((ghb) this.f46846d).mo5377e() == i) {
            return;
        }
        uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public k80(ghb ghbVar) {
        this.f46845c = 0;
        this.f46846d = ghbVar;
        ghbVar.f40837c = this;
    }

    public k80() {
        this.f46845c = 7;
        this.f46846d = new int[8];
    }
}
