package p497y2;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;
import p118fe.C5509a;
import p240ld.C7312l;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: y2.e */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC10283e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10282d f51738a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC10283e(InterfaceC10282d interfaceC10282d) {
        this.f51738a = interfaceC10282d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC10283e) {
            return this.f51738a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC10283e) obj).f51738a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f51738a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        C7312l c7312l = (C7312l) ((C5509a) this.f51738a).f34148b;
        AutoCompleteTextView autoCompleteTextView = c7312l.f40940h;
        if (autoCompleteTextView != null) {
            if (autoCompleteTextView.getInputType() != 0) {
                return;
            }
            int i10 = z10 ? 2 : 1;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18682s(c7312l.f40954d, i10);
        }
    }
}
