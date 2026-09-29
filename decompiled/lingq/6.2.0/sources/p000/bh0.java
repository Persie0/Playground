package p000;

import androidx.compose.foundation.gestures.C0097e;
import androidx.compose.material3.C0269z;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bh0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8530a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0269z f8531b;

    public /* synthetic */ bh0(C0269z c0269z, int i) {
        this.f8530a = i;
        this.f8531b = c0269z;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f8530a;
        xfa xfaVar = xfa.f68157a;
        C0269z c0269z = this.f8531b;
        switch (i) {
            case 0:
                ((Float) obj).getClass();
                return Float.valueOf(((Number) c0269z.f3648b.mo0a()).floatValue());
            case 1:
                q98 q98Var = (q98) obj;
                C0097e c0097e = c0269z.f3651e;
                float fM19861h = c0097e.f2241j.m19861h();
                float fM132e = c0097e.m849c().m132e();
                float f = fM19861h < fM132e ? fM132e - fM19861h : 0.0f;
                q98Var.m19824q(f > 0.0f ? 1.0f / ((Float.intBitsToFloat((int) (q98Var.f57462M & 4294967295L)) + f) / Float.intBitsToFloat((int) (4294967295L & q98Var.f57462M))) : 1.0f);
                q98Var.m19828x(omd.m18157m(0.5f, 0.0f));
                return xfaVar;
            default:
                q98 q98Var2 = (q98) obj;
                C0097e c0097e2 = c0269z.f3651e;
                float fM19861h2 = c0097e2.f2241j.m19861h();
                float fM132e2 = c0097e2.m849c().m132e();
                float f2 = fM19861h2 < fM132e2 ? fM132e2 - fM19861h2 : 0.0f;
                q98Var2.m19824q(f2 > 0.0f ? (Float.intBitsToFloat((int) (q98Var2.f57462M & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & q98Var2.f57462M)) : 1.0f);
                q98Var2.m19828x(omd.m18157m(0.5f, 0.0f));
                return xfaVar;
        }
    }
}
