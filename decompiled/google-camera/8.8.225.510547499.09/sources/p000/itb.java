package p000;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class itb extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ite f32046a;

    public itb(ite iteVar) {
        this.f32046a = iteVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        accessibilityNodeInfo.setContentDescription(this.f32046a.f32060K.getText());
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (!view.isEnabled()) {
            return false;
        }
        switch (i) {
            case 4096:
                this.f32046a.mo11739T();
                return true;
            case 8192:
                this.f32046a.mo11738S();
                return true;
            default:
                return super.performAccessibilityAction(view, i, bundle);
        }
    }
}
