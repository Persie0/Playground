package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.AbstractC0117w;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import java.util.ArrayList;
import java.util.List;
import p000.C3024g3;
import p000.C3299li;
import p000.C3757xf;
import p000.a44;
import p000.bh4;
import p000.cd4;
import p000.chd;
import p000.ci8;
import p000.dr3;
import p000.eb1;
import p000.fg7;
import p000.gq6;
import p000.hta;
import p000.jl3;
import p000.kg7;
import p000.kk5;
import p000.pg9;
import p000.rv3;
import p000.sv3;
import p000.thb;
import p000.tv8;
import p000.ui3;
import p000.v56;
import p000.w34;
import p000.wfb;
import p000.x74;
import p000.x87;
import p000.y56;

/* JADX INFO: renamed from: androidx.compose.foundation.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0081g extends AbstractC0075a {

    /* JADX INFO: renamed from: f0 */
    public String f1755f0;

    /* JADX INFO: renamed from: g0 */
    public ui3 f1756g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f1757h0;

    /* JADX INFO: renamed from: i0 */
    public final y56 f1758i0;

    /* JADX INFO: renamed from: j0 */
    public final y56 f1759j0;

    /* JADX INFO: renamed from: k0 */
    public kg7 f1760k0;

    /* JADX INFO: renamed from: l0 */
    public pg9 f1761l0;

    /* JADX INFO: renamed from: m0 */
    public pg9 f1762m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f1763n0;

    /* JADX INFO: renamed from: o0 */
    public boolean f1764o0;

    /* JADX INFO: renamed from: p0 */
    public long f1765p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f1766q0;

    /* JADX INFO: renamed from: r0 */
    public a44 f1767r0;

    /* JADX INFO: renamed from: s0 */
    public pg9 f1768s0;

    /* JADX INFO: renamed from: t0 */
    public pg9 f1769t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f1770u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f1771v0;

    /* JADX INFO: renamed from: w0 */
    public long f1772w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f1773x0;

    public C0081g(ui3 ui3Var, String str, ui3 ui3Var2, v56 v56Var, w34 w34Var) {
        super(v56Var, w34Var, false, true, null, null, ui3Var);
        this.f1755f0 = str;
        this.f1756g0 = ui3Var2;
        this.f1757h0 = true;
        int i = kk5.f47454a;
        this.f1758i0 = new y56(6);
        this.f1759j0 = new y56(6);
        this.f1765p0 = -1L;
        this.f1772w0 = -1L;
    }

    @Override // androidx.compose.foundation.AbstractC0075a, p000.ng7
    /* JADX INFO: renamed from: D */
    public final void mo786D(fg7 fg7Var, PointerEventPass pointerEventPass, long j) {
        super.mo786D(fg7Var, pointerEventPass, j);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.f1760k0 == null || this.f1764o0) {
                return;
            }
            List list = fg7Var.f39071a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                kg7 kg7Var = (kg7) list.get(i);
                if (kg7Var.m15191c() && kg7Var != this.f1760k0) {
                    m821p1(false);
                    return;
                }
            }
            return;
        }
        if (this.f1760k0 == null) {
            if (AbstractC0117w.m943f(fg7Var, true)) {
                kg7 kg7Var2 = (kg7) fg7Var.f39071a.get(0);
                kg7Var2.m15189a();
                this.f1760k0 = kg7Var2;
                if (this.f1722Q) {
                    pg9 pg9Var = this.f1762m0;
                    if (pg9Var != null && pg9Var.mo4538b()) {
                        ((hta) thb.m22050i(this, AbstractC0402n.f4829u)).getClass();
                        if (kg7Var2.f47236b - this.f1765p0 < 40) {
                            this.f1766q0 = true;
                            return;
                        }
                        this.f1763n0 = true;
                        pg9 pg9Var2 = this.f1762m0;
                        if (pg9Var2 != null) {
                            pg9Var2.mo4537a(null);
                        }
                        this.f1762m0 = null;
                    }
                    this.f1764o0 = false;
                    m797j1(kg7Var2);
                    if (this.f1756g0 != null) {
                        this.f1761l0 = wfb.m23926u(m9971N0(), null, null, new CombinedClickableNode$handleDownEvent$1(this, null), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean z = fg7Var.f39073c == 2;
        List list2 = fg7Var.f39071a;
        if (z && !this.f1764o0 && this.f1722Q && this.f1756g0 != null) {
            pg9 pg9Var3 = this.f1761l0;
            if (pg9Var3 != null) {
                pg9Var3.mo4537a(null);
            }
            this.f1761l0 = null;
            ui3 ui3Var = this.f1756g0;
            if (ui3Var != null) {
                ui3Var.mo0a();
            }
            if (this.f1757h0) {
                ((x87) ((dr3) thb.m22050i(this, AbstractC0402n.f4820l))).m24403a(0);
            }
            this.f1764o0 = true;
        }
        if (this.f1764o0) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!ci8.m4725j((kg7) list2.get(i2))) {
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((kg7) list2.get(i3)).m15189a();
                    }
                    return;
                }
            }
            kg7 kg7Var3 = (kg7) list2.get(0);
            kg7Var3.m15189a();
            long j2 = kg7Var3.f47236b;
            kg7 kg7Var4 = this.f1760k0;
            kg7Var4.getClass();
            m823r1(j2, kg7Var4);
            return;
        }
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!ci8.m4724i((kg7) list2.get(i4))) {
                long jM793f1 = m793f1(j);
                int size5 = list2.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    kg7 kg7Var5 = (kg7) list2.get(i5);
                    if (kg7Var5.m15191c() || ci8.m4696I(kg7Var5, j, jM793f1)) {
                        m821p1(false);
                        return;
                    }
                }
                return;
            }
        }
        kg7 kg7Var6 = (kg7) list2.get(0);
        kg7Var6.m15189a();
        long j3 = kg7Var6.f47236b;
        kg7 kg7Var7 = this.f1760k0;
        kg7Var7.getClass();
        m823r1(j3, kg7Var7);
    }

    @Override // p000.ng7
    /* JADX INFO: renamed from: K */
    public final void mo818K() {
        rv3 rv3Var;
        v56 v56Var = this.f1717L;
        if (v56Var != null && (rv3Var = this.f1730Y) != null) {
            v56Var.m23126b(new sv3(rv3Var));
        }
        this.f1730Y = null;
        m821p1(false);
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: T0 */
    public final void mo763T0() {
        m824s1();
    }

    @Override // androidx.compose.foundation.AbstractC0075a
    /* JADX INFO: renamed from: c1 */
    public final void mo54c1(tv8 tv8Var) {
        if (this.f1756g0 != null) {
            String str = this.f1755f0;
            C3757xf c3757xf = new C3757xf(this, 7);
            bh4[] bh4VarArr = AbstractC0426f.f5022a;
            tv8Var.mo3709d(AbstractC0421a.f4947c, new C3024g3(str, c3757xf));
        }
    }

    @Override // p000.h44
    /* JADX INFO: renamed from: e0 */
    public final void mo819e0(C3299li c3299li, PointerEventPass pointerEventPass) {
        m798k1();
        if (this.f1722Q && this.f1726U == null) {
            jl3 jl3Var = new jl3(this);
            m11624Z0(jl3Var);
            this.f1726U = jl3Var;
        }
        int i = 0;
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.f1767r0 == null || this.f1771v0) {
                return;
            }
            List listM16226d = c3299li.m16226d();
            int size = listM16226d.size();
            while (i < size) {
                a44 a44Var = (a44) ((ArrayList) listM16226d).get(i);
                if (a44Var.m108h() && a44Var != this.f1767r0) {
                    m821p1(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.f1767r0 == null) {
            List listM16226d2 = c3299li.m16226d();
            int size2 = listM16226d2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (x74.m24352i((a44) ((ArrayList) listM16226d2).get(i2))) {
                    a44 a44Var2 = (a44) ((ArrayList) c3299li.m16226d()).get(0);
                    a44Var2.m101a();
                    this.f1767r0 = a44Var2;
                    if (this.f1722Q) {
                        pg9 pg9Var = this.f1769t0;
                        if (pg9Var != null && pg9Var.mo4538b()) {
                            ((hta) thb.m22050i(this, AbstractC0402n.f4829u)).getClass();
                            if (a44Var2.m107g() - this.f1772w0 < 40) {
                                this.f1773x0 = true;
                                return;
                            }
                            this.f1770u0 = true;
                            pg9 pg9Var2 = this.f1769t0;
                            if (pg9Var2 != null) {
                                pg9Var2.mo4537a(null);
                            }
                            this.f1769t0 = null;
                        }
                        this.f1771v0 = false;
                        m796i1(a44Var2);
                        if (this.f1756g0 != null) {
                            this.f1768s0 = wfb.m23926u(m9971N0(), null, null, new CombinedClickableNode$handleDownEvent$2(this, null), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.f1771v0) {
            List listM16226d3 = c3299li.m16226d();
            int size3 = listM16226d3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                a44 a44Var3 = (a44) ((ArrayList) listM16226d3).get(i3);
                if (!a44Var3.m106f() || a44Var3.m104d()) {
                    List listM16226d4 = c3299li.m16226d();
                    int size4 = listM16226d4.size();
                    while (i < size4) {
                        ((a44) ((ArrayList) listM16226d4).get(i)).m101a();
                        i++;
                    }
                    return;
                }
            }
            a44 a44Var4 = (a44) ((ArrayList) c3299li.m16226d()).get(0);
            a44Var4.m101a();
            long jM107g = a44Var4.m107g();
            a44 a44Var5 = this.f1767r0;
            a44Var5.getClass();
            m822q1(jM107g, a44Var5);
            return;
        }
        List listM16226d5 = c3299li.m16226d();
        int size5 = listM16226d5.size();
        for (int i4 = 0; i4 < size5; i4++) {
            a44 a44Var6 = (a44) ((ArrayList) listM16226d5).get(i4);
            if (a44Var6.m108h() || !a44Var6.m106f() || a44Var6.m104d()) {
                float fMo13460f = ((hta) thb.m22050i(this, AbstractC0402n.f4829u)).mo13460f();
                List listM16226d6 = c3299li.m16226d();
                int size6 = listM16226d6.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    a44 a44Var7 = (a44) ((ArrayList) listM16226d6).get(i5);
                    long jM103c = a44Var7.m103c();
                    a44 a44Var8 = this.f1767r0;
                    a44Var8.getClass();
                    boolean z = Math.abs(gq6.m12822c(gq6.m12824e(jM103c, a44Var8.m103c()))) > fMo13460f;
                    if (a44Var7.m108h() || z) {
                        m821p1(true);
                        return;
                    }
                }
                return;
            }
        }
        a44 a44Var9 = (a44) ((ArrayList) c3299li.m16226d()).get(0);
        a44Var9.m101a();
        long jM107g2 = a44Var9.m107g();
        a44 a44Var10 = this.f1767r0;
        a44Var10.getClass();
        m822q1(jM107g2, a44Var10);
    }

    @Override // p000.h44
    /* JADX INFO: renamed from: k0 */
    public final void mo820k0() {
        m821p1(true);
    }

    @Override // androidx.compose.foundation.AbstractC0075a
    /* JADX INFO: renamed from: l1 */
    public final void mo799l1() {
        m824s1();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    @Override // androidx.compose.foundation.AbstractC0075a
    /* JADX INFO: renamed from: m1 */
    public final boolean mo800m1(KeyEvent keyEvent) {
        boolean z;
        long jM4667a = chd.m4667a(keyEvent);
        if (this.f1756g0 != null) {
            y56 y56Var = this.f1758i0;
            if (y56Var.m24942d(jM4667a) == null) {
                y56Var.m24945g(wfb.m23926u(m9971N0(), null, null, new CombinedClickableNode$onClickKeyDownEvent$1(this, null), 3), jM4667a);
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return z;
    }

    @Override // androidx.compose.foundation.AbstractC0075a
    /* JADX INFO: renamed from: n1 */
    public final void mo802n1(KeyEvent keyEvent) {
        long jM4667a = chd.m4667a(keyEvent);
        y56 y56Var = this.f1758i0;
        boolean z = false;
        if (y56Var.m24942d(jM4667a) != null) {
            cd4 cd4Var = (cd4) y56Var.m24942d(jM4667a);
            if (cd4Var != null) {
                if (cd4Var.mo4538b()) {
                    cd4Var.mo4537a(null);
                } else {
                    z = true;
                }
            }
            y56Var.m24944f(jM4667a);
        }
        if (z) {
            return;
        }
        this.f1723R.mo0a();
    }

    /* JADX INFO: renamed from: p1 */
    public final void m821p1(boolean z) {
        if (z) {
            this.f1767r0 = null;
            pg9 pg9Var = this.f1768s0;
            if (pg9Var != null) {
                pg9Var.mo4537a(null);
            }
            this.f1768s0 = null;
            pg9 pg9Var2 = this.f1769t0;
            if (pg9Var2 != null) {
                pg9Var2.mo4537a(null);
            }
            this.f1769t0 = null;
            this.f1770u0 = false;
            this.f1771v0 = false;
            this.f1772w0 = -1L;
            this.f1773x0 = false;
        } else {
            this.f1760k0 = null;
            pg9 pg9Var3 = this.f1761l0;
            if (pg9Var3 != null) {
                pg9Var3.mo4537a(null);
            }
            this.f1761l0 = null;
            pg9 pg9Var4 = this.f1762m0;
            if (pg9Var4 != null) {
                pg9Var4.mo4537a(null);
            }
            this.f1762m0 = null;
            this.f1763n0 = false;
            this.f1764o0 = false;
            this.f1765p0 = -1L;
            this.f1766q0 = false;
        }
        m794g1(z);
    }

    /* JADX INFO: renamed from: q1 */
    public final void m822q1(long j, a44 a44Var) {
        if (this.f1722Q && !this.f1773x0) {
            m795h1(a44Var.m103c(), true);
            this.f1772w0 = j;
            if (!this.f1771v0 && !this.f1770u0) {
                this.f1723R.mo0a();
            }
        }
        this.f1767r0 = null;
        this.f1773x0 = false;
        this.f1770u0 = false;
        pg9 pg9Var = this.f1768s0;
        if (pg9Var != null) {
            pg9Var.mo4537a(null);
        }
        this.f1768s0 = null;
        this.f1771v0 = false;
    }

    /* JADX INFO: renamed from: r1 */
    public final void m823r1(long j, kg7 kg7Var) {
        if (this.f1722Q && !this.f1766q0) {
            m795h1(kg7Var.f47237c, false);
            this.f1765p0 = j;
            if (!this.f1764o0 && !this.f1763n0) {
                this.f1723R.mo0a();
            }
        }
        this.f1760k0 = null;
        this.f1766q0 = false;
        this.f1763n0 = false;
        pg9 pg9Var = this.f1761l0;
        if (pg9Var != null) {
            pg9Var.mo4537a(null);
        }
        this.f1761l0 = null;
        this.f1764o0 = false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x009f A[LOOP:2: B:24:0x0071->B:35:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:36:0x00a2 BREAK  A[LOOP:2: B:24:0x0071->B:35:0x009f], SYNTHETIC] */
    /* JADX INFO: renamed from: s1 */
    public final void m824s1() {
        char c;
        long j;
        long j2;
        y56 y56Var = this.f1758i0;
        Object[] objArr = y56Var.f69318c;
        long[] jArr = y56Var.f69316a;
        int length = jArr.length - 2;
        char c2 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c2) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            ((cd4) objArr[(i << 3) + i3]).mo4537a(null);
                        }
                        j3 >>= 8;
                        i3++;
                        c2 = c2;
                    }
                    c = c2;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c2;
                }
                if (i == length) {
                    break;
                }
                i++;
                c2 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        y56Var.m24939a();
        y56 y56Var2 = this.f1759j0;
        Object[] objArr2 = y56Var2.f69318c;
        long[] jArr2 = y56Var2.f69316a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i4 != length2) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((eb1) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 != length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        y56Var2.m24939a();
    }
}
