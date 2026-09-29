package p000;

import androidx.compose.animation.core.C0059a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vi6 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65412a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f65413b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f65414c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f65415d;

    public /* synthetic */ vi6(Object obj, float f, boolean z, int i) {
        this.f65412a = i;
        this.f65413b = obj;
        this.f65414c = f;
        this.f65415d = z;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f65412a;
        xfa xfaVar = xfa.f68157a;
        boolean z = this.f65415d;
        float f = this.f65414c;
        Object obj2 = this.f65413b;
        switch (i) {
            case 0:
                q98 q98Var = (q98) obj;
                float fMo169a = ((k73) obj2).mo169a();
                q98Var.m19823p(fMo169a > 0.0f ? 1.0f / ((fMo169a / f) + 1.0f) : 1.0f);
                q98Var.m19828x(omd.m18157m(z ? 0.0f : 1.0f, 0.0f));
                break;
            case 1:
                q98 q98Var2 = (q98) obj;
                float fMo169a2 = ((k73) obj2).mo169a();
                q98Var2.m19823p(fMo169a2 > 0.0f ? (fMo169a2 / f) + 1.0f : 1.0f);
                q98Var2.m19828x(omd.m18157m(z ? 0.0f : 1.0f, 0.5f));
                break;
            default:
                C0059a c0059a = (C0059a) obj2;
                q98 q98Var3 = (q98) obj;
                q98Var3.getClass();
                q98Var3.m19813c(((Number) c0059a.m745d()).floatValue());
                float fFloatValue = (((Number) c0059a.m745d()).floatValue() * 0.14999998f) + 0.85f;
                q98Var3.m19823p(fFloatValue);
                q98Var3.m19824q(fFloatValue);
                q98Var3.m19828x(omd.m18157m(Float.intBitsToFloat((int) (q98Var3.f57462M >> 32)) > 0.0f ? l70.m15944g(f / Float.intBitsToFloat((int) (q98Var3.f57462M >> 32)), 0.0f, 1.0f) : 0.5f, z ? 0.0f : 1.0f));
                break;
        }
        return xfaVar;
    }
}
