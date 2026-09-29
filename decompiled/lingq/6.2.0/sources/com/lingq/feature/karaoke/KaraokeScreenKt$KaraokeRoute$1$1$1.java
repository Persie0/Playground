package com.lingq.feature.karaoke;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.tg6;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.karaoke.KaraokeScreenKt$KaraokeRoute$1$1$1", m4291f = "KaraokeScreen.kt", m4292l = {156}, m4293m = "invokeSuspend", m4294v = 2)
final class KaraokeScreenKt$KaraokeRoute$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26209a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2118c f26210b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Integer f26211c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f26212d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KaraokeScreenKt$KaraokeRoute$1$1$1(C2118c c2118c, Integer num, vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f26210b = c2118c;
        this.f26211c = num;
        this.f26212d = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KaraokeScreenKt$KaraokeRoute$1$1$1(this.f26210b, this.f26211c, this.f26212d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((KaraokeScreenKt$KaraokeRoute$1$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26209a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f26209a = 1;
            if (this.f26210b.m9030V2(this.f26211c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        this.f26212d.invoke(tg6.f62255a);
        return xfa.f68157a;
    }
}
