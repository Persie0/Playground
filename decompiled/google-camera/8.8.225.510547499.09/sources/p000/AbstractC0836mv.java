package p000;

import android.view.View;

/* JADX INFO: renamed from: mv */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0836mv extends AbstractC0809lv {
    /* JADX INFO: renamed from: e */
    public abstract boolean mo11836e(C0829mo c0829mo, C0829mo c0829mo2, int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo11837f(C0829mo c0829mo, int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: i */
    public abstract void mo11838i(C0829mo c0829mo);

    /* JADX INFO: renamed from: j */
    public abstract void mo11839j(C0829mo c0829mo);

    @Override // p000.AbstractC0809lv
    /* JADX INFO: renamed from: n */
    public final boolean mo16078n(C0829mo c0829mo) {
        return c0829mo.m16692s();
    }

    @Override // p000.AbstractC0809lv
    /* JADX INFO: renamed from: p */
    public final boolean mo16079p(C0829mo c0829mo, aev aevVar, aev aevVar2) {
        int i;
        int i2;
        if (aevVar != null && ((i = aevVar.f264b) != (i2 = aevVar2.f264b) || aevVar.f263a != aevVar2.f263a)) {
            return mo11837f(c0829mo, i, aevVar.f263a, i2, aevVar2.f263a);
        }
        mo11838i(c0829mo);
        return true;
    }

    @Override // p000.AbstractC0809lv
    /* JADX INFO: renamed from: q */
    public final boolean mo16080q(C0829mo c0829mo, C0829mo c0829mo2, aev aevVar, aev aevVar2) {
        int i;
        int i2;
        int i3 = aevVar.f264b;
        int i4 = aevVar.f263a;
        if (c0829mo2.m16699z()) {
            int i5 = aevVar.f264b;
            i2 = aevVar.f263a;
            i = i5;
        } else {
            i = aevVar2.f264b;
            i2 = aevVar2.f263a;
        }
        return mo11836e(c0829mo, c0829mo2, i3, i4, i, i2);
    }

    @Override // p000.AbstractC0809lv
    /* JADX INFO: renamed from: r */
    public final boolean mo16081r(C0829mo c0829mo, aev aevVar, aev aevVar2) {
        int i = aevVar.f264b;
        int i2 = aevVar.f263a;
        View view = c0829mo.f41155a;
        int left = aevVar2 == null ? view.getLeft() : aevVar2.f264b;
        int top = aevVar2 == null ? view.getTop() : aevVar2.f263a;
        if (c0829mo.m16694u() || (i == left && i2 == top)) {
            mo11839j(c0829mo);
            return true;
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo11837f(c0829mo, i, i2, left, top);
    }

    @Override // p000.AbstractC0809lv
    /* JADX INFO: renamed from: s */
    public final boolean mo16082s(C0829mo c0829mo, aev aevVar, aev aevVar2) {
        int i = aevVar.f264b;
        int i2 = aevVar2.f264b;
        if (i != i2 || aevVar.f263a != aevVar2.f263a) {
            return mo11837f(c0829mo, i, aevVar.f263a, i2, aevVar2.f263a);
        }
        m16076l(c0829mo);
        return false;
    }
}
