package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import retrofit2.AbstractC3533a;

/* JADX INFO: loaded from: classes2.dex */
public final class zw3 extends bx3 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f72295d;

    /* JADX INFO: renamed from: e */
    public final xl0 f72296e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw3(h78 h78Var, dr6 dr6Var, fm1 fm1Var, xl0 xl0Var, int i) {
        super(h78Var, dr6Var, fm1Var);
        this.f72295d = i;
        this.f72296e = xl0Var;
    }

    @Override // p000.bx3
    /* JADX INFO: renamed from: a */
    public final Object mo3111a(br6 br6Var, Object[] objArr) {
        int i = this.f72295d;
        xl0 xl0Var = this.f72296e;
        switch (i) {
            case 0:
                return xl0Var.mo3355h(br6Var);
            default:
                ul0 ul0Var = (ul0) xl0Var.mo3355h(br6Var);
                Continuation continuation = (Continuation) objArr[objArr.length - 1];
                try {
                    sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(continuation));
                    sm0Var.m21468u();
                    sm0Var.m21470w(new uk4(ul0Var, 1));
                    ul0Var.mo4152r(new hi8(sm0Var, 21));
                    Object objM21466r = sm0Var.m21466r();
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return objM21466r;
                } catch (Exception e) {
                    return AbstractC3533a.m20601c(e, continuation);
                }
        }
    }
}
