package p000;

import androidx.compose.foundation.gestures.C0115u;
import androidx.compose.p002ui.focus.C0301c;
import androidx.compose.p002ui.focus.C0302d;
import androidx.compose.p002ui.focus.FocusStateImpl;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class co8 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10365a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0115u f10366b;

    public /* synthetic */ co8(C0115u c0115u, int i) {
        this.f10365a = i;
        this.f10366b = c0115u;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f10365a;
        C0115u c0115u = this.f10366b;
        switch (i) {
            case 0:
                return Boolean.valueOf(c0115u.f34836I);
            default:
                C0302d c0302d = c0115u.f2354k0;
                if (!c0302d.f34837a.f34836I) {
                    return null;
                }
                FocusStateImpl focusStateImplM1373e1 = c0302d.m1373e1();
                if (!focusStateImplM1373e1.getHasFocus()) {
                    return null;
                }
                if (focusStateImplM1373e1.isFocused()) {
                    return c0302d.m1371c1(null);
                }
                C0302d c0302dM1362h = ((C0301c) ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(c0302d)).getFocusOwner()).m1362h();
                if (c0302dM1362h != null) {
                    return c0302dM1362h.m1371c1(te1.m21978K(c0302d));
                }
                return null;
        }
    }
}
