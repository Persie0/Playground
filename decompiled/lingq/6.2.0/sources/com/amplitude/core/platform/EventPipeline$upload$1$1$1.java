package com.amplitude.core.platform;

import com.amplitude.android.storage.C0898b;
import java.io.FileNotFoundException;
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
@c32(m4290c = "com.amplitude.core.platform.EventPipeline$upload$1$1$1", m4291f = "EventPipeline.kt", m4292l = {120}, m4293m = "invokeSuspend")
final class EventPipeline$upload$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f11088a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0907a f11089b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventPipeline$upload$1$1$1(C0907a c0907a, Continuation continuation) {
        super(2, continuation);
        this.f11089b = c0907a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EventPipeline$upload$1$1$1(this.f11089b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((EventPipeline$upload$1$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f11088a;
        xfa xfaVar = xfa.f68157a;
        C0907a c0907a = this.f11089b;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C0898b c0898b = c0907a.f11099e;
                this.f11088a = 1;
                return c0898b.m5101f(this) == coroutineSingletons ? coroutineSingletons : xfaVar;
            }
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            c0907a.f11095a.m5113g().mo16257c("Event storage file not found: ".concat(message));
            return xfaVar;
        }
    }
}
