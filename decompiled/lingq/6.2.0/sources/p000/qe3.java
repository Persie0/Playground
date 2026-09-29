package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.fragment.app.C0637e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
@jj6("fragment")
public class qe3 extends kj6 {

    /* JADX INFO: renamed from: c */
    public final Context f57635c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0638f f57636d;

    /* JADX INFO: renamed from: e */
    public final int f57637e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f57638f = new LinkedHashSet();

    /* JADX INFO: renamed from: g */
    public final ArrayList f57639g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final oe3 f57640h = new oe3(this, 0);

    /* JADX INFO: renamed from: i */
    public final C0011a9 f57641i = new C0011a9(this, 19);

    /* JADX INFO: renamed from: qe3$a */
    public static final class C3495a extends wta {

        /* JADX INFO: renamed from: b */
        public WeakReference f57642b;

        @Override // p000.wta
        /* JADX INFO: renamed from: U2 */
        public final void mo8918U2() {
            WeakReference weakReference = this.f57642b;
            if (weakReference == null) {
                fa4.m11636J("completeTransition");
                throw null;
            }
            ui3 ui3Var = (ui3) weakReference.get();
            if (ui3Var != null) {
                ui3Var.mo0a();
            }
        }
    }

    public qe3(Context context, AbstractC0638f abstractC0638f, int i) {
        this.f57635c = context;
        this.f57636d = abstractC0638f;
        this.f57637e = i;
    }

    /* JADX INFO: renamed from: k */
    public static void m19891k(qe3 qe3Var, String str, int i) {
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) != 0;
        ArrayList arrayList = qe3Var.f57639g;
        if (z2) {
            u91.m22606X0(new jd0(str, 8), arrayList);
        }
        arrayList.add(new Pair(str, Boolean.valueOf(z)));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m19892n() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    @Override // p000.kj6
    /* JADX INFO: renamed from: a */
    public final r86 mo10901a() {
        return new re3(this);
    }

