package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wfc {

    /* JADX INFO: renamed from: a */
    public static final Class f66783a;

    /* JADX INFO: renamed from: b */
    public static final boolean f66784b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f66783a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f66784b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m23932a() {
        return (f66783a == null || f66784b) ? false : true;
    }
}
