package p000;

import android.os.PowerManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.p002ui.window.C0461i;

/* JADX INFO: renamed from: x3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3745x3 {
    /* JADX INFO: renamed from: a */
    public static String m24247a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m24248b(PowerManager powerManager) {
        return powerManager.isLowPowerStandbyEnabled() || powerManager.isDeviceLightIdleMode();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m24249c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* JADX INFO: renamed from: d */
    public static final void m24250d(C0461i c0461i, C0854co c0854co) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (c0854co == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = c0461i.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, c0854co);
    }

    /* JADX INFO: renamed from: e */
    public static final void m24251e(C0461i c0461i, C0854co c0854co) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (c0854co == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = c0461i.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(c0854co);
    }
}
