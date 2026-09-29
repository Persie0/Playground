package p406u4;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: u4.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9431q0 {

    /* JADX INFO: renamed from: a */
    public static boolean f48399a = true;

    /* JADX INFO: renamed from: b */
    public static Method f48400b;

    /* JADX INFO: renamed from: c */
    public static boolean f48401c;

    /* JADX INFO: renamed from: a */
    public static void m17829a(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
            return;
        }
        if (f48399a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f48399a = false;
            }
        }
    }
}
