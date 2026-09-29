package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.onboarding.TooltipStep;
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

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$showPlayAudioTooltip$1", m4291f = "ReaderViewModel.kt", m4292l = {2372}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$showPlayAudioTooltip$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29074a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f29075b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$showPlayAudioTooltip$1(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f29075b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$showPlayAudioTooltip$1(this.f29075b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$showPlayAudioTooltip$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29074a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f29074a = 1;
            if (AbstractC3208a.m15437d(320L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        TooltipStep tooltipStep = TooltipStep.PlayAudio;
        C2412n c2412n = this.f29075b;
        if (c2412n.mo8753Z0(tooltipStep)) {
            c2412n.f29270D1.mo4677k(tooltipStep);
        }
        return xfa.f68157a;
    }
}
