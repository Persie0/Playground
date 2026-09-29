package p000;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.platform.ViewOnAttachStateChangeListenerC0393e;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.compose.p002ui.viewinterop.AbstractC0442b;

/* JADX INFO: renamed from: wg */
/* JADX INFO: loaded from: classes.dex */
public final class C3721wg extends C3133j3 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0391c f66785d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0357g f66786e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0391c f66787f;

    public C3721wg(ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c, C0357g c0357g, ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c2) {
        this.f66785d = viewTreeObserverOnGlobalLayoutListenerC0391c;
        this.f66786e = c0357g;
        this.f66787f = viewTreeObserverOnGlobalLayoutListenerC0391c2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // p000.C3133j3
    /* JADX INFO: renamed from: d */
    public final void mo6010d(View view, C0797b4 c0797b4) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0797b4.f7900a;
        this.f44987a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = this.f66785d;
        ViewOnAttachStateChangeListenerC0393e viewOnAttachStateChangeListenerC0393e = viewTreeObserverOnGlobalLayoutListenerC0391c.f4666Q;
        if (viewOnAttachStateChangeListenerC0393e.m1794v()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        C0357g c0357g = this.f66786e;
        C0357g c0357gM1610w = c0357g.m1610w();
        while (true) {
            if (c0357gM1610w == null) {
                c0357gM1610w = null;
                break;
            } else if (c0357gM1610w.f4335a0.m14799f(8)) {
                break;
            } else {
                c0357gM1610w = c0357gM1610w.m1610w();
            }
        }
        Integer numValueOf = c0357gM1610w != null ? Integer.valueOf(c0357gM1610w.f4336b) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == viewTreeObserverOnGlobalLayoutListenerC0391c.getSemanticsOwner().m21750a().f4976f) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        c0797b4.f7901b = iIntValue;
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c2 = this.f66787f;
        accessibilityNodeInfo.setParent(viewTreeObserverOnGlobalLayoutListenerC0391c2, iIntValue);
        int i = c0357g.f4336b;
        int iM20409d = viewOnAttachStateChangeListenerC0393e.f4739W.m20409d(i);
        if (iM20409d != -1) {
            AbstractC0442b abstractC0442bM24761d0 = xwc.m24761d0(viewTreeObserverOnGlobalLayoutListenerC0391c.getAndroidViewsHandler$ui(), iM20409d);
            if (abstractC0442bM24761d0 != null) {
                accessibilityNodeInfo.setTraversalBefore(abstractC0442bM24761d0);
            } else {
                accessibilityNodeInfo.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC0391c2, iM20409d);
            }
            ViewTreeObserverOnGlobalLayoutListenerC0391c.m1718d(viewTreeObserverOnGlobalLayoutListenerC0391c, i, accessibilityNodeInfo, viewOnAttachStateChangeListenerC0393e.f4741Y);
        }
        int iM20409d2 = viewOnAttachStateChangeListenerC0393e.f4740X.m20409d(i);
        if (iM20409d2 != -1) {
            AbstractC0442b abstractC0442bM24761d1 = xwc.m24761d0(viewTreeObserverOnGlobalLayoutListenerC0391c.getAndroidViewsHandler$ui(), iM20409d2);
            if (abstractC0442bM24761d1 != null) {
                accessibilityNodeInfo.setTraversalAfter(abstractC0442bM24761d1);
            } else {
                accessibilityNodeInfo.setTraversalAfter(viewTreeObserverOnGlobalLayoutListenerC0391c2, iM20409d2);
            }
            ViewTreeObserverOnGlobalLayoutListenerC0391c.m1718d(viewTreeObserverOnGlobalLayoutListenerC0391c, i, accessibilityNodeInfo, viewOnAttachStateChangeListenerC0393e.f4742Z);
        }
    }
}
