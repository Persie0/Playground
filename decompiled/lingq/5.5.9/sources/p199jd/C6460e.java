package p199jd;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p471x2.C10026a;
import p497y2.C10284f;

/* JADX INFO: renamed from: jd.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6460e extends C10026a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BaseTransientBottomBar f37030d;

    public C6460e(BaseTransientBottomBar baseTransientBottomBar) {
        this.f37030d = baseTransientBottomBar;
    }

    @Override // p471x2.C10026a
    /* JADX INFO: renamed from: d */
    public final void mo2999d(View view, C10284f c10284f) {
        View.AccessibilityDelegate accessibilityDelegate = this.f50989a;
        AccessibilityNodeInfo accessibilityNodeInfo = c10284f.f51739a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        c10284f.m19256a(1048576);
        accessibilityNodeInfo.setDismissable(true);
    }

    @Override // p471x2.C10026a
    /* JADX INFO: renamed from: g */
    public final boolean mo3000g(View view, int i10, Bundle bundle) {
        if (i10 != 1048576) {
            return super.mo3000g(view, i10, bundle);
        }
        this.f37030d.mo8833a();
        return true;
    }
}
