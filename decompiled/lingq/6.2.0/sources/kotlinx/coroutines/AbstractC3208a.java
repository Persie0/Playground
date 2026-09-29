package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.DurationUnit;
import p000.AbstractC3352my;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.be4;
import p000.ca2;
import p000.cd4;
import p000.ci2;
import p000.cn2;
import p000.d1a;
import p000.ei2;
import p000.g62;
import p000.gm5;
import p000.in1;
import p000.iy5;
import p000.jj5;
import p000.kn1;
import p000.nj0;
import p000.pfa;
import p000.sd4;
import p000.sm0;
import p000.ui3;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: kotlinx.coroutines.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3208a {
    /* JADX INFO: renamed from: a */
    public static sd4 m15434a() {
        return new sd4(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final CoroutineSingletons m15435b(ContinuationImpl continuationImpl) throws Throwable {
        DelayKt$awaitCancellation$1 delayKt$awaitCancellation$1;
        if (continuationImpl instanceof DelayKt$awaitCancellation$1) {
            delayKt$awaitCancellation$1 = (DelayKt$awaitCancellation$1) continuationImpl;
            int i = delayKt$awaitCancellation$1.f47747b;
            if ((i & Integer.MIN_VALUE) != 0) {
                delayKt$awaitCancellation$1.f47747b = i - Integer.MIN_VALUE;
            } else {
                delayKt$awaitCancellation$1 = new DelayKt$awaitCancellation$1(continuationImpl);
            }
        } else {
            delayKt$awaitCancellation$1 = new DelayKt$awaitCancellation$1(continuationImpl);
        }
        Object obj = delayKt$awaitCancellation$1.f47746a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = delayKt$awaitCancellation$1.f47747b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            delayKt$awaitCancellation$1.f47747b = 1;
            sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(delayKt$awaitCancellation$1));
            sm0Var.m21468u();
            if (sm0Var.m21466r() == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17631r();
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final void m15436c(kn1 kn1Var, CancellationException cancellationException) {
        cd4 cd4Var = (cd4) kn1Var.get(nj0.f52795N);
        if (cd4Var != null) {
            cd4Var.mo4537a(cancellationException);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Object m15437d(long j, Continuation continuation) {
        if (j > 0) {
            sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(continuation));
            sm0Var.m21468u();
            if (j < Long.MAX_VALUE) {
                m15440g(sm0Var.f61016e).mo4458N(j, sm0Var);
            }
            Object objM21466r = sm0Var.m21466r();
            if (objM21466r == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM21466r;
            }
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: e */
    public static final Object m15438e(long j, ContinuationImpl continuationImpl) {
        Object objM15437d = m15437d(m15446m(j), continuationImpl);
        return objM15437d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15437d : xfa.f68157a;
    }

    /* JADX INFO: renamed from: f */
    public static final void m15439f(kn1 kn1Var) {
        cd4 cd4Var = (cd4) kn1Var.get(nj0.f52795N);
        if (cd4Var != null && !cd4Var.mo4538b()) {
            throw cd4Var.mo4541u();
        }
    }

    /* JADX INFO: renamed from: g */
    public static final ca2 m15440g(kn1 kn1Var) {
        in1 in1Var = kn1Var.get(jj5.f45612c);
        ca2 ca2Var = in1Var instanceof ca2 ? (ca2) in1Var : null;
        return ca2Var == null ? g62.f40259a : ca2Var;
    }

    /* JADX INFO: renamed from: h */
    public static final cd4 m15441h(kn1 kn1Var) {
        cd4 cd4Var = (cd4) kn1Var.get(nj0.f52795N);
        if (cd4Var != null) {
            return cd4Var;
        }
        C3386nv.m17632s(kn1Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static ci2 m15442i(cd4 cd4Var, be4 be4Var) {
        return cd4Var instanceof C3213d ? ((C3213d) cd4Var).m15503V(true, be4Var) : cd4Var.mo4536R(be4Var.mo3669r(), true, new JobKt__JobKt$invokeOnCompletion$1(be4Var));
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m15443j(kn1 kn1Var) {
        cd4 cd4Var = (cd4) kn1Var.get(nj0.f52795N);
        if (cd4Var != null) {
            return cd4Var.mo4538b();
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static Object m15444k(ui3 ui3Var, ContinuationImpl continuationImpl) {
        return wfb.m23905G(new InterruptibleKt$runInterruptible$2(ui3Var, null), EmptyCoroutineContext.f47685a, continuationImpl);
    }

    /* JADX INFO: renamed from: l */
    public static final Object m15445l(d1a d1aVar, zi3 zi3Var) {
        m15442i(d1aVar, new ei2(m15440g(d1aVar.f10336f.getContext()).mo4459x(d1aVar.f34853g, d1aVar, d1aVar.f7705e)));
        return pfa.m19112b(d1aVar, false, d1aVar, zi3Var);
    }

    /* JADX INFO: renamed from: m */
    public static final long m15446m(long j) {
        iy5 iy5Var = cn2.f10315b;
        boolean z = j > 0;
        if (z) {
            return cn2.m4886d(cn2.m4889g(j, AbstractC3352my.m17119f0(999999L, DurationUnit.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        gm5.m12750e();
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public static final Object m15447n(long j, zi3 zi3Var, ContinuationImpl continuationImpl) throws Throwable {
        TimeoutKt$withTimeoutOrNull$1 timeoutKt$withTimeoutOrNull$1;
        Ref$ObjectRef ref$ObjectRef;
        if (continuationImpl instanceof TimeoutKt$withTimeoutOrNull$1) {
            timeoutKt$withTimeoutOrNull$1 = (TimeoutKt$withTimeoutOrNull$1) continuationImpl;
            int i = timeoutKt$withTimeoutOrNull$1.f47762c;
            if ((i & Integer.MIN_VALUE) != 0) {
                timeoutKt$withTimeoutOrNull$1.f47762c = i - Integer.MIN_VALUE;
            } else {
                timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(continuationImpl);
            }
        } else {
            timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(continuationImpl);
        }
        Object obj = timeoutKt$withTimeoutOrNull$1.f47761b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = timeoutKt$withTimeoutOrNull$1.f47762c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            if (j > 0) {
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                try {
                    timeoutKt$withTimeoutOrNull$1.f47760a = ref$ObjectRef2;
                    timeoutKt$withTimeoutOrNull$1.f47762c = 1;
                    d1a d1aVar = new d1a(j, timeoutKt$withTimeoutOrNull$1);
                    ref$ObjectRef2.f47718a = d1aVar;
                    Object objM15445l = m15445l(d1aVar, zi3Var);
                    return objM15445l == coroutineSingletons ? coroutineSingletons : objM15445l;
                } catch (TimeoutCancellationException e) {
                    e = e;
                    ref$ObjectRef = ref$ObjectRef2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ref$ObjectRef = timeoutKt$withTimeoutOrNull$1.f47760a;
        try {
            AbstractC3193b.m15359b(obj);
            return obj;
        } catch (TimeoutCancellationException e2) {
            e = e2;
        }
        if (e.f47759a != ref$ObjectRef.f47718a) {
            throw e;
        }
        return null;
    }
}
