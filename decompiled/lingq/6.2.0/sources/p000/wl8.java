package p000;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wl8 implements zta {

    /* JADX INFO: renamed from: a */
    public final Application f67015a;

    /* JADX INFO: renamed from: b */
    public final yta f67016b;

    /* JADX INFO: renamed from: c */
    public final Bundle f67017c;

    /* JADX INFO: renamed from: d */
    public final AbstractC3572sf f67018d;

    /* JADX INFO: renamed from: e */
    public final fs6 f67019e;

    public wl8(Application application, vl8 vl8Var, Bundle bundle) {
        yta ytaVar;
        this.f67019e = vl8Var.mo2118t();
        this.f67018d = vl8Var.mo256K();
        this.f67017c = bundle;
        this.f67015a = application;
        if (application != null) {
            if (yta.f70451c == null) {
                yta.f70451c = new yta(application);
            }
            ytaVar = yta.f70451c;
            ytaVar.getClass();
        } else {
            ytaVar = new yta(null);
        }
        this.f67016b = ytaVar;
    }

    @Override // p000.zta
    /* JADX INFO: renamed from: a */
    public final wta mo3069a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m24054d(cls, canonicalName);
        }
        C3386nv.m17626m("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // p000.zta
    /* JADX INFO: renamed from: b */
    public final wta mo3070b(Class cls, p56 p56Var) {
        gr7 gr7Var = m58.f50615d;
        LinkedHashMap linkedHashMap = p56Var.f58099a;
        String str = (String) linkedHashMap.get(gr7Var);
        if (str == null) {
            C3386nv.m17633t("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(ci8.f10122f) == null || linkedHashMap.get(ci8.f10123g) == null) {
            if (this.f67018d != null) {
                return m24054d(cls, str);
            }
            C3386nv.m17633t("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(yta.f70452d);
        boolean zIsAssignableFrom = AbstractC3302ll.class.isAssignableFrom(cls);
        Constructor constructorM24608c = (!zIsAssignableFrom || application == null) ? xl8.m24608c(cls, xl8.f68330b) : xl8.m24608c(cls, xl8.f68329a);
        if (constructorM24608c == null) {
            return this.f67016b.mo3070b(cls, p56Var);
        }
        return (!zIsAssignableFrom || application == null) ? xl8.m24609d(cls, constructorM24608c, ci8.m4730o(p56Var)) : xl8.m24609d(cls, constructorM24608c, application, ci8.m4730o(p56Var));
    }

    @Override // p000.zta
    /* JADX INFO: renamed from: c */
    public final wta mo3071c(z21 z21Var, p56 p56Var) {
        Class cls = z21Var.f70781a;
        cls.getClass();
        return mo3070b(cls, p56Var);
    }

    /* JADX INFO: renamed from: d */
    public final wta m24054d(Class cls, String str) {
        AbstractC3572sf abstractC3572sf = this.f67018d;
        if (abstractC3572sf == null) {
            C3386nv.m17636w("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = AbstractC3302ll.class.isAssignableFrom(cls);
        Application application = this.f67015a;
        Constructor constructorM24608c = (!zIsAssignableFrom || application == null) ? xl8.m24608c(cls, xl8.f68330b) : xl8.m24608c(cls, xl8.f68329a);
        if (constructorM24608c == null) {
            if (application != null) {
                return this.f67016b.mo3069a(cls);
            }
            if (aua.f7530a == null) {
                aua.f7530a = new aua();
            }
            aua.f7530a.getClass();
            return do7.m10534j(cls);
        }
        fs6 fs6Var = this.f67019e;
        fs6Var.getClass();
        ol8 ol8VarM16236b = lid.m16236b(fs6Var, abstractC3572sf, str, this.f67017c);
        wta wtaVarM24609d = (!zIsAssignableFrom || application == null) ? xl8.m24609d(cls, constructorM24608c, ol8VarM16236b.m18105p()) : xl8.m24609d(cls, constructorM24608c, application, ol8VarM16236b.m18105p());
        wtaVarM24609d.m24154R2("androidx.lifecycle.savedstate.vm.tag", ol8VarM16236b);
        return wtaVarM24609d;
    }

    public wl8() {
        this.f67016b = new yta(null);
    }
}
