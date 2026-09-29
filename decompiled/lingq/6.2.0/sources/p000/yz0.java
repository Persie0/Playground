package p000;

import java.util.Iterator;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.C3229i;
import kotlinx.coroutines.flow.C3242j;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1;
import kotlinx.coroutines.flow.StartedLazily$command$$inlined$unsafeFlow$1$1;

/* JADX INFO: loaded from: classes3.dex */
public final class yz0 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70661a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f70662b;

    public /* synthetic */ yz0(Object obj, int i) {
        this.f70661a = i;
        this.f70662b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1 flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1;
        int i;
        Iterator it;
        int i2;
        StartedLazily$command$$inlined$unsafeFlow$1$1 startedLazily$command$$inlined$unsafeFlow$1$1;
        int i3 = this.f70661a;
        xfa xfaVar = xfa.f68157a;
        Object obj = this.f70662b;
        switch (i3) {
            case 0:
                Object objCollect = ((C3540rl) obj).collect(new C3475pw(e83Var, 7), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            case 1:
                Object objCollect2 = ((yo1) obj).collect(new C3475pw(e83Var, 9), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
            case 2:
                Object objCollect3 = ((m83) obj).collect(new C3475pw(e83Var, 17), continuation);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : xfaVar;
            case 3:
                if (continuation instanceof FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1) {
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1 = (FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1) continuation;
                    int i4 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1.f47812b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1.f47812b = i4 - Integer.MIN_VALUE;
                    } else {
                        flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1 = new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1(this, continuation);
                    }
                } else {
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1 = new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1(this, continuation);
                }
                Object obj2 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1.f47811a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1.f47812b;
                if (i5 == 0) {
                    AbstractC3193b.m15359b(obj2);
                    i = 0;
                    it = ((Iterable) ((z91) obj).f71218b).iterator();
                    i2 = 0;
                } else {
                    if (i5 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1.f47817g;
                    int i7 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1.f47816f;
                    it = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1.f47815e;
                    e83 e83Var2 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1.f47814d;
                    AbstractC3193b.m15359b(obj2);
                    i2 = i7;
                    i = i6;
                    e83Var = e83Var2;
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1.f47814d = e83Var;
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1.f47815e = it;
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1.f47816f = i2;
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1.f47817g = i;
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1.f47812b = 1;
                    if (e83Var.emit(next, flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return xfaVar;
            case 4:
                Object objCollect4 = ((mv7) obj).collect(new wv7(e83Var, 14), continuation);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : xfaVar;
            default:
                if (continuation instanceof StartedLazily$command$$inlined$unsafeFlow$1$1) {
                    startedLazily$command$$inlined$unsafeFlow$1$1 = (StartedLazily$command$$inlined$unsafeFlow$1$1) continuation;
                    int i8 = startedLazily$command$$inlined$unsafeFlow$1$1.f48027b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        startedLazily$command$$inlined$unsafeFlow$1$1.f48027b = i8 - Integer.MIN_VALUE;
                    } else {
                        startedLazily$command$$inlined$unsafeFlow$1$1 = new StartedLazily$command$$inlined$unsafeFlow$1$1(this, continuation);
                    }
                } else {
                    startedLazily$command$$inlined$unsafeFlow$1$1 = new StartedLazily$command$$inlined$unsafeFlow$1$1(this, continuation);
                }
                Object obj3 = startedLazily$command$$inlined$unsafeFlow$1$1.f48026a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = startedLazily$command$$inlined$unsafeFlow$1$1.f48027b;
                if (i9 == 0) {
                    AbstractC3193b.m15359b(obj3);
                    C3242j c3242j = new C3242j(new Ref$BooleanRef(), e83Var);
                    startedLazily$command$$inlined$unsafeFlow$1$1.f48027b = 1;
                    if (C3229i.m15548j((vm9) obj, c3242j, startedLazily$command$$inlined$unsafeFlow$1$1) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i9 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj3);
                }
                C3386nv.m17631r();
                return null;
        }
    }
}
