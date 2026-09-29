package p000;

import android.app.ActivityOptions;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: k3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3170k3 {
    /* JADX INFO: renamed from: a */
    public static float m14777a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    /* JADX INFO: renamed from: b */
    public static int m14778b(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    /* JADX INFO: renamed from: c */
    public static int m14779c(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    /* JADX INFO: renamed from: d */
    public static void m14780d(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    /* JADX INFO: renamed from: e */
    public static void m14781e(ActivityOptions activityOptions) {
        activityOptions.setShareIdentityEnabled(false);
    }
}
