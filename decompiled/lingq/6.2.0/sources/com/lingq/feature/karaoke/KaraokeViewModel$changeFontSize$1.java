package com.lingq.feature.karaoke;

import com.lingq.core.datastore.C1368a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.si7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.karaoke.KaraokeViewModel$changeFontSize$1", m4291f = "KaraokeViewModel.kt", m4292l = {331}, m4293m = "invokeSuspend", m4294v = 2)
final class KaraokeViewModel$changeFontSize$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26254a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2118c f26255b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f26256c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KaraokeViewModel$changeFontSize$1(C2118c c2118c, int i, Continuation continuation) {
        super(2, continuation);
        this.f26255b = c2118c;
        this.f26256c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KaraokeViewModel$changeFontSize$1(this.f26255b, this.f26256c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((KaraokeViewModel$changeFontSize$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26254a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            si7 si7Var = this.f26255b.f26294h;
            this.f26254a = 1;
            if (((C1368a) si7Var).m7843B(this.f26256c, this) == coroutineSingletons) {
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
