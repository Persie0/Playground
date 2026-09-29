package curtains.internal;

import kotlin.jvm.internal.Lambda;
import p000.cs4;
import p000.ui3;

/* JADX INFO: loaded from: classes.dex */
final class WindowManagerSpy$windowManagerInstance$2 extends Lambda implements ui3 {

    /* JADX INFO: renamed from: b */
    public static final WindowManagerSpy$windowManagerInstance$2 f34572b = new WindowManagerSpy$windowManagerInstance$2(0);

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        cs4 cs4Var = C2902c.f34581a;
        Class cls = (Class) C2902c.f34581a.getValue();
        if (cls != null) {
            return cls.getMethod("getInstance", null).invoke(null, null);
        }
        return null;
    }
}
