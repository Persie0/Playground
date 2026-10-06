package p000;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class alo extends alv implements alt {

    /* JADX INFO: renamed from: a */
    private Application f651a;

    /* JADX INFO: renamed from: b */
    private final alt f652b;

    /* JADX INFO: renamed from: c */
    private Bundle f653c;

    /* JADX INFO: renamed from: d */
    private aks f654d;

    /* JADX INFO: renamed from: e */
    private aqm f655e;

    public alo() {
        this.f652b = new als();
    }

    @Override // p000.alt
    /* JADX INFO: renamed from: a */
    public final alr mo916a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m918c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // p000.alt
    /* JADX INFO: renamed from: b */
    public final alr mo917b(Class cls, alz alzVar) {
        String str = (String) alzVar.mo925a(alu.f668d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (alzVar.mo925a(all.f643a) == null || alzVar.mo925a(all.f644b) == null) {
            if (this.f654d != null) {
                return m918c(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) alzVar.mo925a(als.f665b);
        boolean zIsAssignableFrom = akh.class.isAssignableFrom(cls);
        Constructor constructorM921b = (!zIsAssignableFrom || application == null) ? alp.m921b(cls, alp.f657b) : alp.m921b(cls, alp.f656a);
        if (constructorM921b == null) {
            return this.f652b.mo917b(cls, alzVar);
        }
        return (!zIsAssignableFrom || application == null) ? alp.m920a(cls, constructorM921b, all.m911a(alzVar)) : alp.m920a(cls, constructorM921b, application, all.m911a(alzVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final alr m918c(String str, Class cls) {
        Object obj;
        Application application;
        if (this.f654d == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = akh.class.isAssignableFrom(cls);
        Constructor constructorM921b = (!zIsAssignableFrom || this.f651a == null) ? alp.m921b(cls, alp.f657b) : alp.m921b(cls, alp.f656a);
        if (constructorM921b == null) {
            if (this.f651a != null) {
                return this.f652b.mo916a(cls);
            }
            if (alu.f667c == null) {
                alu.f667c = new alu();
            }
            alu aluVar = alu.f667c;
            aluVar.getClass();
            return aluVar.mo916a(cls);
        }
        aqm aqmVar = this.f655e;
        aks aksVar = this.f654d;
        Bundle bundle = this.f653c;
        Bundle bundleM1858a = aqmVar.m1858a(str);
        Class[] clsArr = alj.f635a;
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, aby.m174b(bundleM1858a, bundle));
        savedStateHandleController.m1463b(aqmVar, aksVar);
        abv.m167e(aqmVar, aksVar);
        alr alrVarM920a = (!zIsAssignableFrom || (application = this.f651a) == null) ? alp.m920a(cls, constructorM921b, savedStateHandleController.f1525b) : alp.m920a(cls, constructorM921b, application, savedStateHandleController.f1525b);
        synchronized (alrVarM920a.f661h) {
            obj = alrVarM920a.f661h.get("androidx.lifecycle.savedstate.vm.tag");
            if (obj == null) {
                alrVarM920a.f661h.put("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
            }
        }
        if (obj != null) {
            savedStateHandleController = obj;
        }
        if (alrVarM920a.f663j) {
            alr.m922g(savedStateHandleController);
        }
        return alrVarM920a;
    }

    @Override // p000.alv
    /* JADX INFO: renamed from: d */
    public final void mo919d(alr alrVar) {
        aks aksVar = this.f654d;
        if (aksVar != null) {
            abv.m166d(alrVar, this.f655e, aksVar);
        }
    }

    public alo(Application application, aqn aqnVar, Bundle bundle) {
        als alsVar;
        this.f655e = aqnVar.getSavedStateRegistry();
        this.f654d = aqnVar.getLifecycle();
        this.f653c = bundle;
        this.f651a = application;
        if (application != null) {
            if (als.f664a == null) {
                als.f664a = new als(application);
            }
            alsVar = als.f664a;
            alsVar.getClass();
        } else {
            alsVar = new als();
        }
        this.f652b = alsVar;
    }
}
