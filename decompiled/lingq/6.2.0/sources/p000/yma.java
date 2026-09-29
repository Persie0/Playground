package p000;

import com.lingq.core.datastore.C1371d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class yma implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70077a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c83 f70078b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1371d f70079c;

    public /* synthetic */ yma(c83 c83Var, C1371d c1371d, int i) {
        this.f70077a = i;
        this.f70078b = c83Var;
        this.f70079c = c1371d;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        int i = this.f70077a;
        xfa xfaVar = xfa.f68157a;
        C1371d c1371d = this.f70079c;
        c83 c83Var = this.f70078b;
        switch (i) {
            case 0:
                Object objCollect = c83Var.collect(new xma(e83Var, c1371d, 0), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            case 1:
                Object objCollect2 = c83Var.collect(new wma(e83Var, c1371d, 1), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
            case 2:
                Object objCollect3 = c83Var.collect(new wma(e83Var, c1371d, 2), continuation);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : xfaVar;
            case 3:
                Object objCollect4 = c83Var.collect(new xma(e83Var, c1371d, 1), continuation);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : xfaVar;
            case 4:
                Object objCollect5 = c83Var.collect(new wma(e83Var, c1371d, 3), continuation);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : xfaVar;
            case 5:
                Object objCollect6 = c83Var.collect(new xma(e83Var, c1371d, 2), continuation);
                return objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect6 : xfaVar;
            case 6:
                Object objCollect7 = c83Var.collect(new wma(e83Var, c1371d, 0), continuation);
                return objCollect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect7 : xfaVar;
            case 7:
                Object objCollect8 = c83Var.collect(new wma(e83Var, c1371d, 4), continuation);
                return objCollect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect8 : xfaVar;
            case 8:
                Object objCollect9 = c83Var.collect(new xma(e83Var, c1371d, 3), continuation);
                return objCollect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect9 : xfaVar;
            case 9:
                Object objCollect10 = c83Var.collect(new xma(e83Var, c1371d, 4), continuation);
                return objCollect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect10 : xfaVar;
            case 10:
                Object objCollect11 = c83Var.collect(new xma(e83Var, c1371d, 5), continuation);
                return objCollect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect11 : xfaVar;
            case 11:
                Object objCollect12 = c83Var.collect(new wma(e83Var, c1371d, 5), continuation);
                return objCollect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect12 : xfaVar;
            case 12:
                Object objCollect13 = c83Var.collect(new wma(e83Var, c1371d, 6), continuation);
                return objCollect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect13 : xfaVar;
            default:
                Object objCollect14 = c83Var.collect(new xma(e83Var, c1371d, 6), continuation);
                return objCollect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect14 : xfaVar;
        }
    }
}
