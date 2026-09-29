package com.lingq.core.domain.stats;

import com.lingq.core.data.repository.C1294j;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.user.ProfileAccount;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.C3386nv;
import p000.C3540rl;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.stats.StreakWeekUseCase$invoke$$inlined$flatMapLatest$1", m4291f = "StreakWeekUseCase.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class StreakWeekUseCase$invoke$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f19971a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f19972b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f19973c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1529d f19974d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreakWeekUseCase$invoke$$inlined$flatMapLatest$1(Continuation continuation, C1529d c1529d) {
        super(3, continuation);
        this.f19974d = c1529d;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        StreakWeekUseCase$invoke$$inlined$flatMapLatest$1 streakWeekUseCase$invoke$$inlined$flatMapLatest$1 = new StreakWeekUseCase$invoke$$inlined$flatMapLatest$1((Continuation) obj3, this.f19974d);
        streakWeekUseCase$invoke$$inlined$flatMapLatest$1.f19972b = (e83) obj;
        streakWeekUseCase$invoke$$inlined$flatMapLatest$1.f19973c = obj2;
        return streakWeekUseCase$invoke$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f19972b;
        Object obj2 = this.f19973c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f19971a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Pair pair = (Pair) obj2;
            ProfileAccount profileAccount = (ProfileAccount) pair.f47623a;
            Language language = (Language) pair.f47624b;
            C1529d c1529d = this.f19974d;
            C3235e c3235eM15546y = AbstractC3224d.m15546y(new C3540rl(((C1294j) c1529d.f19990b).m7238l(language.f19024a), 5), new StreakWeekUseCase$invoke$2$1(profileAccount, c1529d, null));
            this.f19972b = null;
            this.f19973c = null;
            this.f19971a = 1;
            if (AbstractC3224d.m15537p(e83Var, c3235eM15546y, this) == coroutineSingletons) {
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
