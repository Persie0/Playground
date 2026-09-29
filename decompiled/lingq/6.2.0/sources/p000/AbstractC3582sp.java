package p000;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: renamed from: sp */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3582sp {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m21523a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: b */
    public static OnBackInvokedCallback m21524b(Object obj, LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp) {
        Objects.requireNonNull(layoutInflaterFactory2C3804yp);
        C0854co c0854co = new C0854co(layoutInflaterFactory2C3804yp, 1);
        AbstractC3616tm.m22217l(obj).registerOnBackInvokedCallback(1000000, c0854co);
        return c0854co;
    }

    /* JADX INFO: renamed from: c */
    public static void m21525c(Object obj, Object obj2) {
        AbstractC3616tm.m22217l(obj).unregisterOnBackInvokedCallback(AbstractC3616tm.m22214i(obj2));
    }
}
