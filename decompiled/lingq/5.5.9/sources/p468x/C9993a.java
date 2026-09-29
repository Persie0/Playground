package p468x;

import android.graphics.Rect;
import android.view.View;
import cm.InterfaceC2041a;
import dm.C5207g;
import p127g1.InterfaceC5647k;
import p375s0.C8941c;
import p375s0.C8942d;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: x.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9993a implements InterfaceC9995c {

    /* JADX INFO: renamed from: a */
    public final View f50807a;

    public C9993a(View view) {
        C5207g.m11111f(view, "view");
        this.f50807a = view;
    }

    @Override // p468x.InterfaceC9995c
    /* JADX INFO: renamed from: c */
    public final Object mo1529c(InterfaceC5647k interfaceC5647k, InterfaceC2041a<C8942d> interfaceC2041a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        long jMo2159N = interfaceC5647k.mo2159N(C8941c.f46888b);
        C8942d c8942dMo807E = interfaceC2041a.mo807E();
        if (c8942dMo807E == null) {
            return C9072e.f47360a;
        }
        C8942d c8942dM17173d = c8942dMo807E.m17173d(jMo2159N);
        this.f50807a.requestRectangleOnScreen(new Rect((int) c8942dM17173d.f46894a, (int) c8942dM17173d.f46895b, (int) c8942dM17173d.f46896c, (int) c8942dM17173d.f46897d), false);
        return C9072e.f47360a;
    }
}
