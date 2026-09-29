package com.lingq.core.p012ui.highlightedtext;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aa1;
import p000.c32;
import p000.fda;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$4$1$2$1$1", m4291f = "HighlightedText.kt", m4292l = {376}, m4293m = "invokeSuspend", m4294v = 2)
final class HighlightedTextKt$HighlightedText$4$1$2$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24008a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0059a f24009b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fda f24010c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightedTextKt$HighlightedText$4$1$2$1$1(C0059a c0059a, fda fdaVar, Continuation continuation) {
        super(2, continuation);
        this.f24009b = c0059a;
        this.f24010c = fdaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HighlightedTextKt$HighlightedText$4$1$2$1$1(this.f24009b, this.f24010c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HighlightedTextKt$HighlightedText$4$1$2$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24008a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            aa1 aa1Var = new aa1(aa1.f411j);
            this.f24008a = 1;
            if (C0059a.m744c(this.f24009b, aa1Var, this.f24010c, null, this, 12) == coroutineSingletons) {
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
