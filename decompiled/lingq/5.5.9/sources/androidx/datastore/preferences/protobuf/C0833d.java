package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0833d {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f5836a;

    /* JADX INFO: renamed from: b */
    public static final boolean f5837b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f5836a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f5837b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3200a() {
        return (f5836a == null || f5837b) ? false : true;
    }
}
