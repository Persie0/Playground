package p000;

import androidx.compose.p002ui.semantics.AbstractC0426f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fn7 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f39342a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h41 f39343b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f39344c;

    public /* synthetic */ fn7(float f, h41 h41Var, int i) {
        this.f39342a = f;
        this.f39343b = h41Var;
        this.f39344c = i;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        Float fValueOf = Float.valueOf(this.f39342a);
        h41 h41Var = this.f39343b;
        AbstractC0426f.m1863g((tv8) obj, new tm7(((Number) l70.m15948k(fValueOf, h41Var)).floatValue(), h41Var, this.f39344c));
        return xfa.f68157a;
    }
}
