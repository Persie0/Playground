package p000;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
@jj6("dialog")
public final class fe2 extends kj6 {

    /* JADX INFO: renamed from: c */
    public final Context f38936c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0638f f38937d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f38938e = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public final d28 f38939f = new d28(this, 3);

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f38940g = new LinkedHashMap();

    public fe2(Context context, AbstractC0638f abstractC0638f) {
        this.f38936c = context;
        this.f38937d = abstractC0638f;
    }

    @Override // p000.kj6
    /* JADX INFO: renamed from: a */
    public final r86 mo10901a() {
        return new de2(this);
    }

    @Override // p000.kj6
    /* JADX INFO: renamed from: d */
    public final void mo11795d(List list, wd6 wd6Var) {
        AbstractC0638f abstractC0638f = this.f38937d;
        if (abstractC0638f.m2144Q()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y76 y76Var = (y76) it.next();
            m11799k(y76Var).m3665k0(abstractC0638f, y76Var.f69413f);
            y76 y76Var2 = (y76) u91.m22598P0((List) ((C3244l) m15273b().f35168e.f9311a).getValue());
            boolean zM22633z0 = u91.m22633z0((Iterable) ((C3244l) m15273b().f35169f.f9311a).getValue(), y76Var2);
            m15273b().m10160h(y76Var);
            if (y76Var2 != null && !zM22633z0) {
                m15273b().m10155c(y76Var2);
            }
        }
    }

    @Override // p000.kj6
    /* JADX INFO: renamed from: e */
    public final void mo11796e(d86 d86Var) {
        wb5 wb5Var;
        this.f47395a = d86Var;
        this.f47396b = true;
        Iterator it = ((List) ((C3244l) d86Var.f35168e.f9311a).getValue()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            AbstractC0638f abstractC0638f = this.f38937d;
            if (!zHasNext) {
                abstractC0638f.f5756q.add(new ue3() { // from class: ce2
                    @Override // p000.ue3
                    /* JADX INFO: renamed from: g */
                    public final void mo4569g(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, AbstractC0638f abstractC0638f2) {
                        abstractC0638f2.getClass();
                        abstractComponentCallbacksC0635c.getClass();
                        fe2 fe2Var = this.f9964a;
                        LinkedHashSet linkedHashSet = fe2Var.f38938e;
                        String str = abstractComponentCallbacksC0635c.f5680V;
                        if ((linkedHashSet instanceof tg4) && !(linkedHashSet instanceof ug4)) {
                            lda.m16113M(linkedHashSet, "kotlin.collections.MutableCollection");
                            throw null;
                        }
                        if (linkedHashSet.remove(str)) {
                            abstractComponentCallbacksC0635c.f5709m0.mo21323g(fe2Var.f38939f);
                        }
                        LinkedHashMap linkedHashMap = fe2Var.f38940g;
                        lda.m16118d(linkedHashMap).remove(abstractComponentCallbacksC0635c.f5680V);
                    }
                });
                return;
            }
            y76 y76Var = (y76) it.next();
            be2 be2Var = (be2) abstractC0638f.m2137E(y76Var.f69413f);
            if (be2Var == null || (wb5Var = be2Var.f5709m0) == null) {
                this.f38938e.add(y76Var.f69413f);
            } else {
                wb5Var.mo21323g(this.f38939f);
            }
        }
    }

    @Override // p000.kj6
    /* JADX INFO: renamed from: f */
    public final void mo11797f(y76 y76Var) {
        String str = y76Var.f69413f;
        AbstractC0638f abstractC0638f = this.f38937d;
        if (abstractC0638f.m2144Q()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        be2 be2Var = (be2) this.f38940g.get(str);
        if (be2Var == null) {
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM2137E = abstractC0638f.m2137E(str);
            be2Var = abstractComponentCallbacksC0635cM2137E instanceof be2 ? (be2) abstractComponentCallbacksC0635cM2137E : null;
        }
        if (be2Var != null) {
            be2Var.f5709m0.mo21331x(this.f38939f);
            be2Var.mo3657c0();
        }
        m11799k(y76Var).m3665k0(abstractC0638f, str);
        d86 d86VarM15273b = m15273b();
        List list = (List) ((C3244l) d86VarM15273b.f35168e.f9311a).getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            y76 y76Var2 = (y76) listIterator.previous();
            if (fa4.m11650l(y76Var2.f69413f, str)) {
                C3244l c3244l = d86VarM15273b.f35166c;
                c3244l.m15572j(null, AbstractC3489q9.m19765B(AbstractC3489q9.m19765B((Set) c3244l.getValue(), y76Var2), y76Var));
                d86VarM15273b.m10156d(y76Var);
                return;
            }
        }
        uk9.m22775i("List contains no element matching the predicate.");
    }

    @Override // p000.kj6
    /* JADX INFO: renamed from: i */
    public final void mo11798i(y76 y76Var, boolean z) {
        AbstractC0638f abstractC0638f = this.f38937d;
        if (abstractC0638f.m2144Q()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) ((C3244l) m15273b().f35168e.f9311a).getValue();
        int iIndexOf = list.indexOf(y76Var);
        Iterator it = u91.m22610b1(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM2137E = abstractC0638f.m2137E(((y76) it.next()).f69413f);
            if (abstractComponentCallbacksC0635cM2137E != null) {
                ((be2) abstractComponentCallbacksC0635cM2137E).mo3657c0();
            }
        }
        m11800l(iIndexOf, y76Var, z);
    }

    /* JADX INFO: renamed from: k */
    public final be2 m11799k(y76 y76Var) {
        r86 r86Var = y76Var.f69409b;
        r86Var.getClass();
        de2 de2Var = (de2) r86Var;
        String str = de2Var.f35492g;
        if (str == null) {
            C3386nv.m17633t("DialogFragment class was not set");
            return null;
        }
        char cCharAt = str.charAt(0);
        Context context = this.f38936c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        de3 de3VarM2140I = this.f38937d.m2140I();
        context.getClassLoader();
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM10309a = de3VarM2140I.m10309a(str);
        abstractComponentCallbacksC0635cM10309a.getClass();
        if (be2.class.isAssignableFrom(abstractComponentCallbacksC0635cM10309a.getClass())) {
            be2 be2Var = (be2) abstractComponentCallbacksC0635cM10309a;
            be2Var.m2095W(y76Var.f69415h.m170a());
            be2Var.f5709m0.mo21323g(this.f38939f);
            this.f38940g.put(y76Var.f69413f, be2Var);
            return be2Var;
        }
        StringBuilder sb = new StringBuilder("Dialog destination ");
        String str2 = de2Var.f35492g;
        if (str2 != null) {
            C3386nv.m17624j(AbstractC3393o1.m17738m(sb, str2, " is not an instance of DialogFragment"));
            return null;
        }
        C3386nv.m17633t("DialogFragment class was not set");
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m11800l(int i, y76 y76Var, boolean z) {
        y76 y76Var2 = (y76) u91.m22592J0(i - 1, (List) ((C3244l) m15273b().f35168e.f9311a).getValue());
        boolean zM22633z0 = u91.m22633z0((Iterable) ((C3244l) m15273b().f35169f.f9311a).getValue(), y76Var2);
        m15273b().m10158f(y76Var, z);
        if (y76Var2 == null || zM22633z0) {
            return;
        }
        m15273b().m10155c(y76Var2);
    }
}
