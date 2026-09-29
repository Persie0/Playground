package kotlinx.coroutines.flow;

import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.AbstractC3212b;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.AbstractC3231a;
import kotlinx.coroutines.flow.internal.C3235e;
import kotlinx.coroutines.flow.internal.C3236f;
import kotlinx.coroutines.flow.internal.C3239i;
import p000.AbstractC3352my;
import p000.C0842cc;
import p000.C3386nv;
import p000.C3512qv;
import p000.C3611th;
import p000.aj3;
import p000.bj3;
import p000.bm6;
import p000.bu0;
import p000.c18;
import p000.c83;
import p000.cd4;
import p000.cj3;
import p000.cu0;
import p000.dj3;
import p000.du0;
import p000.e83;
import p000.eh9;
import p000.ej0;
import p000.eu0;
import p000.fa4;
import p000.fi2;
import p000.fs6;
import p000.fu0;
import p000.i59;
import p000.ij6;
import p000.j59;
import p000.jj3;
import p000.kk8;
import p000.kn1;
import p000.lda;
import p000.ln1;
import p000.n83;
import p000.nj0;
import p000.p83;
import p000.pg9;
import p000.pk9;
import p000.q83;
import p000.r83;
import p000.thb;
import p000.u66;
import p000.uk9;
import p000.un1;
import p000.ux5;
import p000.wfb;
import p000.xfa;
import p000.zi3;
import p000.zz9;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3224d {
    /* JADX INFO: renamed from: A */
    public static final du0 m15519A(C3211a c3211a) {
        return new du0(c3211a, false);
    }

    /* JADX INFO: renamed from: B */
    public static final c18 m15520B(c83 c83Var, un1 un1Var, j59 j59Var, Object obj) {
        fs6 fs6Var;
        AbstractC3231a abstractC3231a;
        c83 c83VarMo10650f;
        cu0.f34534o.getClass();
        bu0 bu0Var = bu0.f9016a;
        int i = 23;
        if (!(c83Var instanceof AbstractC3231a) || (c83VarMo10650f = (abstractC3231a = (AbstractC3231a) c83Var).mo10650f()) == null) {
            BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
            fs6Var = new fs6(i, c83Var, EmptyCoroutineContext.f47685a);
        } else {
            int i2 = abstractC3231a.f48134b;
            if (i2 == -3 || i2 == -2 || i2 == 0) {
                BufferOverflow bufferOverflow2 = BufferOverflow.SUSPEND;
            }
            fs6Var = new fs6(i, c83VarMo10650f, abstractC3231a.f48133a);
        }
        C3244l c3244lM17114d = AbstractC3352my.m17114d(obj);
        return new c18(c3244lM17114d, wfb.m23925t(un1Var, (kn1) fs6Var.f39591c, fa4.m11650l(j59Var, i59.f43549a) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowKt__ShareKt$launchSharing$1(j59Var, (c83) fs6Var.f39590b, c3244lM17114d, obj, null)));
    }

    /* JADX INFO: renamed from: C */
    public static final C3235e m15521C(c83 c83Var, aj3 aj3Var) {
        int i = p83.f55729a;
        return new C3235e(aj3Var, c83Var, EmptyCoroutineContext.f47685a, -2, BufferOverflow.SUSPEND);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final CoroutineSingletons m15522a(e83 e83Var, Object obj, Object obj2, ContinuationImpl continuationImpl) throws Throwable {
        FlowKt__LimitKt$emitAbort$1 flowKt__LimitKt$emitAbort$1;
        if (continuationImpl instanceof FlowKt__LimitKt$emitAbort$1) {
            flowKt__LimitKt$emitAbort$1 = (FlowKt__LimitKt$emitAbort$1) continuationImpl;
            int i = flowKt__LimitKt$emitAbort$1.f47891c;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$emitAbort$1.f47891c = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(continuationImpl);
            }
        } else {
            flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(continuationImpl);
        }
        Object obj3 = flowKt__LimitKt$emitAbort$1.f47890b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__LimitKt$emitAbort$1.f47891c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj3);
            flowKt__LimitKt$emitAbort$1.f47889a = obj2;
            flowKt__LimitKt$emitAbort$1.f47891c = 1;
            if (e83Var.emit(obj, flowKt__LimitKt$emitAbort$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = flowKt__LimitKt$emitAbort$1.f47889a;
            AbstractC3193b.m15359b(obj3);
        }
        throw new AbortFlowException(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m15523b(zz9 zz9Var, aj3 aj3Var, Throwable th, ContinuationImpl continuationImpl) throws Throwable {
        FlowKt__EmittersKt$invokeSafely$1 flowKt__EmittersKt$invokeSafely$1;
        if (continuationImpl instanceof FlowKt__EmittersKt$invokeSafely$1) {
            flowKt__EmittersKt$invokeSafely$1 = (FlowKt__EmittersKt$invokeSafely$1) continuationImpl;
            int i = flowKt__EmittersKt$invokeSafely$1.f47850c;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$invokeSafely$1.f47850c = i - Integer.MIN_VALUE;
            } else {
                flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(continuationImpl);
            }
        } else {
            flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(continuationImpl);
        }
        Object obj = flowKt__EmittersKt$invokeSafely$1.f47849b;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__EmittersKt$invokeSafely$1.f47850c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                flowKt__EmittersKt$invokeSafely$1.f47848a = th;
                flowKt__EmittersKt$invokeSafely$1.f47850c = 1;
                if (aj3Var.invoke(zz9Var, th, flowKt__EmittersKt$invokeSafely$1) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = flowKt__EmittersKt$invokeSafely$1.f47848a;
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                lda.m16117c(th2, th);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final c18 m15524c(u66 u66Var) {
        return new c18(u66Var, null);
    }

    /* JADX INFO: renamed from: d */
    public static c83 m15525d(c83 c83Var, int i) {
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        if (i < 0 && i != -2 && i != -1) {
            C3386nv.m17624j(ux5.m22988k(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1) {
            bufferOverflow = BufferOverflow.DROP_OLDEST;
            i = 0;
        }
        int i2 = i;
        BufferOverflow bufferOverflow2 = bufferOverflow;
        return c83Var instanceof jj3 ? jj3.m14495a((jj3) c83Var, null, i2, bufferOverflow2, 1) : new fu0(c83Var, null, i2, bufferOverflow2, 2);
    }

    /* JADX INFO: renamed from: e */
    public static final C3222b m15526e(zi3 zi3Var) {
        return new C3222b(zi3Var, EmptyCoroutineContext.f47685a, -2, BufferOverflow.SUSPEND);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static final Serializable m15527f(c83 c83Var, e83 e83Var, ContinuationImpl continuationImpl) throws Throwable {
        FlowKt__ErrorsKt$catchImpl$1 flowKt__ErrorsKt$catchImpl$1;
        Ref$ObjectRef ref$ObjectRef;
        cd4 cd4Var;
        CancellationException cancellationExceptionMo4541u;
        if (continuationImpl instanceof FlowKt__ErrorsKt$catchImpl$1) {
            flowKt__ErrorsKt$catchImpl$1 = (FlowKt__ErrorsKt$catchImpl$1) continuationImpl;
            int i = flowKt__ErrorsKt$catchImpl$1.f47870c;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$1.f47870c = i - Integer.MIN_VALUE;
            } else {
                flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(continuationImpl);
            }
        } else {
            flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(continuationImpl);
        }
        Object obj = flowKt__ErrorsKt$catchImpl$1.f47869b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__ErrorsKt$catchImpl$1.f47870c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            try {
                e83 c3226f = new C3226f(e83Var, ref$ObjectRef2);
                flowKt__ErrorsKt$catchImpl$1.f47868a = ref$ObjectRef2;
                flowKt__ErrorsKt$catchImpl$1.f47870c = 1;
                if (c83Var.collect(c3226f, flowKt__ErrorsKt$catchImpl$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                ref$ObjectRef = ref$ObjectRef2;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef = flowKt__ErrorsKt$catchImpl$1.f47868a;
            try {
                AbstractC3193b.m15359b(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) ref$ObjectRef.f47718a;
        if ((th3 != null && th3.equals(th)) || ((cd4Var = (cd4) flowKt__ErrorsKt$catchImpl$1.getContext().get(nj0.f52795N)) != null && cd4Var.isCancelled() && (cancellationExceptionMo4541u = cd4Var.mo4541u()) != null && cancellationExceptionMo4541u.equals(th))) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            lda.m16117c(th3, th);
            throw th3;
        }
        lda.m16117c(th, th3);
        throw th;
    }

    /* JADX INFO: renamed from: g */
    public static final eu0 m15528g(zi3 zi3Var) {
        return new eu0(zi3Var, EmptyCoroutineContext.f47685a, -2, BufferOverflow.SUSPEND);
    }

    /* JADX INFO: renamed from: h */
    public static final Object m15529h(c83 c83Var, zi3 zi3Var, Continuation continuation) {
        Object objCollect = m15525d(m15546y(c83Var, zi3Var), 0).collect(bm6.f8690a, continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        xfa xfaVar = xfa.f68157a;
        if (objCollect != coroutineSingletons) {
            objCollect = xfaVar;
        }
        return objCollect == coroutineSingletons ? objCollect : xfaVar;
    }

    /* JADX INFO: renamed from: i */
    public static final n83 m15530i(c83 c83Var, c83 c83Var2, c83 c83Var3, c83 c83Var4, c83 c83Var5, dj3 dj3Var) {
        return new n83(4, new c83[]{c83Var, c83Var2, c83Var3, c83Var4, c83Var5}, dj3Var);
    }

    /* JADX INFO: renamed from: j */
    public static final n83 m15531j(c83 c83Var, c83 c83Var2, c83 c83Var3, c83 c83Var4, cj3 cj3Var) {
        return new n83(3, new c83[]{c83Var, c83Var2, c83Var3, c83Var4}, cj3Var);
    }

    /* JADX INFO: renamed from: k */
    public static final n83 m15532k(c83 c83Var, c83 c83Var2, c83 c83Var3, bj3 bj3Var) {
        return new n83(2, new c83[]{c83Var, c83Var2, c83Var3}, bj3Var);
    }

    /* JADX INFO: renamed from: l */
    public static final kk8 m15533l(c83 c83Var, c83 c83Var2, c83 c83Var3, c83 c83Var4, dj3 dj3Var) {
        return new kk8(new C3219xd7c321e9(new c83[]{c83Var, c83Var2, c83Var3, c83Var4}, null, dj3Var));
    }

    /* JADX INFO: renamed from: m */
    public static final kk8 m15534m(c83 c83Var, c83 c83Var2, bj3 bj3Var) {
        return new kk8(new C3217xd7c321e7(new c83[]{c83Var, c83Var2}, null, bj3Var));
    }

    /* JADX INFO: renamed from: n */
    public static final c83 m15535n(c83 c83Var, long j) {
        if (j >= 0) {
            return j == 0 ? c83Var : new C3239i(new FlowKt__DelayKt$debounceInternal$1(new C3611th(3, j), c83Var, null));
        }
        C3386nv.m17626m("Debounce timeout should not be negative");
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static final c83 m15536o(c83 c83Var) {
        if (c83Var instanceof eh9) {
            return c83Var;
        }
        ln1 ln1Var = pk9.f56359d;
        if (c83Var instanceof fi2) {
            fi2 fi2Var = (fi2) c83Var;
            if (fi2Var.f39138b == ln1Var) {
                return fi2Var;
            }
        }
        return new fi2(c83Var, ln1Var);
    }

    /* JADX INFO: renamed from: p */
    public static final Object m15537p(e83 e83Var, c83 c83Var, Continuation continuation) throws Throwable {
        m15539r(e83Var);
        Object objCollect = c83Var.collect(e83Var, continuation);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:24:0x0053, B:28:0x0068, B:30:0x0070, B:20:0x0045, B:23:0x004f), top: B:42:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (r2.emit(r10, r0) == r1) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0082 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m15538q(e83 e83Var, cu0 cu0Var, boolean z, Continuation continuation) throws Throwable {
        FlowKt__ChannelsKt$emitAllImpl$1 flowKt__ChannelsKt$emitAllImpl$1;
        ej0 it;
        ej0 ej0Var;
        e83 e83Var2;
        Object objM11164b;
        if (continuation instanceof FlowKt__ChannelsKt$emitAllImpl$1) {
            flowKt__ChannelsKt$emitAllImpl$1 = (FlowKt__ChannelsKt$emitAllImpl$1) continuation;
            int i = flowKt__ChannelsKt$emitAllImpl$1.f47823f;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ChannelsKt$emitAllImpl$1.f47823f = i - Integer.MIN_VALUE;
            } else {
                flowKt__ChannelsKt$emitAllImpl$1 = new FlowKt__ChannelsKt$emitAllImpl$1(continuation);
            }
        } else {
            flowKt__ChannelsKt$emitAllImpl$1 = new FlowKt__ChannelsKt$emitAllImpl$1(continuation);
        }
        Object obj = flowKt__ChannelsKt$emitAllImpl$1.f47822e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__ChannelsKt$emitAllImpl$1.f47823f;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                m15539r(e83Var);
                it = cu0Var.iterator();
                flowKt__ChannelsKt$emitAllImpl$1.f47818a = e83Var;
                flowKt__ChannelsKt$emitAllImpl$1.f47819b = cu0Var;
                flowKt__ChannelsKt$emitAllImpl$1.f47820c = it;
                flowKt__ChannelsKt$emitAllImpl$1.f47821d = z;
                flowKt__ChannelsKt$emitAllImpl$1.f47823f = 1;
                objM11164b = it.m11164b(flowKt__ChannelsKt$emitAllImpl$1);
                if (objM11164b == coroutineSingletons) {
                    e83Var2 = e83Var;
                    ej0Var = it;
                    obj = objM11164b;
                    if (!((Boolean) obj).booleanValue()) {
                        if (z) {
                            cu0Var.mo4537a(null);
                        }
                        return xfa.f68157a;
                    }
                    Object objM11165c = ej0Var.m11165c();
                    flowKt__ChannelsKt$emitAllImpl$1.f47818a = e83Var2;
                    flowKt__ChannelsKt$emitAllImpl$1.f47819b = cu0Var;
                    flowKt__ChannelsKt$emitAllImpl$1.f47820c = ej0Var;
                    flowKt__ChannelsKt$emitAllImpl$1.f47821d = z;
                    flowKt__ChannelsKt$emitAllImpl$1.f47823f = 2;
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                z = flowKt__ChannelsKt$emitAllImpl$1.f47821d;
                ej0Var = flowKt__ChannelsKt$emitAllImpl$1.f47820c;
                cu0Var = flowKt__ChannelsKt$emitAllImpl$1.f47819b;
                e83Var2 = flowKt__ChannelsKt$emitAllImpl$1.f47818a;
                AbstractC3193b.m15359b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    if (z) {
                        cu0Var.mo4537a(null);
                    }
                    return xfa.f68157a;
                }
                Object objM11165c2 = ej0Var.m11165c();
                flowKt__ChannelsKt$emitAllImpl$1.f47818a = e83Var2;
                flowKt__ChannelsKt$emitAllImpl$1.f47819b = cu0Var;
                flowKt__ChannelsKt$emitAllImpl$1.f47820c = ej0Var;
                flowKt__ChannelsKt$emitAllImpl$1.f47821d = z;
                flowKt__ChannelsKt$emitAllImpl$1.f47823f = 2;
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = flowKt__ChannelsKt$emitAllImpl$1.f47821d;
                ej0Var = flowKt__ChannelsKt$emitAllImpl$1.f47820c;
                cu0Var = flowKt__ChannelsKt$emitAllImpl$1.f47819b;
                e83Var2 = flowKt__ChannelsKt$emitAllImpl$1.f47818a;
                AbstractC3193b.m15359b(obj);
            }
            it = ej0Var;
            e83Var = e83Var2;
            flowKt__ChannelsKt$emitAllImpl$1.f47818a = e83Var;
            flowKt__ChannelsKt$emitAllImpl$1.f47819b = cu0Var;
            flowKt__ChannelsKt$emitAllImpl$1.f47820c = it;
            flowKt__ChannelsKt$emitAllImpl$1.f47821d = z;
            flowKt__ChannelsKt$emitAllImpl$1.f47823f = 1;
            objM11164b = it.m11164b(flowKt__ChannelsKt$emitAllImpl$1);
            if (objM11164b == coroutineSingletons) {
                e83Var2 = e83Var;
                ej0Var = it;
                obj = objM11164b;
                if (!((Boolean) obj).booleanValue()) {
                    if (z) {
                        cu0Var.mo4537a(null);
                    }
                    return xfa.f68157a;
                }
                Object objM11165c3 = ej0Var.m11165c();
                flowKt__ChannelsKt$emitAllImpl$1.f47818a = e83Var2;
                flowKt__ChannelsKt$emitAllImpl$1.f47819b = cu0Var;
                flowKt__ChannelsKt$emitAllImpl$1.f47820c = ej0Var;
                flowKt__ChannelsKt$emitAllImpl$1.f47821d = z;
                flowKt__ChannelsKt$emitAllImpl$1.f47823f = 2;
            }
            return coroutineSingletons;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z) {
                    AbstractC3212b.m15485b(cu0Var, th);
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m15539r(e83 e83Var) throws Throwable {
        if (e83Var instanceof zz9) {
            throw ((zz9) e83Var).f72433a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x006f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: s */
    public static final Object m15540s(c83 c83Var, zi3 zi3Var, ContinuationImpl continuationImpl) throws Throwable {
        FlowKt__ReduceKt$first$3 flowKt__ReduceKt$first$3;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        r83 r83Var;
        C0842cc c0842cc = thb.f62314j;
        if (continuationImpl instanceof FlowKt__ReduceKt$first$3) {
            flowKt__ReduceKt$first$3 = (FlowKt__ReduceKt$first$3) continuationImpl;
            int i = flowKt__ReduceKt$first$3.f47924d;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$3.f47924d = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(continuationImpl);
            }
        } else {
            flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(continuationImpl);
        }
        Object obj = flowKt__ReduceKt$first$3.f47923c;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__ReduceKt$first$3.f47924d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.f47718a = c0842cc;
            r83 r83Var2 = new r83(0, zi3Var, ref$ObjectRef2);
            try {
                flowKt__ReduceKt$first$3.f47921a = ref$ObjectRef2;
                flowKt__ReduceKt$first$3.f47922b = r83Var2;
                flowKt__ReduceKt$first$3.f47924d = 1;
                if (c83Var.collect(r83Var2, flowKt__ReduceKt$first$3) == obj2) {
                    return obj2;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } catch (AbortFlowException e2) {
                ref$ObjectRef = ref$ObjectRef2;
                e = e2;
                r83Var = r83Var2;
                if (e.f48068a == r83Var) {
                    throw e;
                }
                AbstractC3208a.m15439f(flowKt__ReduceKt$first$3.getContext());
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r83Var = flowKt__ReduceKt$first$3.f47922b;
            ref$ObjectRef = flowKt__ReduceKt$first$3.f47921a;
            try {
                AbstractC3193b.m15359b(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.f48068a == r83Var) {
                    throw e;
                }
                AbstractC3208a.m15439f(flowKt__ReduceKt$first$3.getContext());
            }
        }
        Object obj3 = ref$ObjectRef.f47718a;
        if (obj3 != c0842cc) {
            return obj3;
        }
        uk9.m22775i("Expected at least one element matching the predicate");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x006f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: t */
    public static final Object m15541t(c83 c83Var, Continuation continuation) {
        FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        q83 q83Var;
        C0842cc c0842cc = thb.f62314j;
        if (continuation instanceof FlowKt__ReduceKt$first$1) {
            flowKt__ReduceKt$first$1 = (FlowKt__ReduceKt$first$1) continuation;
            int i = flowKt__ReduceKt$first$1.f47920d;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$1.f47920d = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(continuation);
            }
        } else {
            flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(continuation);
        }
        Object obj = flowKt__ReduceKt$first$1.f47919c;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__ReduceKt$first$1.f47920d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.f47718a = c0842cc;
            q83 q83Var2 = new q83(0, ref$ObjectRef2);
            try {
                flowKt__ReduceKt$first$1.f47917a = ref$ObjectRef2;
                flowKt__ReduceKt$first$1.f47918b = q83Var2;
                flowKt__ReduceKt$first$1.f47920d = 1;
                if (c83Var.collect(q83Var2, flowKt__ReduceKt$first$1) == obj2) {
                    return obj2;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } catch (AbortFlowException e2) {
                ref$ObjectRef = ref$ObjectRef2;
                e = e2;
                q83Var = q83Var2;
                if (e.f48068a == q83Var) {
                    throw e;
                }
                AbstractC3208a.m15439f(flowKt__ReduceKt$first$1.getContext());
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q83Var = flowKt__ReduceKt$first$1.f47918b;
            ref$ObjectRef = flowKt__ReduceKt$first$1.f47917a;
            try {
                AbstractC3193b.m15359b(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.f48068a == q83Var) {
                    throw e;
                }
                AbstractC3208a.m15439f(flowKt__ReduceKt$first$1.getContext());
            }
        }
        Object obj3 = ref$ObjectRef.f47718a;
        if (obj3 != c0842cc) {
            return obj3;
        }
        uk9.m22775i("Expected at least one element");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public static final Object m15542u(c83 c83Var, Continuation continuation) throws Throwable {
        FlowKt__ReduceKt$firstOrNull$1 flowKt__ReduceKt$firstOrNull$1;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        q83 q83Var;
        if (continuation instanceof FlowKt__ReduceKt$firstOrNull$1) {
            flowKt__ReduceKt$firstOrNull$1 = (FlowKt__ReduceKt$firstOrNull$1) continuation;
            int i = flowKt__ReduceKt$firstOrNull$1.f47928d;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$1.f47928d = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(continuation);
            }
        } else {
            flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(continuation);
        }
        Object obj = flowKt__ReduceKt$firstOrNull$1.f47927c;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__ReduceKt$firstOrNull$1.f47928d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            q83 q83Var2 = new q83(1, ref$ObjectRef2);
            try {
                flowKt__ReduceKt$firstOrNull$1.f47925a = ref$ObjectRef2;
                flowKt__ReduceKt$firstOrNull$1.f47926b = q83Var2;
                flowKt__ReduceKt$firstOrNull$1.f47928d = 1;
                if (c83Var.collect(q83Var2, flowKt__ReduceKt$firstOrNull$1) == obj2) {
                    return obj2;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } catch (AbortFlowException e2) {
                ref$ObjectRef = ref$ObjectRef2;
                e = e2;
                q83Var = q83Var2;
                if (e.f48068a == q83Var) {
                    throw e;
                }
                AbstractC3208a.m15439f(flowKt__ReduceKt$firstOrNull$1.getContext());
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q83Var = flowKt__ReduceKt$firstOrNull$1.f47926b;
            ref$ObjectRef = flowKt__ReduceKt$firstOrNull$1.f47925a;
            try {
                AbstractC3193b.m15359b(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.f48068a == q83Var) {
                    throw e;
                }
                AbstractC3208a.m15439f(flowKt__ReduceKt$firstOrNull$1.getContext());
            }
        }
        return ref$ObjectRef.f47718a;
    }

    /* JADX INFO: renamed from: v */
    public static final kk8 m15543v(c18 c18Var, c83 c83Var, bj3 bj3Var) {
        return new kk8(new C3216xd7c321e6(new c83[]{c18Var, c83Var}, null, bj3Var));
    }

    /* JADX INFO: renamed from: w */
    public static final c83 m15544w(c83 c83Var, kn1 kn1Var) {
        if (kn1Var.get(nj0.f52795N) != null) {
            ij6.m13961s(kn1Var, "Flow context cannot contain job in it. Had ");
            return null;
        }
        if (kn1Var.equals(EmptyCoroutineContext.f47685a)) {
            return c83Var;
        }
        return c83Var instanceof jj3 ? jj3.m14495a((jj3) c83Var, kn1Var, 0, null, 6) : new fu0(c83Var, kn1Var, 0, null, 12);
    }

    /* JADX INFO: renamed from: x */
    public static final pg9 m15545x(c83 c83Var, un1 un1Var) {
        return wfb.m23926u(un1Var, null, null, new FlowKt__CollectKt$launchIn$1(c83Var, null), 3);
    }

    /* JADX INFO: renamed from: y */
    public static final C3235e m15546y(c83 c83Var, zi3 zi3Var) {
        int i = p83.f55729a;
        return m15521C(c83Var, new FlowKt__MergeKt$mapLatest$1(zi3Var, null));
    }

    /* JADX INFO: renamed from: z */
    public static final C3236f m15547z(c83... c83VarArr) {
        int i = p83.f55729a;
        return new C3236f(c83VarArr.length == 0 ? EmptyList.f47638a : new C3512qv(c83VarArr, 0), EmptyCoroutineContext.f47685a, -2, BufferOverflow.SUSPEND);
    }
}
