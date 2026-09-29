package p000;

import android.util.Log;
import androidx.window.core.VerificationMode;
import androidx.window.extensions.WindowExtensionsProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class cy2 {

    /* JADX INFO: renamed from: a */
    public static final String f34707a = y38.m24933a(cy2.class).m25414c();

    /* JADX INFO: renamed from: a */
    public static int m9933a() {
        String str = f34707a;
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (kj0.m15266a() != VerificationMode.LOG) {
                return 0;
            }
            Log.d(str, "Embedding extension version not found");
            return 0;
        } catch (NullPointerException unused2) {
            if (kj0.m15266a() != VerificationMode.LOG) {
                return 0;
            }
            Log.d(str, "Error with Extension implementation");
            return 0;
        } catch (UnsupportedOperationException unused3) {
            if (kj0.m15266a() != VerificationMode.LOG) {
                return 0;
            }
            Log.d(str, "Stub Extension");
            return 0;
        }
    }
}
