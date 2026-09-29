package p000;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final class d28 implements rb5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34872a;

    /* JADX INFO: renamed from: b */
    public final Object f34873b;

    public /* synthetic */ d28(Object obj, int i) {
        this.f34872a = i;
        this.f34873b = obj;
    }

    @Override // p000.rb5
    /* JADX INFO: renamed from: c */
    public final void mo399c(ub5 ub5Var, Lifecycle$Event lifecycle$Event) {
        int iNextIndex;
        View view;
        int i = this.f34872a;
        Object obj = this.f34873b;
        Object obj2 = null;
        switch (i) {
            case 0:
                vl8 vl8Var = (vl8) obj;
                if (lifecycle$Event != Lifecycle$Event.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                ub5Var.mo256K().mo21331x(this);
                Bundle bundleM12108m = vl8Var.mo2118t().m12108m("androidx.savedstate.Restarter");
                if (bundleM12108m == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleM12108m.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    C3386nv.m17633t("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, d28.class.getClassLoader()).asSubclass(tl8.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                ((xw4) ((tl8) objNewInstance)).m24725a(vl8Var);
                            } catch (Exception e) {
                                ij6.m13958p(AbstractC3393o1.m17734i("Failed to instantiate ", str), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        ij6.m13958p(wq1.m24118n("Class ", str, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                uc1 uc1Var = (uc1) obj;
                if (uc1Var.f63701e == null) {
                    pc1 pc1Var = (pc1) uc1Var.getLastNonConfigurationInstance();
                    if (pc1Var != null) {
                        uc1Var.f63701e = pc1Var.f55942a;
                    }
                    if (uc1Var.f63701e == null) {
                        uc1Var.f63701e = new cua();
                    }
                }
                uc1Var.f62130a.mo21331x(this);
                return;
            case 2:
                new HashMap();
                kk3[] kk3VarArr = (kk3[]) obj;
                if (kk3VarArr.length > 0) {
                    kk3 kk3Var = kk3VarArr[0];
                    throw null;
                }
                if (kk3VarArr.length <= 0) {
                    return;
                }
                kk3 kk3Var2 = kk3VarArr[0];
                throw null;
            case 3:
                fe2 fe2Var = (fe2) obj;
                int i2 = ee2.f37100a[lifecycle$Event.ordinal()];
                if (i2 == 1) {
                    be2 be2Var = (be2) ub5Var;
                    Iterable iterable = (Iterable) ((C3244l) fe2Var.m15273b().f35168e.f9311a).getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (fa4.m11650l(((y76) it.next()).f69413f, be2Var.f5680V)) {
                                return;
                            }
                        }
                    }
                    be2Var.mo3657c0();
                    return;
                }
                if (i2 == 2) {
                    be2 be2Var2 = (be2) ub5Var;
                    for (Object obj3 : (Iterable) ((C3244l) fe2Var.m15273b().f35169f.f9311a).getValue()) {
                        if (fa4.m11650l(((y76) obj3).f69413f, be2Var2.f5680V)) {
                            obj2 = obj3;
                        }
                    }
                    y76 y76Var = (y76) obj2;
                    if (y76Var != null) {
                        fe2Var.m15273b().m10155c(y76Var);
                        return;
                    }
                    return;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        return;
                    }
                    be2 be2Var3 = (be2) ub5Var;
                    for (Object obj4 : (Iterable) ((C3244l) fe2Var.m15273b().f35169f.f9311a).getValue()) {
                        if (fa4.m11650l(((y76) obj4).f69413f, be2Var3.f5680V)) {
                            obj2 = obj4;
                        }
                    }
                    y76 y76Var2 = (y76) obj2;
                    if (y76Var2 != null) {
                        fe2Var.m15273b().m10155c(y76Var2);
                    }
                    be2Var3.f5709m0.mo21331x(this);
                    return;
                }
                be2 be2Var4 = (be2) ub5Var;
                if (be2Var4.m3663i0().isShowing()) {
                    return;
                }
                List list = (List) ((C3244l) fe2Var.m15273b().f35168e.f9311a).getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                    } else if (fa4.m11650l(((y76) listIterator.previous()).f69413f, be2Var4.f5680V)) {
                        iNextIndex = listIterator.nextIndex();
                    }
                }
                y76 y76Var3 = (y76) u91.m22592J0(iNextIndex, list);
                if (!fa4.m11650l(u91.m22598P0(list), y76Var3)) {
                    Log.i("DialogFragmentNavigator", "Dialog " + be2Var4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                }
                if (y76Var3 != null) {
                    fe2Var.m11800l(iNextIndex, y76Var3, false);
                    return;
                }
                return;
            case 4:
                if (lifecycle$Event != Lifecycle$Event.ON_STOP || (view = ((AbstractComponentCallbacksC0635c) obj).f5692d0) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 5:
                if (lifecycle$Event != Lifecycle$Event.ON_CREATE) {
                    ij6.m13951i(lifecycle$Event, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    ub5Var.mo256K().mo21331x(this);
                    ((rl8) obj).m20706b();
                    return;
                }
            default:
                if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                    eta etaVar = (eta) obj;
                    etaVar.f37832a = null;
                    etaVar.f37833b = null;
                    return;
                }
                return;
        }
    }
}
