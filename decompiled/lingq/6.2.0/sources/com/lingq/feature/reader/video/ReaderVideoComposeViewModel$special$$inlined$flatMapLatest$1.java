package com.lingq.feature.reader.video;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.ap1;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.i83;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$special$$inlined$flatMapLatest$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class ReaderVideoComposeViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f31278a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f31279b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f31280c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2583a f31281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$special$$inlined$flatMapLatest$1(C2583a c2583a, Continuation continuation) {
        super(3, continuation);
        this.f31281d = c2583a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderVideoComposeViewModel$special$$inlined$flatMapLatest$1 readerVideoComposeViewModel$special$$inlined$flatMapLatest$1 = new ReaderVideoComposeViewModel$special$$inlined$flatMapLatest$1(this.f31281d, (Continuation) obj3);
        readerVideoComposeViewModel$special$$inlined$flatMapLatest$1.f31279b = (e83) obj;
        readerVideoComposeViewModel$special$$inlined$flatMapLatest$1.f31280c = obj2;
        return readerVideoComposeViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        c83 i83Var;
        e83 e83Var = this.f31279b;
        Object obj2 = this.f31280c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31278a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Integer num = (Integer) obj2;
            if (num == null || num.intValue() <= 0) {
                i83Var = new i83(new ap1(false, false), 1);
            } else {
                C2583a c2583a = this.f31281d;
                i83Var = c2583a.f31381n.m9399a(num.intValue(), c2583a.f31369b.mo4589b2());
            }
            this.f31279b = null;
            this.f31280c = null;
            this.f31278a = 1;
            if (AbstractC3224d.m15537p(e83Var, i83Var, this) == coroutineSingletons) {
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
