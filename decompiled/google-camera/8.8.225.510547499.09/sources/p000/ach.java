package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ach {
    /* JADX INFO: renamed from: a */
    public static Drawable m188a(Resources resources, int i, Resources.Theme theme) {
        return resources.getDrawable(i, theme);
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m189b(Resources resources, int i, int i2, Resources.Theme theme) {
        return resources.getDrawableForDensity(i, i2, theme);
    }

    /* JADX INFO: renamed from: c */
    public static final alr m190c(Class cls, bkn bknVar, alt altVar, alz alzVar) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m191d("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), cls, bknVar, altVar, alzVar);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: d */
    public static final alr m191d(String str, Class cls, bkn bknVar, alt altVar, alz alzVar) {
        alr alrVarMo916a;
        alr alrVarM2589j = bknVar.m2589j(str);
        if (cls.isInstance(alrVarM2589j)) {
            alv alvVar = altVar instanceof alv ? (alv) altVar : null;
            if (alvVar != null) {
                alrVarM2589j.getClass();
                alvVar.mo919d(alrVarM2589j);
            }
            alrVarM2589j.getClass();
            return alrVarM2589j;
        }
        amb ambVar = new amb(alzVar);
        ambVar.m932b(alu.f668d, str);
        try {
            alrVarMo916a = altVar.mo917b(cls, ambVar);
        } catch (AbstractMethodError e) {
            alrVarMo916a = altVar.mo916a(cls);
        }
        alrVarMo916a.getClass();
        alr alrVar = (alr) bknVar.f3651a.put(str, alrVarMo916a);
        if (alrVar != null) {
            alrVar.mo923d();
        }
        return alrVarMo916a;
    }
}
