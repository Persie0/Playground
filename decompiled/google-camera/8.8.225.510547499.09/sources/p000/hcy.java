package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.camera.smarts.SmartsChipView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hcy extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ SmartsChipView f27284a;

    public hcy(SmartsChipView smartsChipView) {
        this.f27284a = smartsChipView;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768) {
            SmartsChipView smartsChipView = this.f27284a;
            if (!smartsChipView.f6930d) {
                smartsChipView.f6930d = true;
            }
        } else if (accessibilityEvent.getEventType() == 65536) {
            if (!this.f27284a.f6927a.isAccessibilityFocused() && !this.f27284a.f6929c.isAccessibilityFocused()) {
                SmartsChipView smartsChipView2 = this.f27284a;
                smartsChipView2.f6930d = false;
                if (smartsChipView2.f6931e) {
                    smartsChipView2.m4290b();
                }
            }
        } else if (accessibilityEvent.getEventType() == 1) {
            view.performAccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLEAR_ACCESSIBILITY_FOCUS.getId(), null);
        }
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
}
