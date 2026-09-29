package com.amplitude.core.platform;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.o9b;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.platform.EventPipeline$schedule$1", m4291f = "EventPipeline.kt", m4292l = {178}, m4293m = "invokeSuspend")
final class EventPipeline$schedule$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f11078a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f11079b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0907a f11080c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventPipeline$schedule$1(C0907a c0907a, Continuation continuation) {
        super(2, continuation);
        this.f11080c = c0907a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        EventPipeline$schedule$1 eventPipeline$schedule$1 = new EventPipeline$schedule$1(this.f11080c, continuation);
        eventPipeline$schedule$1.f11079b = obj;
        return eventPipeline$schedule$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((EventPipeline$schedule$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f11078a;
        C0907a c0907a = this.f11080c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (vz1.m23603I((un1) this.f11079b) && c0907a.f11103i && !c0907a.f11104j) {
                c0907a.f11104j = true;
                long j = c0907a.f11095a.f11016a.f10791d;
                this.f11078a = 1;
                if (AbstractC3208a.m15437d(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        c0907a.f11101g.mo4677k(new o9b(WriteQueueMessageType.FLUSH, null));
        c0907a.f11104j = false;
        return xfa.f68157a;
    }
}
