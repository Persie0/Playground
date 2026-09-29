package p000;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.C3223c;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: loaded from: classes.dex */
public final class m83 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50747a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c83 f50748b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zi3 f50749c;

    public m83(c83 c83Var, zi3 zi3Var) {
        this.f50747a = 0;
        this.f50749c = zi3Var;
        this.f50748b = c83Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) throws Throwable {
        FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1;
        SafeCollector safeCollector;
        Throwable th;
        int i;
        int i2 = this.f50747a;
        xfa xfaVar = xfa.f68157a;
        zi3 zi3Var = this.f50749c;
        c83 c83Var = this.f50748b;
        switch (i2) {
            case 0:
                if (continuation instanceof FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1) {
                    flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 = (FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1) continuation;
                    int i3 = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.f47858b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.f47858b = i3 - Integer.MIN_VALUE;
                    } else {
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1(this, continuation);
                    }
                } else {
                    flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1(this, continuation);
                }
                Object obj = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.f47857a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.f47858b;
                if (i4 == 0) {
                    AbstractC3193b.m15359b(obj);
                    SafeCollector safeCollector2 = new SafeCollector(e83Var, flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.getContext());
                    try {
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.f47860d = e83Var;
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.f47861e = safeCollector2;
                        i = 0;
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.f47862f = 0;
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.f47858b = 1;
                        if (zi3Var.invoke(safeCollector2, flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1) != coroutineSingletons) {
                            safeCollector = safeCollector2;
                            safeCollector.releaseIntercepted();
                            flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.f47860d = null;
                            flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.f47861e = null;
                            flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.f47862f = i;
                            flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.f47858b = 2;
                            if (c83Var.collect(e83Var, flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1) != coroutineSingletons) {
                                return xfaVar;
                            }
                        }
                    } catch (Throwable th2) {
                        safeCollector = safeCollector2;
                        th = th2;
                        safeCollector.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            AbstractC3193b.m15359b(obj);
                            return xfaVar;
                        }
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.f47862f;
                    safeCollector = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.f47861e;
                    e83 e83Var2 = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.f47860d;
                    try {
                        AbstractC3193b.m15359b(obj);
                        i = i5;
                        e83Var = e83Var2;
                        safeCollector.releaseIntercepted();
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.f47860d = null;
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.f47861e = null;
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.f47862f = i;
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.f47858b = 2;
                        if (c83Var.collect(e83Var, flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1) != coroutineSingletons) {
                            return xfaVar;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        safeCollector.releaseIntercepted();
                        throw th;
                    }
                }
                return coroutineSingletons;
            case 1:
                Object objCollect = c83Var.collect(new C3223c(new Ref$BooleanRef(), e83Var, zi3Var), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            default:
                Object objCollect2 = c83Var.collect(new o83(e83Var, zi3Var), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
        }
    }

    public /* synthetic */ m83(c83 c83Var, zi3 zi3Var, int i) {
        this.f50747a = i;
        this.f50748b = c83Var;
        this.f50749c = zi3Var;
    }
}