    @Override // p000.kj6
    /* JADX INFO: renamed from: d */
    public final void mo11795d(List list, wd6 wd6Var) {
        AbstractC0638f abstractC0638f = this.f57636d;
        if (abstractC0638f.m2144Q()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y76 y76Var = (y76) it.next();
            boolean zIsEmpty = ((List) ((C3244l) m15273b().f35168e.f9311a).getValue()).isEmpty();
            if (wd6Var == null || zIsEmpty || !wd6Var.f66650b || !this.f57638f.remove(y76Var.f69413f)) {
                g70 g70VarM19894m = m19894m(y76Var, wd6Var);
                String str = y76Var.f69413f;
                if (!zIsEmpty) {
                    y76 y76Var2 = (y76) u91.m22598P0((List) ((C3244l) m15273b().f35168e.f9311a).getValue());
                    if (y76Var2 != null) {
                        m19891k(this, y76Var2.f69413f, 6);
                    }
                    m19891k(this, str, 6);
                    g70VarM19894m.m12393c(str);
                }
                g70VarM19894m.m12396f();
                if (m19892n()) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + y76Var);
                }
                m15273b().m10160h(y76Var);
            } else {
                abstractC0638f.m2189x(new C0637e(abstractC0638f, y76Var.f69413f, 0), false);
                m15273b().m10160h(y76Var);
            }
        }
    }

    @Override // p000.kj6
    /* JADX INFO: renamed from: e */
    public final void mo11796e(final d86 d86Var) {
        this.f47395a = d86Var;
        this.f47396b = true;
        if (m19892n()) {
            Log.v("FragmentNavigator", "onAttach");
        }
        ue3 ue3Var = new ue3() { // from class: pe3
            @Override // p000.ue3
            /* JADX INFO: renamed from: g */
            public final void mo4569g(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, AbstractC0638f abstractC0638f) {
                Object objPrevious;
                abstractC0638f.getClass();
                abstractComponentCallbacksC0635c.getClass();
                d86 d86Var2 = d86Var;
                List list = (List) ((C3244l) d86Var2.f35168e.f9311a).getValue();
                ListIterator listIterator = list.listIterator(list.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (!fa4.m11650l(((y76) objPrevious).f69413f, abstractComponentCallbacksC0635c.f5680V));
                y76 y76Var = (y76) objPrevious;
                boolean zM19892n = qe3.m19892n();
                qe3 qe3Var = this;
                if (zM19892n) {
                    Log.v("FragmentNavigator", "Attaching fragment " + abstractComponentCallbacksC0635c + " associated with entry " + y76Var + " to FragmentManager " + qe3Var.f57636d);
                }
                if (y76Var != null) {
                    abstractComponentCallbacksC0635c.f5711o0.m23763d(abstractComponentCallbacksC0635c, new te3(new bb0(qe3Var, abstractComponentCallbacksC0635c, y76Var, 8), 0));
                    abstractComponentCallbacksC0635c.f5709m0.mo21323g(qe3Var.f57640h);
                    qe3Var.m19893l(abstractComponentCallbacksC0635c, y76Var, d86Var2);
                }
            }
        };
        AbstractC0638f abstractC0638f = this.f57636d;
        abstractC0638f.f5756q.add(ue3Var);
        abstractC0638f.f5754o.add(new se3(d86Var, this));
    }

    @Override // p000.kj6
    /* JADX INFO: renamed from: f */
    public final void mo11797f(y76 y76Var) {
        String str = y76Var.f69413f;
        AbstractC0638f abstractC0638f = this.f57636d;
        if (abstractC0638f.m2144Q()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        g70 g70VarM19894m = m19894m(y76Var, null);
        List list = (List) ((C3244l) m15273b().f35168e.f9311a).getValue();
        if (list.size() > 1) {
            y76 y76Var2 = (y76) u91.m22592J0(list.size() - 2, list);
            if (y76Var2 != null) {
                m19891k(this, y76Var2.f69413f, 6);
            }
            m19891k(this, str, 4);
            abstractC0638f.m2148U(str);
            m19891k(this, str, 2);
            g70VarM19894m.m12393c(str);
        }
        g70VarM19894m.m12396f();
        m15273b().m10156d(y76Var);
    }

    @Override // p000.kj6
    /* JADX INFO: renamed from: g */
    public final void mo15274g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f57638f;
            linkedHashSet.clear();
            u91.m22630w0(stringArrayList, linkedHashSet);
        }
    }

    @Override // p000.kj6
    /* JADX INFO: renamed from: h */
    public final Bundle mo15275h() {
        LinkedHashSet linkedHashSet = this.f57638f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return omd.m18160p(new Pair("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // p000.kj6
    /* JADX INFO: renamed from: i */
    public final void mo11798i(y76 y76Var, boolean z) {
        AbstractC0638f abstractC0638f = this.f57636d;
        if (abstractC0638f.m2144Q()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) ((C3244l) m15273b().f35168e.f9311a).getValue();
        int iIndexOf = list.indexOf(y76Var);
        List listSubList = list.subList(iIndexOf, list.size());
        y76 y76Var2 = (y76) u91.m22589G0(list);
        int i = 1;
        y76 y76Var3 = (y76) u91.m22592J0(iIndexOf - 1, list);
        if (y76Var3 != null) {
            m19891k(this, y76Var3.f69413f, 6);
        }
        List list2 = listSubList;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    m19891k(this, ((y76) it2.next()).f69413f, 4);
                }
                if (z) {
                    for (y76 y76Var4 : u91.m22610b1(list2)) {
                        if (fa4.m11650l(y76Var4, y76Var2)) {
                            Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + y76Var4);
                        } else {
                            abstractC0638f.m2189x(new C0637e(abstractC0638f, y76Var4.f69413f, i), false);
                            this.f57638f.add(y76Var4.f69413f);
                        }
                    }
                } else {
                    abstractC0638f.m2148U(y76Var.f69413f);
                }
                if (m19892n()) {
                    Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + y76Var + " with savedState " + z);
                }
                m15273b().m10158f(y76Var, z);
                return;
            }
            Object next = it.next();
            y76 y76Var5 = (y76) next;
            ArrayList arrayList2 = this.f57639g;
            arrayList2.getClass();
            String str = y76Var5.f69413f;
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    i2 = -1;
                    break;
                }
                Pair pair = (Pair) it3.next();
                pair.getClass();
                String str2 = (String) pair.f47623a;
                if (i2 < 0) {
                    vz1.m23628e0();
                    throw null;
                }
                if (fa4.m11650l(str, str2)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 >= 0 || !fa4.m11650l(y76Var5.f69413f, y76Var2.f69413f)) {
                arrayList.add(next);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m19893l(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, y76 y76Var, d86 d86Var) {
        abstractComponentCallbacksC0635c.getClass();
        cua cuaVarMo2116r = abstractComponentCallbacksC0635c.mo2116r();
        d54 d54Var = new d54(0);
        d54Var.m10098a(y38.m24933a(C3495a.class), new C2951e4(27));
        C3601t7 c3601t7M10100c = d54Var.m10100c();
        or1 or1Var = or1.f54780b;
        or1Var.getClass();
        ny8 ny8Var = new ny8(cuaVarMo2116r, c3601t7M10100c, or1Var);
        z21 z21VarM24933a = y38.m24933a(C3495a.class);
        String strM25413b = z21VarM24933a.m25413b();
        if (strM25413b == null) {
            C3386nv.m17626m("Local and anonymous classes can not be ViewModels");
        } else {
            ((C3495a) ny8Var.m17675B(z21VarM24933a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM25413b))).f57642b = new WeakReference(new C3006fm(y76Var, d86Var, this, abstractComponentCallbacksC0635c));
        }
    }

    /* JADX INFO: renamed from: m */
    public final g70 m19894m(y76 y76Var, wd6 wd6Var) {
        r86 r86Var = y76Var.f69409b;
        r86Var.getClass();
        Bundle bundleM170a = y76Var.f69415h.m170a();
        String str = ((re3) r86Var).f59156g;
        if (str == null) {
            C3386nv.m17633t("Fragment class was not set");
            return null;
        }
        char cCharAt = str.charAt(0);
        Context context = this.f57635c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        AbstractC0638f abstractC0638f = this.f57636d;
        de3 de3VarM2140I = abstractC0638f.m2140I();
        context.getClassLoader();
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM10309a = de3VarM2140I.m10309a(str);
        abstractComponentCallbacksC0635cM10309a.getClass();
        abstractComponentCallbacksC0635cM10309a.m2095W(bundleM170a);
        g70 g70Var = new g70(abstractC0638f);
        int i = wd6Var != null ? wd6Var.f66654f : -1;
        int i2 = wd6Var != null ? wd6Var.f66655g : -1;
        int i3 = wd6Var != null ? wd6Var.f66656h : -1;
        int i4 = wd6Var != null ? wd6Var.f66657i : -1;
        if (i != -1 || i2 != -1 || i3 != -1 || i4 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            int i5 = i4 != -1 ? i4 : 0;
            g70Var.f40288b = i;
            g70Var.f40289c = i2;
            g70Var.f40290d = i3;
            g70Var.f40291e = i5;
        }
        String str2 = y76Var.f69413f;
        int i6 = this.f57637e;
        if (i6 == 0) {
            C3386nv.m17626m("Must use non-zero containerViewId");
            return null;
        }
        g70Var.m12398h(i6, abstractComponentCallbacksC0635cM10309a, str2, 2);
        g70Var.m12402l(abstractComponentCallbacksC0635cM10309a);
        g70Var.f40302p = true;
        return g70Var;
    }
}
