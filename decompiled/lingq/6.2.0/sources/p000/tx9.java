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
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class tx9 extends d16 implements InterfaceC0354d, ll2, ov8 {

    /* JADX INFO: renamed from: J */
    public String f63063J;

    /* JADX INFO: renamed from: K */
    public vx9 f63064K;

    /* JADX INFO: renamed from: L */
    public wa3 f63065L;

    /* JADX INFO: renamed from: M */
    public int f63066M;

    /* JADX INFO: renamed from: N */
    public boolean f63067N;

    /* JADX INFO: renamed from: O */
    public int f63068O;

    /* JADX INFO: renamed from: P */
    public int f63069P;

    /* JADX INFO: renamed from: Q */
    public HashMap f63070Q;

    /* JADX INFO: renamed from: R */
    public i37 f63071R;

    /* JADX INFO: renamed from: S */
    public rx9 f63072S;

    /* JADX INFO: renamed from: T */
    public sx9 f63073T;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [vi3] */
    /* JADX WARN: Type inference failed for: r0v2, types: [rx9] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // p000.ov8
    /* JADX INFO: renamed from: H0 */
    public final void mo787H0(tv8 tv8Var) {
        rx9 rx9Var = this.f63072S;
        ?? r0 = rx9Var;
        if (rx9Var == null) {
            final int i = 0;
            ?? r1 = new vi3(this) { // from class: rx9

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ tx9 f60012b;

                {
                    this.f60012b = this;
                }

                /* JADX WARN: Code duplicated, block: B:23:0x00bc  */
                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    fb2 fb2Var;
                    rw9 rw9Var;
                    int i2 = i;
                    boolean z = true;
                    tx9 tx9Var = this.f60012b;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            i37 i37VarM22334Z0 = tx9Var.m22334Z0();
                            vx9 vx9VarM23585f = vx9.m23585f(tx9Var.f63064K, aa1.f412k, 0L, null, null, 0L, null, 0, 0L, 16777214);
                            LayoutDirection layoutDirection = i37VarM22334Z0.f43439o;
                            rw9 rw9Var2 = null;
                            if (layoutDirection == null || (fb2Var = i37VarM22334Z0.f43433i) == null) {
                                rw9Var = null;
                            } else {
                                C3419on c3419on = new C3419on(i37VarM22334Z0.f43425a);
                                if (i37VarM22334Z0.f43434j == null || i37VarM22334Z0.f43438n == null) {
                                    rw9Var = null;
                                } else {
                                    long j = i37VarM22334Z0.f43440p & (-8589934589L);
                                    int i3 = i37VarM22334Z0.f43430f;
                                    boolean z2 = i37VarM22334Z0.f43429e;
                                    int i4 = i37VarM22334Z0.f43428d;
                                    wa3 wa3Var = i37VarM22334Z0.f43427c;
                                    EmptyList emptyList = EmptyList.f47638a;
                                    rw9Var = new rw9(new qw9(c3419on, vx9VarM23585f, emptyList, i3, z2, i4, fb2Var, layoutDirection, wa3Var, j), new w46(new w41(c3419on, vx9VarM23585f, emptyList, fb2Var, wa3Var), j, i37VarM22334Z0.f43430f, i37VarM22334Z0.f43428d), i37VarM22334Z0.f43436l);
                                }
                            }
                            if (rw9Var != null) {
                                list.add(rw9Var);
                                rw9Var2 = rw9Var;
                            }
                            return Boolean.valueOf(rw9Var2 != null);
                        case 1:
                            String str = ((C3419on) obj).f54604b;
                            sx9 sx9Var = tx9Var.f63073T;
                            if (sx9Var == null) {
                                sx9 sx9Var2 = new sx9(tx9Var.f63063J, str);
                                i37 i37Var = new i37(str, tx9Var.f63064K, tx9Var.f63065L, tx9Var.f63066M, tx9Var.f63067N, tx9Var.f63068O, tx9Var.f63069P);
                                i37Var.m13647d(tx9Var.m22334Z0().f43433i);
                                sx9Var2.f61561d = i37Var;
                                tx9Var.f63073T = sx9Var2;
                            } else if (!fa4.m11650l(str, sx9Var.f61559b)) {
                                sx9Var.f61559b = str;
                                i37 i37Var2 = sx9Var.f61561d;
                                if (i37Var2 != null) {
                                    vx9 vx9Var = tx9Var.f63064K;
                                    wa3 wa3Var2 = tx9Var.f63065L;
                                    int i5 = tx9Var.f63066M;
                                    boolean z3 = tx9Var.f63067N;
                                    int i6 = tx9Var.f63068O;
                                    int i7 = tx9Var.f63069P;
                                    i37Var2.f43425a = str;
                                    i37Var2.f43426b = vx9Var;
                                    i37Var2.f43427c = wa3Var2;
                                    i37Var2.f43428d = i5;
                                    i37Var2.f43429e = z3;
                                    i37Var2.f43430f = i6;
                                    i37Var2.f43431g = i7;
                                    i37Var2.f43443s = (i37Var2.f43443s << 2) | 2;
                                    i37Var2.m13646c();
                                }
                            }
                            thb.m22062u(tx9Var);
                            d32.m10020R(tx9Var);
                            AbstractC3489q9.m19789s(tx9Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            sx9 sx9Var3 = tx9Var.f63073T;
                            if (sx9Var3 == null) {
                                z = false;
                            } else {
                                sx9Var3.f61560c = zBooleanValue;
                                thb.m22062u(tx9Var);
                                d32.m10020R(tx9Var);
                                AbstractC3489q9.m19789s(tx9Var);
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.f63072S = r1;
            r0 = r1;
        }
        C3419on c3419on = new C3419on(this.f63063J);
        bh4[] bh4VarArr = AbstractC0426f.f5022a;
        tv8Var.mo3709d(AbstractC0424d.f4979C, vz1.m23604J(c3419on));
        sx9 sx9Var = this.f63073T;
        if (sx9Var != null) {
            boolean z = sx9Var.f61560c;
            C0427g c0427g = AbstractC0424d.f4981E;
            bh4[] bh4VarArr2 = AbstractC0426f.f5022a;
            bh4 bh4Var = bh4VarArr2[17];
            tv8Var.mo3709d(c0427g, Boolean.valueOf(z));
            C3419on c3419on2 = new C3419on(sx9Var.f61559b);
            C0427g c0427g2 = AbstractC0424d.f4980D;
            bh4 bh4Var2 = bh4VarArr2[16];
            tv8Var.mo3709d(c0427g2, c3419on2);
        }
        final int i2 = 1;
        tv8Var.mo3709d(AbstractC0421a.f4956l, new C3024g3(null, new vi3(this) { // from class: rx9

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ tx9 f60012b;

            {
                this.f60012b = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00bc  */
            @Override // p000.vi3
            public final Object invoke(Object obj) {
                fb2 fb2Var;
                rw9 rw9Var;
                int i3 = i2;
                boolean z2 = true;
                tx9 tx9Var = this.f60012b;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        i37 i37VarM22334Z0 = tx9Var.m22334Z0();
                        vx9 vx9VarM23585f = vx9.m23585f(tx9Var.f63064K, aa1.f412k, 0L, null, null, 0L, null, 0, 0L, 16777214);
                        LayoutDirection layoutDirection = i37VarM22334Z0.f43439o;
                        rw9 rw9Var2 = null;
                        if (layoutDirection == null || (fb2Var = i37VarM22334Z0.f43433i) == null) {
                            rw9Var = null;
                        } else {
                            C3419on c3419on3 = new C3419on(i37VarM22334Z0.f43425a);
                            if (i37VarM22334Z0.f43434j == null || i37VarM22334Z0.f43438n == null) {
                                rw9Var = null;
                            } else {
                                long j = i37VarM22334Z0.f43440p & (-8589934589L);
                                int i4 = i37VarM22334Z0.f43430f;
                                boolean z3 = i37VarM22334Z0.f43429e;
                                int i5 = i37VarM22334Z0.f43428d;
                                wa3 wa3Var = i37VarM22334Z0.f43427c;
                                EmptyList emptyList = EmptyList.f47638a;
                                rw9Var = new rw9(new qw9(c3419on3, vx9VarM23585f, emptyList, i4, z3, i5, fb2Var, layoutDirection, wa3Var, j), new w46(new w41(c3419on3, vx9VarM23585f, emptyList, fb2Var, wa3Var), j, i37VarM22334Z0.f43430f, i37VarM22334Z0.f43428d), i37VarM22334Z0.f43436l);
                            }
                        }
                        if (rw9Var != null) {
                            list.add(rw9Var);
                            rw9Var2 = rw9Var;
                        }
                        return Boolean.valueOf(rw9Var2 != null);
                    case 1:
                        String str = ((C3419on) obj).f54604b;
                        sx9 sx9Var2 = tx9Var.f63073T;
                        if (sx9Var2 == null) {
                            sx9 sx9Var3 = new sx9(tx9Var.f63063J, str);
                            i37 i37Var = new i37(str, tx9Var.f63064K, tx9Var.f63065L, tx9Var.f63066M, tx9Var.f63067N, tx9Var.f63068O, tx9Var.f63069P);
                            i37Var.m13647d(tx9Var.m22334Z0().f43433i);
                            sx9Var3.f61561d = i37Var;
                            tx9Var.f63073T = sx9Var3;
                        } else if (!fa4.m11650l(str, sx9Var2.f61559b)) {
                            sx9Var2.f61559b = str;
                            i37 i37Var2 = sx9Var2.f61561d;
                            if (i37Var2 != null) {
                                vx9 vx9Var = tx9Var.f63064K;
                                wa3 wa3Var2 = tx9Var.f63065L;
                                int i6 = tx9Var.f63066M;
                                boolean z4 = tx9Var.f63067N;
                                int i7 = tx9Var.f63068O;
                                int i8 = tx9Var.f63069P;
                                i37Var2.f43425a = str;
                                i37Var2.f43426b = vx9Var;
                                i37Var2.f43427c = wa3Var2;
                                i37Var2.f43428d = i6;
                                i37Var2.f43429e = z4;
                                i37Var2.f43430f = i7;
                                i37Var2.f43431g = i8;
                                i37Var2.f43443s = (i37Var2.f43443s << 2) | 2;
                                i37Var2.m13646c();
                            }
                        }
                        thb.m22062u(tx9Var);
                        d32.m10020R(tx9Var);
                        AbstractC3489q9.m19789s(tx9Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        sx9 sx9Var4 = tx9Var.f63073T;
                        if (sx9Var4 == null) {
                            z2 = false;
                        } else {
                            sx9Var4.f61560c = zBooleanValue;
                            thb.m22062u(tx9Var);
                            d32.m10020R(tx9Var);
                            AbstractC3489q9.m19789s(tx9Var);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final int i3 = 2;
        tv8Var.mo3709d(AbstractC0421a.f4957m, new C3024g3(null, new vi3(this) { // from class: rx9

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ tx9 f60012b;

            {
                this.f60012b = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00bc  */
            @Override // p000.vi3
            public final Object invoke(Object obj) {
                fb2 fb2Var;
                rw9 rw9Var;
                int i4 = i3;
                boolean z2 = true;
                tx9 tx9Var = this.f60012b;
                switch (i4) {
                    case 0:
                        List list = (List) obj;
                        i37 i37VarM22334Z0 = tx9Var.m22334Z0();
                        vx9 vx9VarM23585f = vx9.m23585f(tx9Var.f63064K, aa1.f412k, 0L, null, null, 0L, null, 0, 0L, 16777214);
                        LayoutDirection layoutDirection = i37VarM22334Z0.f43439o;
                        rw9 rw9Var2 = null;
                        if (layoutDirection == null || (fb2Var = i37VarM22334Z0.f43433i) == null) {
                            rw9Var = null;
                        } else {
                            C3419on c3419on3 = new C3419on(i37VarM22334Z0.f43425a);
                            if (i37VarM22334Z0.f43434j == null || i37VarM22334Z0.f43438n == null) {
                                rw9Var = null;
                            } else {
                                long j = i37VarM22334Z0.f43440p & (-8589934589L);
                                int i5 = i37VarM22334Z0.f43430f;
                                boolean z3 = i37VarM22334Z0.f43429e;
                                int i6 = i37VarM22334Z0.f43428d;
                                wa3 wa3Var = i37VarM22334Z0.f43427c;
                                EmptyList emptyList = EmptyList.f47638a;
                                rw9Var = new rw9(new qw9(c3419on3, vx9VarM23585f, emptyList, i5, z3, i6, fb2Var, layoutDirection, wa3Var, j), new w46(new w41(c3419on3, vx9VarM23585f, emptyList, fb2Var, wa3Var), j, i37VarM22334Z0.f43430f, i37VarM22334Z0.f43428d), i37VarM22334Z0.f43436l);
                            }
                        }
                        if (rw9Var != null) {
                            list.add(rw9Var);
                            rw9Var2 = rw9Var;
                        }
                        return Boolean.valueOf(rw9Var2 != null);
                    case 1:
                        String str = ((C3419on) obj).f54604b;
                        sx9 sx9Var2 = tx9Var.f63073T;
                        if (sx9Var2 == null) {
                            sx9 sx9Var3 = new sx9(tx9Var.f63063J, str);
                            i37 i37Var = new i37(str, tx9Var.f63064K, tx9Var.f63065L, tx9Var.f63066M, tx9Var.f63067N, tx9Var.f63068O, tx9Var.f63069P);
                            i37Var.m13647d(tx9Var.m22334Z0().f43433i);
                            sx9Var3.f61561d = i37Var;
                            tx9Var.f63073T = sx9Var3;
                        } else if (!fa4.m11650l(str, sx9Var2.f61559b)) {
                            sx9Var2.f61559b = str;
                            i37 i37Var2 = sx9Var2.f61561d;
                            if (i37Var2 != null) {
                                vx9 vx9Var = tx9Var.f63064K;
                                wa3 wa3Var2 = tx9Var.f63065L;
                                int i7 = tx9Var.f63066M;
                                boolean z4 = tx9Var.f63067N;
                                int i8 = tx9Var.f63068O;
                                int i9 = tx9Var.f63069P;
                                i37Var2.f43425a = str;
                                i37Var2.f43426b = vx9Var;
                                i37Var2.f43427c = wa3Var2;
                                i37Var2.f43428d = i7;
                                i37Var2.f43429e = z4;
                                i37Var2.f43430f = i8;
                                i37Var2.f43431g = i9;
                                i37Var2.f43443s = (i37Var2.f43443s << 2) | 2;
                                i37Var2.m13646c();
                            }
                        }
                        thb.m22062u(tx9Var);
                        d32.m10020R(tx9Var);
                        AbstractC3489q9.m19789s(tx9Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        sx9 sx9Var4 = tx9Var.f63073T;
                        if (sx9Var4 == null) {
                            z2 = false;
                        } else {
                            sx9Var4.f61560c = zBooleanValue;
                            thb.m22062u(tx9Var);
                            d32.m10020R(tx9Var);
                            AbstractC3489q9.m19789s(tx9Var);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        tv8Var.mo3709d(AbstractC0421a.f4958n, new C3024g3(null, new y47(this, 19)));
        AbstractC0426f.m1858b(tv8Var, r0);
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return false;
    }

    /* JADX INFO: renamed from: Z0 */
    public final i37 m22334Z0() {
        vx9 vx9Var = this.f63064K;
        if (this.f63071R == null) {
            this.f63071R = new i37(this.f63063J, vx9Var, this.f63065L, this.f63066M, this.f63067N, this.f63068O, this.f63069P);
        }
        i37 i37Var = this.f63071R;
        i37Var.getClass();
        return i37Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: b */
    public final int mo967b(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        i37 i37VarM22334Z0;
        sx9 sx9Var = this.f63073T;
        if (sx9Var == null) {
            i37VarM22334Z0 = m22334Z0();
        } else {
            if (!sx9Var.f61560c) {
                sx9Var = null;
            }
            if (sx9Var == null || (i37VarM22334Z0 = sx9Var.f61561d) == null) {
                i37VarM22334Z0 = m22334Z0();
            }
        }
        i37VarM22334Z0.m13647d(abstractC0359i);
        return xwc.m24773k(i37VarM22334Z0.m13648e(abstractC0359i.getLayoutDirection()).mo13025b());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: e */
    public final int mo968e(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        i37 i37VarM22334Z0;
        sx9 sx9Var = this.f63073T;
        if (sx9Var == null) {
            i37VarM22334Z0 = m22334Z0();
        } else {
            if (!sx9Var.f61560c) {
                sx9Var = null;
            }
            if (sx9Var == null || (i37VarM22334Z0 = sx9Var.f61561d) == null) {
                i37VarM22334Z0 = m22334Z0();
            }
        }
        i37VarM22334Z0.m13647d(abstractC0359i);
        return i37VarM22334Z0.m13644a(i, abstractC0359i.getLayoutDirection());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x003d, B:21:0x0045, B:22:0x006c, B:12:0x0015), top: B:28:0x0005 }] */
    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        i37 i37VarM22334Z0;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            sx9 sx9Var = this.f63073T;
            if (sx9Var == null) {
                i37VarM22334Z0 = m22334Z0();
            } else {
                if (!sx9Var.f61560c) {
                    sx9Var = null;
                }
                if (sx9Var == null || (i37VarM22334Z0 = sx9Var.f61561d) == null) {
                    i37VarM22334Z0 = m22334Z0();
                }
            }
            i37VarM22334Z0.m13647d(jt5Var);
            boolean zM13645b = i37VarM22334Z0.m13645b(j, jt5Var.getLayoutDirection());
            h37 h37Var = i37VarM22334Z0.f43438n;
            if (h37Var != null) {
                h37Var.mo13024a();
            }
            C3300lj c3300lj = i37VarM22334Z0.f43434j;
            c3300lj.getClass();
            pw9 pw9Var = c3300lj.f49728d;
            long j2 = i37VarM22334Z0.f43436l;
            if (zM13645b) {
                d32.m10019Q(this);
                HashMap map = this.f63070Q;
                if (map == null) {
                    map = new HashMap(2);
                    this.f63070Q = map;
                }
                map.put(AbstractC0334a.f4179a, Integer.valueOf(Math.round(pw9Var.m19547d(0))));
                map.put(AbstractC0334a.f4180b, Integer.valueOf(Math.round(pw9Var.m19547d(pw9Var.f56920g - 1))));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            l87 l87VarMo1514r = ct5Var.mo1514r(AbstractC3423or.m18278s(i, i, i2, i2));
            HashMap map2 = this.f63070Q;
            map2.getClass();
            return jt5Var.mo9895M0(i, i2, map2, new C3773xv(l87VarMo1514r, 14));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: i */
    public final int mo969i(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        i37 i37VarM22334Z0;
        sx9 sx9Var = this.f63073T;
        if (sx9Var == null) {
            i37VarM22334Z0 = m22334Z0();
        } else {
            if (!sx9Var.f61560c) {
                sx9Var = null;
            }
            if (sx9Var == null || (i37VarM22334Z0 = sx9Var.f61561d) == null) {
                i37VarM22334Z0 = m22334Z0();
            }
        }
        i37VarM22334Z0.m13647d(abstractC0359i);
        return xwc.m24773k(i37VarM22334Z0.m13648e(abstractC0359i.getLayoutDirection()).mo13026c());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0016  */
    @Override // p000.ll2
    /* JADX INFO: renamed from: i0 */
    public final void mo952i0(C0358h c0358h) {
        i37 i37VarM22334Z0;
        if (this.f34836I) {
            sx9 sx9Var = this.f63073T;
            if (sx9Var == null) {
                i37VarM22334Z0 = m22334Z0();
            } else {
                if (!sx9Var.f61560c) {
                    sx9Var = null;
                }
                if (sx9Var == null || (i37VarM22334Z0 = sx9Var.f61561d) == null) {
                    i37VarM22334Z0 = m22334Z0();
                }
            }
            C3300lj c3300lj = i37VarM22334Z0.f43434j;
            if (c3300lj == null) {
                l54.m15815b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.f63071R + ", textSubstitution=" + this.f63073T + ')');
                C3386nv.m17631r();
                return;
            }
            ym0 ym0VarM16515r = c0358h.f4358a.f853b.m16515r();
            boolean z = i37VarM22334Z0.f43435k;
            if (z) {
                long j = i37VarM22334Z0.f43436l;
                ym0VarM16515r.mo17016h();
                ym0VarM16515r.mo17022n(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                vx9 vx9Var = this.f63064K;
                he9 he9Var = vx9Var.f66065a;
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
                    c3300lj.m16244g(ym0VarM16515r, vi0VarMo24174b, vx9Var.f66065a.f42264a.mo24175c(), l39Var2, rt9Var2, ml2Var2);
                } else {
                    long jM23586c = aa1.f412k;
                    if (jM23586c == 16) {
                        jM23586c = vx9Var.m23586c() != 16 ? vx9Var.m23586c() : aa1.f403b;
                    }
                    c3300lj.m16243f(ym0VarM16515r, jM23586c, l39Var2, rt9Var2, ml2Var2);
                }
            } finally {
                if (z) {
                    ym0VarM16515r.mo17024p();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: j */
    public final int mo970j(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        i37 i37VarM22334Z0;
        sx9 sx9Var = this.f63073T;
        if (sx9Var == null) {
            i37VarM22334Z0 = m22334Z0();
        } else {
            if (!sx9Var.f61560c) {
                sx9Var = null;
            }
            if (sx9Var == null || (i37VarM22334Z0 = sx9Var.f61561d) == null) {
                i37VarM22334Z0 = m22334Z0();
            }
        }
        i37VarM22334Z0.m13647d(abstractC0359i);
        return i37VarM22334Z0.m13644a(i, abstractC0359i.getLayoutDirection());
    }
}
