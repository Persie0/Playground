package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: kf */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0766kf extends AbstractC0836mv {

    /* JADX INFO: renamed from: m */
    private static TimeInterpolator f35798m;

    /* JADX INFO: renamed from: n */
    private final ArrayList f35806n = new ArrayList();

    /* JADX INFO: renamed from: o */
    private final ArrayList f35807o = new ArrayList();

    /* JADX INFO: renamed from: p */
    private final ArrayList f35808p = new ArrayList();

    /* JADX INFO: renamed from: q */
    private final ArrayList f35809q = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final ArrayList f35799a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f35800b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f35801c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f35802d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final ArrayList f35803e = new ArrayList();

    /* JADX INFO: renamed from: f */
    final ArrayList f35804f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final ArrayList f35805g = new ArrayList();

    /* JADX INFO: renamed from: k */
    static final void m14099k(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((C0829mo) list.get(size)).f41155a.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: v */
    private final void m14100v(List list, C0829mo c0829mo) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0765ke c0765ke = (C0765ke) list.get(size);
            if (m14103y(c0765ke, c0829mo) && c0765ke.f35706a == null && c0765ke.f35707b == null) {
                list.remove(c0765ke);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    private final void m14101w(C0765ke c0765ke) {
        C0829mo c0829mo = c0765ke.f35706a;
        if (c0829mo != null) {
            m14103y(c0765ke, c0829mo);
        }
        C0829mo c0829mo2 = c0765ke.f35707b;
        if (c0829mo2 != null) {
            m14103y(c0765ke, c0829mo2);
        }
    }

    /* JADX INFO: renamed from: x */
    private final void m14102x(C0829mo c0829mo) {
        if (f35798m == null) {
            f35798m = new ValueAnimator().getInterpolator();
        }
        c0829mo.f41155a.animate().setInterpolator(f35798m);
        mo11859b(c0829mo);
    }

    /* JADX INFO: renamed from: y */
    private final boolean m14103y(C0765ke c0765ke, C0829mo c0829mo) {
        if (c0765ke.f35707b == c0829mo) {
            c0765ke.f35707b = null;
        } else {
            if (c0765ke.f35706a != c0829mo) {
                return false;
            }
            c0765ke.f35706a = null;
        }
        c0829mo.f41155a.setAlpha(1.0f);
        c0829mo.f41155a.setTranslationX(0.0f);
        c0829mo.f41155a.setTranslationY(0.0f);
        m16076l(c0829mo);
        return true;
    }

    /* JADX INFO: renamed from: a */
    final void m14104a() {
        if (mo11863h()) {
            return;
        }
        m16077m();
    }

    @Override // p000.AbstractC0809lv
    /* JADX INFO: renamed from: b */
    public final void mo11859b(C0829mo c0829mo) {
        View view = c0829mo.f41155a;
        view.animate().cancel();
        int size = this.f35808p.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((ixk) this.f35808p.get(size)).f32566a == c0829mo) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m16076l(c0829mo);
                this.f35808p.remove(size);
            }
        }
        m14100v(this.f35809q, c0829mo);
        if (this.f35806n.remove(c0829mo)) {
            view.setAlpha(1.0f);
            m16076l(c0829mo);
        }
        if (this.f35807o.remove(c0829mo)) {
            view.setAlpha(1.0f);
            m16076l(c0829mo);
        }
        for (int size2 = this.f35801c.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f35801c.get(size2);
            m14100v(arrayList, c0829mo);
            if (arrayList.isEmpty()) {
                this.f35801c.remove(size2);
            }
        }
        for (int size3 = this.f35800b.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f35800b.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (((ixk) arrayList2.get(size4)).f32566a == c0829mo) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m16076l(c0829mo);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f35800b.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f35799a.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f35799a.get(size5);
            if (arrayList3.remove(c0829mo)) {
                view.setAlpha(1.0f);
                m16076l(c0829mo);
                if (arrayList3.isEmpty()) {
                    this.f35799a.remove(size5);
                }
            }
        }
        this.f35804f.remove(c0829mo);
        this.f35802d.remove(c0829mo);
        this.f35805g.remove(c0829mo);
        this.f35803e.remove(c0829mo);
        m14104a();
    }

    @Override // p000.AbstractC0809lv
    /* JADX INFO: renamed from: c */
    public final void mo11860c() {
        int size = this.f35808p.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ixk ixkVar = (ixk) this.f35808p.get(size);
            View view = ixkVar.f32566a.f41155a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m16076l(ixkVar.f32566a);
            this.f35808p.remove(size);
        }
        for (int size2 = this.f35806n.size() - 1; size2 >= 0; size2--) {
            m16076l((C0829mo) this.f35806n.get(size2));
            this.f35806n.remove(size2);
        }
        int size3 = this.f35807o.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C0829mo c0829mo = (C0829mo) this.f35807o.get(size3);
            c0829mo.f41155a.setAlpha(1.0f);
            m16076l(c0829mo);
            this.f35807o.remove(size3);
        }
        for (int size4 = this.f35809q.size() - 1; size4 >= 0; size4--) {
            m14101w((C0765ke) this.f35809q.get(size4));
        }
        this.f35809q.clear();
        if (mo11863h()) {
            for (int size5 = this.f35800b.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f35800b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    ixk ixkVar2 = (ixk) arrayList.get(size6);
                    View view2 = ixkVar2.f32566a.f41155a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m16076l(ixkVar2.f32566a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f35800b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f35799a.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f35799a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C0829mo c0829mo2 = (C0829mo) arrayList2.get(size8);
                    c0829mo2.f41155a.setAlpha(1.0f);
                    m16076l(c0829mo2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f35799a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f35801c.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f35801c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m14101w((C0765ke) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f35801c.remove(arrayList3);
                    }
                }
            }
            m14099k(this.f35804f);
            m14099k(this.f35803e);
            m14099k(this.f35802d);
            m14099k(this.f35805g);
            m16077m();
        }
    }

    @Override // p000.AbstractC0809lv
    /* JADX INFO: renamed from: d */
    public final void mo11861d() {
        boolean z = !this.f35806n.isEmpty();
        boolean z2 = !this.f35808p.isEmpty();
        boolean z3 = !this.f35809q.isEmpty();
        boolean z4 = !this.f35807o.isEmpty();
        if (z || z2 || z4 || z3) {
            ArrayList arrayList = this.f35806n;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0829mo c0829mo = (C0829mo) arrayList.get(i);
                View view = c0829mo.f41155a;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                this.f35804f.add(c0829mo);
                viewPropertyAnimatorAnimate.setDuration(this.f39372i).alpha(0.0f).setListener(new C0759jz(this, c0829mo, viewPropertyAnimatorAnimate, view)).start();
            }
            this.f35806n.clear();
            if (z2) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f35808p);
                this.f35800b.add(arrayList2);
                this.f35808p.clear();
                RunnableC0058bd runnableC0058bd = new RunnableC0058bd(this, arrayList2, 6);
                if (z) {
                    afb.m429j(((ixk) arrayList2.get(0)).f32566a.f41155a, runnableC0058bd, this.f39372i);
                } else {
                    runnableC0058bd.run();
                }
            }
            if (z3) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f35809q);
                this.f35801c.add(arrayList3);
                this.f35809q.clear();
                RunnableC0058bd runnableC0058bd2 = new RunnableC0058bd(this, arrayList3, 7);
                if (z) {
                    afb.m429j(((C0765ke) arrayList3.get(0)).f35706a.f41155a, runnableC0058bd2, this.f39372i);
                } else {
                    runnableC0058bd2.run();
                }
            }
            if (z4) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(this.f35807o);
                this.f35799a.add(arrayList4);
                this.f35807o.clear();
                RunnableC0058bd runnableC0058bd3 = new RunnableC0058bd(this, arrayList4, 8);
                if (z || z2 || z3) {
                    afb.m429j(((C0829mo) arrayList4.get(0)).f41155a, runnableC0058bd3, (z ? this.f39372i : 0L) + Math.max(z2 ? this.f39373j : 0L, z3 ? this.f39374k : 0L));
                } else {
                    runnableC0058bd3.run();
                }
            }
        }
    }

    @Override // p000.AbstractC0836mv
    /* JADX INFO: renamed from: e */
    public final boolean mo11836e(C0829mo c0829mo, C0829mo c0829mo2, int i, int i2, int i3, int i4) {
        if (c0829mo == c0829mo2) {
            return mo11837f(c0829mo, i, i2, i3, i4);
        }
        float translationX = c0829mo.f41155a.getTranslationX();
        float translationY = c0829mo.f41155a.getTranslationY();
        float alpha = c0829mo.f41155a.getAlpha();
        m14102x(c0829mo);
        float f = (i3 - i) - translationX;
        float f2 = (i4 - i2) - translationY;
        c0829mo.f41155a.setTranslationX(translationX);
        c0829mo.f41155a.setTranslationY(translationY);
        c0829mo.f41155a.setAlpha(alpha);
        if (c0829mo2 != null) {
            m14102x(c0829mo2);
            c0829mo2.f41155a.setTranslationX(-((int) f));
            c0829mo2.f41155a.setTranslationY(-((int) f2));
            c0829mo2.f41155a.setAlpha(0.0f);
        }
        this.f35809q.add(new C0765ke(c0829mo, c0829mo2, i, i2, i3, i4));
        return true;
    }

    @Override // p000.AbstractC0836mv
    /* JADX INFO: renamed from: f */
    public final boolean mo11837f(C0829mo c0829mo, int i, int i2, int i3, int i4) {
        View view = c0829mo.f41155a;
        int translationX = (int) view.getTranslationX();
        int translationY = (int) c0829mo.f41155a.getTranslationY();
        m14102x(c0829mo);
        int i5 = i + translationX;
        int i6 = i3 - i5;
        int i7 = i2 + translationY;
        int i8 = i4 - i7;
        if (i6 == 0) {
            i6 = 0;
            if (i8 == 0) {
                m16076l(c0829mo);
                return false;
            }
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        this.f35808p.add(new ixk(c0829mo, i5, i7, i3, i4));
        return true;
    }

    @Override // p000.AbstractC0809lv
    /* JADX INFO: renamed from: g */
    public final boolean mo11862g(C0829mo c0829mo, List list) {
        return !list.isEmpty() || mo16078n(c0829mo);
    }

    @Override // p000.AbstractC0809lv
    /* JADX INFO: renamed from: h */
    public final boolean mo11863h() {
        return (this.f35807o.isEmpty() && this.f35809q.isEmpty() && this.f35808p.isEmpty() && this.f35806n.isEmpty() && this.f35803e.isEmpty() && this.f35804f.isEmpty() && this.f35802d.isEmpty() && this.f35805g.isEmpty() && this.f35800b.isEmpty() && this.f35799a.isEmpty() && this.f35801c.isEmpty()) ? false : true;
    }

    @Override // p000.AbstractC0836mv
    /* JADX INFO: renamed from: i */
    public final void mo11838i(C0829mo c0829mo) {
        m14102x(c0829mo);
        c0829mo.f41155a.setAlpha(0.0f);
        this.f35807o.add(c0829mo);
    }

    @Override // p000.AbstractC0836mv
    /* JADX INFO: renamed from: j */
    public final void mo11839j(C0829mo c0829mo) {
        m14102x(c0829mo);
        this.f35806n.add(c0829mo);
    }
}
