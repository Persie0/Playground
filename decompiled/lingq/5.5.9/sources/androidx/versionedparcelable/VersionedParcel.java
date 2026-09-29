package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p326q.C8446b;
import p448w4.C9811b;
import p448w4.InterfaceC9812c;

/* JADX INFO: loaded from: classes.dex */
public abstract class VersionedParcel {

    /* JADX INFO: renamed from: a */
    public final C8446b<String, Method> f7631a;

    /* JADX INFO: renamed from: b */
    public final C8446b<String, Method> f7632b;

    /* JADX INFO: renamed from: c */
    public final C8446b<String, Class> f7633c;

    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(C8446b<String, Method> c8446b, C8446b<String, Method> c8446b2, C8446b<String, Class> c8446b3) {
        this.f7631a = c8446b;
        this.f7632b = c8446b2;
        this.f7633c = c8446b3;
    }

    /* JADX INFO: renamed from: a */
    public abstract C9811b mo4617a();

    /* JADX INFO: renamed from: b */
    public final Class m4618b(Class<? extends InterfaceC9812c> cls) throws ClassNotFoundException {
        String name = cls.getName();
        C8446b<String, Class> c8446b = this.f7633c;
        Class orDefault = c8446b.getOrDefault(name, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        c8446b.put(cls.getName(), cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: c */
    public final Method m4619c(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        C8446b<String, Method> c8446b = this.f7631a;
        Method orDefault = c8446b.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        c8446b.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final Method m4620d(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C8446b<String, Method> c8446b = this.f7632b;
        Method orDefault = c8446b.getOrDefault(name, null);
        if (orDefault == null) {
            Class clsM4618b = m4618b(cls);
            System.currentTimeMillis();
            orDefault = clsM4618b.getDeclaredMethod("write", cls, VersionedParcel.class);
            c8446b.put(cls.getName(), orDefault);
        }
        return orDefault;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo4621e();

    /* JADX INFO: renamed from: f */
    public abstract byte[] mo4622f();

    /* JADX INFO: renamed from: g */
    public abstract CharSequence mo4623g();

    /* JADX INFO: renamed from: h */
    public abstract boolean mo4624h(int i10);

    /* JADX INFO: renamed from: i */
    public abstract int mo4625i();

    /* JADX INFO: renamed from: j */
    public final int m4626j(int i10, int i11) {
        return !mo4624h(i11) ? i10 : mo4625i();
    }

    /* JADX INFO: renamed from: k */
    public abstract <T extends Parcelable> T mo4627k();

    /* JADX INFO: renamed from: l */
    public final <T extends Parcelable> T m4628l(T t10, int i10) {
        return !mo4624h(i10) ? t10 : (T) mo4627k();
    }

    /* JADX INFO: renamed from: m */
    public abstract String mo4629m();

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: n */
    public final <T extends InterfaceC9812c> T m4630n() {
        String strMo4629m = mo4629m();
        if (strMo4629m == null) {
            return null;
        }
        try {
            return (T) m4619c(strMo4629m).invoke(null, mo4617a());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo4631o(int i10);

    /* JADX INFO: renamed from: p */
    public abstract void mo4632p(boolean z10);

    /* JADX INFO: renamed from: q */
    public abstract void mo4633q(byte[] bArr);

    /* JADX INFO: renamed from: r */
    public abstract void mo4634r(CharSequence charSequence);

    /* JADX INFO: renamed from: s */
    public abstract void mo4635s(int i10);

    /* JADX INFO: renamed from: t */
    public final void m4636t(int i10, int i11) {
        mo4631o(i11);
        mo4635s(i10);
    }

    /* JADX INFO: renamed from: u */
    public abstract void mo4637u(Parcelable parcelable);

    /* JADX INFO: renamed from: v */
    public abstract void mo4638v(String str);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: w */
    public final void m4639w(InterfaceC9812c interfaceC9812c) {
        if (interfaceC9812c == null) {
            mo4638v(null);
            return;
        }
        try {
            mo4638v(m4618b(interfaceC9812c.getClass()).getName());
            C9811b c9811bMo4617a = mo4617a();
            try {
                m4620d(interfaceC9812c.getClass()).invoke(null, interfaceC9812c, c9811bMo4617a);
                c9811bMo4617a.m18291x();
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (InvocationTargetException e13) {
                if (!(e13.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
                }
                throw ((RuntimeException) e13.getCause());
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(interfaceC9812c.getClass().getSimpleName().concat(" does not have a Parcelizer"), e14);
        }
    }
}
