package com.amplitude.core.utilities;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: com.amplitude.core.utilities.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0914b {

    /* JADX INFO: renamed from: a */
    public final int f11262a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f11263b = new AtomicInteger(0);

    public C0914b(int i) {
        this.f11262a = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m5167a(vi3 vi3Var, ContinuationImpl continuationImpl) throws Throwable {
        ExponentialBackoffRetryHandler$attemptRetry$1 exponentialBackoffRetryHandler$attemptRetry$1;
        if (continuationImpl instanceof ExponentialBackoffRetryHandler$attemptRetry$1) {
            exponentialBackoffRetryHandler$attemptRetry$1 = (ExponentialBackoffRetryHandler$attemptRetry$1) continuationImpl;
            int i = exponentialBackoffRetryHandler$attemptRetry$1.f11218e;
            if ((i & Integer.MIN_VALUE) != 0) {
                exponentialBackoffRetryHandler$attemptRetry$1.f11218e = i - Integer.MIN_VALUE;
            } else {
                exponentialBackoffRetryHandler$attemptRetry$1 = new ExponentialBackoffRetryHandler$attemptRetry$1(this, continuationImpl);
            }
        } else {
            exponentialBackoffRetryHandler$attemptRetry$1 = new ExponentialBackoffRetryHandler$attemptRetry$1(this, continuationImpl);
        }
        Object obj = exponentialBackoffRetryHandler$attemptRetry$1.f11216c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = exponentialBackoffRetryHandler$attemptRetry$1.f11218e;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            AtomicInteger atomicInteger = this.f11263b;
            if (atomicInteger.get() >= this.f11262a) {
                vi3Var.invoke(Boolean.FALSE);
                return xfaVar;
            }
            long jPow = (long) (Math.pow(2.0d, atomicInteger.get()) * 1000.0d);
            exponentialBackoffRetryHandler$attemptRetry$1.f11214a = this;
            exponentialBackoffRetryHandler$attemptRetry$1.f11215b = vi3Var;
            exponentialBackoffRetryHandler$attemptRetry$1.f11218e = 1;
            if (AbstractC3208a.m15437d(jPow, exponentialBackoffRetryHandler$attemptRetry$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vi3Var = (vi3) exponentialBackoffRetryHandler$attemptRetry$1.f11215b;
            this = exponentialBackoffRetryHandler$attemptRetry$1.f11214a;
            AbstractC3193b.m15359b(obj);
        }
        vi3Var.invoke(Boolean.TRUE);
        this.f11263b.incrementAndGet();
        return xfaVar;
    }
}
