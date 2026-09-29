package com.lingq.feature.reader.reader.state;

import com.lingq.core.data.repository.C1294j;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.xfa;
import p000.zm3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.state.ReaderReviewStateHolder$special$$inlined$flatMapLatest$1", m4291f = "ReaderReviewStateHolder.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class ReaderReviewStateHolder$special$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f30290a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f30291b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30292c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2502a f30293d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderReviewStateHolder$special$$inlined$flatMapLatest$1(Continuation continuation, C2502a c2502a) {
        super(3, continuation);
        this.f30293d = c2502a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderReviewStateHolder$special$$inlined$flatMapLatest$1 readerReviewStateHolder$special$$inlined$flatMapLatest$1 = new ReaderReviewStateHolder$special$$inlined$flatMapLatest$1((Continuation) obj3, this.f30293d);
        readerReviewStateHolder$special$$inlined$flatMapLatest$1.f30291b = (e83) obj;
        readerReviewStateHolder$special$$inlined$flatMapLatest$1.f30292c = obj2;
        return readerReviewStateHolder$special$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f30291b;
        Object obj2 = this.f30292c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30290a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            String str = (String) obj2;
            zm3 zm3Var = this.f30293d.f30308a;
            str.getClass();
            c83 c83VarM15536o = AbstractC3224d.m15536o(((C1294j) zm3Var.f71762a).m7238l(str));
            this.f30291b = null;
            this.f30292c = null;
            this.f30290a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM15536o, this) == coroutineSingletons) {
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
