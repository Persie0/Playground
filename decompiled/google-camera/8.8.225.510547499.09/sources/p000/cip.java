package p000;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cip extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.getExtras().putBoolean("AccessibilityNodeInfo.hasImageForOCR", true);
    }
}
