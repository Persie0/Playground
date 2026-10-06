package androidx.savedstate;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import p000.akq;
import p000.akt;
import p000.akv;
import p000.aqk;
import p000.aqn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements akt {

    /* JADX INFO: renamed from: a */
    private final aqn f1633a;

    public Recreator(aqn aqnVar) {
        this.f1633a = aqnVar;
    }

    @Override // p000.akt
    /* JADX INFO: renamed from: a */
    public final void mo883a(akv akvVar, akq akqVar) {
        if (akqVar != akq.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        akvVar.getLifecycle().m881c(this);
        Bundle bundleM1858a = this.f1633a.getSavedStateRegistry().m1858a("androidx.savedstate.Restarter");
        if (bundleM1858a == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM1858a.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(aqk.class);
                clsAsSubclass.getClass();
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                        objNewInstance.getClass();
                        ((aqk) objNewInstance).mo869a(this.f1633a);
                    } catch (Exception e) {
                        throw new RuntimeException("Failed to instantiate ".concat(String.valueOf(str)), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException("Class " + str + " wasn't found", e3);
            }
        }
    }
}
