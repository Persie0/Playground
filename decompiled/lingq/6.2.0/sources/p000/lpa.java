package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lpa {

    /* JADX INFO: renamed from: a */
    public final C3275kv f49990a;

    /* JADX INFO: renamed from: b */
    public final C3275kv f49991b;

    /* JADX INFO: renamed from: c */
    public final C3275kv f49992c;

    public lpa(C3275kv c3275kv, C3275kv c3275kv2, C3275kv c3275kv3) {
        this.f49990a = c3275kv;
        this.f49991b = c3275kv2;
        this.f49992c = c3275kv3;
    }

    /* JADX INFO: renamed from: a */
    public abstract mpa mo16429a();

    /* JADX INFO: renamed from: b */
    public final Class m16430b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C3275kv c3275kv = this.f49992c;
        Class cls2 = (Class) c3275kv.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c3275kv.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: c */
    public final Method m16431c(String str) throws NoSuchMethodException {
        C3275kv c3275kv = this.f49990a;
        Method method = (Method) c3275kv.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, lpa.class.getClassLoader()).getDeclaredMethod("read", lpa.class);
        c3275kv.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: d */
    public final Method m16432d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C3275kv c3275kv = this.f49991b;
        Method method = (Method) c3275kv.get(name);
        if (method != null) {
            return method;
        }
        Class clsM16430b = m16430b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM16430b.getDeclaredMethod("write", cls, lpa.class);
        c3275kv.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo16433e(int i);

    /* JADX INFO: renamed from: f */
    public final int m16434f(int i, int i2) {
        return !mo16433e(i2) ? i : ((mpa) this).f51707e.readInt();
    }

    /* JADX INFO: renamed from: g */
    public final Parcelable m16435g(Parcelable parcelable, int i) {
        if (!mo16433e(i)) {
            return parcelable;
        }
        return ((mpa) this).f51707e.readParcelable(mpa.class.getClassLoader());
    }

    /* JADX INFO: renamed from: h */
    public final npa m16436h() {
        String string = ((mpa) this).f51707e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (npa) m16431c(string).invoke(null, mo16429a());
        } catch (ClassNotFoundException e) {
            ij6.m13958p("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            ij6.m13958p("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            ij6.m13958p("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            ij6.m13958p("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo16437i(int i);

    /* JADX INFO: renamed from: j */
    public final void m16438j(int i, int i2) {
        mo16437i(i2);
        ((mpa) this).f51707e.writeInt(i);
    }

    /* JADX INFO: renamed from: k */
    public final void m16439k(Parcelable parcelable, int i) {
        mo16437i(i);
        ((mpa) this).f51707e.writeParcelable(parcelable, 0);
    }

    /* JADX INFO: renamed from: l */
    public final void m16440l(npa npaVar) {
        if (npaVar == null) {
            ((mpa) this).f51707e.writeString(null);
            return;
        }
        try {
            ((mpa) this).f51707e.writeString(m16430b(npaVar.getClass()).getName());
            mpa mpaVarMo16429a = mo16429a();
            try {
                m16432d(npaVar.getClass()).invoke(null, npaVar, mpaVarMo16429a);
                Parcel parcel = mpaVarMo16429a.f51707e;
                int i = mpaVarMo16429a.f51711i;
                if (i >= 0) {
                    int i2 = mpaVarMo16429a.f51706d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                ij6.m13958p("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                ij6.m13958p("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                ij6.m13958p("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                ij6.m13958p("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            ij6.m13958p(npaVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
