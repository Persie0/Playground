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
import p000.ss5;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$2$1", m4291f = "HighlightedText.kt", m4292l = {322, 323, 328}, m4293m = "invokeSuspend", m4294v = 2)
final class HighlightedTextKt$HighlightedText$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23990a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0059a f23991b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f23992c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightedTextKt$HighlightedText$2$1(C0059a c0059a, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f23991b = c0059a;
        this.f23992c = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HighlightedTextKt$HighlightedText$2$1(this.f23991b, this.f23992c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HighlightedTextKt$HighlightedText$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r15 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (r15 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23990a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Regex regex = AbstractC1932c.f24144a;
            boolean zBooleanValue = ((Boolean) this.f23992c.getValue()).booleanValue();
            C0059a c0059a = this.f23991b;
            if (zBooleanValue) {
                Float f = new Float(0.35f);
                this.f23990a = 1;
                if (c0059a.m747f(f, this) != coroutineSingletons) {
                    Float f2 = new Float(0.55f);
                    fda fdaVarM21703b0 = ss5.m21703b0(90, 0, null, 6);
                    this.f23990a = 2;
                    obj = C0059a.m744c(this.f23991b, f2, fdaVarM21703b0, null, this, 12);
                }
            } else {
                Float f3 = new Float(0.0f);
                fda fdaVarM21703b1 = ss5.m21703b0(120, 0, null, 6);
                this.f23990a = 3;
                obj = C0059a.m744c(c0059a, f3, fdaVarM21703b1, null, this, 12);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            Float f4 = new Float(0.55f);
            fda fdaVarM21703b2 = ss5.m21703b0(90, 0, null, 6);
            this.f23990a = 2;
            obj = C0059a.m744c(this.f23991b, f4, fdaVarM21703b2, null, this, 12);
        } else if (i == 2) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
