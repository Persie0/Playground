package p000;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: renamed from: lb */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0789lb extends AbstractC0815ma {

    /* JADX INFO: renamed from: b */
    private AbstractC0803lp f37866b;

    /* JADX INFO: renamed from: c */
    private AbstractC0803lp f37867c;

    /* JADX INFO: renamed from: h */
    private final int m15136h(AbstractC0812ly abstractC0812ly, AbstractC0803lp abstractC0803lp, int i, int i2) {
        int[] iArrMo11875g = mo11875g(i, i2);
        int iM16164aj = abstractC0812ly.m16164aj();
        float f = 1.0f;
        if (iM16164aj != 0) {
            View view = null;
            View view2 = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < iM16164aj; i5++) {
                View viewM16174av = abstractC0812ly.m16174av(i5);
                int iM16136be = AbstractC0812ly.m16136be(viewM16174av);
                if (iM16136be != -1) {
                    int i6 = iM16136be < i4 ? iM16136be : i4;
                    if (iM16136be < i4) {
                        view = viewM16174av;
                    }
                    if (iM16136be > i3) {
                        view2 = viewM16174av;
                        i3 = iM16136be;
                    }
                    i4 = i6;
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(abstractC0803lp.mo15746a(view), abstractC0803lp.mo15746a(view2)) - Math.min(abstractC0803lp.mo15749d(view), abstractC0803lp.mo15749d(view2));
                if (iMax != 0) {
                    f = iMax / ((i3 - i4) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArrMo11875g[0]) > Math.abs(iArrMo11875g[1]) ? iArrMo11875g[0] : iArrMo11875g[1]) / f);
    }

    /* JADX INFO: renamed from: i */
    private final AbstractC0803lp m15137i(AbstractC0812ly abstractC0812ly) {
        AbstractC0803lp abstractC0803lp = this.f37867c;
        if (abstractC0803lp == null || abstractC0803lp.f38877a != abstractC0812ly) {
            this.f37867c = AbstractC0803lp.m15796p(abstractC0812ly);
        }
        return this.f37867c;
    }

    /* JADX INFO: renamed from: j */
    private final AbstractC0803lp m15138j(AbstractC0812ly abstractC0812ly) {
        AbstractC0803lp abstractC0803lp = this.f37866b;
        if (abstractC0803lp == null || abstractC0803lp.f38877a != abstractC0812ly) {
            this.f37866b = AbstractC0803lp.m15798r(abstractC0812ly);
        }
        return this.f37866b;
    }

    /* JADX INFO: renamed from: k */
    private static final int m15139k(View view, AbstractC0803lp abstractC0803lp) {
        return (abstractC0803lp.mo15749d(view) + (abstractC0803lp.mo15747b(view) / 2)) - (abstractC0803lp.mo15755j() + (abstractC0803lp.mo15756k() / 2));
    }

    /* JADX INFO: renamed from: l */
    private static final View m15140l(AbstractC0812ly abstractC0812ly, AbstractC0803lp abstractC0803lp) {
        int iM16164aj = abstractC0812ly.m16164aj();
        View view = null;
        if (iM16164aj == 0) {
            return null;
        }
        int iMo15755j = abstractC0803lp.mo15755j() + (abstractC0803lp.mo15756k() / 2);
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        while (i < iM16164aj) {
            View viewM16174av = abstractC0812ly.m16174av(i);
            int iAbs = Math.abs((abstractC0803lp.mo15749d(viewM16174av) + (abstractC0803lp.mo15747b(viewM16174av) / 2)) - iMo15755j);
            int i3 = iAbs < i2 ? iAbs : i2;
            if (iAbs < i2) {
                view = viewM16174av;
            }
            i++;
            i2 = i3;
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC0815ma
    /* JADX INFO: renamed from: a */
    public int mo11871a(AbstractC0812ly abstractC0812ly, int i, int i2) {
        int iM16165al;
        View viewMo2046b;
        int iM16136be;
        int i3;
        PointF pointFMo1150J;
        int iM15136h;
        int iM15136h2;
        if (!(abstractC0812ly instanceof InterfaceC0824mj) || (iM16165al = abstractC0812ly.m16165al()) == 0 || (viewMo2046b = mo2046b(abstractC0812ly)) == null || (iM16136be = AbstractC0812ly.m16136be(viewMo2046b)) == -1 || (pointFMo1150J = ((InterfaceC0824mj) abstractC0812ly).mo1150J((i3 = iM16165al - 1))) == null) {
            return -1;
        }
        if (abstractC0812ly.mo1162V()) {
            iM15136h = m15136h(abstractC0812ly, m15137i(abstractC0812ly), i, 0);
            if (pointFMo1150J.x < 0.0f) {
                iM15136h = -iM15136h;
            }
        } else {
            iM15136h = 0;
        }
        if (abstractC0812ly.mo1163W()) {
            iM15136h2 = m15136h(abstractC0812ly, m15138j(abstractC0812ly), 0, i2);
            if (pointFMo1150J.y < 0.0f) {
                iM15136h2 = -iM15136h2;
            }
        } else {
            iM15136h2 = 0;
        }
        if (true == abstractC0812ly.mo1163W()) {
            iM15136h = iM15136h2;
        }
        if (iM15136h == 0) {
            return -1;
        }
        int i4 = iM16136be + iM15136h;
        int i5 = i4 >= 0 ? i4 : 0;
        return i5 >= iM16165al ? i3 : i5;
    }

    @Override // p000.AbstractC0815ma
    /* JADX INFO: renamed from: b */
    public final View mo2046b(AbstractC0812ly abstractC0812ly) {
        if (abstractC0812ly.mo1163W()) {
            return m15140l(abstractC0812ly, m15138j(abstractC0812ly));
        }
        if (abstractC0812ly.mo1162V()) {
            return m15140l(abstractC0812ly, m15137i(abstractC0812ly));
        }
        return null;
    }

    @Override // p000.AbstractC0815ma
    /* JADX INFO: renamed from: c */
    public int[] mo11872c(AbstractC0812ly abstractC0812ly, View view) {
        int[] iArr = new int[2];
        if (abstractC0812ly.mo1162V()) {
            iArr[0] = m15139k(view, m15137i(abstractC0812ly));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0812ly.mo1163W()) {
            iArr[1] = m15139k(view, m15138j(abstractC0812ly));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
