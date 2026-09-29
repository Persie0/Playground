package com.lingq.feature.karaoke;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.ij2;
import p000.lj2;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.karaoke.KaraokeViewModel$special$$inlined$flatMapLatest$1", m4291f = "KaraokeViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class KaraokeViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f26271a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f26272b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f26273c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2118c f26274d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KaraokeViewModel$special$$inlined$flatMapLatest$1(C2118c c2118c, Continuation continuation) {
        super(3, continuation);
        this.f26274d = c2118c;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        KaraokeViewModel$special$$inlined$flatMapLatest$1 karaokeViewModel$special$$inlined$flatMapLatest$1 = new KaraokeViewModel$special$$inlined$flatMapLatest$1(this.f26274d, (Continuation) obj3);
        karaokeViewModel$special$$inlined$flatMapLatest$1.f26272b = (e83) obj;
        karaokeViewModel$special$$inlined$flatMapLatest$1.f26273c = obj2;
        return karaokeViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f26272b;
        Object obj2 = this.f26273c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26271a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            int iIntValue = ((Number) obj2).intValue();
            C3244l c3244l = ((lj2) this.f26274d.f26297k.f65506b).f49736a;
            this.f26272b = null;
            this.f26273c = null;
            this.f26271a = 1;
            AbstractC3224d.m15539r(e83Var);
            Object objCollect = c3244l.collect(new ij2(e83Var, iIntValue, 0), this);
            if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objCollect = xfaVar;
            }
            if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objCollect = xfaVar;
            }
            if (objCollect == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
