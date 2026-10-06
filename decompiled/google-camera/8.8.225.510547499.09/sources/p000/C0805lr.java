package p000;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: renamed from: lr */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0805lr extends AbstractC0815ma {

    /* JADX INFO: renamed from: b */
    private AbstractC0803lp f39053b;

    /* JADX INFO: renamed from: c */
    private AbstractC0803lp f39054c;

    /* JADX INFO: renamed from: h */
    private final AbstractC0803lp m15899h(AbstractC0812ly abstractC0812ly) {
        AbstractC0803lp abstractC0803lp = this.f39054c;
        if (abstractC0803lp == null || abstractC0803lp.f38877a != abstractC0812ly) {
            this.f39054c = AbstractC0803lp.m15796p(abstractC0812ly);
        }
        return this.f39054c;
    }

    /* JADX INFO: renamed from: i */
    private final AbstractC0803lp m15900i(AbstractC0812ly abstractC0812ly) {
        AbstractC0803lp abstractC0803lp = this.f39053b;
        if (abstractC0803lp == null || abstractC0803lp.f38877a != abstractC0812ly) {
            this.f39053b = AbstractC0803lp.m15798r(abstractC0812ly);
        }
        return this.f39053b;
    }

    /* JADX INFO: renamed from: j */
    private static final int m15901j(View view, AbstractC0803lp abstractC0803lp) {
        return (abstractC0803lp.mo15749d(view) + (abstractC0803lp.mo15747b(view) / 2)) - (abstractC0803lp.mo15755j() + (abstractC0803lp.mo15756k() / 2));
    }

    /* JADX INFO: renamed from: k */
    private static final View m15902k(AbstractC0812ly abstractC0812ly, AbstractC0803lp abstractC0803lp) {
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

    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC0815ma
    /* JADX INFO: renamed from: a */
    public final int mo11871a(AbstractC0812ly abstractC0812ly, int i, int i2) {
        boolean z;
        PointF pointFMo1150J;
        int iM16165al = abstractC0812ly.m16165al();
        if (iM16165al == 0) {
            return -1;
        }
        View view = null;
        AbstractC0803lp abstractC0803lpM15900i = abstractC0812ly.mo1163W() ? m15900i(abstractC0812ly) : abstractC0812ly.mo1162V() ? m15899h(abstractC0812ly) : null;
        if (abstractC0803lpM15900i == null) {
            return -1;
        }
        int iM16164aj = abstractC0812ly.m16164aj();
        boolean z2 = false;
        View view2 = null;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < iM16164aj; i5++) {
            View viewM16174av = abstractC0812ly.m16174av(i5);
            if (viewM16174av != null) {
                int iM15901j = m15901j(viewM16174av, abstractC0803lpM15900i);
                if (iM15901j <= 0 && iM15901j > i4) {
                    view2 = viewM16174av;
                    i4 = iM15901j;
                }
                if (iM15901j >= 0 && iM15901j < i3) {
                    view = viewM16174av;
                    i3 = iM15901j;
                }
            }
        }
        if (abstractC0812ly.mo1162V()) {
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
        } else if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && view != null) {
            return AbstractC0812ly.m16136be(view);
        }
        if (!z && view2 != null) {
            return AbstractC0812ly.m16136be(view2);
        }
        if (true == z) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iM16136be = AbstractC0812ly.m16136be(view);
        int iM16165al2 = abstractC0812ly.m16165al();
        if ((abstractC0812ly instanceof InterfaceC0824mj) && (pointFMo1150J = ((InterfaceC0824mj) abstractC0812ly).mo1150J(iM16165al2 - 1)) != null && (pointFMo1150J.x < 0.0f || pointFMo1150J.y < 0.0f)) {
            z2 = true;
        }
        int i6 = iM16136be + (z2 == z ? -1 : 1);
        if (i6 < 0 || i6 >= iM16165al) {
            return -1;
        }
        return i6;
    }

    @Override // p000.AbstractC0815ma
    /* JADX INFO: renamed from: b */
    public View mo2046b(AbstractC0812ly abstractC0812ly) {
        if (abstractC0812ly.mo1163W()) {
            return m15902k(abstractC0812ly, m15900i(abstractC0812ly));
        }
        if (abstractC0812ly.mo1162V()) {
            return m15902k(abstractC0812ly, m15899h(abstractC0812ly));
        }
        return null;
    }

    @Override // p000.AbstractC0815ma
    /* JADX INFO: renamed from: c */
    public final int[] mo11872c(AbstractC0812ly abstractC0812ly, View view) {
        int[] iArr = new int[2];
        if (abstractC0812ly.mo1162V()) {
            iArr[0] = m15901j(view, m15899h(abstractC0812ly));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0812ly.mo1163W()) {
            iArr[1] = m15901j(view, m15900i(abstractC0812ly));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // p000.AbstractC0815ma
    /* JADX INFO: renamed from: d */
    public final C0825mk mo11873d(AbstractC0812ly abstractC0812ly) {
        if (abstractC0812ly instanceof InterfaceC0824mj) {
            return new C0804lq(this, this.f39692a.getContext());
        }
        return null;
    }
}
