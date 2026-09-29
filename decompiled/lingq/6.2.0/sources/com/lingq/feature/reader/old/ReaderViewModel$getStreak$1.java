package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1294j;
import com.lingq.core.domain.model.language.LanguageStudyStats;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$getStreak$1", m4291f = "ReaderViewModel.kt", m4292l = {2279}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$getStreak$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f28956a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28957b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$getStreak$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$getStreak$1$1", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23981 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28958a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2412n f28959b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23981(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28959b = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23981 c23981 = new C23981(this.f28959b, continuation);
            c23981.f28958a = obj;
            return c23981;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23981 c23981 = (C23981) create((LanguageStudyStats) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23981.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LanguageStudyStats languageStudyStats = (LanguageStudyStats) this.f28958a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (languageStudyStats != null) {
                C3244l c3244l = this.f28959b.f29374j1;
                c3244l.getClass();
                c3244l.m15572j(null, languageStudyStats);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$getStreak$1(C2412n c2412n, Continuation continuation) {
        super(1, continuation);
        this.f28957b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ReaderViewModel$getStreak$1(this.f28957b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((ReaderViewModel$getStreak$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28956a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28957b;
            c83 c83VarM7238l = ((C1294j) c2412n.f29406t).m7238l(c2412n.f29340b.mo4589b2());
            C23981 c23981 = new C23981(c2412n, null);
            this.f28956a = 1;
            if (AbstractC3224d.m15529h(c83VarM7238l, c23981, this) == coroutineSingletons) {
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
