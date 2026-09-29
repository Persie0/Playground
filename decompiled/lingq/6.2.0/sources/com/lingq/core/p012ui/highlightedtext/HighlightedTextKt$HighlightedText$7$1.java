package com.lingq.core.p012ui.highlightedtext;

import com.lingq.core.domain.store.AudioUnderlineMode;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.jt3;
import p000.t66;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$7$1", m4291f = "HighlightedText.kt", m4292l = {493}, m4293m = "invokeSuspend", m4294v = 2)
final class HighlightedTextKt$HighlightedText$7$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24077a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f24078b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jt3 f24079c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f24080d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightedTextKt$HighlightedText$7$1(jt3 jt3Var, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f24079c = jt3Var;
        this.f24080d = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HighlightedTextKt$HighlightedText$7$1 highlightedTextKt$HighlightedText$7$1 = new HighlightedTextKt$HighlightedText$7$1(this.f24079c, this.f24080d, continuation);
        highlightedTextKt$HighlightedText$7$1.f24078b = obj;
        return highlightedTextKt$HighlightedText$7$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HighlightedTextKt$HighlightedText$7$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        un1 un1Var = (un1) this.f24078b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24077a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            jt3 jt3Var = this.f24079c;
            if (jt3Var.f46122t != null && jt3Var.f46123u == AudioUnderlineMode.Wave) {
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        while (vz1.m23603I(un1Var)) {
            long jNanoTime = System.nanoTime();
            Regex regex = AbstractC1932c.f24144a;
            this.f24080d.setValue(Long.valueOf(jNanoTime));
            this.f24078b = un1Var;
            this.f24077a = 1;
            if (AbstractC3208a.m15437d(16L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfa.f68157a;
    }
}
