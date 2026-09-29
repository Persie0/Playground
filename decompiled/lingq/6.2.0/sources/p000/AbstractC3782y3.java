package p000;

import android.app.ActivityOptions;
import android.app.Notification;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: y3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3782y3 {
    /* JADX INFO: renamed from: a */
    public static int m24918a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getChecked();
    }

    /* JADX INFO: renamed from: b */
    public static int m24919b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExpandedState();
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m24920c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getSupplementalDescription();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m24921d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isFieldRequired();
    }

    /* JADX INFO: renamed from: e */
    public static void m24922e(ActivityOptions activityOptions, boolean z) {
        activityOptions.setAllowPassThroughOnTouchOutside(z);
    }

    /* JADX INFO: renamed from: f */
    public static void m24923f(Notification.Builder builder) {
        builder.setShortCriticalText(null);
    }
}
