package androidx.compose.p002ui.graphics.layer;

import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import kotlin.jvm.internal.Lambda;
import p000.AbstractC3393o1;
import p000.C3309ls;
import p000.C3500qj;
import p000.qn3;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
final class GraphicsLayer$clipDrawBlock$1 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0312a f3973b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphicsLayer$clipDrawBlock$1(C0312a c0312a) {
        super(1);
        this.f3973b = c0312a;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
        C0312a c0312a = this.f3973b;
        C3500qj c3500qj = c0312a.f3988l;
        if (c0312a.f3990n && c0312a.f3975A && c3500qj != null) {
            C3309ls c3309lsMo603o0 = interfaceC0310a.mo603o0();
            long jM16483A = c3309lsMo603o0.m16483A();
            c3309lsMo603o0.m16515r().mo17016h();
            try {
                ((C3309ls) ((qn3) c3309lsMo603o0.f50064b).f57974a).m16515r().mo17020l(c3500qj);
                c0312a.m1426c(interfaceC0310a);
            } finally {
                AbstractC3393o1.m17751z(c3309lsMo603o0, jM16483A);
            }
        } else {
            c0312a.m1426c(interfaceC0310a);
        }
        return xfa.f68157a;
    }
}
