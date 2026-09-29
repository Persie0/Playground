package p000;

import android.os.Trace;
import androidx.compose.p002ui.layout.AbstractC0334a;
import androidx.compose.p002ui.node.AbstractC0359i;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.node.InterfaceC0354d;
import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.p002ui.semantics.C0427g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class qs9 extends d16 implements InterfaceC0354d, ll2, ov8 {

    /* JADX INFO: renamed from: J */
    public C3419on f58147J;

    /* JADX INFO: renamed from: K */
    public vx9 f58148K;

    /* JADX INFO: renamed from: L */
    public wa3 f58149L;

    /* JADX INFO: renamed from: M */
    public vi3 f58150M;

    /* JADX INFO: renamed from: N */
    public int f58151N;

    /* JADX INFO: renamed from: O */
    public boolean f58152O;

    /* JADX INFO: renamed from: P */
    public int f58153P;

    /* JADX INFO: renamed from: Q */
    public int f58154Q;

    /* JADX INFO: renamed from: R */
    public List f58155R;

    /* JADX INFO: renamed from: S */
    public vi3 f58156S;

    /* JADX INFO: renamed from: T */
    public m20 f58157T;

    /* JADX INFO: renamed from: U */
    public vi3 f58158U;

    /* JADX INFO: renamed from: V */
    public Map f58159V;

    /* JADX INFO: renamed from: W */
    public z46 f58160W;

    /* JADX INFO: renamed from: X */
    public os9 f58161X;

    /* JADX INFO: renamed from: Y */
    public ps9 f58162Y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [vi3] */
    /* JADX WARN: Type inference failed for: r0v2, types: [os9] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // p000.ov8
    /* JADX INFO: renamed from: H0 */
    public final void mo787H0(tv8 tv8Var) {
        os9 os9Var = this.f58161X;
        ?? r0 = os9Var;
        if (os9Var == null) {
            final int i = 0;
            ?? r1 = new vi3(this) { // from class: os9

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ qs9 f54946b;

                {
                    this.f54946b = this;
                }

                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    boolean z;
                    int i2 = i;
                    rw9 rw9Var = null;
                    qs9 qs9Var = this.f54946b;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            rw9 rw9Var2 = qs9Var.m20142Z0().f70891o;
                            if (rw9Var2 != null) {
                                qw9 qw9Var = rw9Var2.f59975a;
                                rw9 rw9Var3 = new rw9(new qw9(qw9Var.f58295a, vx9.m23585f(qs9Var.f58148K, aa1.f412k, 0L, null, null, 0L, null, 0, 0L, 16777214), qw9Var.f58297c, qw9Var.f58298d, qw9Var.f58299e, qw9Var.f58300f, qw9Var.f58301g, qw9Var.f58302h, qw9Var.f58303i, qw9Var.f58304j), rw9Var2.f59976b, rw9Var2.f59977c);
                                list.add(rw9Var3);
                                rw9Var = rw9Var3;
                            }
                            return Boolean.valueOf(rw9Var != null);
                        case 1:
                            C3419on c3419on = (C3419on) obj;
                            ps9 ps9Var = qs9Var.f58162Y;
                            EmptyList emptyList = EmptyList.f47638a;
                            if (ps9Var == null) {
                                ps9 ps9Var2 = new ps9(qs9Var.f58147J, c3419on);
                                z46 z46Var = new z46(c3419on, qs9Var.f58148K, qs9Var.f58149L, qs9Var.f58151N, qs9Var.f58152O, qs9Var.f58153P, qs9Var.f58154Q, emptyList, qs9Var.f58157T);
                                z46Var.m25453d(qs9Var.m20142Z0().f70887k);
                                ps9Var2.f56770d = z46Var;
                                qs9Var.f58162Y = ps9Var2;
                            } else if (!fa4.m11650l(c3419on, ps9Var.f56768b)) {
                                ps9Var.f56768b = c3419on;
                                z46 z46Var2 = ps9Var.f56770d;
                                if (z46Var2 != null) {
                                    vx9 vx9Var = qs9Var.f58148K;
                                    wa3 wa3Var = qs9Var.f58149L;
                                    int i3 = qs9Var.f58151N;
                                    boolean z2 = qs9Var.f58152O;
                                    int i4 = qs9Var.f58153P;
                                    int i5 = qs9Var.f58154Q;
                                    m20 m20Var = qs9Var.f58157T;
                                    z46Var2.f70877a = c3419on;
                                    z46Var2.m25455f(vx9Var);
                                    z46Var2.f70878b = wa3Var;
                                    z46Var2.f70879c = i3;
                                    z46Var2.f70880d = z2;
                                    z46Var2.f70881e = i4;
                                    z46Var2.f70882f = i5;
                                    z46Var2.f70883g = emptyList;
                                    z46Var2.f70884h = m20Var;
                                    z46Var2.f70895s = (z46Var2.f70895s << 2) | 2;
                                    z46Var2.f70889m = null;
                                    z46Var2.f70891o = null;
                                    z46Var2.f70893q = -1;
                                    z46Var2.f70892p = -1;
                                    z46Var2.f70894r = null;
                                }
                            }
                            thb.m22062u(qs9Var);
                            d32.m10020R(qs9Var);
                            AbstractC3489q9.m19789s(qs9Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            ps9 ps9Var3 = qs9Var.f58162Y;
                            if (ps9Var3 == null) {
                                z = false;
                            } else {
                                vi3 vi3Var = qs9Var.f58158U;
                                if (vi3Var != null) {
                                    vi3Var.invoke(ps9Var3);
                                }
                                ps9 ps9Var4 = qs9Var.f58162Y;
                                if (ps9Var4 != null) {
                                    ps9Var4.f56769c = zBooleanValue;
                                }
                                thb.m22062u(qs9Var);
                                d32.m10020R(qs9Var);
                                AbstractC3489q9.m19789s(qs9Var);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.f58161X = r1;
            r0 = r1;
        }
        C3419on c3419on = this.f58147J;
        bh4[] bh4VarArr = AbstractC0426f.f5022a;
        tv8Var.mo3709d(AbstractC0424d.f4979C, vz1.m23604J(c3419on));
        ps9 ps9Var = this.f58162Y;
        if (ps9Var != null) {
            C3419on c3419on2 = ps9Var.f56768b;
            C0427g c0427g = AbstractC0424d.f4980D;
            bh4[] bh4VarArr2 = AbstractC0426f.f5022a;
            bh4 bh4Var = bh4VarArr2[16];
            tv8Var.mo3709d(c0427g, c3419on2);
            boolean z = ps9Var.f56769c;
            C0427g c0427g2 = AbstractC0424d.f4981E;
            bh4 bh4Var2 = bh4VarArr2[17];
            tv8Var.mo3709d(c0427g2, Boolean.valueOf(z));
        }
        final int i2 = 1;
        tv8Var.mo3709d(AbstractC0421a.f4956l, new C3024g3(null, new vi3(this) { // from class: os9

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ qs9 f54946b;

            {
                this.f54946b = this;
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                boolean z2;
                int i3 = i2;
                rw9 rw9Var = null;
                qs9 qs9Var = this.f54946b;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        rw9 rw9Var2 = qs9Var.m20142Z0().f70891o;
                        if (rw9Var2 != null) {
                            qw9 qw9Var = rw9Var2.f59975a;
                            rw9 rw9Var3 = new rw9(new qw9(qw9Var.f58295a, vx9.m23585f(qs9Var.f58148K, aa1.f412k, 0L, null, null, 0L, null, 0, 0L, 16777214), qw9Var.f58297c, qw9Var.f58298d, qw9Var.f58299e, qw9Var.f58300f, qw9Var.f58301g, qw9Var.f58302h, qw9Var.f58303i, qw9Var.f58304j), rw9Var2.f59976b, rw9Var2.f59977c);
                            list.add(rw9Var3);
                            rw9Var = rw9Var3;
                        }
                        return Boolean.valueOf(rw9Var != null);
                    case 1:
                        C3419on c3419on3 = (C3419on) obj;
                        ps9 ps9Var2 = qs9Var.f58162Y;
                        EmptyList emptyList = EmptyList.f47638a;
                        if (ps9Var2 == null) {
                            ps9 ps9Var3 = new ps9(qs9Var.f58147J, c3419on3);
                            z46 z46Var = new z46(c3419on3, qs9Var.f58148K, qs9Var.f58149L, qs9Var.f58151N, qs9Var.f58152O, qs9Var.f58153P, qs9Var.f58154Q, emptyList, qs9Var.f58157T);
                            z46Var.m25453d(qs9Var.m20142Z0().f70887k);
                            ps9Var3.f56770d = z46Var;
                            qs9Var.f58162Y = ps9Var3;
                        } else if (!fa4.m11650l(c3419on3, ps9Var2.f56768b)) {
                            ps9Var2.f56768b = c3419on3;
                            z46 z46Var2 = ps9Var2.f56770d;
                            if (z46Var2 != null) {
                                vx9 vx9Var = qs9Var.f58148K;
                                wa3 wa3Var = qs9Var.f58149L;
                                int i4 = qs9Var.f58151N;
                                boolean z3 = qs9Var.f58152O;
                                int i5 = qs9Var.f58153P;
                                int i6 = qs9Var.f58154Q;
                                m20 m20Var = qs9Var.f58157T;
                                z46Var2.f70877a = c3419on3;
                                z46Var2.m25455f(vx9Var);
                                z46Var2.f70878b = wa3Var;
                                z46Var2.f70879c = i4;
                                z46Var2.f70880d = z3;
                                z46Var2.f70881e = i5;
                                z46Var2.f70882f = i6;
                                z46Var2.f70883g = emptyList;
                                z46Var2.f70884h = m20Var;
                                z46Var2.f70895s = (z46Var2.f70895s << 2) | 2;
                                z46Var2.f70889m = null;
                                z46Var2.f70891o = null;
                                z46Var2.f70893q = -1;
                                z46Var2.f70892p = -1;
                                z46Var2.f70894r = null;
                            }
                        }
                        thb.m22062u(qs9Var);
                        d32.m10020R(qs9Var);
                        AbstractC3489q9.m19789s(qs9Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        ps9 ps9Var4 = qs9Var.f58162Y;
                        if (ps9Var4 == null) {
                            z2 = false;
                        } else {
                            vi3 vi3Var = qs9Var.f58158U;
                            if (vi3Var != null) {
                                vi3Var.invoke(ps9Var4);
                            }
                            ps9 ps9Var5 = qs9Var.f58162Y;
                            if (ps9Var5 != null) {
                                ps9Var5.f56769c = zBooleanValue;
                            }
                            thb.m22062u(qs9Var);
                            d32.m10020R(qs9Var);
                            AbstractC3489q9.m19789s(qs9Var);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final int i3 = 2;
        tv8Var.mo3709d(AbstractC0421a.f4957m, new C3024g3(null, new vi3(this) { // from class: os9

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ qs9 f54946b;

            {
                this.f54946b = this;
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                boolean z2;
                int i4 = i3;
                rw9 rw9Var = null;
                qs9 qs9Var = this.f54946b;
                switch (i4) {
                    case 0:
                        List list = (List) obj;
                        rw9 rw9Var2 = qs9Var.m20142Z0().f70891o;
                        if (rw9Var2 != null) {
                            qw9 qw9Var = rw9Var2.f59975a;
                            rw9 rw9Var3 = new rw9(new qw9(qw9Var.f58295a, vx9.m23585f(qs9Var.f58148K, aa1.f412k, 0L, null, null, 0L, null, 0, 0L, 16777214), qw9Var.f58297c, qw9Var.f58298d, qw9Var.f58299e, qw9Var.f58300f, qw9Var.f58301g, qw9Var.f58302h, qw9Var.f58303i, qw9Var.f58304j), rw9Var2.f59976b, rw9Var2.f59977c);
                            list.add(rw9Var3);
                            rw9Var = rw9Var3;
                        }
                        return Boolean.valueOf(rw9Var != null);
                    case 1:
                        C3419on c3419on3 = (C3419on) obj;
                        ps9 ps9Var2 = qs9Var.f58162Y;
                        EmptyList emptyList = EmptyList.f47638a;
                        if (ps9Var2 == null) {
                            ps9 ps9Var3 = new ps9(qs9Var.f58147J, c3419on3);
                            z46 z46Var = new z46(c3419on3, qs9Var.f58148K, qs9Var.f58149L, qs9Var.f58151N, qs9Var.f58152O, qs9Var.f58153P, qs9Var.f58154Q, emptyList, qs9Var.f58157T);
                            z46Var.m25453d(qs9Var.m20142Z0().f70887k);
                            ps9Var3.f56770d = z46Var;
                            qs9Var.f58162Y = ps9Var3;
                        } else if (!fa4.m11650l(c3419on3, ps9Var2.f56768b)) {
                            ps9Var2.f56768b = c3419on3;
                            z46 z46Var2 = ps9Var2.f56770d;
                            if (z46Var2 != null) {
                                vx9 vx9Var = qs9Var.f58148K;
                                wa3 wa3Var = qs9Var.f58149L;
                                int i5 = qs9Var.f58151N;
                                boolean z3 = qs9Var.f58152O;
                                int i6 = qs9Var.f58153P;
                                int i7 = qs9Var.f58154Q;
                                m20 m20Var = qs9Var.f58157T;
                                z46Var2.f70877a = c3419on3;
                                z46Var2.m25455f(vx9Var);
                                z46Var2.f70878b = wa3Var;
                                z46Var2.f70879c = i5;
                                z46Var2.f70880d = z3;
                                z46Var2.f70881e = i6;
                                z46Var2.f70882f = i7;
                                z46Var2.f70883g = emptyList;
                                z46Var2.f70884h = m20Var;
                                z46Var2.f70895s = (z46Var2.f70895s << 2) | 2;
                                z46Var2.f70889m = null;
                                z46Var2.f70891o = null;
                                z46Var2.f70893q = -1;
                                z46Var2.f70892p = -1;
                                z46Var2.f70894r = null;
                            }
                        }
                        thb.m22062u(qs9Var);
                        d32.m10020R(qs9Var);
                        AbstractC3489q9.m19789s(qs9Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        ps9 ps9Var4 = qs9Var.f58162Y;
                        if (ps9Var4 == null) {
                            z2 = false;
                        } else {
                            vi3 vi3Var = qs9Var.f58158U;
                            if (vi3Var != null) {
                                vi3Var.invoke(ps9Var4);
                            }
                            ps9 ps9Var5 = qs9Var.f58162Y;
                            if (ps9Var5 != null) {
                                ps9Var5.f56769c = zBooleanValue;
                            }
                            thb.m22062u(qs9Var);
                            d32.m10020R(qs9Var);
                            AbstractC3489q9.m19789s(qs9Var);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        tv8Var.mo3709d(AbstractC0421a.f4958n, new C3024g3(null, new y47(this, 16)));
        AbstractC0426f.m1858b(tv8Var, r0);
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return false;
    }

    /* JADX INFO: renamed from: Z0 */
    public final z46 m20142Z0() {
        if (this.f58160W == null) {
            this.f58160W = new z46(this.f58147J, this.f58148K, this.f58149L, this.f58151N, this.f58152O, this.f58153P, this.f58154Q, this.f58155R, this.f58157T);
        }
        z46 z46Var = this.f58160W;
        z46Var.getClass();
        return z46Var;
    }

    /* JADX INFO: renamed from: a1 */
    public final z46 m20143a1(fb2 fb2Var) {
        z46 z46Var;
        ps9 ps9Var = this.f58162Y;
        if (ps9Var != null && ps9Var.f56769c && (z46Var = ps9Var.f56770d) != null) {
            z46Var.m25453d(fb2Var);
            return z46Var;
        }
        z46 z46VarM20142Z0 = m20142Z0();
        z46VarM20142Z0.m25453d(fb2Var);
        return z46VarM20142Z0;
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: b */
    public final int mo967b(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return xwc.m24773k(m20143a1(abstractC0359i).m25454e(abstractC0359i.getLayoutDirection()).mo13025b());
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: e */
    public final int mo968e(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return m20143a1(abstractC0359i).m25450a(i, abstractC0359i.getLayoutDirection());
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            z46 z46VarM20143a1 = m20143a1(jt5Var);
            boolean zM25452c = z46VarM20143a1.m25452c(j, jt5Var.getLayoutDirection());
            rw9 rw9Var = z46VarM20143a1.f70891o;
            if (rw9Var == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + z46VarM20143a1);
            }
            long j2 = rw9Var.f59977c;
            rw9Var.f59976b.f66376a.mo13024a();
            if (zM25452c) {
                d32.m10019Q(this);
                vi3 vi3Var = this.f58150M;
                if (vi3Var != null) {
                    vi3Var.invoke(rw9Var);
                }
                Map linkedHashMap = this.f58159V;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(AbstractC0334a.f4179a, Integer.valueOf(Math.round(rw9Var.f59978d)));
                linkedHashMap.put(AbstractC0334a.f4180b, Integer.valueOf(Math.round(rw9Var.f59979e)));
                this.f58159V = linkedHashMap;
            }
            vi3 vi3Var2 = this.f58156S;
            if (vi3Var2 != null) {
                vi3Var2.invoke(rw9Var.f59980f);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            l87 l87VarMo1514r = ct5Var.mo1514r(AbstractC3423or.m18278s(i, i, i2, i2));
            Map map = this.f58159V;
            map.getClass();
            it5 it5VarMo9895M0 = jt5Var.mo9895M0(i, i2, map, new C3773xv(l87VarMo1514r, 11));
            Trace.endSection();
            return it5VarMo9895M0;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: i */
    public final int mo969i(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return xwc.m24773k(m20143a1(abstractC0359i).m25454e(abstractC0359i.getLayoutDirection()).mo13026c());
    }

    @Override // p000.ll2
    /* JADX INFO: renamed from: i0 */
    public final void mo952i0(C0358h c0358h) {
        List list;
        if (this.f34836I) {
            ym0 ym0VarM16515r = c0358h.f4358a.f853b.m16515r();
            z46 z46VarM20143a1 = m20143a1(c0358h);
            rw9 rw9Var = z46VarM20143a1.f70891o;
            if (rw9Var == null) {
                ij6.m13966x(z46VarM20143a1, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ");
                return;
            }
            w46 w46Var = rw9Var.f59976b;
            boolean z = rw9Var.m20957d() && this.f58151N != 3;
            if (z) {
                long j = rw9Var.f59977c;
                e28 e28VarM23907b = wfb.m23907b(0L, (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L));
                ym0VarM16515r.mo17016h();
                ym0.m25196q(ym0VarM16515r, e28VarM23907b);
            }
            try {
                he9 he9Var = this.f58148K.f66065a;
                rt9 rt9Var = he9Var.f42276m;
                if (rt9Var == null) {
                    rt9Var = rt9.f59801b;
                }
                rt9 rt9Var2 = rt9Var;
                l39 l39Var = he9Var.f42277n;
                if (l39Var == null) {
                    l39Var = l39.f48992d;
                }
                l39 l39Var2 = l39Var;
                ml2 ml2Var = he9Var.f42279p;
                if (ml2Var == null) {
                    ml2Var = w33.f66328a;
                }
                ml2 ml2Var2 = ml2Var;
                vi0 vi0VarMo24174b = he9Var.f42264a.mo24174b();
                if (vi0VarMo24174b != null) {
                    w46.m23739j(w46Var, ym0VarM16515r, vi0VarMo24174b, this.f58148K.f66065a.f42264a.mo24175c(), l39Var2, rt9Var2, ml2Var2);
                } else {
                    long jM23586c = aa1.f412k;
                    if (jM23586c == 16) {
                        jM23586c = this.f58148K.m23586c() != 16 ? this.f58148K.m23586c() : aa1.f403b;
                    }
                    w46.m23738i(w46Var, ym0VarM16515r, jM23586c, l39Var2, rt9Var2, ml2Var2);
                }
                if (z) {
                    ym0VarM16515r.mo17024p();
                }
                ps9 ps9Var = this.f58162Y;
                if (((ps9Var == null || !ps9Var.f56769c) ? thb.m22060s(this.f58147J) : false) || !((list = this.f58155R) == null || list.isEmpty())) {
                    c0358h.m1614b();
                }
            } catch (Throwable th) {
                if (!z) {
                    throw th;
                }
                ym0VarM16515r.mo17024p();
                throw th;
            }
        }
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: j */
    public final int mo970j(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return m20143a1(abstractC0359i).m25450a(i, abstractC0359i.getLayoutDirection());
    }
}
