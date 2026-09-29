package p000;

/* JADX INFO: renamed from: hg */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3074hg {

    /* JADX INFO: renamed from: a */
    public static final Class f42313a;

    /* JADX INFO: renamed from: b */
    public static final boolean f42314b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f42313a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f42314b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m13220a() {
        return (f42313a == null || f42314b) ? false : true;
    }
}
