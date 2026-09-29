package p507yc;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.CheckableImageButton;
import p471x2.C10026a;
import p497y2.C10284f;

/* JADX INFO: renamed from: yc.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10334a extends C10026a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CheckableImageButton f52021d;

    public C10334a(CheckableImageButton checkableImageButton) {
        this.f52021d = checkableImageButton;
    }

    @Override // p471x2.C10026a
    /* JADX INFO: renamed from: c */
    public final void mo2998c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2998c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f52021d.isChecked());
    }

    @Override // p471x2.C10026a
    /* JADX INFO: renamed from: d */
    public final void mo2999d(View view, C10284f c10284f) {
        View.AccessibilityDelegate accessibilityDelegate = this.f50989a;
        AccessibilityNodeInfo accessibilityNodeInfo = c10284f.f51739a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        CheckableImageButton checkableImageButton = this.f52021d;
        accessibilityNodeInfo.setCheckable(checkableImageButton.f15330e);
        accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
    }
}
