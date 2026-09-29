package curtains.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Lambda;
import p000.cs4;
import p000.ui3;

/* JADX INFO: loaded from: classes.dex */
final class WindowManagerSpy$mViewsField$2 extends Lambda implements ui3 {

    /* JADX INFO: renamed from: b */
    public static final WindowManagerSpy$mViewsField$2 f34570b = new WindowManagerSpy$mViewsField$2(0);

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() throws NoSuchFieldException {
        cs4 cs4Var = C2902c.f34581a;
        Class cls = (Class) C2902c.f34581a.getValue();
        if (cls == null) {
            return null;
        }
        Field declaredField = cls.getDeclaredField("mViews");
        declaredField.setAccessible(true);
        return declaredField;
    }
}
