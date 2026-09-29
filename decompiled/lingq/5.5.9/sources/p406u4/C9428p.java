package p406u4;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0977s0;
import androidx.fragment.app.RunnableC0960k;
import java.util.ArrayList;
import p389t2.C9185d;

/* JADX INFO: renamed from: u4.p */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public class C9428p extends AbstractC0977s0 {

    /* JADX INFO: renamed from: u4.p$a */
    public class a implements AbstractC9409f0.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f48380a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f48381b;

        public a(View view, ArrayList arrayList) {
            this.f48380a = view;
            this.f48381b = arrayList;
        }

        @Override // p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: a */
        public final void mo17765a() {
        }

        @Override // p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: b */
        public final void mo17810b(AbstractC9409f0 abstractC9409f0) {
            abstractC9409f0.mo17779F(this);
            abstractC9409f0.mo17791b(this);
        }

        @Override // p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: c */
        public final void mo17766c() {
        }

        @Override // p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: d */
        public final void mo17767d() {
        }

        @Override // p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: e */
        public final void mo17768e(AbstractC9409f0 abstractC9409f0) {
            abstractC9409f0.mo17779F(this);
            this.f48380a.setVisibility(8);
            ArrayList arrayList = this.f48381b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) arrayList.get(i10)).setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: u4.p$b */
    public class b extends AbstractC9409f0.d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Rect f48382a;

        public b(Rect rect) {
            this.f48382a = rect;
        }

        @Override // p406u4.AbstractC9409f0.d
        /* JADX INFO: renamed from: a */
        public final Rect mo17809a() {
            Rect rect = this.f48382a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return rect;
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m17826s(AbstractC9409f0 abstractC9409f0) {
        return (AbstractC0977s0.m3798h(abstractC9409f0.f48295e) && AbstractC0977s0.m3798h(abstractC9409f0.f48297g) && AbstractC0977s0.m3798h(abstractC9409f0.f48298h)) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: a */
    public final void mo3780a(View view, Object obj) {
        ((AbstractC9409f0) obj).mo17793d(view);
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: b */
    public final void mo3781b(Object obj, ArrayList<View> arrayList) {
        AbstractC9409f0 abstractC9409f0 = (AbstractC9409f0) obj;
        if (abstractC9409f0 == null) {
            return;
        }
        int i10 = 0;
        if (abstractC9409f0 instanceof C9421l0) {
            C9421l0 c9421l0 = (C9421l0) abstractC9409f0;
            int size = c9421l0.f48356Y.size();
            while (i10 < size) {
                mo3781b((i10 < 0 || i10 >= c9421l0.f48356Y.size()) ? null : c9421l0.f48356Y.get(i10), arrayList);
                i10++;
            }
        } else if (!m17826s(abstractC9409f0) && AbstractC0977s0.m3798h(abstractC9409f0.f48296f)) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                abstractC9409f0.mo17793d(arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: c */
    public final void mo3782c(ViewGroup viewGroup, Object obj) {
        C9419k0.m17819a(viewGroup, (AbstractC9409f0) obj);
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: e */
    public final boolean mo3783e(Object obj) {
        return obj instanceof AbstractC9409f0;
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: f */
    public final Object mo3784f(Object obj) {
        if (obj != null) {
            return ((AbstractC9409f0) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: i */
    public final Object mo3785i(Object obj, Object obj2, Object obj3) {
        AbstractC9409f0 abstractC9409f0;
        AbstractC9409f0 abstractC9409f1 = (AbstractC9409f0) obj;
        AbstractC9409f0 abstractC9409f2 = (AbstractC9409f0) obj2;
        AbstractC9409f0 abstractC9409f3 = (AbstractC9409f0) obj3;
        if (abstractC9409f1 != null && abstractC9409f2 != null) {
            C9421l0 c9421l0 = new C9421l0();
            c9421l0.m17821S(abstractC9409f1);
            c9421l0.m17821S(abstractC9409f2);
            c9421l0.m17824W(1);
            abstractC9409f0 = c9421l0;
        } else if (abstractC9409f1 == null) {
            abstractC9409f0 = abstractC9409f2 != null ? abstractC9409f2 : null;
        }
        if (abstractC9409f3 == null) {
            abstractC9409f0 = abstractC9409f1;
            return abstractC9409f0;
        }
        abstractC9409f0 = abstractC9409f1;
        C9421l0 c9421l1 = new C9421l0();
        if (abstractC9409f0 != null) {
            c9421l1.m17821S(abstractC9409f0);
        }
        c9421l1.m17821S(abstractC9409f3);
        return c9421l1;
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: j */
    public final Object mo3786j(Object obj, Object obj2) {
        C9421l0 c9421l0 = new C9421l0();
        if (obj != null) {
            c9421l0.m17821S((AbstractC9409f0) obj);
        }
        c9421l0.m17821S((AbstractC9409f0) obj2);
        return c9421l0;
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: k */
    public final void mo3787k(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC9409f0) obj).mo17791b(new a(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: l */
    public final void mo3788l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((AbstractC9409f0) obj).mo17791b(new C9430q(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: m */
    public final void mo3789m(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            AbstractC0977s0.m3797g(view, rect);
            ((AbstractC9409f0) obj).mo17784K(new C9426o(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: n */
    public final void mo3790n(Object obj, Rect rect) {
        ((AbstractC9409f0) obj).mo17784K(new b(rect));
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: o */
    public final void mo3791o(Object obj, C9185d c9185d, RunnableC0960k runnableC0960k) {
        AbstractC9409f0 abstractC9409f0 = (AbstractC9409f0) obj;
        c9185d.m17520b(new C9432r(abstractC9409f0));
        abstractC9409f0.mo17791b(new C9434s(runnableC0960k));
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: p */
    public final void mo3792p(Object obj, View view, ArrayList<View> arrayList) {
        C9421l0 c9421l0 = (C9421l0) obj;
        ArrayList<View> arrayList2 = c9421l0.f48296f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0977s0.m3796d(arrayList.get(i10), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo3781b(c9421l0, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: q */
    public final void mo3793q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C9421l0 c9421l0 = (C9421l0) obj;
        if (c9421l0 != null) {
            ArrayList<View> arrayList3 = c9421l0.f48296f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            m17827t(c9421l0, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: r */
    public final Object mo3794r(Object obj) {
        if (obj == null) {
            return null;
        }
        C9421l0 c9421l0 = new C9421l0();
        c9421l0.m17821S((AbstractC9409f0) obj);
        return c9421l0;
    }

    /* JADX INFO: renamed from: t */
    public final void m17827t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC9409f0 abstractC9409f0 = (AbstractC9409f0) obj;
        int i10 = 0;
        if (!(abstractC9409f0 instanceof C9421l0)) {
            if (!m17826s(abstractC9409f0)) {
                ArrayList<View> arrayList3 = abstractC9409f0.f48296f;
                if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                    int size = arrayList2 == null ? 0 : arrayList2.size();
                    while (i10 < size) {
                        abstractC9409f0.mo17793d(arrayList2.get(i10));
                        i10++;
                    }
                    int size2 = arrayList.size();
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        } else {
                            abstractC9409f0.mo17780G(arrayList.get(size2));
                        }
                    }
                }
            }
        } else {
            C9421l0 c9421l0 = (C9421l0) abstractC9409f0;
            int size3 = c9421l0.f48356Y.size();
            while (i10 < size3) {
                m17827t((i10 < 0 || i10 >= c9421l0.f48356Y.size()) ? null : c9421l0.f48356Y.get(i10), arrayList, arrayList2);
                i10++;
            }
        }
    }
}
