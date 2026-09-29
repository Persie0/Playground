package p000;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
public final class tk8 {

    /* JADX INFO: renamed from: a */
    public final ClassLoader f62455a;

    /* JADX INFO: renamed from: b */
    public final qn3 f62456b;

    /* JADX INFO: renamed from: c */
    public final cc4 f62457c;

    public tk8(ClassLoader classLoader, qn3 qn3Var) {
        this.f62455a = classLoader;
        this.f62456b = qn3Var;
        this.f62457c = new cc4(classLoader);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m22188d(tk8 tk8Var) throws NoSuchMethodException, ClassNotFoundException {
        Class<?> clsLoadClass = tk8Var.f62455a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        clsLoadClass.getClass();
        Method method = clsLoadClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
        Method method2 = clsLoadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        method.getClass();
        if (!Modifier.isPublic(method.getModifiers())) {
            return false;
        }
        method2.getClass();
        return Modifier.isPublic(method2.getModifiers());
    }

    /* JADX INFO: renamed from: a */
    public final WindowLayoutComponent m22189a() {
        int iM9933a;
        cc4 cc4Var = this.f62457c;
        cc4Var.getClass();
        boolean zM22191c = false;
        try {
            ((ClassLoader) cc4Var.f9881a).loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
            if (pvc.m19501I("WindowExtensionsProvider#getWindowExtensions is not valid", new y47(cc4Var, 4)) && pvc.m19501I("WindowExtensions#getWindowLayoutComponent is not valid", new sk8(this, 0)) && pvc.m19501I("FoldingFeature class is not valid", new sk8(this, 1)) && (iM9933a = cy2.m9933a()) >= 1) {
                if (iM9933a == 1) {
                    zM22191c = m22190b();
                } else if (iM9933a < 5) {
                    zM22191c = m22191c();
                } else if (m22191c() && pvc.m19501I("DisplayFoldFeature is not valid", new sk8(this, 3)) && pvc.m19501I("SupportedWindowFeatures is not valid", new sk8(this, 2)) && pvc.m19501I("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new sk8(this, 4))) {
                    zM22191c = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!zM22191c) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m22190b() {
        return pvc.m19501I("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new sk8(this, 5));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m22191c() {
        if (!m22190b()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(Context.class.getName());
        sb.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
        return pvc.m19501I(sb.toString(), new sk8(this, 6));
    }
}
