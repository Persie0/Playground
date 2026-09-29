package curtains.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Lambda;
import p000.ui3;

/* JADX INFO: loaded from: classes2.dex */
final class WindowCallbackWrapper$Companion$jetpackWrappedField$2 extends Lambda implements ui3 {

    /* JADX INFO: renamed from: b */
    public static final WindowCallbackWrapper$Companion$jetpackWrappedField$2 f34568b = new WindowCallbackWrapper$Companion$jetpackWrappedField$2(0);

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        Class cls = (Class) WindowCallbackC2901b.f34575d.getValue();
        if (cls == null) {
            return null;
        }
        try {
            Field declaredField = cls.getDeclaredField("mWrapped");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }
}
