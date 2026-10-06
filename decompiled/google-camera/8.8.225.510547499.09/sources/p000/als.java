package p000;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class als extends alu {

    /* JADX INFO: renamed from: a */
    public static als f664a;

    /* JADX INFO: renamed from: b */
    public static final aly f665b = alk.f641a;

    /* JADX INFO: renamed from: e */
    private final Application f666e;

    public als() {
        this(null);
    }

    public als(Application application) {
        this.f666e = application;
    }

    /* JADX INFO: renamed from: c */
    private final alr m924c(Class cls, Application application) {
        if (!akh.class.isAssignableFrom(cls)) {
            return super.mo916a(cls);
        }
        try {
            alr alrVar = (alr) cls.getConstructor(Application.class).newInstance(application);
            alrVar.getClass();
            return alrVar;
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create an instance of ");
            sb.append(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e);
        } catch (InstantiationException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot create an instance of ");
            sb2.append(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Cannot create an instance of ");
            sb3.append(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Cannot create an instance of ");
            sb4.append(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e4);
        }
    }

    @Override // p000.alu, p000.alt
    /* JADX INFO: renamed from: a */
    public final alr mo916a(Class cls) {
        Application application = this.f666e;
        if (application != null) {
            return m924c(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // p000.alu, p000.alt
    /* JADX INFO: renamed from: b */
    public final alr mo917b(Class cls, alz alzVar) {
        if (this.f666e != null) {
            return mo916a(cls);
        }
        Application application = (Application) alzVar.mo925a(f665b);
        if (application != null) {
            return m924c(cls, application);
        }
        if (akh.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.mo916a(cls);
    }
}
