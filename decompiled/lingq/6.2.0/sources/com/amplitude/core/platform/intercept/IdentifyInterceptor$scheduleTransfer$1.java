package com.amplitude.core.platform.intercept;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.platform.intercept.IdentifyInterceptor$scheduleTransfer$1", m4291f = "IdentifyInterceptor.kt", m4292l = {106, 107}, m4293m = "invokeSuspend")
final class IdentifyInterceptor$scheduleTransfer$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f11130a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0909b f11131b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentifyInterceptor$scheduleTransfer$1(C0909b c0909b, Continuation continuation) {
        super(2, continuation);
        this.f11131b = c0909b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IdentifyInterceptor$scheduleTransfer$1(this.f11131b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((IdentifyInterceptor$scheduleTransfer$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r0.m5142c(r8) == r2) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0909b c0909b = this.f11131b;
        AtomicBoolean atomicBoolean = c0909b.f11144f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f11130a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            atomicBoolean.getAndSet(false);
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        if (!atomicBoolean.get()) {
            atomicBoolean.getAndSet(true);
            long j = c0909b.f11142d.f10800m;
            this.f11130a = 1;
            if (AbstractC3208a.m15437d(j, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
        this.f11130a = 2;
    }
}
