package p000;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.R$id;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: i3 */
/* JADX INFO: loaded from: classes.dex */
public final class C3098i3 extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    public final C3133j3 f43394a;

    public C3098i3(C3133j3 c3133j3) {
        this.f43394a = c3133j3;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f43394a.mo14275a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        qn3 qn3VarMo1782b = this.f43394a.mo1782b(view);
        if (qn3VarMo1782b != null) {
            return (AccessibilityNodeProvider) qn3VarMo1782b.f57974a;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f43394a.mo14276c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C0797b4 c0797b4 = new C0797b4(accessibilityNodeInfo);
        WeakHashMap weakHashMap = dta.f36217a;
        Boolean bool = (Boolean) new ssa(R$id.tag_screen_reader_focusable, 0).m22870d(view);
        accessibilityNodeInfo.setScreenReaderFocusable(bool != null && bool.booleanValue());
        Boolean bool2 = (Boolean) new ssa(R$id.tag_accessibility_heading, 3).m22870d(view);
        accessibilityNodeInfo.setHeading(bool2 != null && bool2.booleanValue());
        accessibilityNodeInfo.setPaneTitle(dta.m10632c(view));
        c0797b4.m3283n((CharSequence) new ssa(R$id.tag_state_description, 2).m22870d(view));
        this.f43394a.mo6010d(view, c0797b4);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(R$id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i = 0; i < list.size(); i++) {
            c0797b4.m3272b((C3671v3) list.get(i));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f43394a.mo10704e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f43394a.mo14277f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f43394a.mo6011g(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f43394a.mo14278h(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f43394a.mo14279i(view, accessibilityEvent);
    }
}
