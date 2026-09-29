package p000;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class z0a {

    /* JADX INFO: renamed from: a */
    public static final w0a f70734a = new w0a();

    static {
        uma.m22828w(0);
        uma.m22828w(1);
        uma.m22828w(2);
    }

    /* JADX INFO: renamed from: a */
    public int mo23247a(boolean z) {
        return m25398p() ? -1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo17285b(Object obj);

    /* JADX INFO: renamed from: c */
    public int mo23248c(boolean z) {
        if (m25398p()) {
            return -1;
        }
        return mo17288o() - 1;
    }

    /* JADX INFO: renamed from: d */
    public final int m25394d(int i, x0a x0aVar, y0a y0aVar, int i2, boolean z) {
        int i3 = mo16393f(i, x0aVar, false).f67601c;
        if (mo39m(i3, y0aVar, 0L).f69076m != i) {
            return i + 1;
        }
        int iMo23249e = mo23249e(i3, i2, z);
        if (iMo23249e == -1) {
            return -1;
        }
        return mo39m(iMo23249e, y0aVar, 0L).f69075l;
    }

    /* JADX INFO: renamed from: e */
    public int mo23249e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo23248c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo23248c(z) ? mo23247a(z) : i + 1;
        }
        uk9.m22770c();
        return 0;
    }

    public boolean equals(Object obj) {
        int iMo23248c;
        if (this != obj) {
            if (obj instanceof z0a) {
                z0a z0aVar = (z0a) obj;
                if (z0aVar.mo17288o() == mo17288o() && z0aVar.mo17286h() == mo17286h()) {
                    y0a y0aVar = new y0a();
                    x0a x0aVar = new x0a();
                    y0a y0aVar2 = new y0a();
                    x0a x0aVar2 = new x0a();
                    for (int i = 0; i < mo17288o(); i++) {
                        if (mo39m(i, y0aVar, 0L).equals(z0aVar.mo39m(i, y0aVar2, 0L))) {
                        }
                    }
                    for (int i2 = 0; i2 < mo17286h(); i2++) {
                        if (mo16393f(i2, x0aVar, true).equals(z0aVar.mo16393f(i2, x0aVar2, true))) {
                        }
                    }
                    int iMo23247a = mo23247a(true);
                    if (iMo23247a == z0aVar.mo23247a(true) && (iMo23248c = mo23248c(true)) == z0aVar.mo23248c(true)) {
                        while (iMo23247a != iMo23248c) {
                            int iMo23249e = mo23249e(iMo23247a, 0, true);
                            if (iMo23249e == z0aVar.mo23249e(iMo23247a, 0, true)) {
                                iMo23247a = iMo23249e;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public abstract x0a mo16393f(int i, x0a x0aVar, boolean z);

    /* JADX INFO: renamed from: g */
    public x0a mo23250g(Object obj, x0a x0aVar) {
        return mo16393f(mo17285b(obj), x0aVar, true);
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo17286h();

    public int hashCode() {
        y0a y0aVar = new y0a();
        x0a x0aVar = new x0a();
        int iMo17288o = mo17288o() + 217;
        for (int i = 0; i < mo17288o(); i++) {
            iMo17288o = (iMo17288o * 31) + mo39m(i, y0aVar, 0L).hashCode();
        }
        int iMo17286h = mo17286h() + (iMo17288o * 31);
        for (int i2 = 0; i2 < mo17286h(); i2++) {
            iMo17286h = (iMo17286h * 31) + mo16393f(i2, x0aVar, true).hashCode();
        }
        int iMo23247a = mo23247a(true);
        while (iMo23247a != -1) {
            iMo17286h = (iMo17286h * 31) + iMo23247a;
            iMo23247a = mo23249e(iMo23247a, 0, true);
        }
        return iMo17286h;
    }

    /* JADX INFO: renamed from: i */
    public final Pair m25395i(y0a y0aVar, x0a x0aVar, int i, long j) {
        Pair pairM25396j = m25396j(y0aVar, x0aVar, i, j, 0L);
        pairM25396j.getClass();
        return pairM25396j;
    }

    /* JADX INFO: renamed from: j */
    public final Pair m25396j(y0a y0aVar, x0a x0aVar, int i, long j, long j2) {
        bna.m3973s(i, mo17288o());
        mo39m(i, y0aVar, j2);
        if (j == -9223372036854775807L) {
            j = y0aVar.f69073j;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = y0aVar.f69075l;
        mo16393f(i2, x0aVar, false);
        while (i2 < y0aVar.f69076m && x0aVar.f67603e != j) {
            int i3 = i2 + 1;
            if (mo16393f(i3, x0aVar, false).f67603e > j) {
                break;
            }
            i2 = i3;
        }
        mo16393f(i2, x0aVar, true);
        long jMin = j - x0aVar.f67603e;
        long j3 = x0aVar.f67602d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = x0aVar.f67600b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    /* JADX INFO: renamed from: k */
    public int mo23251k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo23247a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo23247a(z) ? mo23248c(z) : i - 1;
        }
        uk9.m22770c();
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public abstract Object mo17287l(int i);

    /* JADX INFO: renamed from: m */
    public abstract y0a mo39m(int i, y0a y0aVar, long j);

    /* JADX INFO: renamed from: n */
    public final void m25397n(int i, y0a y0aVar) {
        mo39m(i, y0aVar, 0L);
    }

    /* JADX INFO: renamed from: o */
    public abstract int mo17288o();

    /* JADX INFO: renamed from: p */
    public final boolean m25398p() {
        return mo17288o() == 0;
    }
}
