package p000;

import com.lingq.feature.reader.reader.C2493a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class jv7 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46232a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c83 f46233b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2493a f46234c;

    public /* synthetic */ jv7(c18 c18Var, C2493a c2493a, int i) {
        this.f46232a = i;
        this.f46233b = c18Var;
        this.f46234c = c2493a;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        int i = this.f46232a;
        xfa xfaVar = xfa.f68157a;
        C2493a c2493a = this.f46234c;
        c83 c83Var = this.f46233b;
        switch (i) {
            case 0:
                Object objCollect = c83Var.collect(new iv7(e83Var, c2493a, 0), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            case 1:
                Object objCollect2 = c83Var.collect(new zd7(e83Var, c2493a, 6), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
            case 2:
                Object objCollect3 = c83Var.collect(new iv7(e83Var, c2493a, 1), continuation);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : xfaVar;
            case 3:
                Object objCollect4 = c83Var.collect(new iv7(e83Var, c2493a, 2), continuation);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : xfaVar;
            default:
                Object objCollect5 = c83Var.collect(new iv7(e83Var, c2493a, 3), continuation);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : xfaVar;
        }
    }
}
