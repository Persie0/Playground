package com.lingq.feature.challenges;

import com.lingq.core.data.repository.C1288d;
import com.lingq.core.p012ui.challenges.ChallengeType;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.C3445p2;
import p000.c32;
import p000.e83;
import p000.fr0;
import p000.lr0;
import p000.m83;
import p000.mr0;
import p000.or0;
import p000.u91;
import p000.vi3;
import p000.xfa;
import p000.yp0;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengeDetailsViewModel$observableUserRankings$1", m4291f = "ChallengeDetailsViewModel.kt", m4292l = {229}, m4293m = "invokeSuspend", m4294v = 2)
final class ChallengeDetailsViewModel$observableUserRankings$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f24398a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1962b f24399b;

    /* JADX INFO: renamed from: com.lingq.feature.challenges.ChallengeDetailsViewModel$observableUserRankings$1$1 */
    @c32(m4290c = "com.lingq.feature.challenges.ChallengeDetailsViewModel$observableUserRankings$1$1", m4291f = "ChallengeDetailsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19521 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1962b f24400a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19521(C1962b c1962b, Continuation continuation) {
            super(2, continuation);
            this.f24400a = c1962b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C19521(this.f24400a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C19521 c19521 = (C19521) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c19521.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f24400a.f24509t;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, fr0.m12004a((fr0) value, null, null, null, lr0.f50025a, null, null, null, null, null, null, 4087)));
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.challenges.ChallengeDetailsViewModel$observableUserRankings$1$2 */
    @c32(m4290c = "com.lingq.feature.challenges.ChallengeDetailsViewModel$observableUserRankings$1$2", m4291f = "ChallengeDetailsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19532 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f24401a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1962b f24402b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19532(C1962b c1962b, Continuation continuation) {
            super(2, continuation);
            this.f24402b = c1962b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C19532 c19532 = new C19532(this.f24402b, continuation);
            c19532.f24401a = obj;
            return c19532;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C19532 c19532 = (C19532) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c19532.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            List list = (List) this.f24401a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ArrayList arrayListM22587E0 = u91.m22587E0(list);
            if (!arrayListM22587E0.isEmpty()) {
                C3244l c3244l = this.f24402b.f24509t;
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, fr0.m12004a((fr0) value, null, null, null, new mr0(arrayListM22587E0), null, null, null, null, null, null, 4087)));
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailsViewModel$observableUserRankings$1(C1962b c1962b, Continuation continuation) {
        super(1, continuation);
        this.f24399b = c1962b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ChallengeDetailsViewModel$observableUserRankings$1(this.f24399b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((ChallengeDetailsViewModel$observableUserRankings$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24398a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1962b c1962b = this.f24399b;
            or0 or0Var = c1962b.f24493d;
            String strMo4589b2 = c1962b.f24491b.mo4589b2();
            String str = c1962b.f24500k.f67168a;
            String metric = ((ChallengeType) c1962b.f24507r.getValue()).getMetric();
            C1288d c1288d = (C1288d) or0Var;
            c1288d.getClass();
            strMo4589b2.getClass();
            metric.getClass();
            yp0 yp0Var = c1288d.f16464a;
            yp0Var.getClass();
            m83 m83Var = new m83(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(yp0Var.f70233K, true, new String[]{"ChallengeRankingEntity"}, new C3445p2(strMo4589b2, str, metric, (Object) yp0Var, 3))), new C19521(c1962b, null));
            C19532 c19532 = new C19532(c1962b, null);
            this.f24398a = 1;
            if (AbstractC3224d.m15529h(m83Var, c19532, this) == coroutineSingletons) {
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
