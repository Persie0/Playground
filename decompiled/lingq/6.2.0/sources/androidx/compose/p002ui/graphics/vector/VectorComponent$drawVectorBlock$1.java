package androidx.compose.p002ui.graphics.vector;

import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import kotlin.jvm.internal.Lambda;
import p000.AbstractC3393o1;
import p000.C3309ls;
import p000.qn3;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
final class VectorComponent$drawVectorBlock$1 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0315c f4006b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorComponent$drawVectorBlock$1(C0315c c0315c) {
        super(1);
        this.f4006b = c0315c;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
        C0315c c0315c = this.f4006b;
        C0313a c0313a = c0315c.f4047b;
        float f = c0315c.f4056k;
        float f2 = c0315c.f4057l;
        C3309ls c3309lsMo603o0 = interfaceC0310a.mo603o0();
        long jM16483A = c3309lsMo603o0.m16483A();
        c3309lsMo603o0.m16515r().mo17016h();
        try {
            ((qn3) c3309lsMo603o0.f50064b).m20053G(f, f2, 0L);
            c0313a.mo1435a(interfaceC0310a);
            return xfa.f68157a;
        } finally {
            AbstractC3393o1.m17751z(c3309lsMo603o0, jM16483A);
        }
    }
}
