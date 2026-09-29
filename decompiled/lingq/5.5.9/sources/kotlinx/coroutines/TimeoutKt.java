package kotlinx.coroutines;

import cm.InterfaceC2056p;
import dm.C5213m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import no.C7828f;
import no.C7841j0;
import no.C7870t;
import no.InterfaceC7882z;
import no.RunnableC7860p1;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;

/* JADX INFO: loaded from: classes2.dex */
public final class TimeoutKt {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final <U, T extends U> Object m14313a(RunnableC7860p1<U, ? super T> runnableC7860p1, InterfaceC2056p<? super InterfaceC7882z, ? super InterfaceC9968c<? super T>, ? extends Object> interfaceC2056p) throws Throwable {
        Object c7870t;
        Object objM15638V;
        runnableC7860p1.mo15620r1(new C7841j0(C7828f.m15568b(runnableC7860p1.f40440c.mo2029e()).mo14318G0(runnableC7860p1.f42956d, runnableC7860p1, runnableC7860p1.f42914b)));
        try {
            C5213m.m11200e(2, interfaceC2056p);
            c7870t = interfaceC2056p.mo1337m0(runnableC7860p1, runnableC7860p1);
        } catch (Throwable th2) {
            c7870t = new C7870t(th2, false);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (c7870t == coroutineSingletons || (objM15638V = runnableC7860p1.m15638V(c7870t)) == C7499b.f41419I) {
            return coroutineSingletons;
        }
        if (objM15638V instanceof C7870t) {
            Throwable th3 = ((C7870t) objM15638V).f42969a;
            if (((th3 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th3).f39995a == runnableC7860p1) ? false : true) {
                throw th3;
            }
            if (c7870t instanceof C7870t) {
                throw ((C7870t) c7870t).f42969a;
            }
        } else {
            c7870t = C7499b.m14907H0(objM15638V);
        }
        return c7870t;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, no.p1] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static final <T> Object m14314b(long j10, InterfaceC2056p<? super InterfaceC7882z, ? super InterfaceC9968c<? super T>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super T> interfaceC9968c) throws Throwable {
        TimeoutKt$withTimeoutOrNull$1 timeoutKt$withTimeoutOrNull$1;
        TimeoutCancellationException e10;
        Ref$ObjectRef ref$ObjectRef;
        if (interfaceC9968c instanceof TimeoutKt$withTimeoutOrNull$1) {
            timeoutKt$withTimeoutOrNull$1 = (TimeoutKt$withTimeoutOrNull$1) interfaceC9968c;
            int i10 = timeoutKt$withTimeoutOrNull$1.f39999g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                timeoutKt$withTimeoutOrNull$1.f39999g = i10 - Integer.MIN_VALUE;
            } else {
                timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(interfaceC9968c);
            }
        } else {
            timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(interfaceC9968c);
        }
        Object objM14313a = timeoutKt$withTimeoutOrNull$1.f39998f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = timeoutKt$withTimeoutOrNull$1.f39999g;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = timeoutKt$withTimeoutOrNull$1.f39997e;
            try {
                C7499b.m14977z0(objM14313a);
            } catch (TimeoutCancellationException e11) {
                e10 = e11;
                if (e10.f39995a == ref$ObjectRef.f38127a) {
                    return null;
                }
                throw e10;
            }
        }
        C7499b.m14977z0(objM14313a);
        if (j10 <= 0) {
            return null;
        }
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        try {
            timeoutKt$withTimeoutOrNull$1.f39996d = interfaceC2056p;
            timeoutKt$withTimeoutOrNull$1.f39997e = ref$ObjectRef2;
            timeoutKt$withTimeoutOrNull$1.f39999g = 1;
            ?? r10 = (T) new RunnableC7860p1(j10, timeoutKt$withTimeoutOrNull$1);
            ref$ObjectRef2.f38127a = r10;
            objM14313a = m14313a(r10, interfaceC2056p);
            return objM14313a == coroutineSingletons ? coroutineSingletons : objM14313a;
        } catch (TimeoutCancellationException e12) {
            e10 = e12;
            ref$ObjectRef = ref$ObjectRef2;
            if (e10.f39995a == ref$ObjectRef.f38127a) {
                return null;
            }
            throw e10;
        }
    }
}
