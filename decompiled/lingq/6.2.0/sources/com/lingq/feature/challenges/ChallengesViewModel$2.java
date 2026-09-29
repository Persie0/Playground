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
import p000.us0;
import p000.vk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengesViewModel$2", m4291f = "ChallengesViewModel.kt", m4292l = {184}, m4293m = "invokeSuspend", m4294v = 2)
final class ChallengesViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24465a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1986f f24466b;

    /* JADX INFO: renamed from: com.lingq.feature.challenges.ChallengesViewModel$2$1 */
    @c32(m4290c = "com.lingq.feature.challenges.ChallengesViewModel$2$1", m4291f = "ChallengesViewModel.kt", m4292l = {87}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19581 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f24467a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f24468b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1986f f24469c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19581(C1986f c1986f, Continuation continuation) {
            super(2, continuation);
            this.f24469c = c1986f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C19581 c19581 = new C19581(this.f24469c, continuation);
            c19581.f24468b = obj;
            return c19581;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C19581) create((Language) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C1986f c1986f = this.f24469c;
            us0 us0Var = c1986f.f24767h;
            Language language = (Language) this.f24468b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f24467a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (!vk9.m23391n0(us0Var.f64280a)) {
                    if (!fa4.m11650l(language != null ? language.f19024a : null, us0Var.f64280a)) {
                        String str = us0Var.f64280a;
                        this.f24468b = null;
                        this.f24467a = 1;
                        if (c1986f.f24761b.mo4576F1(str, this) == coroutineSingletons) {
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
            c1986f.m8853V2(false);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengesViewModel$2(C1986f c1986f, Continuation continuation) {
        super(2, continuation);
        this.f24466b = c1986f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChallengesViewModel$2(this.f24466b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChallengesViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24465a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1986f c1986f = this.f24466b;
            eh9 eh9VarMo4572B0 = c1986f.f24761b.mo4572B0();
            C19581 c19581 = new C19581(c1986f, null);
            eh9VarMo4572B0.getClass();
            this.f24465a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo4572B0, c19581, this) == coroutineSingletons) {
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
