package p000;

/* JADX INFO: renamed from: fg */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3000fg {

    /* JADX INFO: renamed from: a */
    public static final Class f39030a;

    /* JADX INFO: renamed from: b */
    public static final boolean f39031b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f39030a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f39031b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11816a() {
        return (f39030a == null || f39031b) ? false : true;
    }
}
