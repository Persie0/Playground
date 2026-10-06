package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ixl extends AbstractC0836mv {

    /* JADX INFO: renamed from: b */
    protected final TimeInterpolator f32571b = new ValueAnimator().getInterpolator();

    /* JADX INFO: renamed from: c */
    public final ArrayList f32572c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f32573d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final ArrayList f32574e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f32575f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final ArrayList f32576g = new ArrayList();

    /* JADX INFO: renamed from: m */
    public final ArrayList f32577m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public final ArrayList f32578n = new ArrayList();

    /* JADX INFO: renamed from: o */
    public final ArrayList f32579o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public final ArrayList f32580p = new ArrayList();

    /* JADX INFO: renamed from: q */
    final ArrayList f32581q = new ArrayList();

    /* JADX INFO: renamed from: r */
    public final ArrayList f32582r = new ArrayList();

    /* JADX INFO: renamed from: F */
    static final void m11853F(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((C0829mo) list.get(size)).f41155a.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: G */
    private final void m11854G(List list, C0829mo c0829mo) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ixj ixjVar = (ixj) list.get(size);
            if (m11856I(ixjVar, c0829mo) && ixjVar.f32560a == null && ixjVar.f32561b == null) {
                list.remove(ixjVar);
            }
        }
    }

    /* JADX INFO: renamed from: H */
    private final void m11855H(ixj ixjVar) {
        C0829mo c0829mo = ixjVar.f32560a;
        if (c0829mo != null) {
            m11856I(ixjVar, c0829mo);
        }
        C0829mo c0829mo2 = ixjVar.f32561b;
        if (c0829mo2 != null) {
            m11856I(ixjVar, c0829mo2);
        }
    }

    /* JADX INFO: renamed from: I */
    private final boolean m11856I(ixj ixjVar, C0829mo c0829mo) {
        if (ixjVar.f32561b == c0829mo) {
            ixjVar.f32561b = null;
            mo11845z(c0829mo);
        } else {
            if (ixjVar.f32560a != c0829mo) {
                return false;
            }
            ixjVar.f32560a = null;
            mo11832A(c0829mo);
        }
        c0829mo.f41155a.setTranslationX(0.0f);
        c0829mo.f41155a.setTranslationY(0.0f);
        m16076l(c0829mo);
        return true;
    }

    /* JADX INFO: renamed from: A */
    protected void mo11832A(C0829mo c0829mo) {
        throw null;
    }

    /* JADX INFO: renamed from: B */
    protected abstract void mo11833B(C0829mo c0829mo);

    /* JADX INFO: renamed from: C */
    protected abstract void mo11834C(C0829mo c0829mo);

    /* JADX INFO: renamed from: D */
    final void m11857D() {
        if (mo11863h()) {
            return;
        }
        m16077m();
    }

    /* JADX INFO: renamed from: E */
    public final void m11858E(C0829mo c0829mo) {
        c0829mo.f41155a.animate().setInterpolator(this.f32571b);
        mo11859b(c0829mo);
    }

    /* JADX INFO: renamed from: a */
    public abstract ViewPropertyAnimator mo11835a(C0829mo c0829mo);

    @Override // p000.AbstractC0809lv
    /* JADX INFO: renamed from: b */
    public final void mo11859b(C0829mo c0829mo) {
        c0829mo.f41155a.animate().cancel();
        for (int size = this.f32574e.size() - 1; size >= 0; size--) {
            if (((ixk) this.f32574e.get(size)).f32566a == c0829mo) {
                mo11833B(c0829mo);
                m16076l(c0829mo);
                this.f32574e.remove(size);
            }
        }
        m11854G(this.f32575f, c0829mo);
        if (this.f32572c.remove(c0829mo)) {
            mo11834C(c0829mo);
            m16076l(c0829mo);
        }
        if (this.f32573d.remove(c0829mo)) {
            mo11844y(c0829mo);
            m16076l(c0829mo);
        }
        for (int size2 = this.f32578n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f32578n.get(size2);
            m11854G(arrayList, c0829mo);
            if (arrayList.isEmpty()) {
                this.f32578n.remove(size2);
            }
        }
        for (int size3 = this.f32577m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f32577m.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (((ixk) arrayList2.get(size4)).f32566a == c0829mo) {
                    mo11833B(c0829mo);
                    m16076l(c0829mo);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f32577m.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f32576g.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f32576g.get(size5);
            if (arrayList3.remove(c0829mo)) {
                mo11844y(c0829mo);
                m16076l(c0829mo);
                if (arrayList3.isEmpty()) {
                    this.f32576g.remove(size5);
                }
            }
        }
        this.f32581q.remove(c0829mo);
        this.f32579o.remove(c0829mo);
        this.f32582r.remove(c0829mo);
        this.f32580p.remove(c0829mo);
        m11857D();
    }

    @Override // p000.AbstractC0809lv
    /* JADX INFO: renamed from: c */
    public final void mo11860c() {
        for (int size = this.f32574e.size() - 1; size >= 0; size--) {
            ixk ixkVar = (ixk) this.f32574e.get(size);
            mo11833B(ixkVar.f32566a);
            m16076l(ixkVar.f32566a);
            this.f32574e.remove(size);
        }
        for (int size2 = this.f32572c.size() - 1; size2 >= 0; size2--) {
            C0829mo c0829mo = (C0829mo) this.f32572c.get(size2);
            mo11834C(c0829mo);
            m16076l(c0829mo);
            this.f32572c.remove(size2);
        }
        for (int size3 = this.f32573d.size() - 1; size3 >= 0; size3--) {
            C0829mo c0829mo2 = (C0829mo) this.f32573d.get(size3);
            mo11844y(c0829mo2);
            m16076l(c0829mo2);
            this.f32573d.remove(size3);
        }
        for (int size4 = this.f32575f.size() - 1; size4 >= 0; size4--) {
            m11855H((ixj) this.f32575f.get(size4));
        }
        this.f32575f.clear();
        if (mo11863h()) {
            for (int size5 = this.f32577m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f32577m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    ixk ixkVar2 = (ixk) arrayList.get(size6);
                    mo11833B(ixkVar2.f32566a);
                    m16076l(ixkVar2.f32566a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f32577m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f32576g.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f32576g.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C0829mo c0829mo3 = (C0829mo) arrayList2.get(size8);
                    mo11844y(c0829mo3);
                    m16076l(c0829mo3);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f32576g.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f32578n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f32578n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m11855H((ixj) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f32578n.remove(arrayList3);
                    }
                }
            }
            m11853F(this.f32581q);
            m11853F(this.f32580p);
            m11853F(this.f32579o);
            m11853F(this.f32582r);
            m16077m();
        }
    }

    @Override // p000.AbstractC0809lv
    /* JADX INFO: renamed from: d */
    public final void mo11861d() {
        boolean z = !this.f32572c.isEmpty();
        boolean z2 = !this.f32574e.isEmpty();
        boolean z3 = !this.f32575f.isEmpty();
        boolean z4 = !this.f32573d.isEmpty();
        if (z || z2 || z4 || z3) {
            ArrayList arrayList = this.f32572c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0829mo c0829mo = (C0829mo) arrayList.get(i);
                ViewPropertyAnimator viewPropertyAnimatorMo11843x = mo11843x(c0829mo);
                this.f32581q.add(c0829mo);
                viewPropertyAnimatorMo11843x.setDuration(this.f39372i).setListener(new ixe(this, c0829mo, viewPropertyAnimatorMo11843x)).start();
            }
            this.f32572c.clear();
            if (z2) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f32574e);
                this.f32577m.add(arrayList2);
                this.f32574e.clear();
                ipe ipeVar = new ipe(this, arrayList2, 7);
                if (z) {
                    afb.m429j(((ixk) arrayList2.get(0)).f32566a.f41155a, ipeVar, this.f39372i);
                } else {
                    ipeVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f32575f);
                this.f32578n.add(arrayList3);
                this.f32575f.clear();
                ipe ipeVar2 = new ipe(this, arrayList3, 8);
                if (z) {
                    C0829mo c0829mo2 = ((ixj) arrayList3.get(0)).f32560a;
                    if (c0829mo2 != null) {
                        afb.m429j(c0829mo2.f41155a, ipeVar2, this.f39372i);
                    }
                } else {
                    ipeVar2.run();
                }
            }
            if (z4) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(this.f32573d);
                this.f32576g.add(arrayList4);
                this.f32573d.clear();
                ipe ipeVar3 = new ipe(this, arrayList4, 9);
                if (z || z2 || z3) {
                    afb.m429j(((C0829mo) arrayList4.get(0)).f41155a, ipeVar3, (z ? this.f39372i : 0L) + Math.max(z2 ? this.f39373j : 0L, z3 ? this.f39374k : 0L));
                } else {
                    ipeVar3.run();
                }
            }
        }
    }

    @Override // p000.AbstractC0836mv
    /* JADX INFO: renamed from: e */
    public boolean mo11836e(C0829mo c0829mo, C0829mo c0829mo2, int i, int i2, int i3, int i4) {
        throw null;
    }

    @Override // p000.AbstractC0836mv
    /* JADX INFO: renamed from: f */
    public boolean mo11837f(C0829mo c0829mo, int i, int i2, int i3, int i4) {
        throw null;
    }

    @Override // p000.AbstractC0809lv
    /* JADX INFO: renamed from: g */
    public final boolean mo11862g(C0829mo c0829mo, List list) {
        return !list.isEmpty() || mo16078n(c0829mo);
    }

    @Override // p000.AbstractC0809lv
    /* JADX INFO: renamed from: h */
    public final boolean mo11863h() {
        return (this.f32573d.isEmpty() && this.f32575f.isEmpty() && this.f32574e.isEmpty() && this.f32572c.isEmpty() && this.f32580p.isEmpty() && this.f32581q.isEmpty() && this.f32579o.isEmpty() && this.f32582r.isEmpty() && this.f32577m.isEmpty() && this.f32576g.isEmpty() && this.f32578n.isEmpty()) ? false : true;
    }

    @Override // p000.AbstractC0836mv
    /* JADX INFO: renamed from: i */
    public void mo11838i(C0829mo c0829mo) {
        throw null;
    }

    @Override // p000.AbstractC0836mv
    /* JADX INFO: renamed from: j */
    public void mo11839j(C0829mo c0829mo) {
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public abstract ViewPropertyAnimator mo11840k(C0829mo c0829mo);

    /* JADX INFO: renamed from: v */
    public abstract ViewPropertyAnimator mo11841v(C0829mo c0829mo);

    /* JADX INFO: renamed from: w */
    public abstract ViewPropertyAnimator mo11842w(C0829mo c0829mo, int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: x */
    protected abstract ViewPropertyAnimator mo11843x(C0829mo c0829mo);

    /* JADX INFO: renamed from: y */
    protected void mo11844y(C0829mo c0829mo) {
        throw null;
    }

    /* JADX INFO: renamed from: z */
    protected void mo11845z(C0829mo c0829mo) {
        throw null;
    }
}
