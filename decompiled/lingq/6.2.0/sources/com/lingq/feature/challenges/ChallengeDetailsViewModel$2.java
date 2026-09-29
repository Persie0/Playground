package com.lingq.feature.challenges;

import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.eh9;
import p000.fa4;
import p000.un1;
import p000.vk9;
import p000.wq0;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengeDetailsViewModel$2", m4291f = "ChallengeDetailsViewModel.kt", m4292l = {431}, m4293m = "invokeSuspend", m4294v = 2)
final class ChallengeDetailsViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24375a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1962b f24376b;

    /* JADX INFO: renamed from: com.lingq.feature.challenges.ChallengeDetailsViewModel$2$1 */
    @c32(m4290c = "com.lingq.feature.challenges.ChallengeDetailsViewModel$2$1", m4291f = "ChallengeDetailsViewModel.kt", m4292l = {134}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19471 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f24377a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f24378b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1962b f24379c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19471(C1962b c1962b, Continuation continuation) {
            super(2, continuation);
            this.f24379c = c1962b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C19471 c19471 = new C19471(this.f24379c, continuation);
            c19471.f24378b = obj;
            return c19471;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C19471) create((Language) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Language language = (Language) this.f24378b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f24377a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (language != null) {
                    C1962b c1962b = this.f24379c;
                    wq0 wq0Var = c1962b.f24500k;
                    if (!vk9.m23391n0(wq0Var.f67170c) && !fa4.m11650l(language.f19024a, wq0Var.f67170c)) {
                        String str = wq0Var.f67170c;
                        this.f24378b = null;
                        this.f24377a = 1;
                        if (c1962b.f24491b.mo4576F1(str, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailsViewModel$2(C1962b c1962b, Continuation continuation) {
        super(2, continuation);
        this.f24376b = c1962b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChallengeDetailsViewModel$2(this.f24376b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChallengeDetailsViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24375a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1962b c1962b = this.f24376b;
            eh9 eh9VarMo4572B0 = c1962b.f24491b.mo4572B0();
            C19471 c19471 = new C19471(c1962b, null);
            eh9VarMo4572B0.getClass();
            this.f24375a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo4572B0, c19471, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
