package com.lingq.feature.challenges;

import com.lingq.core.data.repository.C1288d;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c32;
import p000.e83;
import p000.m83;
import p000.t70;
import p000.tl3;
import p000.vi3;
import p000.wz0;
import p000.xfa;
import p000.yp0;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengesViewModel$observeChallenges$1", m4291f = "ChallengesViewModel.kt", m4292l = {107}, m4293m = "invokeSuspend", m4294v = 2)
final class ChallengesViewModel$observeChallenges$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f24480a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1986f f24481b;

    /* JADX INFO: renamed from: com.lingq.feature.challenges.ChallengesViewModel$observeChallenges$1$1 */
    @c32(m4290c = "com.lingq.feature.challenges.ChallengesViewModel$observeChallenges$1$1", m4291f = "ChallengesViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19591 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1986f f24482a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19591(C1986f c1986f, Continuation continuation) {
            super(2, continuation);
            this.f24482a = c1986f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C19591(this.f24482a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C19591 c19591 = (C19591) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c19591.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f24482a.f24769j;
            do {
                value = c3244l.getValue();
                ((Boolean) value).getClass();
            } while (!c3244l.m15570h(value, Boolean.TRUE));
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.challenges.ChallengesViewModel$observeChallenges$1$2 */
    @c32(m4290c = "com.lingq.feature.challenges.ChallengesViewModel$observeChallenges$1$2", m4291f = "ChallengesViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19602 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f24483a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1986f f24484b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19602(C1986f c1986f, Continuation continuation) {
            super(2, continuation);
            this.f24484b = c1986f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C19602 c19602 = new C19602(this.f24484b, continuation);
            c19602.f24483a = obj;
            return c19602;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C19602 c19602 = (C19602) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c19602.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            List list = (List) this.f24483a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C1986f c1986f = this.f24484b;
            C3244l c3244l = c1986f.f24771l;
            C3244l c3244l2 = c1986f.f24770k;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, list));
            if (!list.isEmpty()) {
                C3244l c3244l3 = c1986f.f24769j;
                do {
                    value4 = c3244l3.getValue();
                    ((Boolean) value4).getClass();
                } while (!c3244l3.m15570h(value4, Boolean.FALSE));
            }
            if (((Boolean) c3244l2.getValue()).booleanValue()) {
                C3244l c3244l4 = c1986f.f24768i;
                do {
                    value2 = c3244l4.getValue();
                    ((Boolean) value2).getClass();
                } while (!c3244l4.m15570h(value2, Boolean.TRUE));
                do {
                    value3 = c3244l2.getValue();
                    ((Boolean) value3).getClass();
                } while (!c3244l2.m15570h(value3, Boolean.FALSE));
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengesViewModel$observeChallenges$1(C1986f c1986f, Continuation continuation) {
        super(1, continuation);
        this.f24481b = c1986f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ChallengesViewModel$observeChallenges$1(this.f24481b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((ChallengesViewModel$observeChallenges$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24480a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1986f c1986f = this.f24481b;
            tl3 tl3Var = c1986f.f24762c;
            String strMo4589b2 = c1986f.f24761b.mo4589b2();
            tl3Var.getClass();
            strMo4589b2.getClass();
            C1288d c1288d = (C1288d) tl3Var.f62480a;
            c1288d.getClass();
            yp0 yp0Var = c1288d.f16464a;
            yp0Var.getClass();
            m83 m83Var = new m83(new wz0(7, AbstractC3224d.m15536o(AbstractC3584sr.m21590A(yp0Var.f70233K, true, new String[]{"ChallengeEntity"}, new t70(strMo4589b2, 10))), tl3Var), new C19591(c1986f, null));
            C19602 c19602 = new C19602(c1986f, null);
            this.f24480a = 1;
            if (AbstractC3224d.m15529h(m83Var, c19602, this) == coroutineSingletons) {
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
