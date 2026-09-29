package curtains.internal;

import android.os.Build;
import android.util.Log;
import kotlin.jvm.internal.Lambda;
import p000.ui3;

/* JADX INFO: loaded from: classes.dex */
final class WindowSpy$decorViewClass$2 extends Lambda implements ui3 {

    /* JADX INFO: renamed from: b */
    public static final WindowSpy$decorViewClass$2 f34573b = new WindowSpy$decorViewClass$2(0);

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = Build.VERSION.SDK_INT;
        try {
            return Class.forName("com.android.internal.policy.DecorView");
        } catch (Throwable th) {
            Log.d("WindowSpy", "Unexpected exception loading com.android.internal.policy.DecorView on API " + i, th);
            return null;
        }
    }
}
