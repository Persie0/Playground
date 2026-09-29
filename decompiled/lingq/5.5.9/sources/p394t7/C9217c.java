package p394t7;

import android.util.Log;
import dm.C5207g;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: t7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9217c {

    /* JADX INFO: renamed from: a */
    public static final C9217c f47826a = new C9217c();

    /* JADX INFO: renamed from: b */
    public static final String f47827b = C9217c.class.getCanonicalName();

    /* JADX INFO: renamed from: c */
    public static Class<?> f47828c;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final void m17565a(String str, String str2) {
        try {
            if (f47828c == null) {
                f47826a.getClass();
                f47828c = Class.forName("com.unity3d.player.UnityPlayer");
            }
            Class<?> cls = f47828c;
            if (cls == null) {
                C5207g.m11117l("unityPlayer");
                throw null;
            }
            Method method = cls.getMethod("UnitySendMessage", String.class, String.class, String.class);
            Class<?> cls2 = f47828c;
            if (cls2 != null) {
                method.invoke(cls2, "UnityFacebookSDKPlugin", str, str2);
            } else {
                C5207g.m11117l("unityPlayer");
                throw null;
            }
        } catch (Exception e10) {
            Log.e(f47827b, "Failed to send message to Unity", e10);
        }
    }
}
