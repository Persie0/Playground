package com.lingq.feature.challenges;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.data.repository.C1288d;
import com.lingq.core.domain.model.challenge.Challenge;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengeShareViewModel$observableChallengeDetail$1", m4291f = "ChallengeShareViewModel.kt", m4292l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
final class ChallengeShareViewModel$observableChallengeDetail$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24433a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1973c f24434b;

    /* JADX INFO: renamed from: com.lingq.feature.challenges.ChallengeShareViewModel$observableChallengeDetail$1$1 */
    @c32(m4290c = "com.lingq.feature.challenges.ChallengeShareViewModel$observableChallengeDetail$1$1", m4291f = "ChallengeShareViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19561 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f24435a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1973c f24436b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19561(C1973c c1973c, Continuation continuation) {
            super(2, continuation);
            this.f24436b = c1973c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C19561 c19561 = new C19561(this.f24436b, continuation);
            c19561.f24435a = obj;
            return c19561;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C19561 c19561 = (C19561) create((Challenge) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c19561.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Challenge challenge = (Challenge) this.f24435a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (challenge != null) {
                C3244l c3244l = this.f24436b.f24555e;
                c3244l.getClass();
                c3244l.m15572j(null, challenge);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeShareViewModel$observableChallengeDetail$1(C1973c c1973c, Continuation continuation) {
        super(2, continuation);
        this.f24434b = c1973c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChallengeShareViewModel$observableChallengeDetail$1(this.f24434b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChallengeShareViewModel$observableChallengeDetail$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24433a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1973c c1973c = this.f24434b;
            c83 c83VarM7146m = ((C1288d) c1973c.f24553c).m7146m(c1973c.f24552b.mo4589b2(), c1973c.f24554d.f65821a);
            C19561 c19561 = new C19561(c1973c, null);
            this.f24433a = 1;
            if (AbstractC3224d.m15529h(c83VarM7146m, c19561, this) == coroutineSingletons) {
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
