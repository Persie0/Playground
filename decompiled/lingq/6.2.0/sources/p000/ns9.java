package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ns9 extends i16 {

    /* JADX INFO: renamed from: H */
    public final vi3 f53203H;

    /* JADX INFO: renamed from: b */
    public final C3419on f53204b;

    /* JADX INFO: renamed from: c */
    public final vx9 f53205c;

    /* JADX INFO: renamed from: d */
    public final wa3 f53206d;

    /* JADX INFO: renamed from: e */
    public final vi3 f53207e;

    /* JADX INFO: renamed from: f */
    public final int f53208f;

    /* JADX INFO: renamed from: g */
    public final boolean f53209g;

    /* JADX INFO: renamed from: h */
    public final int f53210h;

    /* JADX INFO: renamed from: i */
    public final int f53211i;

    /* JADX INFO: renamed from: j */
    public final List f53212j;

    /* JADX INFO: renamed from: k */
    public final vi3 f53213k;

    /* JADX INFO: renamed from: l */
    public final m20 f53214l;

    public ns9(C3419on c3419on, vx9 vx9Var, wa3 wa3Var, vi3 vi3Var, int i, boolean z, int i2, int i3, List list, vi3 vi3Var2, m20 m20Var, vi3 vi3Var3) {
        this.f53204b = c3419on;
        this.f53205c = vx9Var;
        this.f53206d = wa3Var;
        this.f53207e = vi3Var;
        this.f53208f = i;
        this.f53209g = z;
        this.f53210h = i2;
        this.f53211i = i3;
        this.f53212j = list;
        this.f53213k = vi3Var2;
        this.f53214l = m20Var;
        this.f53203H = vi3Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns9)) {
            return false;
        }
        ns9 ns9Var = (ns9) obj;
        return fa4.m11650l(this.f53204b, ns9Var.f53204b) && fa4.m11650l(this.f53205c, ns9Var.f53205c) && fa4.m11650l(this.f53212j, ns9Var.f53212j) && fa4.m11650l(this.f53206d, ns9Var.f53206d) && this.f53207e == ns9Var.f53207e && this.f53203H == ns9Var.f53203H && this.f53208f == ns9Var.f53208f && this.f53209g == ns9Var.f53209g && this.f53210h == ns9Var.f53210h && this.f53211i == ns9Var.f53211i && this.f53213k == ns9Var.f53213k;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        qs9 qs9Var = new qs9();
        qs9Var.f58147J = this.f53204b;
        qs9Var.f58148K = this.f53205c;
        qs9Var.f58149L = this.f53206d;
        qs9Var.f58150M = this.f53207e;
        qs9Var.f58151N = this.f53208f;
        qs9Var.f58152O = this.f53209g;
        qs9Var.f58153P = this.f53210h;
        qs9Var.f58154Q = this.f53211i;
        qs9Var.f58155R = this.f53212j;
        qs9Var.f58156S = this.f53213k;
        qs9Var.f58157T = this.f53214l;
        qs9Var.f58158U = this.f53203H;
        return qs9Var;
    }

    public final int hashCode() {
        int iHashCode = (this.f53206d.hashCode() + ux5.m22982e(this.f53205c, this.f53204b.hashCode() * 31, 31)) * 31;
        vi3 vi3Var = this.f53207e;
        int iM12428e = (((g9a.m12428e(wq1.m24106b(this.f53208f, (iHashCode + (vi3Var != null ? vi3Var.hashCode() : 0)) * 31, 31), 31, this.f53209g) + this.f53210h) * 31) + this.f53211i) * 31;
        List list = this.f53212j;
        int iHashCode2 = (iM12428e + (list != null ? list.hashCode() : 0)) * 31;
        vi3 vi3Var2 = this.f53213k;
        int iHashCode3 = (iHashCode2 + (vi3Var2 != null ? vi3Var2.hashCode() : 0)) * 29791;
        vi3 vi3Var3 = this.f53203H;
        return iHashCode3 + (vi3Var3 != null ? vi3Var3.hashCode() : 0);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    /* JADX WARN: Code duplicated, block: B:45:0x009d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00af  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:64:0x0103  */
    /* JADX WARN: Code duplicated, block: B:68:0x010c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0114  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        boolean z;
        C3419on c3419on;
        boolean zM11650l;
        boolean z2;
        boolean z3;
        List list;
        List list2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z4;
        boolean z5;
        wa3 wa3Var;
        wa3 wa3Var2;
        int i5;
        int i6;
        m20 m20Var;
        m20 m20Var2;
        vi3 vi3Var;
        vi3 vi3Var2;
        vi3 vi3Var3;
        vi3 vi3Var4;
        vi3 vi3Var5;
        vi3 vi3Var6;
        qs9 qs9Var = (qs9) d16Var;
        vx9 vx9Var = qs9Var.f58148K;
        boolean z6 = false;
        boolean z7 = true;
        vx9 vx9Var2 = this.f53205c;
        if (vx9Var2 != vx9Var) {
            if (!vx9Var2.f66065a.m13211c(vx9Var.f66065a)) {
                z = true;
            }
            String str = qs9Var.f58147J.f54604b;
            c3419on = this.f53204b;
            zM11650l = fa4.m11650l(str, c3419on.f54604b);
            boolean zM11650l2 = fa4.m11650l(qs9Var.f58147J.f54603a, c3419on.f54603a);
            if (zM11650l || !zM11650l2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                qs9Var.f58147J = c3419on;
            }
            if (!zM11650l) {
                qs9Var.f58162Y = null;
            }
            z3 = !qs9Var.f58148K.m23587d(vx9Var2);
            qs9Var.f58148K = vx9Var2;
            list = qs9Var.f58155R;
            list2 = this.f53212j;
            if (!fa4.m11650l(list, list2)) {
                qs9Var.f58155R = list2;
                z3 = true;
            }
            i = qs9Var.f58154Q;
            i2 = this.f53211i;
            if (i != i2) {
                qs9Var.f58154Q = i2;
                z3 = true;
            }
            i3 = qs9Var.f58153P;
            i4 = this.f53210h;
            if (i3 != i4) {
                qs9Var.f58153P = i4;
                z3 = true;
            }
            z4 = qs9Var.f58152O;
            z5 = this.f53209g;
            if (z4 != z5) {
                qs9Var.f58152O = z5;
                z3 = true;
            }
            wa3Var = qs9Var.f58149L;
            wa3Var2 = this.f53206d;
            if (!fa4.m11650l(wa3Var, wa3Var2)) {
                qs9Var.f58149L = wa3Var2;
                z3 = true;
            }
            i5 = qs9Var.f58151N;
            i6 = this.f53208f;
            if (i5 != i6) {
                qs9Var.f58151N = i6;
                z3 = true;
            }
            m20Var = qs9Var.f58157T;
            m20Var2 = this.f53214l;
            if (!fa4.m11650l(m20Var, m20Var2)) {
                qs9Var.f58157T = m20Var2;
                z3 = true;
            }
            vi3Var = qs9Var.f58150M;
            vi3Var2 = this.f53207e;
            if (vi3Var != vi3Var2) {
                qs9Var.f58150M = vi3Var2;
                z6 = true;
            }
            vi3Var3 = qs9Var.f58156S;
            vi3Var4 = this.f53213k;
            if (vi3Var3 != vi3Var4) {
                qs9Var.f58156S = vi3Var4;
                z6 = true;
            }
            vi3Var5 = qs9Var.f58158U;
            vi3Var6 = this.f53203H;
            if (vi3Var5 != vi3Var6) {
                qs9Var.f58158U = vi3Var6;
            } else {
                z7 = z6;
            }
            if (z2 || z3 || z7) {
                z46 z46VarM20142Z0 = qs9Var.m20142Z0();
                C3419on c3419on2 = qs9Var.f58147J;
                vx9 vx9Var3 = qs9Var.f58148K;
                wa3 wa3Var3 = qs9Var.f58149L;
                int i7 = qs9Var.f58151N;
                boolean z8 = qs9Var.f58152O;
                int i8 = qs9Var.f58153P;
                int i9 = qs9Var.f58154Q;
                List list3 = qs9Var.f58155R;
                m20 m20Var3 = qs9Var.f58157T;
                z46VarM20142Z0.f70877a = c3419on2;
                z46VarM20142Z0.m25455f(vx9Var3);
                z46VarM20142Z0.f70878b = wa3Var3;
                z46VarM20142Z0.f70879c = i7;
                z46VarM20142Z0.f70880d = z8;
                z46VarM20142Z0.f70881e = i8;
                z46VarM20142Z0.f70882f = i9;
                z46VarM20142Z0.f70883g = list3;
                z46VarM20142Z0.f70884h = m20Var3;
                z46VarM20142Z0.f70895s = (z46VarM20142Z0.f70895s << 2) | 2;
                z46VarM20142Z0.f70889m = null;
                z46VarM20142Z0.f70891o = null;
                z46VarM20142Z0.f70893q = -1;
                z46VarM20142Z0.f70892p = -1;
                z46VarM20142Z0.f70894r = null;
            }
            if (qs9Var.f34836I) {
                if (z2 || (z && qs9Var.f58161X != null)) {
                    thb.m22062u(qs9Var);
                }
                if (z2 || z3 || z7) {
                    d32.m10020R(qs9Var);
                    AbstractC3489q9.m19789s(qs9Var);
                }
                if (z) {
                    AbstractC3489q9.m19789s(qs9Var);
                }
            }
            return;
        }
        vx9Var2.getClass();
        z = false;
        String str2 = qs9Var.f58147J.f54604b;
        c3419on = this.f53204b;
        zM11650l = fa4.m11650l(str2, c3419on.f54604b);
        boolean zM11650l3 = fa4.m11650l(qs9Var.f58147J.f54603a, c3419on.f54603a);
        if (zM11650l) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (z2) {
            qs9Var.f58147J = c3419on;
        }
        if (!zM11650l) {
            qs9Var.f58162Y = null;
        }
        z3 = !qs9Var.f58148K.m23587d(vx9Var2);
        qs9Var.f58148K = vx9Var2;
        list = qs9Var.f58155R;
        list2 = this.f53212j;
        if (!fa4.m11650l(list, list2)) {
            qs9Var.f58155R = list2;
            z3 = true;
        }
        i = qs9Var.f58154Q;
        i2 = this.f53211i;
        if (i != i2) {
            qs9Var.f58154Q = i2;
            z3 = true;
        }
        i3 = qs9Var.f58153P;
        i4 = this.f53210h;
        if (i3 != i4) {
            qs9Var.f58153P = i4;
            z3 = true;
        }
        z4 = qs9Var.f58152O;
        z5 = this.f53209g;
        if (z4 != z5) {
            qs9Var.f58152O = z5;
            z3 = true;
        }
        wa3Var = qs9Var.f58149L;
        wa3Var2 = this.f53206d;
        if (!fa4.m11650l(wa3Var, wa3Var2)) {
            qs9Var.f58149L = wa3Var2;
            z3 = true;
        }
        i5 = qs9Var.f58151N;
        i6 = this.f53208f;
        if (i5 != i6) {
            qs9Var.f58151N = i6;
            z3 = true;
        }
        m20Var = qs9Var.f58157T;
        m20Var2 = this.f53214l;
        if (!fa4.m11650l(m20Var, m20Var2)) {
            qs9Var.f58157T = m20Var2;
            z3 = true;
        }
        vi3Var = qs9Var.f58150M;
        vi3Var2 = this.f53207e;
        if (vi3Var != vi3Var2) {
            qs9Var.f58150M = vi3Var2;
            z6 = true;
        }
        vi3Var3 = qs9Var.f58156S;
        vi3Var4 = this.f53213k;
        if (vi3Var3 != vi3Var4) {
            qs9Var.f58156S = vi3Var4;
            z6 = true;
        }
        vi3Var5 = qs9Var.f58158U;
        vi3Var6 = this.f53203H;
        if (vi3Var5 != vi3Var6) {
            qs9Var.f58158U = vi3Var6;
        } else {
            z7 = z6;
        }
        if (z2) {
            z46 z46VarM20142Z1 = qs9Var.m20142Z0();
            C3419on c3419on3 = qs9Var.f58147J;
            vx9 vx9Var4 = qs9Var.f58148K;
            wa3 wa3Var4 = qs9Var.f58149L;
            int i10 = qs9Var.f58151N;
            boolean z9 = qs9Var.f58152O;
            int i11 = qs9Var.f58153P;
            int i12 = qs9Var.f58154Q;
            List list4 = qs9Var.f58155R;
            m20 m20Var4 = qs9Var.f58157T;
            z46VarM20142Z1.f70877a = c3419on3;
            z46VarM20142Z1.m25455f(vx9Var4);
            z46VarM20142Z1.f70878b = wa3Var4;
            z46VarM20142Z1.f70879c = i10;
            z46VarM20142Z1.f70880d = z9;
            z46VarM20142Z1.f70881e = i11;
            z46VarM20142Z1.f70882f = i12;
            z46VarM20142Z1.f70883g = list4;
            z46VarM20142Z1.f70884h = m20Var4;
            z46VarM20142Z1.f70895s = (z46VarM20142Z1.f70895s << 2) | 2;
            z46VarM20142Z1.f70889m = null;
            z46VarM20142Z1.f70891o = null;
            z46VarM20142Z1.f70893q = -1;
            z46VarM20142Z1.f70892p = -1;
            z46VarM20142Z1.f70894r = null;
        } else {
            z46 z46VarM20142Z2 = qs9Var.m20142Z0();
            C3419on c3419on4 = qs9Var.f58147J;
            vx9 vx9Var5 = qs9Var.f58148K;
            wa3 wa3Var5 = qs9Var.f58149L;
            int i13 = qs9Var.f58151N;
            boolean z10 = qs9Var.f58152O;
            int i14 = qs9Var.f58153P;
            int i15 = qs9Var.f58154Q;
            List list5 = qs9Var.f58155R;
            m20 m20Var5 = qs9Var.f58157T;
            z46VarM20142Z2.f70877a = c3419on4;
            z46VarM20142Z2.m25455f(vx9Var5);
            z46VarM20142Z2.f70878b = wa3Var5;
            z46VarM20142Z2.f70879c = i13;
            z46VarM20142Z2.f70880d = z10;
            z46VarM20142Z2.f70881e = i14;
            z46VarM20142Z2.f70882f = i15;
            z46VarM20142Z2.f70883g = list5;
            z46VarM20142Z2.f70884h = m20Var5;
            z46VarM20142Z2.f70895s = (z46VarM20142Z2.f70895s << 2) | 2;
            z46VarM20142Z2.f70889m = null;
            z46VarM20142Z2.f70891o = null;
            z46VarM20142Z2.f70893q = -1;
            z46VarM20142Z2.f70892p = -1;
            z46VarM20142Z2.f70894r = null;
        }
        if (qs9Var.f34836I) {
            return;
        }
        if (z2) {
            thb.m22062u(qs9Var);
        } else {
            thb.m22062u(qs9Var);
        }
        if (z2) {
            d32.m10020R(qs9Var);
            AbstractC3489q9.m19789s(qs9Var);
        } else {
            d32.m10020R(qs9Var);
            AbstractC3489q9.m19789s(qs9Var);
        }
        if (z) {
            AbstractC3489q9.m19789s(qs9Var);
        }
    }
}
