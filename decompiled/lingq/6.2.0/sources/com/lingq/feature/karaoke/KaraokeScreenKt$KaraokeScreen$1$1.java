package com.lingq.feature.karaoke;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.fa4;
import p000.hbb;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.karaoke.KaraokeScreenKt$KaraokeScreen$1$1", m4291f = "KaraokeScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class KaraokeScreenKt$KaraokeScreen$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f26213a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f26214b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f26215c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KaraokeScreenKt$KaraokeScreen$1$1(String str, t66 t66Var, t66 t66Var2, Continuation continuation) {
        super(2, continuation);
        this.f26213a = str;
        this.f26214b = t66Var;
        this.f26215c = t66Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KaraokeScreenKt$KaraokeScreen$1$1(this.f26213a, this.f26214b, this.f26215c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        KaraokeScreenKt$KaraokeScreen$1$1 karaokeScreenKt$KaraokeScreen$1$1 = (KaraokeScreenKt$KaraokeScreen$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        karaokeScreenKt$KaraokeScreen$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        t66 t66Var = this.f26214b;
        String str = (String) t66Var.getValue();
        String str2 = this.f26213a;
        if (!fa4.m11650l(str, str2) && str2 != null) {
            t66Var.setValue(str2);
            this.f26215c.setValue(new hbb(str2));
        }
        return xfa.f68157a;
    }
}
