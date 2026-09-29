package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class onb {

    /* JADX INFO: renamed from: a */
    public static final Class f54625a;

    /* JADX INFO: renamed from: b */
    public static final boolean f54626b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f54625a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f54626b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m18176a() {
        return (f54625a == null || f54626b) ? false : true;
    }
}
