package com.amplitude.core.utilities;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.utilities.EventsFileManager$1", m4291f = "EventsFileManager.kt", m4292l = {49}, m4293m = "invokeSuspend")
final class EventsFileManager$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f11189a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0913a f11190b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventsFileManager$1(C0913a c0913a, Continuation continuation) {
        super(2, continuation);
        this.f11190b = c0913a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EventsFileManager$1(this.f11190b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((EventsFileManager$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f11189a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f11189a = 1;
            if (C0913a.m5153a(this.f11190b, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
