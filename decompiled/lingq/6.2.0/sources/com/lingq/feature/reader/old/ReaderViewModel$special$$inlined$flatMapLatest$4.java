package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.lesson.Lesson;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.d65;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$special$$inlined$flatMapLatest$4", m4291f = "ReaderViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class ReaderViewModel$special$$inlined$flatMapLatest$4 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f29125a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f29126b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f29127c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2412n f29128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$special$$inlined$flatMapLatest$4(C2412n c2412n, Continuation continuation) {
        super(3, continuation);
        this.f29128d = c2412n;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderViewModel$special$$inlined$flatMapLatest$4 readerViewModel$special$$inlined$flatMapLatest$4 = new ReaderViewModel$special$$inlined$flatMapLatest$4(this.f29128d, (Continuation) obj3);
        readerViewModel$special$$inlined$flatMapLatest$4.f29126b = (e83) obj;
        readerViewModel$special$$inlined$flatMapLatest$4.f29127c = obj2;
        return readerViewModel$special$$inlined$flatMapLatest$4.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f29126b;
        Object obj2 = this.f29127c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29125a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f29128d;
            d65 d65Var = c2412n.f29394p;
            C1295k c1295k = (C1295k) d65Var;
            c83 c83VarM7255M = c1295k.m7255M(((Lesson) obj2).f19142a, c2412n.f29340b.mo4589b2());
            this.f29126b = null;
            this.f29127c = null;
            this.f29125a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM7255M, this) == coroutineSingletons) {
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
