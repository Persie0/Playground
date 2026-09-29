package com.lingq.feature.reader.reader.state;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.state.ReaderTooltipStateHolder$setContentReady$1", m4291f = "ReaderTooltipStateHolder.kt", m4292l = {63}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderTooltipStateHolder$setContentReady$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30303a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2503b f30304b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderTooltipStateHolder$setContentReady$1(C2503b c2503b, Continuation continuation) {
        super(2, continuation);
        this.f30304b = c2503b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderTooltipStateHolder$setContentReady$1(this.f30304b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderTooltipStateHolder$setContentReady$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30303a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f30303a = 1;
            if (AbstractC3208a.m15437d(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3244l c3244l = this.f30304b.f30320i;
        Boolean bool = Boolean.TRUE;
        c3244l.getClass();
        c3244l.m15572j(null, bool);
        return xfa.f68157a;
    }
}
