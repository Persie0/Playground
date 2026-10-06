package p000;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.camera.smarts.SmartsChipView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hcz extends hsl {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ SmartsChipView f27285a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcz(SmartsChipView smartsChipView, View.AccessibilityDelegate accessibilityDelegate) {
        super(accessibilityDelegate);
        this.f27285a = smartsChipView;
    }

    @Override // p000.hsl, android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 2048) {
            CharSequence contentDescription = view.getContentDescription();
            boolean zEquals = TextUtils.equals(this.f27285a.f6934h, contentDescription);
            this.f27285a.f6934h = contentDescription;
            if (zEquals) {
                return;
            }
        }
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
}
