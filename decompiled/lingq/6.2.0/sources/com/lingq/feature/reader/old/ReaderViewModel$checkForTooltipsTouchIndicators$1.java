package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.onboarding.TooltipStep;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C3211a;
import p000.C3386nv;
import p000.c32;
import p000.lda;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$checkForTooltipsTouchIndicators$1", m4291f = "ReaderViewModel.kt", m4292l = {2341, 2346, 2351, 2356}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$checkForTooltipsTouchIndicators$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28922a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28923b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$checkForTooltipsTouchIndicators$1(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28923b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$checkForTooltipsTouchIndicators$1(this.f28923b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$checkForTooltipsTouchIndicators$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (kotlinx.coroutines.AbstractC3208a.m15437d(360, r11) == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (kotlinx.coroutines.AbstractC3208a.m15437d(360, r11) == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (kotlinx.coroutines.AbstractC3208a.m15437d(360, r11) == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (kotlinx.coroutines.AbstractC3208a.m15437d(360, r11) == r2) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2412n c2412n = this.f28923b;
        C3211a c3211a = c2412n.f29270D1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28922a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (c2412n.mo8753Z0(TooltipStep.ReviewMenuHighlight)) {
                this.f28922a = 1;
            } else if (c2412n.mo8753Z0(TooltipStep.PlayAudioHighlight)) {
                this.f28922a = 2;
            } else {
                if (!c2412n.mo8753Z0(TooltipStep.SentenceModeHighlight)) {
                    if (c2412n.mo8753Z0(TooltipStep.SwipePageHighlight)) {
                        this.f28922a = 4;
                    }
                    wfb.m23926u(lda.m16103C(c2412n), null, null, new ReaderViewModel$showPlayAudioTooltip$1(c2412n, null), 3);
                    return xfa.f68157a;
                }
                this.f28922a = 3;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                c3211a.mo4677k(TooltipStep.PlayAudioHighlight);
                if (!c2412n.mo8753Z0(TooltipStep.SentenceModeHighlight)) {
                    if (c2412n.mo8753Z0(TooltipStep.SwipePageHighlight)) {
                        this.f28922a = 4;
                    }
                    wfb.m23926u(lda.m16103C(c2412n), null, null, new ReaderViewModel$showPlayAudioTooltip$1(c2412n, null), 3);
                    return xfa.f68157a;
                }
                this.f28922a = 3;
                return coroutineSingletons;
            }
            if (i == 3) {
                AbstractC3193b.m15359b(obj);
                c3211a.mo4677k(TooltipStep.SentenceModeHighlight);
                if (c2412n.mo8753Z0(TooltipStep.SwipePageHighlight)) {
                    this.f28922a = 4;
                }
                wfb.m23926u(lda.m16103C(c2412n), null, null, new ReaderViewModel$showPlayAudioTooltip$1(c2412n, null), 3);
                return xfa.f68157a;
            }
            if (i != 4) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        c3211a.mo4677k(TooltipStep.SwipePageHighlight);
        wfb.m23926u(lda.m16103C(c2412n), null, null, new ReaderViewModel$showPlayAudioTooltip$1(c2412n, null), 3);
        return xfa.f68157a;
        c3211a.mo4677k(TooltipStep.ReviewMenuHighlight);
        if (c2412n.mo8753Z0(TooltipStep.PlayAudioHighlight)) {
            this.f28922a = 2;
        } else {
            if (!c2412n.mo8753Z0(TooltipStep.SentenceModeHighlight)) {
                if (c2412n.mo8753Z0(TooltipStep.SwipePageHighlight)) {
                    this.f28922a = 4;
                }
                wfb.m23926u(lda.m16103C(c2412n), null, null, new ReaderViewModel$showPlayAudioTooltip$1(c2412n, null), 3);
                return xfa.f68157a;
            }
            this.f28922a = 3;
        }
        return coroutineSingletons;
    }
}
