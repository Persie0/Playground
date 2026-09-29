package com.lingq.feature.challenges;

import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.bm3;
import p000.c32;
import p000.cm3;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengesViewModel$special$$inlined$flatMapLatest$1", m4291f = "ChallengesViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class ChallengesViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f24485a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f24486b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f24487c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ cm3 f24488d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengesViewModel$special$$inlined$flatMapLatest$1(Continuation continuation, cm3 cm3Var) {
        super(3, continuation);
        this.f24488d = cm3Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChallengesViewModel$special$$inlined$flatMapLatest$1 challengesViewModel$special$$inlined$flatMapLatest$1 = new ChallengesViewModel$special$$inlined$flatMapLatest$1((Continuation) obj3, this.f24488d);
        challengesViewModel$special$$inlined$flatMapLatest$1.f24486b = (e83) obj;
        challengesViewModel$special$$inlined$flatMapLatest$1.f24487c = obj2;
        return challengesViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f24486b;
        Object obj2 = this.f24487c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24485a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Language language = (Language) obj2;
            String str = language != null ? language.f19024a : null;
            if (str == null) {
                str = "";
            }
            bm3 bm3VarM4856b = cm3.m4856b(this.f24488d, str);
            this.f24486b = null;
            this.f24487c = null;
            this.f24485a = 1;
            if (AbstractC3224d.m15537p(e83Var, bm3VarM4856b, this) == coroutineSingletons) {
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
