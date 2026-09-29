package curtains.internal;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Lambda;
import p000.ui3;

/* JADX INFO: loaded from: classes.dex */
final class WindowSpy$windowField$2 extends Lambda implements ui3 {

    /* JADX INFO: renamed from: b */
    public static final WindowSpy$windowField$2 f34574b = new WindowSpy$windowField$2(0);

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        Class cls = (Class) AbstractC2903d.f34584a.getValue();
        if (cls != null) {
            int i = Build.VERSION.SDK_INT;
            try {
                Field declaredField = cls.getDeclaredField("mWindow");
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException e) {
                Log.d("WindowSpy", "Unexpected exception retrieving " + cls + "#mWindow on API " + i, e);
            }
        }
        return null;
    }
}
