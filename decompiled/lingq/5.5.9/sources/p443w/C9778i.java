package p443w;

import androidx.compose.foundation.layout.IntrinsicSizeModifier;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import dm.C5207g;
import p127g1.InterfaceC5644h;
import p127g1.InterfaceC5645i;
import p127g1.InterfaceC5651o;
import p470x1.C10013a;

/* JADX INFO: renamed from: w.i */
/* JADX INFO: loaded from: classes.dex */
public final class C9778i implements IntrinsicSizeModifier {

    /* JADX INFO: renamed from: a */
    public static final C9778i f49864a = new C9778i();

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    /* JADX INFO: renamed from: e0 */
    public final long mo1502e0(InterfaceC0524e interfaceC0524e, InterfaceC5651o interfaceC5651o, long j10) {
        C5207g.m11111f(interfaceC0524e, "$this$calculateContentConstraints");
        return C10013a.a.m18610d(interfaceC5651o.mo2047u(C10013a.m18602g(j10)));
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: g */
    public final int mo1425g(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        return interfaceC5644h.mo2047u(i10);
    }
}
