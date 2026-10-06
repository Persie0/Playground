package p000;

import com.google.android.apps.camera.filmstrip.GlideConfiguration;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class dkm {
    /* JADX INFO: renamed from: a */
    public static void m6315a(kbo kboVar, nps npsVar, String str, String str2) {
        kxk.m14975U(npsVar, new fgf(kboVar, str, str2, 1), not.INSTANCE);
    }

    /* JADX INFO: renamed from: b */
    public static GlideConfiguration m6316b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object objNewInstance = null;
            try {
                objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                m6317c(cls, e);
            } catch (InstantiationException e2) {
                m6317c(cls, e2);
            } catch (NoSuchMethodException e3) {
                m6317c(cls, e3);
            } catch (InvocationTargetException e4) {
                m6317c(cls, e4);
            }
            if (objNewInstance instanceof GlideConfiguration) {
                return (GlideConfiguration) objNewInstance;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: ".concat(String.valueOf(String.valueOf(objNewInstance))));
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m6317c(Class cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(String.valueOf(cls))), exc);
    }
}
