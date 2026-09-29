package com.lingq.core.p012ui.highlightedtext;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import p000.C3386nv;
import p000.c32;
import p000.fda;
import p000.i84;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$3$1", m4291f = "HighlightedText.kt", m4292l = {335, 336, 338}, m4293m = "invokeSuspend", m4294v = 2)
final class HighlightedTextKt$HighlightedText$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23993a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0059a f23994b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f23995c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ fda f23996d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t66 f23997e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightedTextKt$HighlightedText$3$1(C0059a c0059a, float f, fda fdaVar, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f23994b = c0059a;
        this.f23995c = f;
        this.f23996d = fdaVar;
        this.f23997e = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HighlightedTextKt$HighlightedText$3$1(this.f23994b, this.f23995c, this.f23996d, this.f23997e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HighlightedTextKt$HighlightedText$3$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (androidx.compose.animation.core.C0059a.m744c(r10.f23994b, r5, r10.f23996d, null, r10, 12) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r5.m747f(r10, r10) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23993a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                Float f = new Float(this.f23995c);
                this.f23993a = 2;
            } else {
                if (i != 2 && i != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        Regex regex = AbstractC1932c.f24144a;
        i84 i84Var = (i84) this.f23997e.getValue();
        C0059a c0059a = this.f23994b;
        if (i84Var != null) {
            Float f2 = new Float(0.0f);
            this.f23993a = 1;
            if (c0059a.m747f(f2, this) != coroutineSingletons) {
                Float f3 = new Float(this.f23995c);
                this.f23993a = 2;
            }
        } else {
            Float f4 = new Float(0.0f);
            this.f23993a = 3;
        }
        return coroutineSingletons;
    }
}
