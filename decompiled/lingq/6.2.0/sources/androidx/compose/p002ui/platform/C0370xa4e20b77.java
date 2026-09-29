package androidx.compose.p002ui.platform;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import kotlin.jvm.internal.Lambda;
import p000.vi3;

/* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1 */
/* JADX INFO: loaded from: classes.dex */
final class C0370xa4e20b77 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0393e f4497b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0370xa4e20b77(ViewOnAttachStateChangeListenerC0393e viewOnAttachStateChangeListenerC0393e) {
        super(1);
        this.f4497b = viewOnAttachStateChangeListenerC0393e;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = this.f4497b.f4746d;
        return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
    }
}
