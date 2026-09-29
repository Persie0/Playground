package p000;

import com.lingq.feature.reader.old.C2412n;
import com.lingq.feature.reader.old.ReaderViewModel$20$invokeSuspend$$inlined$combine$1$3;
import com.lingq.feature.reader.old.ReaderViewModel$special$$inlined$combine$1$3;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.AbstractC3238h;

/* JADX INFO: loaded from: classes3.dex */
public final class r08 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58460a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c83[] f58461b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2412n f58462c;

    public /* synthetic */ r08(c83[] c83VarArr, C2412n c2412n, int i) {
        this.f58460a = i;
        this.f58461b = c83VarArr;
        this.f58462c = c2412n;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        int i = this.f58460a;
        xfa xfaVar = xfa.f68157a;
        C2412n c2412n = this.f58462c;
        c83[] c83VarArr = this.f58461b;
        switch (i) {
            case 0:
                Object objM15568a = AbstractC3238h.m15568a(e83Var, new b91(c83VarArr, 10), new ReaderViewModel$20$invokeSuspend$$inlined$combine$1$3(c2412n, null), continuation, c83VarArr);
                return objM15568a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15568a : xfaVar;
            default:
                Object objM15568a2 = AbstractC3238h.m15568a(e83Var, new b91(c83VarArr, 12), new ReaderViewModel$special$$inlined$combine$1$3(c2412n, null), continuation, c83VarArr);
                return objM15568a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15568a2 : xfaVar;
        }
    }
}
