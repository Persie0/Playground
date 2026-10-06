package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hhb extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hhc f27788a;

    public hhb(hhc hhcVar) {
        this.f27788a = hhcVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        AmbientModeSupport.AmbientController ambientController;
        if ((accessibilityEvent.getEventType() == 128 || accessibilityEvent.getEventType() == 32768) && (ambientController = this.f27788a.f27792d) != null) {
            ((hgk) ((hfu) ambientController.f1702a).f27587c.get()).mo10207p(((hfu) ambientController.f1702a).f27586b.getInteger(C0100R.integer.accessibility_social_handle_close_timeout));
        }
        return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }
}
