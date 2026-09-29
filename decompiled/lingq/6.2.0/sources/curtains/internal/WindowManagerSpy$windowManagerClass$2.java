package curtains.internal;

import android.util.Log;
import kotlin.jvm.internal.Lambda;
import p000.ui3;

/* JADX INFO: loaded from: classes.dex */
final class WindowManagerSpy$windowManagerClass$2 extends Lambda implements ui3 {

    /* JADX INFO: renamed from: b */
    public static final WindowManagerSpy$windowManagerClass$2 f34571b = new WindowManagerSpy$windowManagerClass$2(0);

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        try {
            return Class.forName("android.view.WindowManagerGlobal");
        } catch (Throwable th) {
            Log.w("WindowManagerSpy", th);
            return null;
        }
    }
}
