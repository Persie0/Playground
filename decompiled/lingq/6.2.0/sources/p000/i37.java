package p000;

import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class i37 {

    /* JADX INFO: renamed from: a */
    public String f43425a;

    /* JADX INFO: renamed from: b */
    public vx9 f43426b;

    /* JADX INFO: renamed from: c */
    public wa3 f43427c;

    /* JADX INFO: renamed from: d */
    public int f43428d;

    /* JADX INFO: renamed from: e */
    public boolean f43429e;

    /* JADX INFO: renamed from: f */
    public int f43430f;

    /* JADX INFO: renamed from: g */
    public int f43431g;

    /* JADX INFO: renamed from: i */
    public fb2 f43433i;

    /* JADX INFO: renamed from: j */
    public C3300lj f43434j;

    /* JADX INFO: renamed from: k */
    public boolean f43435k;

    /* JADX INFO: renamed from: m */
    public fz5 f43437m;

    /* JADX INFO: renamed from: n */
    public h37 f43438n;

    /* JADX INFO: renamed from: o */
    public LayoutDirection f43439o;

    /* JADX INFO: renamed from: s */
    public long f43443s;

    /* JADX INFO: renamed from: h */
    public long f43432h = m54.f50600a;

    /* JADX INFO: renamed from: l */
    public long f43436l = 0;

    /* JADX INFO: renamed from: p */
    public long f43440p = dk1.m10430h(0, 0, 0, 0);

    /* JADX INFO: renamed from: q */
    public int f43441q = -1;

    /* JADX INFO: renamed from: r */
    public int f43442r = -1;

    public i37(String str, vx9 vx9Var, wa3 wa3Var, int i, boolean z, int i2, int i3) {
        this.f43425a = str;
        this.f43426b = vx9Var;
        this.f43427c = wa3Var;
        this.f43428d = i;
        this.f43429e = z;
        this.f43430f = i2;
        this.f43431g = i3;
    }

    /* JADX INFO: renamed from: f */
    public static long m13643f(i37 i37Var, long j, LayoutDirection layoutDirection) {
        vx9 vx9Var = i37Var.f43426b;
        fz5 fz5Var = i37Var.f43437m;
        fb2 fb2Var = i37Var.f43433i;
        fb2Var.getClass();
        fz5 fz5VarM22005s = te1.m22005s(fz5Var, layoutDirection, vx9Var, fb2Var, i37Var.f43427c);
        i37Var.f43437m = fz5VarM22005s;
        return fz5VarM22005s.m12251a(i37Var.f43431g, j);
    }

    /* JADX INFO: renamed from: a */
    public final int m13644a(int i, LayoutDirection layoutDirection) {
        int i2 = this.f43441q;
        int i3 = this.f43442r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jM10423a = dk1.m10423a(0, i, 0, Integer.MAX_VALUE);
        if (this.f43431g > 1) {
            jM10423a = m13643f(this, jM10423a, layoutDirection);
        }
        h37 h37VarM13648e = m13648e(layoutDirection);
        long jM24361r = x74.m24361r(jM10423a, this.f43429e, this.f43428d, h37VarM13648e.mo13026c());
        boolean z = this.f43429e;
        int i4 = this.f43428d;
        int i5 = this.f43430f;
        int iM24773k = xwc.m24773k(new C3300lj((C3462pj) h37VarM13648e, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jM24361r).m16239b());
        int iM3802j = bk1.m3802j(jM10423a);
        if (iM24773k < iM3802j) {
            iM24773k = iM3802j;
        }
        this.f43441q = i;
        this.f43442r = iM24773k;
        return iM24773k;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13645b(long j, LayoutDirection layoutDirection) {
        h37 h37Var;
        this.f43443s = (this.f43443s << 2) | 3;
        boolean z = true;
        long jM13643f = this.f43431g > 1 ? m13643f(this, j, layoutDirection) : j;
        C3300lj c3300lj = this.f43434j;
        boolean z2 = false;
        if (c3300lj != null && (h37Var = this.f43438n) != null && !h37Var.mo13024a() && layoutDirection == this.f43439o && (bk1.m3795c(jM13643f, this.f43440p) || (bk1.m3801i(jM13643f) == bk1.m3801i(this.f43440p) && bk1.m3803k(jM13643f) == bk1.m3803k(this.f43440p) && bk1.m3800h(jM13643f) >= c3300lj.m16239b() && !c3300lj.f49728d.f56917d))) {
            if (!bk1.m3795c(jM13643f, this.f43440p)) {
                C3300lj c3300lj2 = this.f43434j;
                c3300lj2.getClass();
                long jM10426d = dk1.m10426d(jM13643f, (((long) xwc.m24773k(Math.min(c3300lj2.f49725a.f56292i.m13432c(), c3300lj2.m16241d()))) << 32) | (((long) xwc.m24773k(c3300lj2.m16239b())) & 4294967295L));
                this.f43436l = jM10426d;
                if (this.f43428d == 3 || (((int) (jM10426d >> 32)) >= c3300lj2.m16241d() && ((int) (4294967295L & jM10426d)) >= c3300lj2.m16239b())) {
                    z = false;
                }
                this.f43435k = z;
                this.f43440p = jM13643f;
            }
            return false;
        }
        h37 h37VarM13648e = m13648e(layoutDirection);
        long jM24361r = x74.m24361r(jM13643f, this.f43429e, this.f43428d, h37VarM13648e.mo13026c());
        boolean z3 = this.f43429e;
        int i = this.f43428d;
        int i2 = this.f43430f;
        C3300lj c3300lj3 = new C3300lj((C3462pj) h37VarM13648e, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jM24361r);
        this.f43440p = jM13643f;
        long jM10426d2 = dk1.m10426d(jM13643f, (((long) xwc.m24773k(c3300lj3.m16239b())) & 4294967295L) | (((long) xwc.m24773k(c3300lj3.m16241d())) << 32));
        this.f43436l = jM10426d2;
        if (this.f43428d != 3 && (((int) (jM10426d2 >> 32)) < c3300lj3.m16241d() || ((int) (jM10426d2 & 4294967295L)) < c3300lj3.m16239b())) {
            z2 = true;
        }
        this.f43435k = z2;
        this.f43434j = c3300lj3;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m13646c() {
        this.f43434j = null;
        this.f43438n = null;
        this.f43439o = null;
        this.f43441q = -1;
        this.f43442r = -1;
        this.f43440p = dk1.m10430h(0, 0, 0, 0);
        this.f43436l = 0L;
        this.f43435k = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m13647d(fb2 fb2Var) {
        long jM16632a;
        fb2 fb2Var2 = this.f43433i;
        if (fb2Var != null) {
            int i = m54.f50601b;
            jM16632a = m54.m16632a(fb2Var.mo594a(), fb2Var.mo597d0());
        } else {
            jM16632a = m54.f50600a;
        }
        if (fb2Var2 == null) {
            this.f43433i = fb2Var;
            this.f43432h = jM16632a;
        } else if (fb2Var == null || this.f43432h != jM16632a) {
            this.f43433i = fb2Var;
            this.f43432h = jM16632a;
            this.f43443s = (this.f43443s << 2) | 1;
            m13646c();
        }
    }

    /* JADX INFO: renamed from: e */
    public final h37 m13648e(LayoutDirection layoutDirection) {
        h37 c3462pj = this.f43438n;
        if (c3462pj == null || layoutDirection != this.f43439o || c3462pj.mo13024a()) {
            this.f43439o = layoutDirection;
            String str = this.f43425a;
            vx9 vx9VarM23615W = vz1.m23615W(this.f43426b, layoutDirection);
            fb2 fb2Var = this.f43433i;
            fb2Var.getClass();
            wa3 wa3Var = this.f43427c;
            EmptyList emptyList = EmptyList.f47638a;
            c3462pj = new C3462pj(str, vx9VarM23615W, emptyList, emptyList, wa3Var, fb2Var);
        }
        this.f43438n = c3462pj;
        return c3462pj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f43434j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) m54.m16633b(this.f43432h));
        sb.append(", history=");
        return wq1.m24113i(this.f43443s, ", constraints=$)", sb);
    }
}
