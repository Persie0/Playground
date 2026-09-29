package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a72 extends v28 {

    /* JADX INFO: renamed from: s */
    public static TimeInterpolator f305s;

    /* JADX INFO: renamed from: g */
    public boolean f306g;

    /* JADX INFO: renamed from: h */
    public ArrayList f307h;

    /* JADX INFO: renamed from: i */
    public ArrayList f308i;

    /* JADX INFO: renamed from: j */
    public ArrayList f309j;

    /* JADX INFO: renamed from: k */
    public ArrayList f310k;

    /* JADX INFO: renamed from: l */
    public ArrayList f311l;

    /* JADX INFO: renamed from: m */
    public ArrayList f312m;

    /* JADX INFO: renamed from: n */
    public ArrayList f313n;

    /* JADX INFO: renamed from: o */
    public ArrayList f314o;

    /* JADX INFO: renamed from: p */
    public ArrayList f315p;

    /* JADX INFO: renamed from: q */
    public ArrayList f316q;

    /* JADX INFO: renamed from: r */
    public ArrayList f317r;

    /* JADX INFO: renamed from: h */
    public static void m149h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((o38) arrayList.get(size)).f53781a.animate().cancel();
        }
    }

    @Override // p000.v28
    /* JADX INFO: renamed from: a */
    public final boolean mo150a(o38 o38Var, o38 o38Var2, xp7 xp7Var, xp7 xp7Var2) {
        int i;
        int i2;
        int i3 = xp7Var.f68498b;
        int i4 = xp7Var.f68499c;
        if (o38Var2.m17797q()) {
            int i5 = xp7Var.f68498b;
            i2 = xp7Var.f68499c;
            i = i5;
        } else {
            i = xp7Var2.f68498b;
            i2 = xp7Var2.f68499c;
        }
        if (o38Var == o38Var2) {
            return m154g(o38Var, i3, i4, i, i2);
        }
        View view = o38Var.f53781a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m158l(o38Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = o38Var2.f53781a;
        m158l(o38Var2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        this.f310k.add(new y62(o38Var, o38Var2, i3, i4, i, i2));
        return true;
    }

    @Override // p000.v28
    /* JADX INFO: renamed from: d */
    public final void mo151d(o38 o38Var) {
        ArrayList arrayList = this.f311l;
        ArrayList arrayList2 = this.f312m;
        ArrayList arrayList3 = this.f313n;
        View view = o38Var.f53781a;
        view.animate().cancel();
        ArrayList arrayList4 = this.f309j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((z62) arrayList4.get(size)).f70979a == o38Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m23068c(o38Var);
                arrayList4.remove(size);
            }
        }
        m156j(this.f310k, o38Var);
        if (this.f307h.remove(o38Var)) {
            view.setAlpha(1.0f);
            m23068c(o38Var);
        }
        if (this.f308i.remove(o38Var)) {
            view.setAlpha(1.0f);
            m23068c(o38Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            m156j(arrayList5, o38Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            for (int size4 = arrayList6.size() - 1; size4 >= 0; size4--) {
                if (((z62) arrayList6.get(size4)).f70979a == o38Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m23068c(o38Var);
                    arrayList6.remove(size4);
                    if (!arrayList6.isEmpty()) {
                        break;
                    }
                    arrayList2.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(o38Var)) {
                view.setAlpha(1.0f);
                m23068c(o38Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f316q.remove(o38Var);
        this.f314o.remove(o38Var);
        this.f317r.remove(o38Var);
        this.f315p.remove(o38Var);
        m155i();
    }

    @Override // p000.v28
    /* JADX INFO: renamed from: e */
    public final void mo152e() {
        ArrayList arrayList = this.f310k;
        ArrayList arrayList2 = this.f313n;
        ArrayList arrayList3 = this.f311l;
        ArrayList arrayList4 = this.f312m;
        ArrayList arrayList5 = this.f308i;
        ArrayList arrayList6 = this.f307h;
        ArrayList arrayList7 = this.f309j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            z62 z62Var = (z62) arrayList7.get(size);
            View view = z62Var.f70979a.f53781a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m23068c(z62Var.f70979a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            m23068c((o38) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            o38 o38Var = (o38) arrayList5.get(size3);
            o38Var.f53781a.setAlpha(1.0f);
            m23068c(o38Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            y62 y62Var = (y62) arrayList.get(size4);
            o38 o38Var2 = y62Var.f69356a;
            if (o38Var2 != null) {
                m157k(y62Var, o38Var2);
            }
            o38 o38Var3 = y62Var.f69357b;
            if (o38Var3 != null) {
                m157k(y62Var, o38Var3);
            }
        }
        arrayList.clear();
        if (mo153f()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    z62 z62Var2 = (z62) arrayList8.get(size6);
                    View view2 = z62Var2.f70979a.f53781a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m23068c(z62Var2.f70979a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    o38 o38Var4 = (o38) arrayList9.get(size8);
                    o38Var4.f53781a.setAlpha(1.0f);
                    m23068c(o38Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    y62 y62Var2 = (y62) arrayList10.get(size10);
                    o38 o38Var5 = y62Var2.f69356a;
                    if (o38Var5 != null) {
                        m157k(y62Var2, o38Var5);
                    }
                    o38 o38Var6 = y62Var2.f69357b;
                    if (o38Var6 != null) {
                        m157k(y62Var2, o38Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            m149h(this.f316q);
            m149h(this.f315p);
            m149h(this.f314o);
            m149h(this.f317r);
            ArrayList arrayList11 = this.f64743b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                ho2.m13383c();
            }
        }
    }

    @Override // p000.v28
    /* JADX INFO: renamed from: f */
    public final boolean mo153f() {
        return (this.f308i.isEmpty() && this.f310k.isEmpty() && this.f309j.isEmpty() && this.f307h.isEmpty() && this.f315p.isEmpty() && this.f316q.isEmpty() && this.f314o.isEmpty() && this.f317r.isEmpty() && this.f312m.isEmpty() && this.f311l.isEmpty() && this.f313n.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m154g(o38 o38Var, int i, int i2, int i3, int i4) {
        View view = o38Var.f53781a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) o38Var.f53781a.getTranslationY());
        m158l(o38Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m23068c(o38Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f309j.add(new z62(o38Var, translationX, translationY, i3, i4));
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m155i() {
        if (mo153f()) {
            return;
        }
        ArrayList arrayList = this.f64743b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            ho2.m13383c();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m156j(ArrayList arrayList, o38 o38Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            y62 y62Var = (y62) arrayList.get(size);
            if (m157k(y62Var, o38Var) && y62Var.f69356a == null && y62Var.f69357b == null) {
                arrayList.remove(y62Var);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m157k(y62 y62Var, o38 o38Var) {
        if (y62Var.f69357b == o38Var) {
            y62Var.f69357b = null;
        } else {
            if (y62Var.f69356a != o38Var) {
                return false;
            }
            y62Var.f69356a = null;
        }
        View view = o38Var.f53781a;
        View view2 = o38Var.f53781a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        m23068c(o38Var);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m158l(o38 o38Var) {
        if (f305s == null) {
            f305s = new ValueAnimator().getInterpolator();
        }
        o38Var.f53781a.animate().setInterpolator(f305s);
        mo151d(o38Var);
    }
}
