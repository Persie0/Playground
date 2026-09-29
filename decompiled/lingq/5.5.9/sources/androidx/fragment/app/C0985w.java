package androidx.fragment.app;

import android.support.v4.media.C0141b;
import p326q.C8452h;

/* JADX INFO: renamed from: androidx.fragment.app.w */
/* JADX INFO: loaded from: classes.dex */
public class C0985w {

    /* JADX INFO: renamed from: a */
    public static final C8452h<ClassLoader, C8452h<String, Class<?>>> f6427a = new C8452h<>();

    /* JADX INFO: renamed from: b */
    public static Class<?> m3817b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C8452h<ClassLoader, C8452h<String, Class<?>>> c8452h = f6427a;
        C8452h<String, Class<?>> orDefault = c8452h.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new C8452h<>();
            c8452h.put(classLoader, orDefault);
        }
        Class<?> orDefault2 = orDefault.getOrDefault(str, null);
        if (orDefault2 != null) {
            return orDefault2;
        }
        Class<?> cls = Class.forName(str, false, classLoader);
        orDefault.put(str, cls);
        return cls;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static Class<? extends Fragment> m3818c(ClassLoader classLoader, String str) {
        try {
            return m3817b(classLoader, str);
        } catch (ClassCastException e10) {
            throw new Fragment.InstantiationException(C0141b.m611g("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new Fragment.InstantiationException(C0141b.m611g("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public Fragment mo3674a(String str) {
        throw null;
    }
}
