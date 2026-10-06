package p000;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aeg extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    final aei f252a;

    public aeg(aei aeiVar) {
        this.f252a = aeiVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f252a.mo330f(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        bkn bknVarMo333i = this.f252a.mo333i(view);
        if (bknVarMo333i != null) {
            return (AccessibilityNodeProvider) bknVarMo333i.f3651a;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f252a.mo325a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        agt agtVarM622a = agt.m622a(accessibilityNodeInfo);
        int[] iArr = afq.f274a;
        agtVarM622a.f355a.setScreenReaderFocusable(Boolean.valueOf(afm.m533i(view)).booleanValue());
        agtVarM622a.f355a.setHeading(Boolean.valueOf(afm.m532h(view)).booleanValue());
        agtVarM622a.f355a.setPaneTitle(afm.m525a(view));
        CharSequence charSequenceM538a = afo.m538a(view);
        int i = adg.f162a;
        agtVarM622a.f355a.setStateDescription(charSequenceM538a);
        this.f252a.mo326b(view, agtVarM622a);
        accessibilityNodeInfo.getText();
        List listM324l = aei.m324l(view);
        for (int i2 = 0; i2 < listM324l.size(); i2++) {
            agtVarM622a.m628f((agr) listM324l.get(i2));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f252a.mo327c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f252a.mo331g(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f252a.mo332h(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f252a.mo328d(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f252a.mo329e(view, accessibilityEvent);
    }
}
