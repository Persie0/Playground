package p000;

import android.util.Pair;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class av5 {

    /* JADX INFO: renamed from: c */
    public final l52 f7558c;

    /* JADX INFO: renamed from: d */
    public final qp9 f7559d;

    /* JADX INFO: renamed from: e */
    public final C3487q7 f7560e;

    /* JADX INFO: renamed from: f */
    public long f7561f;

    /* JADX INFO: renamed from: g */
    public int f7562g;

    /* JADX INFO: renamed from: h */
    public boolean f7563h;

    /* JADX INFO: renamed from: i */
    public yu5 f7564i;

    /* JADX INFO: renamed from: j */
    public yu5 f7565j;

    /* JADX INFO: renamed from: k */
    public yu5 f7566k;

    /* JADX INFO: renamed from: l */
    public yu5 f7567l;

    /* JADX INFO: renamed from: m */
    public yu5 f7568m;

    /* JADX INFO: renamed from: n */
    public int f7569n;

    /* JADX INFO: renamed from: o */
    public Object f7570o;

    /* JADX INFO: renamed from: p */
    public long f7571p;

    /* JADX INFO: renamed from: a */
    public final x0a f7556a = new x0a();

    /* JADX INFO: renamed from: b */
    public final y0a f7557b = new y0a();

    /* JADX INFO: renamed from: q */
    public ArrayList f7572q = new ArrayList();

    public av5(l52 l52Var, qp9 qp9Var, C3487q7 c3487q7, tv2 tv2Var) {
        this.f7558c = l52Var;
        this.f7559d = qp9Var;
        this.f7560e = c3487q7;
    }

    /* JADX INFO: renamed from: n */
    public static jv5 m3080n(z0a z0aVar, Object obj, long j, long j2, y0a y0aVar, x0a x0aVar) {
        z0aVar.mo23250g(obj, x0aVar);
        z0aVar.m25397n(x0aVar.f67601c, y0aVar);
        z0aVar.mo17285b(obj);
        int i = x0aVar.f67605g.f46841a;
        if (i != 0) {
            if (i == 1) {
                x0aVar.m24228f(0);
            }
            x0aVar.f67605g.getClass();
            x0aVar.m24229g(0);
        }
        z0aVar.mo23250g(obj, x0aVar);
        int iM24225c = x0aVar.m24225c(j);
        return iM24225c == -1 ? new jv5(obj, j2, x0aVar.m24224b(j)) : new jv5(obj, iM24225c, x0aVar.m24227e(iM24225c), j2, -1);
    }

    /* JADX INFO: renamed from: a */
    public final yu5 m3081a() {
        yu5 yu5Var = this.f7564i;
        if (yu5Var == null) {
            return null;
        }
        if (yu5Var == this.f7565j) {
            this.f7565j = yu5Var.m25325h();
        }
        yu5 yu5Var2 = this.f7564i;
        if (yu5Var2 == this.f7566k) {
            this.f7566k = yu5Var2.m25325h();
        }
        this.f7564i.m25337t();
        int i = this.f7569n - 1;
        this.f7569n = i;
        if (i == 0) {
            this.f7567l = null;
            yu5 yu5Var3 = this.f7564i;
            this.f7570o = yu5Var3.f70473b;
            this.f7571p = yu5Var3.f70478g.f72178a.f46229d;
        }
        this.f7564i = this.f7564i.m25325h();
        m3092l();
        return this.f7564i;
    }

    /* JADX INFO: renamed from: b */
    public final void m3082b() {
        if (this.f7569n == 0) {
            return;
        }
        yu5 yu5VarM25325h = this.f7564i;
        yu5VarM25325h.getClass();
        this.f7570o = yu5VarM25325h.f70473b;
        this.f7571p = yu5VarM25325h.f70478g.f72178a.f46229d;
        while (yu5VarM25325h != null) {
            yu5VarM25325h.m25337t();
            yu5VarM25325h = yu5VarM25325h.m25325h();
        }
        this.f7564i = null;
        this.f7567l = null;
        this.f7565j = null;
        this.f7566k = null;
        this.f7569n = 0;
        m3092l();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
    /* JADX WARN: Code duplicated, block: B:60:0x015e  */
    /* JADX INFO: renamed from: c */
    public final zu5 m3083c(z0a z0aVar, yu5 yu5Var, long j) {
        z0a z0aVar2;
        long j2;
        long jMax;
        Object obj;
        long j3;
        long j4;
        long j5;
        long jMax2;
        zu5 zu5Var = yu5Var.f70478g;
        long jM25327j = (yu5Var.m25327j() + zu5Var.f72183f) - j;
        boolean z = zu5Var.f72186i;
        y0a y0aVar = this.f7557b;
        if (!z) {
            zu5 zu5Var2 = yu5Var.f70478g;
            jv5 jv5Var = zu5Var2.f72178a;
            Object obj2 = jv5Var.f46226a;
            int i = jv5Var.f46230e;
            x0a x0aVar = this.f7556a;
            z0aVar.mo23250g(obj2, x0aVar);
            boolean z2 = zu5Var2.f72185h;
            if (!jv5Var.m14690b()) {
                if (i != -1) {
                    x0aVar.m24228f(i);
                }
                int iM24227e = x0aVar.m24227e(i);
                x0aVar.m24229g(i);
                if (iM24227e != x0aVar.f67605g.m14950a(i).f43665a) {
                    return m3085e(z0aVar, jv5Var.f46226a, jv5Var.f46230e, iM24227e, zu5Var2.f72183f, jv5Var.f46229d, z2);
                }
                z0aVar.mo23250g(obj2, x0aVar);
                x0aVar.m24226d(i);
                x0aVar.f67605g.m14950a(i).getClass();
                return m3086f(z0aVar, jv5Var.f46226a, 0L, -9223372036854775807L, zu5Var2.f72183f, jv5Var.f46229d, false);
            }
            int i2 = jv5Var.f46227b;
            int i3 = x0aVar.f67605g.m14950a(i2).f43665a;
            if (i3 != -1) {
                int iM13715a = x0aVar.f67605g.m14950a(i2).m13715a(jv5Var.f46228c);
                if (iM13715a < i3) {
                    return m3085e(z0aVar, jv5Var.f46226a, i2, iM13715a, zu5Var2.f72181d, jv5Var.f46229d, z2);
                }
                long jLongValue = zu5Var2.f72181d;
                if (jLongValue == -9223372036854775807L) {
                    int i4 = x0aVar.f67601c;
                    if (x0aVar.f67602d != -9223372036854775807L) {
                        jMax = -9223372036854775807L;
                    } else {
                        z0aVar.m25397n(i4, y0aVar);
                        if (!y0aVar.f69070g || y0aVar.f69072i) {
                            jMax = -9223372036854775807L;
                        } else {
                            jMax = Math.max(0L, jM25327j);
                        }
                    }
                    z0aVar2 = z0aVar;
                    Pair pairM25396j = z0aVar2.m25396j(this.f7557b, x0aVar, x0aVar.f67601c, -9223372036854775807L, jMax);
                    if (pairM25396j != null) {
                        jLongValue = ((Long) pairM25396j.second).longValue();
                        j2 = jMax;
                    }
                } else {
                    z0aVar2 = z0aVar;
                    j2 = -9223372036854775807L;
                }
                int i5 = jv5Var.f46227b;
                z0aVar2.mo23250g(obj2, x0aVar);
                x0aVar.m24226d(i5);
                x0aVar.f67605g.m14950a(i5).getClass();
                return m3086f(z0aVar2, jv5Var.f46226a, Math.max(0L, jLongValue), j2, zu5Var2.f72181d, jv5Var.f46229d, z2);
            }
            return null;
        }
        zu5 zu5Var3 = yu5Var.f70478g;
        jv5 jv5Var2 = zu5Var3.f72178a;
        long j6 = zu5Var3.f72181d;
        int iM25394d = z0aVar.m25394d(z0aVar.mo17285b(jv5Var2.f46226a), this.f7556a, this.f7557b, this.f7562g, this.f7563h);
        if (iM25394d != -1) {
            x0a x0aVar2 = this.f7556a;
            int i6 = z0aVar.mo16393f(iM25394d, x0aVar2, true).f67601c;
            Object obj3 = x0aVar2.f67600b;
            obj3.getClass();
            long j7 = jv5Var2.f46229d;
            if (z0aVar.mo39m(i6, y0aVar, 0L).f69075l == iM25394d) {
                int i7 = x0aVar2.f67601c;
                if (x0aVar2.f67602d != -9223372036854775807L) {
                    jMax2 = -9223372036854775807L;
                } else {
                    z0aVar.m25397n(i7, y0aVar);
                    if (!y0aVar.f69070g || y0aVar.f69072i) {
                        jMax2 = -9223372036854775807L;
                    } else {
                        jMax2 = Math.max(0L, jM25327j);
                    }
                }
                Pair pairM25396j2 = z0aVar.m25396j(this.f7557b, this.f7556a, i6, -9223372036854775807L, jMax2);
                if (pairM25396j2 != null) {
                    Object obj4 = pairM25396j2.first;
                    long jLongValue2 = ((Long) pairM25396j2.second).longValue();
                    yu5 yu5VarM25325h = yu5Var.m25325h();
                    if (yu5VarM25325h == null || !yu5VarM25325h.f70473b.equals(obj4)) {
                        long jM3095p = m3095p(obj4);
                        if (jM3095p == -1) {
                            jM3095p = this.f7561f;
                            this.f7561f = 1 + jM3095p;
                        }
                        j7 = jM3095p;
                    } else {
                        j7 = yu5VarM25325h.f70478g.f72178a.f46229d;
                    }
                    obj = obj4;
                    j3 = jLongValue2;
                    j4 = -9223372036854775807L;
                    j5 = jMax2;
                }
            } else {
                obj = obj3;
                j3 = 0;
                j4 = 0;
                j5 = -9223372036854775807L;
            }
            jv5 jv5VarM3080n = m3080n(z0aVar, obj, j3, j7, this.f7557b, this.f7556a);
            if (j4 != -9223372036854775807L && j6 != -9223372036854775807L) {
                int i8 = z0aVar.mo23250g(jv5Var2.f46226a, x0aVar2).f67605g.f46841a;
                x0aVar2.f67605g.getClass();
                if (i8 > 0) {
                    x0aVar2.m24229g(0);
                }
            }
            return m3084d(z0aVar, jv5VarM3080n, j4, j3, j5);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final zu5 m3084d(z0a z0aVar, jv5 jv5Var, long j, long j2, long j3) {
        z0aVar.mo23250g(jv5Var.f46226a, this.f7556a);
        boolean zM14690b = jv5Var.m14690b();
        Object obj = jv5Var.f46226a;
        return zM14690b ? m3085e(z0aVar, obj, jv5Var.f46227b, jv5Var.f46228c, j, jv5Var.f46229d, false) : m3086f(z0aVar, obj, j2, j3, j, jv5Var.f46229d, false);
    }

    /* JADX INFO: renamed from: e */
    public final zu5 m3085e(z0a z0aVar, Object obj, int i, int i2, long j, long j2, boolean z) {
        jv5 jv5Var = new jv5(obj, i, i2, j2, -1);
        x0a x0aVar = this.f7556a;
        long jM24223a = z0aVar.mo23250g(obj, x0aVar).m24223a(i, i2);
        if (i2 == x0aVar.m24227e(i)) {
            x0aVar.f67605g.getClass();
        }
        x0aVar.m24229g(i);
        long jMax = 0;
        if (jM24223a != -9223372036854775807L && 0 >= jM24223a) {
            jMax = Math.max(0L, jM24223a - 1);
        }
        return new zu5(jv5Var, jMax, -9223372036854775807L, j, -9223372036854775807L, jM24223a, z, false, false, false, false);
    }

    /* JADX INFO: renamed from: f */
    public final zu5 m3086f(z0a z0aVar, Object obj, long j, long j2, long j3, long j4, boolean z) {
        long j5;
        x0a x0aVar = this.f7556a;
        z0aVar.mo23250g(obj, x0aVar);
        int iM24224b = x0aVar.m24224b(j);
        boolean z2 = false;
        if (iM24224b != -1) {
            x0aVar.m24229g(iM24224b);
        } else if (x0aVar.f67605g.f46841a > 0) {
            x0aVar.m24229g(0);
        }
        jv5 jv5Var = new jv5(obj, j4, iM24224b);
        if (!jv5Var.m14690b() && iM24224b == -1) {
            z2 = true;
        }
        boolean zM3090j = m3090j(z0aVar, jv5Var);
        boolean zM3089i = m3089i(z0aVar, jv5Var, z2);
        if (iM24224b != -1) {
            x0aVar.m24229g(iM24224b);
        }
        if (iM24224b != -1) {
            x0aVar.m24228f(iM24224b);
        }
        if (iM24224b != -1) {
            x0aVar.m24226d(iM24224b);
            j5 = 0;
        } else {
            j5 = -9223372036854775807L;
        }
        long j6 = (j5 == -9223372036854775807L || j5 == Long.MIN_VALUE) ? x0aVar.f67602d : j5;
        return new zu5(jv5Var, (j6 == -9223372036854775807L || j < j6) ? j : Math.max(0L, j6 - 1), j2, j3, j5, j6, z, false, z2, zM3090j, zM3089i);
    }

    /* JADX INFO: renamed from: g */
    public final yu5 m3087g() {
        return this.f7566k;
    }

    /* JADX INFO: renamed from: h */
    public final zu5 m3088h(z0a z0aVar, zu5 zu5Var) {
        long j;
        long jM24223a;
        jv5 jv5Var = zu5Var.f72178a;
        boolean zM14690b = jv5Var.m14690b();
        int i = jv5Var.f46230e;
        boolean z = !zM14690b && i == -1;
        int i2 = jv5Var.f46227b;
        boolean zM3090j = m3090j(z0aVar, jv5Var);
        boolean zM3089i = m3089i(z0aVar, jv5Var, z);
        Object obj = jv5Var.f46226a;
        x0a x0aVar = this.f7556a;
        z0aVar.mo23250g(obj, x0aVar);
        if (jv5Var.m14690b() || i == -1) {
            j = -9223372036854775807L;
        } else {
            x0aVar.m24226d(i);
            j = 0;
        }
        if (jv5Var.m14690b()) {
            jM24223a = x0aVar.m24223a(i2, jv5Var.f46228c);
        } else {
            jM24223a = (j == -9223372036854775807L || j == Long.MIN_VALUE) ? x0aVar.f67602d : j;
        }
        if (jv5Var.m14690b()) {
            x0aVar.m24229g(i2);
        } else if (i != -1) {
            x0aVar.m24229g(i);
        }
        return new zu5(jv5Var, zu5Var.f72179b, zu5Var.f72180c, zu5Var.f72181d, j, jM24223a, zu5Var.f72184g, false, z, zM3090j, zM3089i);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3089i(z0a z0aVar, jv5 jv5Var, boolean z) {
        int iMo17285b = z0aVar.mo17285b(jv5Var.f46226a);
        if (!z0aVar.mo39m(z0aVar.mo16393f(iMo17285b, this.f7556a, false).f67601c, this.f7557b, 0L).f69070g) {
            if (z0aVar.m25394d(iMo17285b, this.f7556a, this.f7557b, this.f7562g, this.f7563h) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3090j(z0a z0aVar, jv5 jv5Var) {
        boolean z = !jv5Var.m14690b() && jv5Var.f46230e == -1;
        Object obj = jv5Var.f46226a;
        if (z) {
            if (z0aVar.mo39m(z0aVar.mo23250g(obj, this.f7556a).f67601c, this.f7557b, 0L).f69076m == z0aVar.mo17285b(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m3091k() {
        yu5 yu5Var = this.f7568m;
        if (yu5Var == null || yu5Var.m25334q()) {
            this.f7568m = null;
            for (int i = 0; i < this.f7572q.size(); i++) {
                yu5 yu5Var2 = (yu5) this.f7572q.get(i);
                if (!yu5Var2.m25334q()) {
                    this.f7568m = yu5Var2;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3092l() {
        c14 c14VarM6284m = ImmutableList.m6284m();
        for (yu5 yu5VarM25325h = this.f7564i; yu5VarM25325h != null; yu5VarM25325h = yu5VarM25325h.m25325h()) {
            c14VarM6284m.m3157b(yu5VarM25325h.f70478g.f72178a);
        }
        yu5 yu5Var = this.f7565j;
        this.f7559d.m20098c(new RunnableC3725wk(this, c14VarM6284m, yu5Var == null ? null : yu5Var.f70478g.f72178a, 13));
    }

    /* JADX INFO: renamed from: m */
    public final int m3093m(yu5 yu5Var) {
        yu5Var.getClass();
        int i = 0;
        if (yu5Var != this.f7567l) {
            this.f7567l = yu5Var;
            while (yu5Var.m25325h() != null) {
                yu5Var = yu5Var.m25325h();
                yu5Var.getClass();
                if (yu5Var == this.f7565j) {
                    yu5 yu5Var2 = this.f7564i;
                    this.f7565j = yu5Var2;
                    this.f7566k = yu5Var2;
                    i = 3;
                }
                if (yu5Var == this.f7566k) {
                    this.f7566k = this.f7565j;
                    i |= 2;
                }
                yu5Var.m25337t();
                this.f7569n--;
            }
            yu5 yu5Var3 = this.f7567l;
            yu5Var3.getClass();
            yu5Var3.m25339v(null);
            m3092l();
        }
        return i;
    }

    /* JADX INFO: renamed from: o */
    public final jv5 m3094o(z0a z0aVar, Object obj, long j) {
        long jM3095p;
        int iMo17285b;
        Object obj2 = obj;
        x0a x0aVar = this.f7556a;
        int i = z0aVar.mo23250g(obj2, x0aVar).f67601c;
        Object obj3 = this.f7570o;
        if (obj3 == null || (iMo17285b = z0aVar.mo17285b(obj3)) == -1 || z0aVar.mo16393f(iMo17285b, x0aVar, false).f67601c != i) {
            yu5 yu5VarM25325h = this.f7564i;
            while (true) {
                if (yu5VarM25325h == null) {
                    yu5 yu5VarM25325h2 = this.f7564i;
                    while (true) {
                        if (yu5VarM25325h2 == null) {
                            jM3095p = m3095p(obj2);
                            if (jM3095p != -1) {
                                break;
                            }
                            jM3095p = this.f7561f;
                            this.f7561f = 1 + jM3095p;
                            if (this.f7564i != null) {
                                break;
                            }
                            this.f7570o = obj2;
                            this.f7571p = jM3095p;
                            break;
                        }
                        int iMo17285b2 = z0aVar.mo17285b(yu5VarM25325h2.f70473b);
                        if (iMo17285b2 != -1 && z0aVar.mo16393f(iMo17285b2, x0aVar, false).f67601c == i) {
                            jM3095p = yu5VarM25325h2.f70478g.f72178a.f46229d;
                            break;
                        }
                        yu5VarM25325h2 = yu5VarM25325h2.m25325h();
                    }
                } else {
                    if (yu5VarM25325h.f70473b.equals(obj2)) {
                        jM3095p = yu5VarM25325h.f70478g.f72178a.f46229d;
                        break;
                    }
                    yu5VarM25325h = yu5VarM25325h.m25325h();
                }
            }
        } else {
            jM3095p = this.f7571p;
        }
        z0aVar.mo23250g(obj2, x0aVar);
        int i2 = x0aVar.f67601c;
        y0a y0aVar = this.f7557b;
        z0aVar.m25397n(i2, y0aVar);
        boolean z = false;
        for (int iMo17285b3 = z0aVar.mo17285b(obj); iMo17285b3 >= y0aVar.f69075l; iMo17285b3--) {
            z0aVar.mo16393f(iMo17285b3, x0aVar, true);
            boolean z2 = x0aVar.f67605g.f46841a > 0;
            z |= z2;
            if (x0aVar.m24225c(x0aVar.f67602d) != -1) {
                obj2 = x0aVar.f67600b;
                obj2.getClass();
            }
            if (z && (!z2 || x0aVar.f67602d != 0)) {
                break;
            }
        }
        return m3080n(z0aVar, obj2, j, jM3095p, this.f7557b, this.f7556a);
    }

    /* JADX INFO: renamed from: p */
    public final long m3095p(Object obj) {
        for (int i = 0; i < this.f7572q.size(); i++) {
            yu5 yu5Var = (yu5) this.f7572q.get(i);
            if (yu5Var.f70473b.equals(obj)) {
                return yu5Var.f70478g.f72178a.f46229d;
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: q */
    public final int m3096q(z0a z0aVar) {
        z0a z0aVar2;
        yu5 yu5VarM25325h = this.f7564i;
        if (yu5VarM25325h == null) {
            return 0;
        }
        int iMo17285b = z0aVar.mo17285b(yu5VarM25325h.f70473b);
        while (true) {
            z0aVar2 = z0aVar;
            iMo17285b = z0aVar2.m25394d(iMo17285b, this.f7556a, this.f7557b, this.f7562g, this.f7563h);
            while (true) {
                yu5VarM25325h.getClass();
                if (yu5VarM25325h.m25325h() == null || yu5VarM25325h.f70478g.f72186i) {
                    break;
                }
                yu5VarM25325h = yu5VarM25325h.m25325h();
            }
            yu5 yu5VarM25325h2 = yu5VarM25325h.m25325h();
            if (iMo17285b == -1 || yu5VarM25325h2 == null || z0aVar2.mo17285b(yu5VarM25325h2.f70473b) != iMo17285b) {
                break;
            }
            yu5VarM25325h = yu5VarM25325h2;
            z0aVar = z0aVar2;
        }
        int iM3093m = m3093m(yu5VarM25325h);
        yu5VarM25325h.f70478g = m3088h(z0aVar2, yu5VarM25325h.f70478g);
        return iM3093m;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00ca  */
    /* JADX INFO: renamed from: r */
    public final int m3097r(z0a z0aVar, long j, long j2, long j3) {
        long j4;
        int i;
        zu5 zu5VarM25791b;
        int i2;
        yu5 yu5VarM25325h = this.f7564i;
        yu5 yu5Var = null;
        while (yu5VarM25325h != null) {
            zu5 zu5Var = yu5VarM25325h.f70478g;
            if (yu5Var != null) {
                zu5 zu5VarM3083c = m3083c(z0aVar, yu5Var, j);
                if (zu5VarM3083c != null) {
                    long j5 = zu5VarM3083c.f72179b;
                    jv5 jv5Var = zu5Var.f72178a;
                    long j6 = zu5Var.f72180c;
                    j4 = -9223372036854775807L;
                    long j7 = zu5Var.f72179b;
                    i = 0;
                    if (jv5Var.equals(zu5VarM3083c.f72178a)) {
                        if (j7 != j5) {
                            if (j6 != -9223372036854775807L) {
                                long j8 = zu5VarM3083c.f72180c;
                                if (j8 != -9223372036854775807L) {
                                    if (Math.abs((j5 - j8) - (j7 - j6)) >= 5000000) {
                                    }
                                }
                            }
                        }
                        zu5VarM25791b = j7 != j5 ? zu5VarM3083c.m25791b(j7, j6) : zu5VarM3083c;
                    }
                }
                return m3093m(yu5Var);
            }
            zu5VarM25791b = m3088h(z0aVar, zu5Var);
            j4 = -9223372036854775807L;
            i = 0;
            long j9 = zu5VarM25791b.f72183f;
            long j10 = zu5Var.f72181d;
            long j11 = zu5Var.f72183f;
            yu5VarM25325h.f70478g = zu5VarM25791b.m25790a(j10);
            if (j11 != j9) {
                yu5VarM25325h.m25343z();
                long jM25342y = j9 == j4 ? Long.MAX_VALUE : yu5VarM25325h.m25342y(j9);
                int i3 = 1;
                int i4 = (yu5VarM25325h != this.f7565j || yu5VarM25325h.f70478g.f72185h || (j2 != Long.MIN_VALUE && j2 < jM25342y)) ? i : 1;
                int i5 = (yu5VarM25325h != this.f7566k || (j3 != Long.MIN_VALUE && j3 < jM25342y)) ? i : 1;
                int iM3093m = m3093m(yu5VarM25325h);
                if (iM3093m != 0) {
                    return iM3093m;
                }
                if (j11 == j4 && zu5Var.f72182e == Long.MIN_VALUE) {
                    long j12 = zu5VarM25791b.f72182e;
                    if (j12 == j4 || j12 == Long.MIN_VALUE) {
                        i2 = i;
                    } else {
                        i2 = 1;
                    }
                } else {
                    i2 = i;
                }
                if (i4 == 0 || (j11 == j4 && i2 == 0)) {
                    i3 = i;
                }
                return i5 != 0 ? i3 | 2 : i3;
            }
            yu5Var = yu5VarM25325h;
            yu5VarM25325h = yu5VarM25325h.m25325h();
        }
        return 0;
    }
}
