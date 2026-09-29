package com.lingq.core.achievements;

import com.lingq.core.data.repository.C1294j;
import com.lingq.core.domain.model.language.LanguageStudyStats;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.ux5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.achievements.RepairStreakViewModel$2", m4291f = "RepairStreakViewModel.kt", m4292l = {60}, m4293m = "invokeSuspend", m4294v = 2)
final class RepairStreakViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f14219a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1236c f14220b;

    /* JADX INFO: renamed from: com.lingq.core.achievements.RepairStreakViewModel$2$1 */
    @c32(m4290c = "com.lingq.core.achievements.RepairStreakViewModel$2$1", m4291f = "RepairStreakViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C12331 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f14221a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1236c f14222b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12331(C1236c c1236c, Continuation continuation) {
            super(2, continuation);
            this.f14222b = c1236c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C12331 c12331 = new C12331(this.f14222b, continuation);
            c12331.f14221a = obj;
            return c12331;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C12331 c12331 = (C12331) create((LanguageStudyStats) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c12331.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LanguageStudyStats languageStudyStats = (LanguageStudyStats) this.f14221a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (languageStudyStats != null) {
                C1236c c1236c = this.f14222b;
                if (!((Boolean) c1236c.f14234j.getValue()).booleanValue()) {
                    ux5.m22977D(languageStudyStats.f19109d < 5000, c1236c.f14236l, null);
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepairStreakViewModel$2(C1236c c1236c, Continuation continuation) {
        super(2, continuation);
        this.f14220b = c1236c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RepairStreakViewModel$2(this.f14220b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RepairStreakViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14219a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1236c c1236c = this.f14220b;
            c83 c83VarM7238l = ((C1294j) c1236c.f14227c).m7238l(c1236c.f14226b.mo4589b2());
            C12331 c12331 = new C12331(c1236c, null);
            this.f14219a = 1;
            if (AbstractC3224d.m15529h(c83VarM7238l, c12331, this) == coroutineSingletons) {
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
