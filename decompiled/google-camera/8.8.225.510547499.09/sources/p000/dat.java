package p000;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dat extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ dav f10311a;

    public dat(dav davVar) {
        this.f10311a = davVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(null);
        if (this.f10311a.f10320a.mo5872c()) {
            accessibilityNodeInfo.setContentDescription(this.f10311a.f10325f.getString(C0100R.string.stab_button_close_description));
        } else {
            accessibilityNodeInfo.setContentDescription(this.f10311a.f10325f.getString(C0100R.string.stab_button_open_description));
        }
    }
}
