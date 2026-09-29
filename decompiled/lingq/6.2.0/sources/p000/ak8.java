package p000;

import androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h;
import androidx.constraintlayout.core.widgets.analyzer.C0466a;
import androidx.constraintlayout.core.widgets.analyzer.C0468c;
import androidx.constraintlayout.core.widgets.analyzer.C0470e;
import androidx.constraintlayout.core.widgets.analyzer.C0472g;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ak8 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0473h f775a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f776b = new ArrayList();

    public ak8(AbstractC0473h abstractC0473h) {
        this.f775a = null;
        this.f775a = abstractC0473h;
    }

    /* JADX INFO: renamed from: c */
    public static long m529c(C0466a c0466a, long j) {
        AbstractC0473h abstractC0473h = c0466a.f5335d;
        ArrayList arrayList = c0466a.f5342k;
        if (abstractC0473h instanceof C0468c) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            nb2 nb2Var = (nb2) arrayList.get(i);
            if (nb2Var instanceof C0466a) {
                C0466a c0466a2 = (C0466a) nb2Var;
                if (c0466a2.f5335d != abstractC0473h) {
                    jMin = Math.min(jMin, m529c(c0466a2, ((long) c0466a2.f5337f) + j));
                }
            }
        }
        C0466a c0466a3 = abstractC0473h.f5358i;
        C0466a c0466a4 = abstractC0473h.f5357h;
        if (c0466a != c0466a3) {
            return jMin;
        }
        long jMo1928j = j - abstractC0473h.mo1928j();
        return Math.min(Math.min(jMin, m529c(c0466a4, jMo1928j)), jMo1928j - ((long) c0466a4.f5337f));
    }

    /* JADX INFO: renamed from: d */
    public static long m530d(C0466a c0466a, long j) {
        AbstractC0473h abstractC0473h = c0466a.f5335d;
        ArrayList arrayList = c0466a.f5342k;
        if (abstractC0473h instanceof C0468c) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            nb2 nb2Var = (nb2) arrayList.get(i);
            if (nb2Var instanceof C0466a) {
                C0466a c0466a2 = (C0466a) nb2Var;
                if (c0466a2.f5335d != abstractC0473h) {
                    jMax = Math.max(jMax, m530d(c0466a2, ((long) c0466a2.f5337f) + j));
                }
            }
        }
        C0466a c0466a3 = abstractC0473h.f5357h;
        C0466a c0466a4 = abstractC0473h.f5358i;
        if (c0466a != c0466a3) {
            return jMax;
        }
        long jMo1928j = abstractC0473h.mo1928j() + j;
        return Math.max(Math.max(jMax, m530d(c0466a4, jMo1928j)), jMo1928j - ((long) c0466a4.f5337f));
    }

    /* JADX INFO: renamed from: a */
    public final void m531a(AbstractC0473h abstractC0473h) {
        this.f776b.add(abstractC0473h);
    }

    /* JADX INFO: renamed from: b */
    public final long m532b(wj1 wj1Var, int i) {
        float f;
        long j;
        AbstractC0473h abstractC0473h = this.f775a;
        if (!(abstractC0473h instanceof mp0) ? i != 0 ? (abstractC0473h instanceof C0472g) : (abstractC0473h instanceof C0470e) : ((mp0) abstractC0473h).f5355f == i) {
            return 0L;
        }
        C0466a c0466a = (i == 0 ? wj1Var.f65464d : wj1Var.f65466e).f5357h;
        C0466a c0466a2 = (i == 0 ? wj1Var.f65464d : wj1Var.f65466e).f5358i;
        C0466a c0466a3 = abstractC0473h.f5357h;
        C0466a c0466a4 = abstractC0473h.f5357h;
        C0466a c0466a5 = abstractC0473h.f5358i;
        boolean zContains = c0466a3.f5343l.contains(c0466a);
        boolean zContains2 = c0466a5.f5343l.contains(c0466a2);
        long jMo1928j = abstractC0473h.mo1928j();
        if (!zContains || !zContains2) {
            if (zContains) {
                return Math.max(m530d(c0466a4, c0466a4.f5337f), ((long) c0466a4.f5337f) + jMo1928j);
            }
            if (zContains2) {
                return Math.max(-m529c(c0466a5, c0466a5.f5337f), ((long) (-c0466a5.f5337f)) + jMo1928j);
            }
            return (abstractC0473h.mo1928j() + ((long) c0466a4.f5337f)) - ((long) c0466a5.f5337f);
        }
        long jM530d = m530d(c0466a4, 0L);
        long jM529c = m529c(c0466a5, 0L);
        long j2 = jM530d - jMo1928j;
        int i2 = c0466a5.f5337f;
        if (j2 >= (-i2)) {
            j2 += (long) i2;
        }
        long j3 = c0466a4.f5337f;
        long j4 = ((-jM529c) - jMo1928j) - j3;
        if (j4 >= j3) {
            j4 -= j3;
        }
        vj1 vj1Var = abstractC0473h.f5351b;
        if (i == 0) {
            f = vj1Var.f65467e0;
        } else if (i == 1) {
            f = vj1Var.f65469f0;
        } else {
            vj1Var.getClass();
            f = -1.0f;
        }
        if (f > 0.0f) {
            j = (long) ((j2 / (1.0f - f)) + (j4 / f));
        } else {
            j = 0;
        }
        float f2 = j;
        return (((long) c0466a4.f5337f) + ((((long) ((f2 * f) + 0.5f)) + jMo1928j) + ((long) AbstractC3393o1.m17726a(1.0f, f, f2, 0.5f)))) - ((long) c0466a5.f5337f);
    }
}
