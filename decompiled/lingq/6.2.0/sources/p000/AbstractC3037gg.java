package p000;

/* JADX INFO: renamed from: gg */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3037gg {

    /* JADX INFO: renamed from: a */
    public static final Class f40753a;

    /* JADX INFO: renamed from: b */
    public static final boolean f40754b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f40753a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f40754b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12571a() {
        return (f40753a == null || f40754b) ? false : true;
    }
}
