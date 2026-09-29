package p000;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: c4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0834c4 extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a */
    public final qn3 f9432a;

    public C0834c4(qn3 qn3Var) {
        this.f9432a = qn3Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f9432a.mo1758i(i, new C0797b4(accessibilityNodeInfo), str, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C0797b4 c0797b4Mo1759l = this.f9432a.mo1759l(i);
        if (c0797b4Mo1759l == null) {
            return null;
        }
        return c0797b4Mo1759l.f7900a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f9432a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C0797b4 c0797b4Mo1760o = this.f9432a.mo1760o(i);
        if (c0797b4Mo1760o == null) {
            return null;
        }
        return c0797b4Mo1760o.f7900a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f9432a.mo1757C(i, i2, bundle);
    }
}
