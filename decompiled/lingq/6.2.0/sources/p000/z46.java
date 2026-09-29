package p000;

import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class z46 {

    /* JADX INFO: renamed from: a */
    public C3419on f70877a;

    /* JADX INFO: renamed from: b */
    public wa3 f70878b;

    /* JADX INFO: renamed from: c */
    public int f70879c;

    /* JADX INFO: renamed from: d */
    public boolean f70880d;

    /* JADX INFO: renamed from: e */
    public int f70881e;

    /* JADX INFO: renamed from: f */
    public int f70882f;

    /* JADX INFO: renamed from: g */
    public List f70883g;

    /* JADX INFO: renamed from: h */
    public m20 f70884h;

    /* JADX INFO: renamed from: i */
    public fz5 f70885i;

    /* JADX INFO: renamed from: k */
    public fb2 f70887k;

    /* JADX INFO: renamed from: l */
    public vx9 f70888l;

    /* JADX INFO: renamed from: m */
    public w41 f70889m;

    /* JADX INFO: renamed from: n */
    public LayoutDirection f70890n;

    /* JADX INFO: renamed from: o */
    public rw9 f70891o;

    /* JADX INFO: renamed from: r */
    public y46 f70894r;

    /* JADX INFO: renamed from: s */
    public long f70895s;

    /* JADX INFO: renamed from: j */
    public long f70886j = m54.f50600a;

    /* JADX INFO: renamed from: p */
    public int f70892p = -1;

    /* JADX INFO: renamed from: q */
    public int f70893q = -1;

    public z46(C3419on c3419on, vx9 vx9Var, wa3 wa3Var, int i, boolean z, int i2, int i3, List list, m20 m20Var) {
        this.f70877a = c3419on;
        this.f70878b = wa3Var;
        this.f70879c = i;
        this.f70880d = z;
        this.f70881e = i2;
        this.f70882f = i3;
        this.f70883g = list;
        this.f70884h = m20Var;
        this.f70888l = vx9Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m25450a(int i, LayoutDirection layoutDirection) {
        int i2 = this.f70892p;
        int i3 = this.f70893q;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jM10423a = dk1.m10423a(0, i, 0, Integer.MAX_VALUE);
        if (this.f70882f > 1) {
            jM10423a = m25457h(jM10423a, layoutDirection);
        }
        int iM24773k = xwc.m24773k(m25451b(jM10423a, layoutDirection).f66380e);
        int iM3802j = bk1.m3802j(jM10423a);
        if (iM24773k < iM3802j) {
            iM24773k = iM3802j;
        }
        this.f70892p = i;
        this.f70893q = iM24773k;
        return iM24773k;
    }

    /* JADX INFO: renamed from: b */
    public final w46 m25451b(long j, LayoutDirection layoutDirection) {
        w41 w41VarM25454e = m25454e(layoutDirection);
        long jM24361r = x74.m24361r(j, this.f70880d, this.f70879c, w41VarM25454e.mo13026c());
        boolean z = this.f70880d;
        int i = this.f70879c;
        int i2 = this.f70881e;
        return new w46(w41VarM25454e, jM24361r, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m25452c(long j, LayoutDirection layoutDirection) {
        this.f70895s = (this.f70895s << 2) | 3;
        long jM25457h = this.f70882f > 1 ? m25457h(j, layoutDirection) : j;
        rw9 rw9Var = this.f70891o;
        if (rw9Var != null) {
            w46 w46Var = rw9Var.f59976b;
            qw9 qw9Var = rw9Var.f59975a;
            if (!w46Var.f66376a.mo13024a()) {
                LayoutDirection layoutDirection2 = qw9Var.f58302h;
                long j2 = qw9Var.f58304j;
                if (layoutDirection == layoutDirection2 && (bk1.m3795c(jM25457h, j2) || (bk1.m3801i(jM25457h) == bk1.m3801i(j2) && bk1.m3803k(jM25457h) == bk1.m3803k(j2) && bk1.m3800h(jM25457h) >= w46Var.f66380e && !w46Var.f66378c))) {
                    rw9 rw9Var2 = this.f70891o;
                    rw9Var2.getClass();
                    if (bk1.m3795c(jM25457h, rw9Var2.f59975a.f58304j)) {
                        return false;
                    }
                    rw9 rw9Var3 = this.f70891o;
                    rw9Var3.getClass();
                    this.f70891o = m25456g(layoutDirection, jM25457h, rw9Var3.f59976b);
                    return true;
                }
            }
        }
        m20 m20Var = this.f70884h;
        if (m20Var != null) {
            this.f70890n = layoutDirection;
            long j3 = this.f70888l.f66065a.f42265b;
            if (this.f70894r == null) {
                this.f70894r = new y46(this);
            }
            y46 y46Var = this.f70894r;
            y46Var.getClass();
            float fMo903F0 = y46Var.mo903F0(m20Var.f50444c);
            float fMo903F1 = y46Var.mo903F0(m20Var.f50442a);
            float fMo903F2 = y46Var.mo903F0(m20Var.f50443b);
            float f = 2.0f;
            float f2 = (fMo903F1 + fMo903F2) / 2.0f;
            float f3 = fMo903F2;
            float f4 = fMo903F1;
            while (f3 - f4 >= fMo903F0) {
                float f5 = f;
                float f6 = f3;
                if (m20.m16600a(y46Var.m24937b(j, y46Var.mo904N(f2)))) {
                    f3 = f2;
                } else {
                    f4 = f2;
                    f3 = f6;
                }
                f2 = (f4 + f3) / f5;
                f = f5;
            }
            float fFloor = (((float) Math.floor((f4 - fMo903F1) / fMo903F0)) * fMo903F0) + fMo903F1;
            float f7 = fMo903F0 + fFloor;
            if (f7 <= fMo903F2 && !m20.m16600a(y46Var.m24937b(j, y46Var.mo904N(f7)))) {
                fFloor = f7;
            }
            long jMo904N = y46Var.mo904N(fFloor);
            if (zx9.m25849d(jMo904N)) {
                jMo904N = a56.m124a(j3, jMo904N);
            }
            long j4 = jMo904N;
            if (this.f70894r == null) {
                this.f70894r = new y46(this);
            }
            y46 y46Var2 = this.f70894r;
            y46Var2.getClass();
            rw9 rw9Var4 = y46Var2.f69277a;
            if (rw9Var4 != null) {
                qw9 qw9Var2 = rw9Var4.f59975a;
                if (zx9.m25846a(j4, qw9Var2.f58296b.f66065a.f42265b) && qw9Var2.f58300f == this.f70879c) {
                    this.f70891o = rw9Var4;
                    return true;
                }
            }
            m25455f(vx9.m23584b(this.f70888l, 0L, j4, null, null, null, 0L, null, null, 0, 0L, null, 16777213));
        }
        this.f70891o = m25456g(layoutDirection, jM25457h, m25451b(jM25457h, layoutDirection));
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m25453d(fb2 fb2Var) {
        long jM16632a;
        fb2 fb2Var2 = this.f70887k;
        if (fb2Var != null) {
            int i = m54.f50601b;
            jM16632a = m54.m16632a(fb2Var.mo594a(), fb2Var.mo597d0());
        } else {
            jM16632a = m54.f50600a;
        }
        if (fb2Var2 == null) {
            this.f70887k = fb2Var;
            this.f70886j = jM16632a;
            return;
        }
        if (fb2Var == null || this.f70886j != jM16632a) {
            this.f70887k = fb2Var;
            this.f70886j = jM16632a;
            this.f70895s = (this.f70895s << 2) | 1;
            this.f70889m = null;
            this.f70891o = null;
            this.f70893q = -1;
            this.f70892p = -1;
            this.f70894r = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final w41 m25454e(LayoutDirection layoutDirection) {
        w41 w41Var = this.f70889m;
        if (w41Var == null || layoutDirection != this.f70890n || w41Var.mo13024a()) {
            this.f70890n = layoutDirection;
            C3419on c3419on = this.f70877a;
            vx9 vx9VarM23615W = vz1.m23615W(this.f70888l, layoutDirection);
            fb2 fb2Var = this.f70887k;
            fb2Var.getClass();
            wa3 wa3Var = this.f70878b;
            List list = this.f70883g;
            if (list == null) {
                list = EmptyList.f47638a;
            }
            w41Var = new w41(c3419on, vx9VarM23615W, list, fb2Var, wa3Var);
        }
        this.f70889m = w41Var;
        return w41Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m25455f(vx9 vx9Var) {
        boolean zM23587d = vx9Var.m23587d(this.f70888l);
        this.f70888l = vx9Var;
        if (zM23587d) {
            return;
        }
        this.f70895s <<= 2;
        this.f70889m = null;
        this.f70891o = null;
        this.f70893q = -1;
        this.f70892p = -1;
    }

    /* JADX INFO: renamed from: g */
    public final rw9 m25456g(LayoutDirection layoutDirection, long j, w46 w46Var) {
        float fMin = Math.min(w46Var.f66376a.mo13026c(), w46Var.f66379d);
        C3419on c3419on = this.f70877a;
        vx9 vx9Var = this.f70888l;
        List list = this.f70883g;
        if (list == null) {
            list = EmptyList.f47638a;
        }
        int i = this.f70881e;
        boolean z = this.f70880d;
        int i2 = this.f70879c;
        fb2 fb2Var = this.f70887k;
        fb2Var.getClass();
        return new rw9(new qw9(c3419on, vx9Var, list, i, z, i2, fb2Var, layoutDirection, this.f70878b, j), w46Var, dk1.m10426d(j, (((long) xwc.m24773k(fMin)) << 32) | (((long) xwc.m24773k(w46Var.f66380e)) & 4294967295L)));
    }

    /* JADX INFO: renamed from: h */
    public final long m25457h(long j, LayoutDirection layoutDirection) {
        fz5 fz5Var = this.f70885i;
        vx9 vx9Var = this.f70888l;
        fb2 fb2Var = this.f70887k;
        fb2Var.getClass();
        fz5 fz5VarM22005s = te1.m22005s(fz5Var, layoutDirection, vx9Var, fb2Var, this.f70878b);
        this.f70885i = fz5VarM22005s;
        return fz5VarM22005s.m12251a(this.f70882f, j);
    }

    public final String toString() {
        qw9 qw9Var;
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object bk1Var = "null";
        sb.append(this.f70891o != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) m54.m16633b(this.f70886j));
        sb.append(", history=");
        sb.append(this.f70895s);
        sb.append(", constraints=");
        rw9 rw9Var = this.f70891o;
        if (rw9Var != null && (qw9Var = rw9Var.f59975a) != null) {
            bk1Var = new bk1(qw9Var.f58304j);
        }
        sb.append(bk1Var);
        sb.append(')');
        return sb.toString();
    }
}
