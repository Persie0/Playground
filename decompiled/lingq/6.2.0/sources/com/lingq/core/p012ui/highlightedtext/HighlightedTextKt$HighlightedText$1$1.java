package com.lingq.core.p012ui.highlightedtext;

import android.content.Context;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cd9;
import p000.jfa;
import p000.jt3;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$1$1", m4291f = "HighlightedText.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class HighlightedTextKt$HighlightedText$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23977a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jt3 f23978b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f23979c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ cd9 f23980d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ cd9 f23981e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightedTextKt$HighlightedText$1$1(jt3 jt3Var, Context context, cd9 cd9Var, cd9 cd9Var2, Continuation continuation) {
        super(2, continuation);
        this.f23978b = jt3Var;
        this.f23979c = context;
        this.f23980d = cd9Var;
        this.f23981e = cd9Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HighlightedTextKt$HighlightedText$1$1 highlightedTextKt$HighlightedText$1$1 = new HighlightedTextKt$HighlightedText$1$1(this.f23978b, this.f23979c, this.f23980d, this.f23981e, continuation);
        highlightedTextKt$HighlightedText$1$1.f23977a = obj;
        return highlightedTextKt$HighlightedText$1$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        HighlightedTextKt$HighlightedText$1$1 highlightedTextKt$HighlightedText$1$1 = (HighlightedTextKt$HighlightedText$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        highlightedTextKt$HighlightedText$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        un1 un1Var = (un1) this.f23977a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        jt3 jt3Var = this.f23978b;
        if (!jt3Var.f46125w.isEmpty()) {
            Context context = this.f23979c;
            int iM14419b = (int) jfa.m14419b(context, 200);
            int i = context.getResources().getDisplayMetrics().widthPixels;
            for (Map.Entry entry : jt3Var.f46125w.entrySet()) {
                String str = (String) entry.getKey();
                wfb.m23926u(un1Var, null, null, new HighlightedTextKt$HighlightedText$1$1$1$1(this.f23979c, (String) entry.getValue(), i, iM14419b, this.f23980d, str, this.f23981e, null), 3);
            }
        }
        return xfa.f68157a;
    }
}
