package p000;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle$State;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lid {
    /* JADX INFO: renamed from: a */
    public static final void m16235a(wta wtaVar, fs6 fs6Var, AbstractC3572sf abstractC3572sf) {
        fs6Var.getClass();
        abstractC3572sf.getClass();
        ol8 ol8Var = (ol8) wtaVar.m24156T2("androidx.lifecycle.savedstate.vm.tag");
        if (ol8Var == null || ol8Var.f54550c) {
            return;
        }
        ol8Var.m18104a(fs6Var, abstractC3572sf);
        m16237c(fs6Var, abstractC3572sf);
    }

    /* JADX INFO: renamed from: b */
    public static final ol8 m16236b(fs6 fs6Var, AbstractC3572sf abstractC3572sf, String str, Bundle bundle) {
        nl8 nl8Var;
        fs6Var.getClass();
        abstractC3572sf.getClass();
        Bundle bundleM12108m = fs6Var.m12108m(str);
        if (bundleM12108m != null) {
            bundle = bundleM12108m;
        }
        if (bundle == null) {
            nl8Var = new nl8();
        } else {
            ClassLoader classLoader = nl8.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
            MapBuilder mapBuilder = new MapBuilder(bundle.size());
            for (String str2 : bundle.keySet()) {
                str2.getClass();
                mapBuilder.put(str2, bundle.get(str2));
            }
            nl8Var = new nl8(mapBuilder.m15392b());
        }
        ol8 ol8Var = new ol8(str, nl8Var);
        ol8Var.m18104a(fs6Var, abstractC3572sf);
        m16237c(fs6Var, abstractC3572sf);
        return ol8Var;
    }

    /* JADX INFO: renamed from: c */
    public static void m16237c(fs6 fs6Var, AbstractC3572sf abstractC3572sf) {
        Lifecycle$State lifecycle$StateMo21327q = abstractC3572sf.mo21327q();
        if (lifecycle$StateMo21327q == Lifecycle$State.INITIALIZED || lifecycle$StateMo21327q.isAtLeast(Lifecycle$State.STARTED)) {
            fs6Var.m12096K();
        } else {
            abstractC3572sf.mo21323g(new kf3(2, abstractC3572sf, fs6Var));
        }
    }
}
