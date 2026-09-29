package p000;

import android.content.Context;
import android.os.ext.SdkExtensions;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: w3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3708w3 {
    /* JADX INFO: renamed from: a */
    public static String m23692a(Context context) {
        return context.getAttributionTag();
    }

    /* JADX INFO: renamed from: b */
    public static void m23693b(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m23694c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* JADX INFO: renamed from: d */
    public static void m23695d(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    /* JADX INFO: renamed from: e */
    public static void m23696e(View view) {
        view.setImportantForContentCapture(1);
    }

    /* JADX INFO: renamed from: f */
    public static void m23697f(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
