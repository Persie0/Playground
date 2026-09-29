package p000;

import com.lingq.core.datastore.C1369b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class qm7 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57945a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c83 f57946b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1369b f57947c;

    public /* synthetic */ qm7(c83 c83Var, C1369b c1369b, int i) {
        this.f57945a = i;
        this.f57946b = c83Var;
        this.f57947c = c1369b;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        int i = this.f57945a;
        int i2 = 0;
        int i3 = 1;
        int i4 = 2;
        int i5 = 3;
        xfa xfaVar = xfa.f68157a;
        C1369b c1369b = this.f57947c;
        c83 c83Var = this.f57946b;
        switch (i) {
            case 0:
                Object objCollect = c83Var.collect(new pm7(e83Var, c1369b, 0), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            case 1:
                Object objCollect2 = c83Var.collect(new pm7(e83Var, c1369b, 1), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
            case 2:
                Object objCollect3 = c83Var.collect(new om7(e83Var, c1369b, i2), continuation);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : xfaVar;
            case 3:
                Object objCollect4 = c83Var.collect(new om7(e83Var, c1369b, i3), continuation);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : xfaVar;
            case 4:
                Object objCollect5 = c83Var.collect(new om7(e83Var, c1369b, i4), continuation);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : xfaVar;
            case 5:
                Object objCollect6 = c83Var.collect(new om7(e83Var, c1369b, i5), continuation);
                return objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect6 : xfaVar;
            case 6:
                Object objCollect7 = c83Var.collect(new om7(e83Var, c1369b, 4), continuation);
                return objCollect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect7 : xfaVar;
            case 7:
                Object objCollect8 = c83Var.collect(new pm7(e83Var, c1369b, 2), continuation);
                return objCollect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect8 : xfaVar;
            default:
                Object objCollect9 = c83Var.collect(new pm7(e83Var, c1369b, 3), continuation);
                return objCollect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect9 : xfaVar;
        }
    }
}
