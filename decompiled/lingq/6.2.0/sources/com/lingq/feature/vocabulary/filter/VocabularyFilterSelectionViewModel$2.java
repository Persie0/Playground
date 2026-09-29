package com.lingq.feature.vocabulary.filter;

import java.util.List;
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
@c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionViewModel$2", m4291f = "VocabularyFilterSelectionViewModel.kt", m4292l = {546}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSelectionViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33600a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2850b f33601b;

    /* JADX INFO: renamed from: com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionViewModel$2$1 */
    @c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionViewModel$2$1", m4291f = "VocabularyFilterSelectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28341 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f33602a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2850b f33603b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28341(C2850b c2850b, Continuation continuation) {
            super(2, continuation);
            this.f33603b = c2850b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C28341 c28341 = new C28341(this.f33603b, continuation);
            c28341.f33602a = obj;
            return c28341;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C28341 c28341 = (C28341) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28341.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f33602a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f33603b.f33689n.m15571i(list);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSelectionViewModel$2(C2850b c2850b, Continuation continuation) {
        super(2, continuation);
        this.f33601b = c2850b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyFilterSelectionViewModel$2(this.f33601b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyFilterSelectionViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33600a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2850b c2850b = this.f33601b;
            c18 c18Var = c2850b.f33698w;
            C28341 c28341 = new C28341(c2850b, null);
            c18Var.getClass();
            this.f33600a = 1;
            if (AbstractC3224d.m15529h(c18Var, c28341, this) == coroutineSingletons) {
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
