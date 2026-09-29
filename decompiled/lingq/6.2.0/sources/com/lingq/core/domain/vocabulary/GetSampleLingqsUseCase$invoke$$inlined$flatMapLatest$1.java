package com.lingq.core.domain.vocabulary;

import com.lingq.core.data.repository.C1308x;
import com.lingq.core.database.dao.AbstractC1323k;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.status.CardStatus;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.rxa;
import p000.tn4;
import p000.u0b;
import p000.wm3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.vocabulary.GetSampleLingqsUseCase$invoke$$inlined$flatMapLatest$1", m4291f = "GetSampleLingqsUseCase.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class GetSampleLingqsUseCase$invoke$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f20149a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f20150b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f20151c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ wm3 f20152d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSampleLingqsUseCase$invoke$$inlined$flatMapLatest$1(Continuation continuation, wm3 wm3Var) {
        super(3, continuation);
        this.f20152d = wm3Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetSampleLingqsUseCase$invoke$$inlined$flatMapLatest$1 getSampleLingqsUseCase$invoke$$inlined$flatMapLatest$1 = new GetSampleLingqsUseCase$invoke$$inlined$flatMapLatest$1((Continuation) obj3, this.f20152d);
        getSampleLingqsUseCase$invoke$$inlined$flatMapLatest$1.f20150b = (e83) obj;
        getSampleLingqsUseCase$invoke$$inlined$flatMapLatest$1.f20151c = obj2;
        return getSampleLingqsUseCase$invoke$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f20150b;
        Object obj2 = this.f20151c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f20149a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            wm3 wm3Var = this.f20152d;
            u0b u0bVar = wm3Var.f67051a;
            String str = ((Language) obj2).f19024a;
            C1308x c1308x = (C1308x) u0bVar;
            c1308x.getClass();
            str.getClass();
            AbstractC1323k abstractC1323k = c1308x.f16569b;
            int value = CardStatus.New.getValue();
            int value2 = CardStatus.Known.getValue();
            rxa rxaVar = (rxa) abstractC1323k;
            rxaVar.getClass();
            C3235e c3235eM15521C = AbstractC3224d.m15521C(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(rxaVar.f60013K, true, new String[]{"CardEntity"}, new tn4(str, value, value2, rxaVar, 1))), new GetSampleLingqsUseCase$invoke$lambda$0$$inlined$flatMapLatest$1(null, wm3Var));
            this.f20150b = null;
            this.f20151c = null;
            this.f20149a = 1;
            if (AbstractC3224d.m15537p(e83Var, c3235eM15521C, this) == coroutineSingletons) {
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
