package curtains;

import android.view.View;
import android.view.Window;
import curtains.internal.AbstractC2903d;
import java.lang.reflect.Field;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.C3386nv;
import p000.cs4;

/* JADX INFO: renamed from: curtains.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2899b {
    static {
        AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, WindowsKt$tooltipString$2.f34564b);
    }

    /* JADX INFO: renamed from: a */
    public static final Window m9900a(View view) throws IllegalAccessException {
        Field field;
        view.getClass();
        cs4 cs4Var = AbstractC2903d.f34584a;
        View rootView = view.getRootView();
        rootView.getClass();
        Class cls = (Class) AbstractC2903d.f34584a.getValue();
        if (cls != null && cls.isInstance(rootView) && (field = (Field) AbstractC2903d.f34585b.getValue()) != null) {
            Object obj = field.get(rootView);
            if (obj != null) {
                return (Window) obj;
            }
            C3386nv.m17635v("null cannot be cast to non-null type android.view.Window");
        }
        return null;
    }
}
