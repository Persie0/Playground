package p000;

import android.os.Build;
import dalvik.system.VMStack;

/* JADX INFO: loaded from: classes.dex */
public final class xfb extends tfb {

    /* JADX INFO: renamed from: b */
    public static final jj5 f68158b;

    static {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            wfb.class.getName().equals(m24487a());
        } catch (Throwable unused) {
        }
        String str = Build.FINGERPRINT;
        if (str != null) {
            "robolectric".equals(str);
        }
        f68158b = new jj5(18);
    }

    /* JADX INFO: renamed from: a */
    public static String m24487a() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }
}
