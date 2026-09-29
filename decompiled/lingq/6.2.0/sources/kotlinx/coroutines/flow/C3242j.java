package kotlinx.coroutines.flow;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import p000.C3386nv;
import p000.e83;
import p000.xfa;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C3242j implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref$BooleanRef f48150a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f48151b;

    public C3242j(Ref$BooleanRef ref$BooleanRef, e83 e83Var) {
        this.f48150a = ref$BooleanRef;
        this.f48151b = e83Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m15569a(int i, Continuation continuation) throws Throwable {
        StartedLazily$command$1$1$emit$1 startedLazily$command$1$1$emit$1;
        if (continuation instanceof StartedLazily$command$1$1$emit$1) {
            startedLazily$command$1$1$emit$1 = (StartedLazily$command$1$1$emit$1) continuation;
            int i2 = startedLazily$command$1$1$emit$1.f48031c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                startedLazily$command$1$1$emit$1.f48031c = i2 - Integer.MIN_VALUE;
            } else {
                startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, continuation);
            }
        } else {
            startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, continuation);
        }
        Object obj = startedLazily$command$1$1$emit$1.f48029a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = startedLazily$command$1$1$emit$1.f48031c;
        xfa xfaVar = xfa.f68157a;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        if (i > 0) {
            Ref$BooleanRef ref$BooleanRef = this.f48150a;
            if (!ref$BooleanRef.f47713a) {
                ref$BooleanRef.f47713a = true;
                SharingCommand sharingCommand = SharingCommand.START;
                startedLazily$command$1$1$emit$1.f48031c = 1;
                if (this.f48151b.emit(sharingCommand, startedLazily$command$1$1$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return xfaVar;
    }

    @Override // p000.e83
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return m15569a(((Number) obj).intValue(), continuation);
    }
}
