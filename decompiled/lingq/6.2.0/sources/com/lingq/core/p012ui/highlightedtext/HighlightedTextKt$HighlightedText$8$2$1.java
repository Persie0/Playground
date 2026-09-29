package com.lingq.core.p012ui.highlightedtext;

import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import p000.aq4;
import p000.c32;
import p000.cfd;
import p000.e28;
import p000.e65;
import p000.jt3;
import p000.q7b;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$8$2$1", m4291f = "HighlightedText.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class HighlightedTextKt$HighlightedText$8$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24081a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zi3 f24082b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jt3 f24083c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Map f24084d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t66 f24085e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightedTextKt$HighlightedText$8$2$1(int i, zi3 zi3Var, jt3 jt3Var, Map map, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f24081a = i;
        this.f24082b = zi3Var;
        this.f24083c = jt3Var;
        this.f24084d = map;
        this.f24085e = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HighlightedTextKt$HighlightedText$8$2$1(this.f24081a, this.f24082b, this.f24083c, this.f24084d, this.f24085e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        HighlightedTextKt$HighlightedText$8$2$1 highlightedTextKt$HighlightedText$8$2$1 = (HighlightedTextKt$HighlightedText$8$2$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        highlightedTextKt$HighlightedText$8$2$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Regex regex = AbstractC1932c.f24144a;
        aq4 aq4Var = (aq4) this.f24085e.getValue();
        xfa xfaVar = xfa.f68157a;
        if (aq4Var != null) {
            zi3 zi3Var = this.f24082b;
            int i = this.f24081a;
            if (i < 0) {
                zi3Var.invoke(null, null);
                return xfaVar;
            }
            q7b q7bVar = (q7b) this.f24083c.f46105c.get(i);
            List list = (List) e65.m10872d(q7bVar.f57357a.f69009f, this.f24084d);
            if (list != null) {
                e28 e28VarM4632g = cfd.m4632g(list, aq4Var);
                if (e28VarM4632g.f36622c - e28VarM4632g.f36620a > 0.0f && e28VarM4632g.f36623d - e28VarM4632g.f36621b > 0.0f) {
                    zi3Var.invoke(e28VarM4632g, q7bVar.f57357a);
                }
            }
        }
        return xfaVar;
    }
}
