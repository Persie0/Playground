package p000;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle$State;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.AbstractC3192a;

/* JADX INFO: loaded from: classes.dex */
public final class y76 implements ub5, dua, gr3, vl8 {

    /* JADX INFO: renamed from: a */
    public final C3002fi f69408a;

    /* JADX INFO: renamed from: b */
    public r86 f69409b;

    /* JADX INFO: renamed from: c */
    public final Bundle f69410c;

    /* JADX INFO: renamed from: d */
    public Lifecycle$State f69411d;

    /* JADX INFO: renamed from: e */
    public final i86 f69412e;

    /* JADX INFO: renamed from: f */
    public final String f69413f;

    /* JADX INFO: renamed from: g */
    public final Bundle f69414g;

    /* JADX INFO: renamed from: h */
    public final a86 f69415h = new a86(this);

    public y76(C3002fi c3002fi, r86 r86Var, Bundle bundle, Lifecycle$State lifecycle$State, i86 i86Var, String str, Bundle bundle2) {
        this.f69408a = c3002fi;
        this.f69409b = r86Var;
        this.f69410c = bundle;
        this.f69411d = lifecycle$State;
        this.f69412e = i86Var;
        this.f69413f = str;
        this.f69414g = bundle2;
        AbstractC3192a.m15356a(new C3757xf(this, 22));
    }

    @Override // p000.ub5
    /* JADX INFO: renamed from: K */
    public final AbstractC3572sf mo256K() {
        return this.f69415h.f347j;
    }

    /* JADX INFO: renamed from: a */
    public final void m24978a(Lifecycle$State lifecycle$State) {
        lifecycle$State.getClass();
        a86 a86Var = this.f69415h;
        a86Var.getClass();
        a86Var.f348k = lifecycle$State;
        a86Var.m171b();
    }

    @Override // p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return this.f69415h.f349l;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    @Override // p000.gr3
    /* JADX INFO: renamed from: e */
    public final p56 mo2103e() {
        Application application;
        a86 a86Var = this.f69415h;
        a86Var.getClass();
        p56 p56Var = new p56(0);
        u06 u06Var = ci8.f10122f;
        y76 y76Var = a86Var.f338a;
        LinkedHashMap linkedHashMap = p56Var.f58099a;
        linkedHashMap.put(u06Var, y76Var);
        linkedHashMap.put(ci8.f10123g, y76Var);
        Bundle bundleM170a = a86Var.m170a();
        if (bundleM170a != null) {
            linkedHashMap.put(ci8.f10124h, bundleM170a);
        }
        C3002fi c3002fi = this.f69408a;
        if (c3002fi != null) {
            Context applicationContext = c3002fi.f39115a.getApplicationContext();
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            } else {
                application = null;
            }
        } else {
            application = null;
        }
        Application application2 = application != null ? application : null;
        if (application2 != null) {
            linkedHashMap.put(yta.f70452d, application2);
        }
        return p56Var;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof y76)) {
            y76 y76Var = (y76) obj;
            Bundle bundle = y76Var.f69410c;
            if (fa4.m11650l(this.f69413f, y76Var.f69413f) && fa4.m11650l(this.f69409b, y76Var.f69409b) && fa4.m11650l(this.f69415h.f347j, y76Var.f69415h.f347j) && fa4.m11650l(mo2118t(), y76Var.mo2118t())) {
                Bundle bundle2 = this.f69410c;
                if (fa4.m11650l(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!fa4.m11650l(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f69409b.hashCode() + (this.f69413f.hashCode() * 31);
        Bundle bundle = this.f69410c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return mo2118t().hashCode() + ((this.f69415h.f347j.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // p000.dua
    /* JADX INFO: renamed from: r */
    public final cua mo2116r() {
        a86 a86Var = this.f69415h;
        if (!a86Var.f346i) {
            C3386nv.m17633t("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (a86Var.f347j.f66586d == Lifecycle$State.DESTROYED) {
            C3386nv.m17633t("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        i86 i86Var = a86Var.f342e;
        if (i86Var == null) {
            C3386nv.m17633t("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        String str = a86Var.f343f;
        str.getClass();
        LinkedHashMap linkedHashMap = i86Var.f43688b;
        cua cuaVar = (cua) linkedHashMap.get(str);
        if (cuaVar != null) {
            return cuaVar;
        }
        cua cuaVar2 = new cua();
        linkedHashMap.put(str, cuaVar2);
        return cuaVar2;
    }

    @Override // p000.vl8
    /* JADX INFO: renamed from: t */
    public final fs6 mo2118t() {
        return (fs6) this.f69415h.f345h.f39591c;
    }

    public final String toString() {
        return this.f69415h.toString();
    }
}
