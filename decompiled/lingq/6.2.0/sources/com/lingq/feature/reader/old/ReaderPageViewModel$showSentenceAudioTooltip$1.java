package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.onboarding.TooltipStep;
import kotlin.AbstractC3193b;
import kotlin.Pair;
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
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$showSentenceAudioTooltip$1", m4291f = "ReaderPageViewModel.kt", m4292l = {1400}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$showSentenceAudioTooltip$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28728a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2411m f28729b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$showSentenceAudioTooltip$1(C2411m c2411m, Continuation continuation) {
        super(2, continuation);
        this.f28729b = c2411m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageViewModel$showSentenceAudioTooltip$1(this.f28729b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageViewModel$showSentenceAudioTooltip$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28728a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f28728a = 1;
            if (AbstractC3208a.m15437d(360L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        this.f28729b.f29232f0.mo4677k(new Pair(null, TooltipStep.SentenceModeAudio));
        return xfa.f68157a;
    }
}
