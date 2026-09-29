package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import androidx.compose.p002ui.node.AbstractC0356f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C3024g3;
import p000.C3667v;
import p000.C3704w;
import p000.a44;
import p000.ahd;
import p000.bh4;
import p000.bq1;
import p000.cd4;
import p000.chd;
import p000.ea2;
import p000.fa2;
import p000.fa4;
import p000.fg7;
import p000.gi4;
import p000.h44;
import p000.hta;
import p000.il3;
import p000.jl3;
import p000.kg7;
import p000.kj7;
import p000.kk5;
import p000.kl3;
import p000.lj7;
import p000.n31;
import p000.ng7;
import p000.nj0;
import p000.ov8;
import p000.p31;
import p000.pg9;
import p000.qba;
import p000.qp6;
import p000.rv3;
import p000.sv3;
import p000.te1;
import p000.tf1;
import p000.thb;
import p000.tv8;
import p000.uh8;
import p000.ui3;
import p000.v56;
import p000.vl1;
import p000.w34;
import p000.wfb;
import p000.xfa;
import p000.y56;

/* JADX INFO: renamed from: androidx.compose.foundation.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0075a extends fa2 implements ng7, gi4, ov8, tf1, qp6, h44, il3 {

    /* JADX INFO: renamed from: L */
    public v56 f1717L;

    /* JADX INFO: renamed from: M */
    public w34 f1718M;

    /* JADX INFO: renamed from: N */
    public boolean f1719N;

    /* JADX INFO: renamed from: O */
    public String f1720O;

    /* JADX INFO: renamed from: P */
    public uh8 f1721P;

    /* JADX INFO: renamed from: Q */
    public boolean f1722Q;

    /* JADX INFO: renamed from: R */
    public ui3 f1723R;

    /* JADX INFO: renamed from: S */
    public final C0121i f1724S;

    /* JADX INFO: renamed from: T */
    public w34 f1725T;

    /* JADX INFO: renamed from: U */
    public jl3 f1726U;

    /* JADX INFO: renamed from: V */
    public String f1727V = "idle";

    /* JADX INFO: renamed from: W */
    public ea2 f1728W;

    /* JADX INFO: renamed from: X */
    public lj7 f1729X;

    /* JADX INFO: renamed from: Y */
    public rv3 f1730Y;

    /* JADX INFO: renamed from: Z */
    public final y56 f1731Z;

    /* JADX INFO: renamed from: a0 */
    public long f1732a0;

    /* JADX INFO: renamed from: b0 */
    public lj7 f1733b0;

    /* JADX INFO: renamed from: c0 */
    public v56 f1734c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f1735d0;

    /* JADX INFO: renamed from: e0 */
    public pg9 f1736e0;

    public AbstractC0075a(v56 v56Var, w34 w34Var, boolean z, boolean z2, String str, uh8 uh8Var, ui3 ui3Var) {
        this.f1717L = v56Var;
        this.f1718M = w34Var;
        this.f1719N = z;
        this.f1720O = str;
        this.f1721P = uh8Var;
        this.f1722Q = z2;
        this.f1723R = ui3Var;
        this.f1724S = new C0121i(v56Var, 0, new AbstractClickableNode$focusableNode$1(1, this, AbstractC0075a.class, "onFocusChange", "onFocusChange(Z)V", 0));
        int i = kk5.f47454a;
        this.f1731Z = new y56(6);
        this.f1732a0 = 0L;
        v56 v56Var2 = this.f1717L;
        this.f1734c0 = v56Var2;
        this.f1735d0 = v56Var2 == null;
    }

    @Override // p000.ng7
    /* JADX INFO: renamed from: D */
    public void mo786D(fg7 fg7Var, PointerEventPass pointerEventPass, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.f1732a0 = (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        m798k1();
        if (this.f1722Q) {
            if (this.f1726U == null) {
                jl3 jl3Var = new jl3(this);
                m11624Z0(jl3Var);
                this.f1726U = jl3Var;
            }
            if (pointerEventPass == PointerEventPass.Main) {
                int i = fg7Var.f39076f;
                if (i == 4) {
                    wfb.m23926u(m9971N0(), null, null, new AbstractClickableNode$onPointerEvent$1(this, null), 3);
                } else if (i == 5) {
                    wfb.m23926u(m9971N0(), null, null, new AbstractClickableNode$onPointerEvent$2(this, null), 3);
                }
            }
        }
    }

    @Override // p000.ov8
    /* JADX INFO: renamed from: H0 */
    public final void mo787H0(tv8 tv8Var) {
        uh8 uh8Var = this.f1721P;
        if (uh8Var != null) {
            AbstractC0426f.m1864h(tv8Var, uh8Var.f63934a);
        }
        String str = this.f1720O;
        C3667v c3667v = new C3667v(this, 1);
        bh4[] bh4VarArr = AbstractC0426f.f5022a;
        tv8Var.mo3709d(AbstractC0421a.f4946b, new C3024g3(str, c3667v));
        if (this.f1722Q) {
            this.f1724S.mo787H0(tv8Var);
        } else {
            tv8Var.mo3709d(AbstractC0424d.f5003j, xfa.f68157a);
        }
        mo54c1(tv8Var);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007f A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.gi4
    /* JADX INFO: renamed from: I */
    public final boolean mo788I(KeyEvent keyEvent) {
        boolean z;
        m798k1();
        long jM4667a = chd.m4667a(keyEvent);
        boolean z2 = this.f1722Q;
        y56 y56Var = this.f1731Z;
        if (z2 && ahd.m421a(chd.m4668b(keyEvent), 2) && AbstractC0080f.m817d(keyEvent)) {
            if (y56Var.m24940b(jM4667a)) {
                z = false;
            } else {
                lj7 lj7Var = new lj7(this.f1732a0);
                y56Var.m24945g(lj7Var, jM4667a);
                if (this.f1717L != null) {
                    wfb.m23926u(m9971N0(), null, null, new AbstractClickableNode$onKeyEvent$1(this, lj7Var, null), 3);
                }
                z = true;
            }
            if (mo800m1(keyEvent) || z) {
                return true;
            }
            return false;
        }
        if (this.f1722Q && ahd.m421a(chd.m4668b(keyEvent), 1) && AbstractC0080f.m817d(keyEvent)) {
            lj7 lj7Var2 = (lj7) y56Var.m24944f(jM4667a);
            if (lj7Var2 != null) {
                if (this.f1717L != null) {
                    wfb.m23926u(m9971N0(), null, null, new AbstractClickableNode$onKeyEvent$2(this, lj7Var2, null), 3);
                }
                mo802n1(keyEvent);
            }
            if (lj7Var2 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.ov8
    /* JADX INFO: renamed from: I0 */
    public final boolean mo789I0() {
        return true;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return false;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        mo804r0();
        if (!this.f1735d0) {
            m798k1();
        }
        if (this.f1722Q) {
            m11624Z0(this.f1724S);
        }
    }

    @Override // p000.il3
    /* JADX INFO: renamed from: S */
    public final String mo790S() {
        return this.f1727V;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        m792e1();
        if (this.f1734c0 == null) {
            this.f1717L = null;
        }
        ea2 ea2Var = this.f1728W;
        if (ea2Var != null) {
            m11625a1(ea2Var);
        }
        this.f1728W = null;
        jl3 jl3Var = this.f1726U;
        if (jl3Var != null) {
            m11625a1(jl3Var);
        }
        this.f1726U = null;
    }

    /* JADX INFO: renamed from: c1 */
    public void mo54c1(tv8 tv8Var) {
    }

    /* JADX INFO: renamed from: d1 */
    public final boolean m791d1() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        int i = 0;
        qba.m19852d(this, jl3.f45667K, new kl3(new n31(i, ref$ObjectRef), i));
        if (ref$ObjectRef.f47718a != null) {
            return true;
        }
        int i2 = p31.f55511b;
        ViewParent parent = bq1.m4067t0(this).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:16:0x0037->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[EDGE_INSN: B:30:0x0076->B:27:0x0076 BREAK  A[LOOP:0: B:16:0x0037->B:26:0x0073], SYNTHETIC] */
    /* JADX INFO: renamed from: e1 */
    public final void m792e1() {
        v56 v56Var = this.f1717L;
        y56 y56Var = this.f1731Z;
        if (v56Var != null) {
            lj7 lj7Var = this.f1729X;
            if (lj7Var != null) {
                v56Var.m23126b(new kj7(lj7Var));
            }
            lj7 lj7Var2 = this.f1733b0;
            if (lj7Var2 != null) {
                v56Var.m23126b(new kj7(lj7Var2));
            }
            rv3 rv3Var = this.f1730Y;
            if (rv3Var != null) {
                v56Var.m23126b(new sv3(rv3Var));
            }
            Object[] objArr = y56Var.f69318c;
            long[] jArr = y56Var.f69316a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                v56Var.m23126b(new kj7((lj7) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.f1729X = null;
        this.f1733b0 = null;
        this.f1730Y = null;
        y56Var.m24939a();
    }

    /* JADX INFO: renamed from: f1 */
    public final long m793f1(long j) {
        long jMo902D0 = te1.m21979L(this).f4327T.mo902D0(((hta) thb.m22050i(this, AbstractC0402n.f4829u)).mo13458d());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jMo902D0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo902D0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m794g1(boolean z) {
        v56 v56Var = this.f1717L;
        if (v56Var != null) {
            pg9 pg9Var = this.f1736e0;
            if (pg9Var == null || !pg9Var.mo4538b()) {
                lj7 lj7Var = z ? this.f1733b0 : this.f1729X;
                if (lj7Var != null) {
                    kj7 kj7Var = new kj7(lj7Var);
                    cd4 cd4Var = (cd4) ((vl1) m9971N0()).f65559a.get(nj0.f52795N);
                    wfb.m23926u(m9971N0(), null, null, new AbstractClickableNode$handlePressInteractionCancel$1$1$1(v56Var, kj7Var, cd4Var != null ? cd4Var.mo4540r(new C3704w(0, v56Var, kj7Var)) : null, null), 3);
                }
            } else {
                pg9 pg9Var2 = this.f1736e0;
                if (pg9Var2 != null) {
                    pg9Var2.mo4537a(null);
                }
            }
            if (z) {
                this.f1733b0 = null;
            } else {
                this.f1729X = null;
            }
        }
    }

    /* JADX INFO: renamed from: h1 */
    public final void m795h1(long j, boolean z) {
        v56 v56Var = this.f1717L;
        if (v56Var != null) {
            pg9 pg9Var = this.f1736e0;
            if (pg9Var == null || !pg9Var.mo4538b()) {
                lj7 lj7Var = z ? this.f1733b0 : this.f1729X;
                if (lj7Var != null) {
                    wfb.m23926u(m9971N0(), null, null, new AbstractClickableNode$handlePressInteractionRelease$1$2$1(v56Var, lj7Var, null), 3);
                }
            } else {
                pg9Var.mo4537a(null);
                wfb.m23926u(m9971N0(), null, null, new AbstractClickableNode$handlePressInteractionRelease$1$1(pg9Var, j, v56Var, null), 3);
            }
            if (z) {
                this.f1733b0 = null;
            } else {
                this.f1729X = null;
            }
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m796i1(a44 a44Var) {
        v56 v56Var = this.f1717L;
        if (v56Var != null) {
            lj7 lj7Var = new lj7(a44Var.m103c());
            if (m791d1()) {
                this.f1736e0 = wfb.m23926u(m9971N0(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$1(v56Var, lj7Var, this, null), 3);
            } else {
                this.f1733b0 = lj7Var;
                wfb.m23926u(m9971N0(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$2(v56Var, lj7Var, null), 3);
            }
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final void m797j1(kg7 kg7Var) {
        v56 v56Var = this.f1717L;
        if (v56Var != null) {
            lj7 lj7Var = new lj7(kg7Var.f47237c);
            if (m791d1()) {
                this.f1736e0 = wfb.m23926u(m9971N0(), null, null, new AbstractClickableNode$handlePressInteractionStart$2$1(v56Var, lj7Var, this, null), 3);
            } else {
                this.f1729X = lj7Var;
                wfb.m23926u(m9971N0(), null, null, new AbstractClickableNode$handlePressInteractionStart$2$2(v56Var, lj7Var, null), 3);
            }
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final void m798k1() {
        if (this.f1728W != null) {
            return;
        }
        w34 w34Var = this.f1719N ? this.f1725T : this.f1718M;
        if (w34Var != null) {
            if (this.f1717L == null) {
                this.f1717L = new v56();
            }
            this.f1724S.m955d1(this.f1717L);
            v56 v56Var = this.f1717L;
            v56Var.getClass();
            ea2 ea2VarMo20662a = w34Var.mo20662a(v56Var);
            m11624Z0(ea2VarMo20662a);
            this.f1728W = ea2VarMo20662a;
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void mo799l1() {
    }

    /* JADX INFO: renamed from: m1 */
    public abstract boolean mo800m1(KeyEvent keyEvent);

    @Override // p000.gi4
    /* JADX INFO: renamed from: n */
    public final boolean mo801n(KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: n1 */
    public abstract void mo802n1(KeyEvent keyEvent);

    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX INFO: renamed from: o1 */
    public final void m803o1(v56 v56Var, w34 w34Var, boolean z, boolean z2, String str, uh8 uh8Var, ui3 ui3Var) {
        boolean z3;
        boolean z4;
        ea2 ea2Var;
        if (fa4.m11650l(this.f1734c0, v56Var)) {
            z3 = false;
        } else {
            m792e1();
            this.f1734c0 = v56Var;
            this.f1717L = v56Var;
            z3 = true;
        }
        if (!fa4.m11650l(this.f1718M, w34Var)) {
            this.f1718M = w34Var;
            z3 = true;
        }
        if (this.f1719N != z) {
            this.f1719N = z;
            if (z) {
                mo804r0();
            }
            z3 = true;
        }
        boolean z5 = this.f1722Q;
        C0121i c0121i = this.f1724S;
        if (z5 != z2) {
            if (z2) {
                m11624Z0(c0121i);
            } else {
                m11625a1(c0121i);
                m792e1();
            }
            thb.m22062u(this);
            if (!z2) {
                ea2 ea2Var2 = this.f1726U;
                if (ea2Var2 != null) {
                    m11625a1(ea2Var2);
                }
                this.f1726U = null;
                this.f1727V = "idle";
            }
            this.f1722Q = z2;
        }
        if (!fa4.m11650l(this.f1720O, str)) {
            this.f1720O = str;
            thb.m22062u(this);
        }
        if (!fa4.m11650l(this.f1721P, uh8Var)) {
            this.f1721P = uh8Var;
            thb.m22062u(this);
        }
        this.f1723R = ui3Var;
        boolean z6 = this.f1735d0;
        v56 v56Var2 = this.f1734c0;
        if (z6 != (v56Var2 == null)) {
            boolean z7 = v56Var2 == null;
            this.f1735d0 = z7;
            z4 = (z7 || this.f1728W != null) ? z3 : true;
        }
        if (z4 && ((ea2Var = this.f1728W) != null || !this.f1735d0)) {
            if (ea2Var != null) {
                m11625a1(ea2Var);
            }
            this.f1728W = null;
            m798k1();
        }
        c0121i.m955d1(this.f1717L);
    }

    @Override // p000.qp6
    /* JADX INFO: renamed from: r0 */
    public final void mo804r0() {
        if (this.f1719N) {
            AbstractC0356f.m1552b(this, new C3667v(this, 0));
        }
    }
}
