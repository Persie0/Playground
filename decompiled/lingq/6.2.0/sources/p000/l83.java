package p000;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: loaded from: classes.dex */
public final class l83 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49291a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c83 f49292b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aj3 f49293c;

    public /* synthetic */ l83(c83 c83Var, aj3 aj3Var, int i) {
        this.f49291a = i;
        this.f49292b = c83Var;
        this.f49293c = aj3Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) throws Throwable {
        FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1;
        SafeCollector safeCollector;
        SafeCollector safeCollector2;
        Throwable th;
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1;
        int i = this.f49291a;
        xfa xfaVar = xfa.f68157a;
        aj3 aj3Var = this.f49293c;
        c83 c83Var = this.f49292b;
        int i2 = 0;
        switch (i) {
            case 0:
                if (continuation instanceof FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) {
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 = (FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) continuation;
                    int i3 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.f47852b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.f47852b = i3 - Integer.MIN_VALUE;
                    } else {
                        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 = new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1(this, continuation);
                    }
                } else {
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 = new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1(this, continuation);
                }
                Object obj = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.f47851a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.f47852b;
                try {
                    try {
                        if (i4 == 0) {
                            AbstractC3193b.m15359b(obj);
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.f47854d = e83Var;
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.f47856f = 0;
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.f47852b = 1;
                            if (c83Var.collect(e83Var, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        if (i4 != 1) {
                            if (i4 == 2) {
                                Throwable th2 = (Throwable) flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.f47855e;
                                AbstractC3193b.m15359b(obj);
                                throw th2;
                            }
                            if (i4 != 3) {
                                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            safeCollector2 = (SafeCollector) flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.f47855e;
                            try {
                                AbstractC3193b.m15359b(obj);
                                safeCollector2.releaseIntercepted();
                                return xfaVar;
                            } catch (Throwable th3) {
                                th = th3;
                                safeCollector2.releaseIntercepted();
                                throw th;
                            }
                        }
                        i2 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.f47856f;
                        e83Var = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.f47854d;
                        AbstractC3193b.m15359b(obj);
                        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.f47854d = null;
                        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.f47855e = safeCollector;
                        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.f47856f = i2;
                        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.f47852b = 3;
                        if (aj3Var.invoke(safeCollector, null, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) != coroutineSingletons) {
                            safeCollector2 = safeCollector;
                            safeCollector2.releaseIntercepted();
                            return xfaVar;
                        }
                    } catch (Throwable th4) {
                        safeCollector2 = safeCollector;
                        th = th4;
                        safeCollector2.releaseIntercepted();
                        throw th;
                    }
                    safeCollector = new SafeCollector(e83Var, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.getContext());
                } catch (Throwable th5) {
                    zz9 zz9Var = new zz9(th5);
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.f47854d = null;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.f47855e = th5;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.f47856f = i2;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.f47852b = 2;
                    if (AbstractC3224d.m15523b(zz9Var, aj3Var, th5, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) != coroutineSingletons) {
                        throw th5;
                    }
                }
                return coroutineSingletons;
            default:
                if (continuation instanceof FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1) {
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 = (FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1) continuation;
                    int i5 = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.f47864b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.f47864b = i5 - Integer.MIN_VALUE;
                    } else {
                        flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1(this, continuation);
                    }
                } else {
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1(this, continuation);
                }
                Object objM15527f = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.f47863a;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.f47864b;
                if (i6 == 0) {
                    AbstractC3193b.m15359b(objM15527f);
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.f47866d = e83Var;
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.f47867e = 0;
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.f47864b = 1;
                    objM15527f = AbstractC3224d.m15527f(c83Var, e83Var, flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1);
                    if (objM15527f != obj2) {
                    }
                    return obj2;
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        AbstractC3193b.m15359b(objM15527f);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.f47867e;
                e83Var = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.f47866d;
                AbstractC3193b.m15359b(objM15527f);
                Throwable th6 = (Throwable) objM15527f;
                if (th6 == null) {
                    return xfaVar;
                }
                flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.f47866d = null;
                flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.f47867e = i2;
                flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.f47864b = 2;
                if (aj3Var.invoke(e83Var, th6, flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1) != obj2) {
                    return xfaVar;
                }
                return obj2;
        }
    }
}
