package androidx.compose.p002ui.scrollcapture;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.compose.runtime.AbstractC0278f;
import java.util.Arrays;
import java.util.function.Consumer;
import p000.aq4;
import p000.bna;
import p000.bq1;
import p000.d0a;
import p000.e28;
import p000.kn1;
import p000.nn8;
import p000.ss5;
import p000.sv8;
import p000.t66;
import p000.vz1;
import p000.x66;
import p000.xwc;

/* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0420d {

    /* JADX INFO: renamed from: a */
    public final t66 f4916a = AbstractC0278f.m1260j(Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public final void m1837a(ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c, sv8 sv8Var, kn1 kn1Var, Consumer consumer) {
        x66 x66Var = new x66(new nn8[16]);
        AbstractC0418b.m1830b(sv8Var.m21750a(), 0, new ScrollCapture$onScrollCaptureSearch$1(x66Var));
        Arrays.sort(x66Var.f67830a, 0, x66Var.f67832c, ss5.m21717n(ScrollCapture$onScrollCaptureSearch$2.f4905b, ScrollCapture$onScrollCaptureSearch$3.f4906b));
        int i = x66Var.f67832c;
        nn8 nn8Var = (nn8) (i == 0 ? null : x66Var.f67830a[i - 1]);
        if (nn8Var == null) {
            return;
        }
        ScrollCaptureCallbackC0417a scrollCaptureCallbackC0417a = new ScrollCaptureCallbackC0417a(nn8Var.m17505b(), nn8Var.m17506c(), vz1.m23619a(kn1Var), this, viewTreeObserverOnGlobalLayoutListenerC0391c);
        aq4 aq4VarM17504a = nn8Var.m17504a();
        e28 e28VarMo1670Q = bq1.m4054e0(aq4VarM17504a).mo1670Q(aq4VarM17504a, true);
        long jM14323c = nn8Var.m17506c().m14323c();
        ScrollCaptureTarget scrollCaptureTargetM9964b = d0a.m9964b(viewTreeObserverOnGlobalLayoutListenerC0391c, bna.m3980v0(xwc.m24755a0(e28VarMo1670Q)), new Point((int) (jM14323c >> 32), (int) (jM14323c & 4294967295L)), scrollCaptureCallbackC0417a);
        scrollCaptureTargetM9964b.setScrollBounds(bna.m3980v0(nn8Var.m17506c()));
        consumer.accept(scrollCaptureTargetM9964b);
    }
}
