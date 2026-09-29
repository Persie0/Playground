package p000;

import androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3;
import com.lingq.core.data.repository.C1274x90e401d4;
import com.lingq.feature.collections.C2023xc044fe0a;
import com.lingq.feature.collections.C2026x8afd58ca;
import com.lingq.feature.review.ReviewViewModel$1$invokeSuspend$$inlined$combine$1$3;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.AbstractC3238h;

/* JADX INFO: loaded from: classes2.dex */
public final class t91 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62008a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c83[] f62009b;

    public /* synthetic */ t91(c83[] c83VarArr, int i) {
        this.f62008a = i;
        this.f62009b = c83VarArr;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        int i = this.f62008a;
        xfa xfaVar = xfa.f68157a;
        c83[] c83VarArr = this.f62009b;
        switch (i) {
            case 0:
                Object objM15568a = AbstractC3238h.m15568a(e83Var, new b91(c83VarArr, 1), new C2023xc044fe0a(3, null), continuation, c83VarArr);
                return objM15568a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15568a : xfaVar;
            case 1:
                Object objM15568a2 = AbstractC3238h.m15568a(e83Var, new b91(c83VarArr, 2), new C2026x8afd58ca(3, null), continuation, c83VarArr);
                return objM15568a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15568a2 : xfaVar;
            case 2:
                Object objM15568a3 = AbstractC3238h.m15568a(e83Var, new b91(c83VarArr, 7), new C1274x90e401d4(3, null), continuation, c83VarArr);
                return objM15568a3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15568a3 : xfaVar;
            case 3:
                Object objM15568a4 = AbstractC3238h.m15568a(e83Var, new o47(c83VarArr, 10), new ReviewViewModel$1$invokeSuspend$$inlined$combine$1$3(3, null), continuation, c83VarArr);
                return objM15568a4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15568a4 : xfaVar;
            default:
                Object objM15568a5 = AbstractC3238h.m15568a(e83Var, new b91(c83VarArr, 16), new WorkConstraintsTracker$track$$inlined$combine$1$3(3, null), continuation, c83VarArr);
                return objM15568a5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15568a5 : xfaVar;
        }
    }
}
