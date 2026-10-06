package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hxj extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 2048) {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}
