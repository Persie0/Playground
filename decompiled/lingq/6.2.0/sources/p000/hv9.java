package p000;

import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hv9 {

    /* JADX INFO: renamed from: a */
    public final C3419on f42995a;

    /* JADX INFO: renamed from: b */
    public final long f42996b;

    /* JADX INFO: renamed from: c */
    public final rw9 f42997c;

    /* JADX INFO: renamed from: d */
    public final mq6 f42998d;

    /* JADX INFO: renamed from: e */
    public final bx9 f42999e;

    /* JADX INFO: renamed from: f */
    public long f43000f;

    /* JADX INFO: renamed from: g */
    public final C3419on f43001g;

    /* JADX INFO: renamed from: h */
    public final vv9 f43002h;

    /* JADX INFO: renamed from: i */
    public final sw9 f43003i;

    public hv9(vv9 vv9Var, mq6 mq6Var, sw9 sw9Var, bx9 bx9Var) {
        C3419on c3419on = vv9Var.f65990a;
        long j = vv9Var.f65991b;
        rw9 rw9Var = sw9Var != null ? sw9Var.f61519a : null;
        this.f42995a = c3419on;
        this.f42996b = j;
        this.f42997c = rw9Var;
        this.f42998d = mq6Var;
        this.f42999e = bx9Var;
        this.f43000f = j;
        this.f43001g = c3419on;
        this.f43002h = vv9Var;
        this.f43003i = sw9Var;
    }

    /* JADX INFO: renamed from: a */
    public final List m13488a(vi3 vi3Var) {
        if (!cx9.m9921c(this.f43000f)) {
            return vz1.m23605K(new hb1("", 0), new a09(cx9.m9924f(this.f43000f), cx9.m9924f(this.f43000f)));
        }
        uo2 uo2Var = (uo2) vi3Var.invoke(this);
        if (uo2Var != null) {
            return vz1.m23604J(uo2Var);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m13489b() {
        rw9 rw9Var = this.f42997c;
        if (rw9Var == null) {
            return null;
        }
        w46 w46Var = rw9Var.f59976b;
        int iM9923e = cx9.m9923e(this.f43000f);
        mq6 mq6Var = this.f42998d;
        return Integer.valueOf(mq6Var.mo13407j(w46Var.m23742c(w46Var.m23743d(mq6Var.mo13411t(iM9923e)), true)));
    }

    /* JADX INFO: renamed from: c */
    public final Integer m13490c() {
        rw9 rw9Var = this.f42997c;
        if (rw9Var == null) {
            return null;
        }
        int iM9924f = cx9.m9924f(this.f43000f);
        mq6 mq6Var = this.f42998d;
        return Integer.valueOf(mq6Var.mo13407j(rw9Var.m20960g(rw9Var.f59976b.m23743d(mq6Var.mo13411t(iM9924f)))));
    }

    /* JADX INFO: renamed from: d */
    public final Integer m13491d() {
        int length;
        rw9 rw9Var = this.f42997c;
        if (rw9Var == null) {
            return null;
        }
        int iM13505r = m13505r();
        while (true) {
            C3419on c3419on = this.f42995a;
            if (iM13505r < c3419on.f54604b.length()) {
                int length2 = this.f43001g.f54604b.length() - 1;
                if (iM13505r <= length2) {
                    length2 = iM13505r;
                }
                long jM20963j = rw9Var.m20963j(length2);
                int i = cx9.f34693c;
                int i2 = (int) (jM20963j & 4294967295L);
                if (i2 > iM13505r) {
                    length = this.f42998d.mo13407j(i2);
                    break;
                }
                iM13505r++;
            } else {
                length = c3419on.f54604b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    /* JADX INFO: renamed from: e */
    public final Integer m13492e() {
        int iMo13407j;
        rw9 rw9Var = this.f42997c;
        if (rw9Var == null) {
            return null;
        }
        for (int iM13505r = m13505r(); iM13505r > 0; iM13505r--) {
            int length = this.f43001g.f54604b.length() - 1;
            if (iM13505r <= length) {
                length = iM13505r;
            }
            long jM20963j = rw9Var.m20963j(length);
            int i = cx9.f34693c;
            int i2 = (int) (jM20963j >> 32);
            if (i2 < iM13505r) {
                iMo13407j = this.f42998d.mo13407j(i2);
                return Integer.valueOf(iMo13407j);
            }
        }
        iMo13407j = 0;
        return Integer.valueOf(iMo13407j);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m13493f() {
        rw9 rw9Var = this.f42997c;
        return (rw9Var != null ? rw9Var.m20961h(m13505r()) : null) != ResolvedTextDirection.Rtl;
    }

    /* JADX INFO: renamed from: g */
    public final int m13494g(rw9 rw9Var, int i) {
        int iM13505r = m13505r();
        bx9 bx9Var = this.f42999e;
        if (bx9Var.f9149a == null) {
            bx9Var.f9149a = Float.valueOf(rw9Var.m20956c(iM13505r).f36620a);
        }
        w46 w46Var = rw9Var.f59976b;
        int iM23743d = w46Var.m23743d(iM13505r) + i;
        if (iM23743d < 0) {
            return 0;
        }
        if (iM23743d >= w46Var.f66381f) {
            return this.f43001g.f54604b.length();
        }
        float fM23741b = w46Var.m23741b(iM23743d) - 1.0f;
        Float f = bx9Var.f9149a;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((m13493f() && fFloatValue >= rw9Var.m20959f(iM23743d)) || (!m13493f() && fFloatValue <= rw9Var.m20958e(iM23743d))) {
            return w46Var.m23742c(iM23743d, true);
        }
        return this.f42998d.mo13407j(w46Var.m23746g((((long) Float.floatToRawIntBits(fM23741b)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    /* JADX INFO: renamed from: h */
    public final int m13495h(sw9 sw9Var, int i) {
        e28 e28VarMo1670Q;
        aq4 aq4Var = sw9Var.f61520b;
        rw9 rw9Var = sw9Var.f61519a;
        if (aq4Var == null) {
            e28VarMo1670Q = e28.f36619e;
        } else {
            aq4 aq4Var2 = sw9Var.f61521c;
            e28VarMo1670Q = aq4Var2 != null ? aq4Var2.mo1670Q(aq4Var, true) : null;
            if (e28VarMo1670Q == null) {
                e28VarMo1670Q = e28.f36619e;
            }
        }
        long j = this.f43002h.f65991b;
        int i2 = cx9.f34693c;
        mq6 mq6Var = this.f42998d;
        e28 e28VarM20956c = rw9Var.m20956c(mq6Var.mo13411t((int) (j & 4294967295L)));
        float f = e28VarM20956c.f36620a;
        return mq6Var.mo13407j(rw9Var.f59976b.m23746g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (e28VarMo1670Q.m10804e() & 4294967295L)) * i) + e28VarM20956c.f36621b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }

    /* JADX INFO: renamed from: i */
    public final void m13496i() {
        bx9 bx9Var = this.f42999e;
        bx9Var.f9149a = null;
        C3419on c3419on = this.f43001g;
        if (c3419on.f54604b.length() > 0) {
            if (m13493f()) {
                m13498k();
                return;
            }
            bx9Var.f9149a = null;
            if (c3419on.f54604b.length() > 0) {
                String str = c3419on.f54604b;
                long j = this.f43000f;
                int i = cx9.f34693c;
                int iM11137r = eh0.m11137r((int) (j & 4294967295L), str);
                if (iM11137r != -1) {
                    m13504q(iM11137r, iM11137r);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m13497j() {
        this.f42999e.f9149a = null;
        C3419on c3419on = this.f43001g;
        String str = c3419on.f54604b;
        String str2 = c3419on.f54604b;
        if (str.length() > 0) {
            int iM15953p = l70.m15953p(str2, cx9.m9923e(this.f43000f));
            if (iM15953p == cx9.m9923e(this.f43000f) && iM15953p != str2.length()) {
                iM15953p = l70.m15953p(str2, iM15953p + 1);
            }
            m13504q(iM15953p, iM15953p);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m13498k() {
        this.f42999e.f9149a = null;
        C3419on c3419on = this.f43001g;
        if (c3419on.f54604b.length() > 0) {
            String str = c3419on.f54604b;
            long j = this.f43000f;
            int i = cx9.f34693c;
            int iM11139t = eh0.m11139t((int) (j & 4294967295L), str);
            if (iM11139t != -1) {
                m13504q(iM11139t, iM11139t);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m13499l() {
        this.f42999e.f9149a = null;
        C3419on c3419on = this.f43001g;
        String str = c3419on.f54604b;
        String str2 = c3419on.f54604b;
        if (str.length() > 0) {
            int iM15954q = l70.m15954q(str2, cx9.m9924f(this.f43000f));
            if (iM15954q == cx9.m9924f(this.f43000f) && iM15954q != 0) {
                iM15954q = l70.m15954q(str2, iM15954q - 1);
            }
            m13504q(iM15954q, iM15954q);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m13500m() {
        bx9 bx9Var = this.f42999e;
        bx9Var.f9149a = null;
        C3419on c3419on = this.f43001g;
        if (c3419on.f54604b.length() > 0) {
            if (!m13493f()) {
                m13498k();
                return;
            }
            bx9Var.f9149a = null;
            if (c3419on.f54604b.length() > 0) {
                String str = c3419on.f54604b;
                long j = this.f43000f;
                int i = cx9.f34693c;
                int iM11137r = eh0.m11137r((int) (j & 4294967295L), str);
                if (iM11137r != -1) {
                    m13504q(iM11137r, iM11137r);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m13501n() {
        Integer numM13489b;
        this.f42999e.f9149a = null;
        if (this.f43001g.f54604b.length() <= 0 || (numM13489b = m13489b()) == null) {
            return;
        }
        int iIntValue = numM13489b.intValue();
        m13504q(iIntValue, iIntValue);
    }

    /* JADX INFO: renamed from: o */
    public final void m13502o() {
        Integer numM13490c;
        this.f42999e.f9149a = null;
        if (this.f43001g.f54604b.length() <= 0 || (numM13490c = m13490c()) == null) {
            return;
        }
        int iIntValue = numM13490c.intValue();
        m13504q(iIntValue, iIntValue);
    }

    /* JADX INFO: renamed from: p */
    public final void m13503p() {
        if (this.f43001g.f54604b.length() > 0) {
            int i = cx9.f34693c;
            this.f43000f = eh0.m11127g((int) (this.f42996b >> 32), (int) (this.f43000f & 4294967295L));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m13504q(int i, int i2) {
        this.f43000f = eh0.m11127g(i, i2);
    }

    /* JADX INFO: renamed from: r */
    public final int m13505r() {
        long j = this.f43000f;
        int i = cx9.f34693c;
        return this.f42998d.mo13411t((int) (j & 4294967295L));
    }
}
