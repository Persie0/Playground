package p000;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class yta extends aua {

    /* JADX INFO: renamed from: c */
    public static yta f70451c;

    /* JADX INFO: renamed from: d */
    public static final u06 f70452d = new u06(17);

    /* JADX INFO: renamed from: b */
    public final Application f70453b;

    public yta(Application application) {
        this.f70453b = application;
    }

    @Override // p000.aua, p000.zta
    /* JADX INFO: renamed from: a */
    public final wta mo3069a(Class cls) {
        Application application = this.f70453b;
        if (application != null) {
            return m25316d(cls, application);
        }
        C3386nv.m17636w("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // p000.aua, p000.zta
    /* JADX INFO: renamed from: b */
    public final wta mo3070b(Class cls, p56 p56Var) {
        if (this.f70453b != null) {
            return mo3069a(cls);
        }
        Application application = (Application) p56Var.f58099a.get(f70452d);
        if (application != null) {
            return m25316d(cls, application);
        }
        if (!AbstractC3302ll.class.isAssignableFrom(cls)) {
            return do7.m10534j(cls);
        }
        C3386nv.m17626m("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final wta m25316d(Class cls, Application application) {
        if (!AbstractC3302ll.class.isAssignableFrom(cls)) {
            return do7.m10534j(cls);
        }
        try {
            wta wtaVar = (wta) cls.getConstructor(Application.class).newInstance(application);
            wtaVar.getClass();
            return wtaVar;
        } catch (IllegalAccessException e) {
            v63.m23137o("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            v63.m23137o("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            v63.m23137o("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            v63.m23137o("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
