package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.activity.result.C0204c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1152g extends AbstractC1153g0 {

    /* JADX INFO: renamed from: s */
    public static TimeInterpolator f7259s;

    /* JADX INFO: renamed from: h */
    public final ArrayList<RecyclerView.AbstractC1109b0> f7260h = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    public final ArrayList<RecyclerView.AbstractC1109b0> f7261i = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    public final ArrayList<e> f7262j = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    public final ArrayList<d> f7263k = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    public final ArrayList<ArrayList<RecyclerView.AbstractC1109b0>> f7264l = new ArrayList<>();

    /* JADX INFO: renamed from: m */
    public final ArrayList<ArrayList<e>> f7265m = new ArrayList<>();

    /* JADX INFO: renamed from: n */
    public final ArrayList<ArrayList<d>> f7266n = new ArrayList<>();

    /* JADX INFO: renamed from: o */
    public final ArrayList<RecyclerView.AbstractC1109b0> f7267o = new ArrayList<>();

    /* JADX INFO: renamed from: p */
    public final ArrayList<RecyclerView.AbstractC1109b0> f7268p = new ArrayList<>();

    /* JADX INFO: renamed from: q */
    public final ArrayList<RecyclerView.AbstractC1109b0> f7269q = new ArrayList<>();

    /* JADX INFO: renamed from: r */
    public final ArrayList<RecyclerView.AbstractC1109b0> f7270r = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f7271a;

        public a(ArrayList arrayList) {
            this.f7271a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f7271a;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                C1152g c1152g = C1152g.this;
                if (!zHasNext) {
                    arrayList.clear();
                    c1152g.f7265m.remove(arrayList);
                    return;
                }
                e eVar = (e) it.next();
                RecyclerView.AbstractC1109b0 abstractC1109b0 = eVar.f7283a;
                c1152g.getClass();
                View view = abstractC1109b0.f7054a;
                int i10 = eVar.f7286d - eVar.f7284b;
                int i11 = eVar.f7287e - eVar.f7285c;
                if (i10 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i11 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                c1152g.f7268p.add(abstractC1109b0);
                viewPropertyAnimatorAnimate.setDuration(c1152g.f7079e).setListener(new C1158j(c1152g, abstractC1109b0, i10, view, i11, viewPropertyAnimatorAnimate)).start();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f7273a;

        public b(ArrayList arrayList) {
            this.f7273a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f7273a;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                C1152g c1152g = C1152g.this;
                if (!zHasNext) {
                    arrayList.clear();
                    c1152g.f7266n.remove(arrayList);
                    return;
                }
                d dVar = (d) it.next();
                c1152g.getClass();
                RecyclerView.AbstractC1109b0 abstractC1109b0 = dVar.f7277a;
                View view = null;
                View view2 = abstractC1109b0 == null ? null : abstractC1109b0.f7054a;
                RecyclerView.AbstractC1109b0 abstractC1109b1 = dVar.f7278b;
                if (abstractC1109b1 != null) {
                    view = abstractC1109b1.f7054a;
                }
                ArrayList<RecyclerView.AbstractC1109b0> arrayList2 = c1152g.f7270r;
                if (view2 != null) {
                    ViewPropertyAnimator duration = view2.animate().setDuration(c1152g.f7080f);
                    arrayList2.add(dVar.f7277a);
                    duration.translationX(dVar.f7281e - dVar.f7279c);
                    duration.translationY(dVar.f7282f - dVar.f7280d);
                    duration.alpha(0.0f).setListener(new C1160k(c1152g, dVar, duration, view2)).start();
                }
                if (view != null) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                    arrayList2.add(dVar.f7278b);
                    viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(c1152g.f7080f).alpha(1.0f).setListener(new C1161l(c1152g, dVar, viewPropertyAnimatorAnimate, view)).start();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f7275a;

        public c(ArrayList arrayList) {
            this.f7275a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f7275a;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                C1152g c1152g = C1152g.this;
                if (!zHasNext) {
                    arrayList.clear();
                    c1152g.f7264l.remove(arrayList);
                    return;
                }
                RecyclerView.AbstractC1109b0 abstractC1109b0 = (RecyclerView.AbstractC1109b0) it.next();
                c1152g.getClass();
                View view = abstractC1109b0.f7054a;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                c1152g.f7267o.add(abstractC1109b0);
                viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(c1152g.f7077c).setListener(new C1156i(view, viewPropertyAnimatorAnimate, c1152g, abstractC1109b0)).start();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public RecyclerView.AbstractC1109b0 f7277a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.AbstractC1109b0 f7278b;

        /* JADX INFO: renamed from: c */
        public final int f7279c;

        /* JADX INFO: renamed from: d */
        public final int f7280d;

        /* JADX INFO: renamed from: e */
        public final int f7281e;

        /* JADX INFO: renamed from: f */
        public final int f7282f;

        public d(RecyclerView.AbstractC1109b0 abstractC1109b0, RecyclerView.AbstractC1109b0 abstractC1109b1, int i10, int i11, int i12, int i13) {
            this.f7277a = abstractC1109b0;
            this.f7278b = abstractC1109b1;
            this.f7279c = i10;
            this.f7280d = i11;
            this.f7281e = i12;
            this.f7282f = i13;
        }

        @SuppressLint({"UnknownNullness"})
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeInfo{oldHolder=");
            sb2.append(this.f7277a);
            sb2.append(", newHolder=");
            sb2.append(this.f7278b);
            sb2.append(", fromX=");
            sb2.append(this.f7279c);
            sb2.append(", fromY=");
            sb2.append(this.f7280d);
            sb2.append(", toX=");
            sb2.append(this.f7281e);
            sb2.append(", toY=");
            return C0204c.m853l(sb2, this.f7282f, '}');
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final RecyclerView.AbstractC1109b0 f7283a;

        /* JADX INFO: renamed from: b */
        public final int f7284b;

        /* JADX INFO: renamed from: c */
        public final int f7285c;

        /* JADX INFO: renamed from: d */
        public final int f7286d;

        /* JADX INFO: renamed from: e */
        public final int f7287e;

        public e(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10, int i11, int i12, int i13) {
            this.f7283a = abstractC1109b0;
            this.f7284b = i10;
            this.f7285c = i11;
            this.f7286d = i12;
            this.f7287e = i13;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m4477m(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((RecyclerView.AbstractC1109b0) arrayList.get(size)).f7054a.animate().cancel();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1117j
    /* JADX INFO: renamed from: c */
    public final boolean mo4274c(RecyclerView.AbstractC1109b0 abstractC1109b0, List<Object> list) {
        if (list.isEmpty() && !super.mo4274c(abstractC1109b0, list)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1117j
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: e */
    public final void mo4276e(RecyclerView.AbstractC1109b0 abstractC1109b0) {
        View view = abstractC1109b0.f7054a;
        view.animate().cancel();
        ArrayList<e> arrayList = this.f7262j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (arrayList.get(size).f7283a == abstractC1109b0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m4275d(abstractC1109b0);
                arrayList.remove(size);
            }
        }
        m4483o(abstractC1109b0, this.f7263k);
        if (this.f7260h.remove(abstractC1109b0)) {
            view.setAlpha(1.0f);
            m4275d(abstractC1109b0);
        }
        if (this.f7261i.remove(abstractC1109b0)) {
            view.setAlpha(1.0f);
            m4275d(abstractC1109b0);
        }
        ArrayList<ArrayList<d>> arrayList2 = this.f7266n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<d> arrayList3 = arrayList2.get(size2);
            m4483o(abstractC1109b0, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<e>> arrayList4 = this.f7265m;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<e> arrayList5 = arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 >= 0) {
                    if (arrayList5.get(size4).f7283a == abstractC1109b0) {
                        view.setTranslationY(0.0f);
                        view.setTranslationX(0.0f);
                        m4275d(abstractC1109b0);
                        arrayList5.remove(size4);
                        if (arrayList5.isEmpty()) {
                            arrayList4.remove(size3);
                            break;
                        }
                    }
                }
                break;
            }
        }
        ArrayList<ArrayList<RecyclerView.AbstractC1109b0>> arrayList6 = this.f7264l;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.f7269q.remove(abstractC1109b0);
                this.f7267o.remove(abstractC1109b0);
                this.f7270r.remove(abstractC1109b0);
                this.f7268p.remove(abstractC1109b0);
                m4482n();
                return;
            }
            ArrayList<RecyclerView.AbstractC1109b0> arrayList7 = arrayList6.get(size5);
            if (arrayList7.remove(abstractC1109b0)) {
                view.setAlpha(1.0f);
                m4275d(abstractC1109b0);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1117j
    /* JADX INFO: renamed from: f */
    public final void mo4277f() {
        ArrayList<e> arrayList = this.f7262j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e eVar = arrayList.get(size);
            View view = eVar.f7283a.f7054a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m4275d(eVar.f7283a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.AbstractC1109b0> arrayList2 = this.f7260h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            m4275d(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.AbstractC1109b0> arrayList3 = this.f7261i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC1109b0 abstractC1109b0 = arrayList3.get(size3);
            abstractC1109b0.f7054a.setAlpha(1.0f);
            m4275d(abstractC1109b0);
            arrayList3.remove(size3);
        }
        ArrayList<d> arrayList4 = this.f7263k;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            d dVar = arrayList4.get(size4);
            RecyclerView.AbstractC1109b0 abstractC1109b1 = dVar.f7277a;
            if (abstractC1109b1 != null) {
                m4484p(dVar, abstractC1109b1);
            }
            RecyclerView.AbstractC1109b0 abstractC1109b2 = dVar.f7278b;
            if (abstractC1109b2 != null) {
                m4484p(dVar, abstractC1109b2);
            }
        }
        arrayList4.clear();
        if (mo4278g()) {
            ArrayList<ArrayList<e>> arrayList5 = this.f7265m;
            int size5 = arrayList5.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList<e> arrayList6 = arrayList5.get(size5);
                int size6 = arrayList6.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        e eVar2 = arrayList6.get(size6);
                        View view2 = eVar2.f7283a.f7054a;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        m4275d(eVar2.f7283a);
                        arrayList6.remove(size6);
                        if (arrayList6.isEmpty()) {
                            arrayList5.remove(arrayList6);
                        }
                    }
                }
            }
            ArrayList<ArrayList<RecyclerView.AbstractC1109b0>> arrayList7 = this.f7264l;
            int size7 = arrayList7.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList<RecyclerView.AbstractC1109b0> arrayList8 = arrayList7.get(size7);
                int size8 = arrayList8.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        RecyclerView.AbstractC1109b0 abstractC1109b3 = arrayList8.get(size8);
                        abstractC1109b3.f7054a.setAlpha(1.0f);
                        m4275d(abstractC1109b3);
                        arrayList8.remove(size8);
                        if (arrayList8.isEmpty()) {
                            arrayList7.remove(arrayList8);
                        }
                    }
                }
            }
            ArrayList<ArrayList<d>> arrayList9 = this.f7266n;
            int size9 = arrayList9.size();
            while (true) {
                size9--;
                if (size9 < 0) {
                    break;
                }
                ArrayList<d> arrayList10 = arrayList9.get(size9);
                int size10 = arrayList10.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        d dVar2 = arrayList10.get(size10);
                        RecyclerView.AbstractC1109b0 abstractC1109b4 = dVar2.f7277a;
                        if (abstractC1109b4 != null) {
                            m4484p(dVar2, abstractC1109b4);
                        }
                        RecyclerView.AbstractC1109b0 abstractC1109b5 = dVar2.f7278b;
                        if (abstractC1109b5 != null) {
                            m4484p(dVar2, abstractC1109b5);
                        }
                        if (arrayList10.isEmpty()) {
                            arrayList9.remove(arrayList10);
                        }
                    }
                }
            }
            m4477m(this.f7269q);
            m4477m(this.f7268p);
            m4477m(this.f7267o);
            m4477m(this.f7270r);
            ArrayList<RecyclerView.AbstractC1117j.a> arrayList11 = this.f7076b;
            int size11 = arrayList11.size();
            for (int i10 = 0; i10 < size11; i10++) {
                arrayList11.get(i10).m4280a();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1117j
    /* JADX INFO: renamed from: g */
    public final boolean mo4278g() {
        return (this.f7261i.isEmpty() && this.f7263k.isEmpty() && this.f7262j.isEmpty() && this.f7260h.isEmpty() && this.f7268p.isEmpty() && this.f7269q.isEmpty() && this.f7267o.isEmpty() && this.f7270r.isEmpty() && this.f7265m.isEmpty() && this.f7264l.isEmpty() && this.f7266n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1117j
    /* JADX INFO: renamed from: h */
    public final void mo4279h() {
        long j10;
        ArrayList<RecyclerView.AbstractC1109b0> arrayList = this.f7260h;
        boolean z10 = !arrayList.isEmpty();
        ArrayList<e> arrayList2 = this.f7262j;
        boolean z11 = !arrayList2.isEmpty();
        ArrayList<d> arrayList3 = this.f7263k;
        boolean z12 = !arrayList3.isEmpty();
        ArrayList<RecyclerView.AbstractC1109b0> arrayList4 = this.f7261i;
        boolean z13 = !arrayList4.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<RecyclerView.AbstractC1109b0> it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                j10 = this.f7078d;
                if (!zHasNext) {
                    break;
                }
                RecyclerView.AbstractC1109b0 next = it.next();
                View view = next.f7054a;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                this.f7269q.add(next);
                viewPropertyAnimatorAnimate.setDuration(j10).alpha(0.0f).setListener(new C1154h(view, viewPropertyAnimatorAnimate, this, next)).start();
            }
            arrayList.clear();
            if (z11) {
                ArrayList<e> arrayList5 = new ArrayList<>();
                arrayList5.addAll(arrayList2);
                this.f7265m.add(arrayList5);
                arrayList2.clear();
                a aVar = new a(arrayList5);
                if (z10) {
                    View view2 = arrayList5.get(0).f7283a.f7054a;
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    C10029b0.d.m18677n(view2, aVar, j10);
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList<d> arrayList6 = new ArrayList<>();
                arrayList6.addAll(arrayList3);
                this.f7266n.add(arrayList6);
                arrayList3.clear();
                b bVar = new b(arrayList6);
                if (z10) {
                    View view3 = arrayList6.get(0).f7277a.f7054a;
                    WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                    C10029b0.d.m18677n(view3, bVar, j10);
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                ArrayList<RecyclerView.AbstractC1109b0> arrayList7 = new ArrayList<>();
                arrayList7.addAll(arrayList4);
                this.f7264l.add(arrayList7);
                arrayList4.clear();
                c cVar = new c(arrayList7);
                if (!z10 && !z11 && !z12) {
                    cVar.run();
                    return;
                }
                if (!z10) {
                    j10 = 0;
                }
                long jMax = Math.max(z11 ? this.f7079e : 0L, z12 ? this.f7080f : 0L) + j10;
                View view4 = arrayList7.get(0).f7054a;
                WeakHashMap<View, C10049l0> weakHashMap3 = C10029b0.f50993a;
                C10029b0.d.m18677n(view4, cVar, jMax);
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1153g0
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: i */
    public final void mo4478i(RecyclerView.AbstractC1109b0 abstractC1109b0) {
        m4485q(abstractC1109b0);
        abstractC1109b0.f7054a.setAlpha(0.0f);
        this.f7261i.add(abstractC1109b0);
    }

    @Override // androidx.recyclerview.widget.AbstractC1153g0
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: j */
    public final boolean mo4479j(RecyclerView.AbstractC1109b0 abstractC1109b0, RecyclerView.AbstractC1109b0 abstractC1109b1, int i10, int i11, int i12, int i13) {
        if (abstractC1109b0 == abstractC1109b1) {
            return mo4480k(abstractC1109b0, i10, i11, i12, i13);
        }
        View view = abstractC1109b0.f7054a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m4485q(abstractC1109b0);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        m4485q(abstractC1109b1);
        float f3 = -((int) ((i12 - i10) - translationX));
        View view2 = abstractC1109b1.f7054a;
        view2.setTranslationX(f3);
        view2.setTranslationY(-((int) ((i13 - i11) - translationY)));
        view2.setAlpha(0.0f);
        this.f7263k.add(new d(abstractC1109b0, abstractC1109b1, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1153g0
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: k */
    public final boolean mo4480k(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10, int i11, int i12, int i13) {
        View view = abstractC1109b0.f7054a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) abstractC1109b0.f7054a.getTranslationY());
        m4485q(abstractC1109b0);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            m4275d(abstractC1109b0);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f7262j.add(new e(abstractC1109b0, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1153g0
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: l */
    public final void mo4481l(RecyclerView.AbstractC1109b0 abstractC1109b0) {
        m4485q(abstractC1109b0);
        this.f7260h.add(abstractC1109b0);
    }

    /* JADX INFO: renamed from: n */
    public final void m4482n() {
        if (!mo4278g()) {
            ArrayList<RecyclerView.AbstractC1117j.a> arrayList = this.f7076b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.get(i10).m4280a();
            }
            arrayList.clear();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m4483o(RecyclerView.AbstractC1109b0 abstractC1109b0, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                d dVar = (d) arrayList.get(size);
                if (!m4484p(dVar, abstractC1109b0) || dVar.f7277a != null || dVar.f7278b != null) {
                    break;
                } else {
                    arrayList.remove(dVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m4484p(d dVar, RecyclerView.AbstractC1109b0 abstractC1109b0) {
        if (dVar.f7278b == abstractC1109b0) {
            dVar.f7278b = null;
        } else {
            if (dVar.f7277a != abstractC1109b0) {
                return false;
            }
            dVar.f7277a = null;
        }
        abstractC1109b0.f7054a.setAlpha(1.0f);
        View view = abstractC1109b0.f7054a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        m4275d(abstractC1109b0);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m4485q(RecyclerView.AbstractC1109b0 abstractC1109b0) {
        if (f7259s == null) {
            f7259s = new ValueAnimator().getInterpolator();
        }
        abstractC1109b0.f7054a.animate().setInterpolator(f7259s);
        mo4276e(abstractC1109b0);
    }
}
