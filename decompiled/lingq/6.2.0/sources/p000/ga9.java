package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.C0228e0;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ga9 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40465a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f40466b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f40467c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f40468d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f40469e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float f40470f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ float f40471g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ zi3 f40472h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ aj3 f40473i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f40474j;

    public /* synthetic */ ga9(Object obj, long j, long j2, long j3, long j4, float f, float f2, zi3 zi3Var, aj3 aj3Var, int i) {
        this.f40465a = i;
        this.f40474j = obj;
        this.f40466b = j;
        this.f40467c = j2;
        this.f40468d = j3;
        this.f40469e = j4;
        this.f40470f = f;
        this.f40471g = f2;
        this.f40472h = zi3Var;
        this.f40473i = aj3Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        float fMo912g0;
        int i = this.f40465a;
        xfa xfaVar = xfa.f68157a;
        float f = this.f40470f;
        Object obj2 = this.f40474j;
        switch (i) {
            case 0:
                C0228e0 c0228e0 = (C0228e0) obj2;
                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                if (xj2.m24560b(Float.NaN, Float.NaN)) {
                    fMo912g0 = (c0228e0.f3412m == Orientation.Vertical ? Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)) : Float.intBitsToFloat((int) (4294967295L & interfaceC0310a.mo1422h()))) / 2.0f;
                } else {
                    fMo912g0 = interfaceC0310a.mo912g0(Float.NaN);
                }
                la9 la9Var = la9.f49371a;
                la9.m16042i(interfaceC0310a, c0228e0.f3406g, 0.0f, c0228e0.m1142c(), this.f40466b, this.f40467c, this.f40468d, this.f40469e, interfaceC0310a.mo905T(0), interfaceC0310a.mo905T(0), interfaceC0310a.mo905T(c0228e0.f3410k.m21222h()), interfaceC0310a.mo905T(c0228e0.f3411l.m21222h()), f + 0.0f, this.f40471g, interfaceC0310a.mo906W(fMo912g0), this.f40472h, this.f40473i, false, c0228e0.f3412m);
                break;
            default:
                oq7 oq7Var = (oq7) obj2;
                InterfaceC0310a interfaceC0310a2 = (InterfaceC0310a) obj;
                float fIntBitsToFloat = xj2.m24560b(Float.NaN, Float.NaN) ? Float.intBitsToFloat((int) (4294967295L & interfaceC0310a2.mo1422h())) / 2.0f : interfaceC0310a2.mo912g0(Float.NaN);
                la9 la9Var2 = la9.f49371a;
                la9.m16042i(interfaceC0310a2, oq7Var.f54740f, oq7Var.m18208b(), oq7Var.m18207a(), this.f40466b, this.f40467c, this.f40468d, this.f40469e, interfaceC0310a2.mo906W(oq7Var.f54741g.m19861h()), interfaceC0310a2.mo906W(oq7Var.f54742h.m19861h()), interfaceC0310a2.mo906W(oq7Var.f54743i.m19861h()), interfaceC0310a2.mo906W(oq7Var.f54744j.m19861h()), f + 0.0f, this.f40471g, interfaceC0310a2.mo906W(fIntBitsToFloat), this.f40472h, this.f40473i, true, Orientation.Horizontal);
                break;
        }
        return xfaVar;
    }
}
