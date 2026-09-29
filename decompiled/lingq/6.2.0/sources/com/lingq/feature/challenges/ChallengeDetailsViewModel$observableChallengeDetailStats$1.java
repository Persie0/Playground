package com.lingq.feature.challenges;

import com.lingq.core.data.repository.C1288d;
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
import p000.c32;
import p000.e83;
import p000.fr0;
import p000.is0;
import p000.js0;
import p000.ks0;
import p000.m83;
import p000.md0;
import p000.or0;
import p000.u91;
import p000.un1;
import p000.xfa;
import p000.yp0;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengeDetailsViewModel$observableChallengeDetailStats$1", m4291f = "ChallengeDetailsViewModel.kt", m4292l = {192}, m4293m = "invokeSuspend", m4294v = 2)
final class ChallengeDetailsViewModel$observableChallengeDetailStats$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24391a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1962b f24392b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f24393c;

    /* JADX INFO: renamed from: com.lingq.feature.challenges.ChallengeDetailsViewModel$observableChallengeDetailStats$1$1 */
    @c32(m4290c = "com.lingq.feature.challenges.ChallengeDetailsViewModel$observableChallengeDetailStats$1$1", m4291f = "ChallengeDetailsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19501 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1962b f24394a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19501(C1962b c1962b, Continuation continuation) {
            super(2, continuation);
            this.f24394a = c1962b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C19501(this.f24394a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C19501 c19501 = (C19501) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c19501.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f24394a.f24509t;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, fr0.m12004a((fr0) value, null, null, js0.f46054a, null, null, null, null, null, null, null, 4091)));
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.challenges.ChallengeDetailsViewModel$observableChallengeDetailStats$1$2 */
    @c32(m4290c = "com.lingq.feature.challenges.ChallengeDetailsViewModel$observableChallengeDetailStats$1$2", m4291f = "ChallengeDetailsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19512 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f24395a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1962b f24396b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f24397c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19512(C1962b c1962b, int i, Continuation continuation) {
            super(2, continuation);
            this.f24396b = c1962b;
            this.f24397c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C19512 c19512 = new C19512(this.f24396b, this.f24397c, continuation);
            c19512.f24395a = obj;
            return c19512;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C19512 c19512 = (C19512) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c19512.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            Object value2;
            List list = (List) this.f24395a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ArrayList arrayListM22587E0 = u91.m22587E0(list);
            boolean zIsEmpty = arrayListM22587E0.isEmpty();
            C3244l c3244l = this.f24396b.f24509t;
            if (zIsEmpty) {
                do {
                    value2 = c3244l.getValue();
                } while (!c3244l.m15570h(value2, fr0.m12004a((fr0) value2, null, null, is0.f44478a, null, null, null, null, null, null, null, 4091)));
            } else {
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, fr0.m12004a((fr0) value, null, null, new ks0(this.f24397c, arrayListM22587E0), null, null, null, null, null, null, null, 4091)));
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailsViewModel$observableChallengeDetailStats$1(C1962b c1962b, int i, Continuation continuation) {
        super(2, continuation);
        this.f24392b = c1962b;
        this.f24393c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChallengeDetailsViewModel$observableChallengeDetailStats$1(this.f24392b, this.f24393c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChallengeDetailsViewModel$observableChallengeDetailStats$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24391a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1962b c1962b = this.f24392b;
            or0 or0Var = c1962b.f24493d;
            String strMo4589b2 = c1962b.f24491b.mo4589b2();
            String str = c1962b.f24500k.f67168a;
            C1288d c1288d = (C1288d) or0Var;
            c1288d.getClass();
            strMo4589b2.getClass();
            yp0 yp0Var = c1288d.f16464a;
            yp0Var.getClass();
            m83 m83Var = new m83(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(yp0Var.f70233K, true, new String[]{"ChallengeStatsEntity"}, new md0(strMo4589b2, 6, str))), new C19501(c1962b, null));
            C19512 c19512 = new C19512(c1962b, this.f24393c, null);
            this.f24391a = 1;
            if (AbstractC3224d.m15529h(m83Var, c19512, this) == coroutineSingletons) {
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
