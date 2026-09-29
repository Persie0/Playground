package com.lingq.feature.reader.old;

import com.lingq.core.analytics.data.modules.LessonEngagedDataType;
import com.lingq.core.domain.model.lesson.LessonStats;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c18;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$17", m4291f = "ReaderViewModel.kt", m4292l = {2943}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$17 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28831a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28832b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$17$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$17$1", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23801 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28833a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2412n f28834b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23801(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28834b = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23801 c23801 = new C23801(this.f28834b, continuation);
            c23801.f28833a = obj;
            return c23801;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23801 c23801 = (C23801) create((LessonStats) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23801.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LessonStats lessonStats = (LessonStats) this.f28833a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (lessonStats != null) {
                this.f28834b.mo49u1(LessonEngagedDataType.CoinsEarned, new Integer((int) lessonStats.f19272f));
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$17(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28832b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$17(this.f28832b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$17) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28831a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28832b;
            c18 c18Var = c2412n.f29371i2;
            C23801 c23801 = new C23801(c2412n, null);
            c18Var.getClass();
            this.f28831a = 1;
            if (AbstractC3224d.m15529h(c18Var, c23801, this) == coroutineSingletons) {
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
