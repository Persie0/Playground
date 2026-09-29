package mc;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.bottomsheet.DialogC2965b;
import p471x2.C10026a;
import p497y2.C10284f;

/* JADX INFO: renamed from: mc.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7539e extends C10026a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ DialogC2965b f41614d;

    public C7539e(DialogC2965b dialogC2965b) {
        this.f41614d = dialogC2965b;
    }

    @Override // p471x2.C10026a
    /* JADX INFO: renamed from: d */
    public final void mo2999d(View view, C10284f c10284f) {
        View.AccessibilityDelegate accessibilityDelegate = this.f50989a;
        AccessibilityNodeInfo accessibilityNodeInfo = c10284f.f51739a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        if (!this.f41614d.f14896j) {
            accessibilityNodeInfo.setDismissable(false);
        } else {
            c10284f.m19256a(1048576);
            accessibilityNodeInfo.setDismissable(true);
        }
    }

    @Override // p471x2.C10026a
    /* JADX INFO: renamed from: g */
    public final boolean mo3000g(View view, int i10, Bundle bundle) {
        if (i10 == 1048576) {
            DialogC2965b dialogC2965b = this.f41614d;
            if (dialogC2965b.f14896j) {
                dialogC2965b.cancel();
                return true;
            }
        }
        return super.mo3000g(view, i10, bundle);
    }
}
