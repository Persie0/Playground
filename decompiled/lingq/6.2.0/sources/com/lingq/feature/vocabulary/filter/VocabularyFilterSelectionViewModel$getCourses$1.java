package com.lingq.feature.vocabulary.filter;

import com.lingq.core.data.repository.C1290f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.iza;
import p000.m83;
import p000.un1;
import p000.xfa;
import p000.xo1;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionViewModel$getCourses$1", m4291f = "VocabularyFilterSelectionViewModel.kt", m4292l = {341, 343}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSelectionViewModel$getCourses$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33614a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2850b f33615b;

    /* JADX INFO: renamed from: com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionViewModel$getCourses$1$1 */
    @c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionViewModel$getCourses$1$1", m4291f = "VocabularyFilterSelectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28371 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2850b f33616a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28371(C2850b c2850b, Continuation continuation) {
            super(2, continuation);
            this.f33616a = c2850b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C28371(this.f33616a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C28371 c28371 = (C28371) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28371.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f33616a.f33687l;
            Boolean bool = Boolean.TRUE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSelectionViewModel$getCourses$1(C2850b c2850b, Continuation continuation) {
        super(2, continuation);
        this.f33615b = c2850b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyFilterSelectionViewModel$getCourses$1(this.f33615b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyFilterSelectionViewModel$getCourses$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r2.collect(r7, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33614a;
        int i2 = 1;
        C2850b c2850b = this.f33615b;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        xo1 xo1Var = c2850b.f33679d;
        String strMo4589b2 = c2850b.f33677b.mo4589b2();
        this.f33614a = 1;
        obj = ((C1290f) xo1Var).m7184h(strMo4589b2);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        m83 m83Var = new m83((c83) obj, new C28371(c2850b, null));
        iza izaVar = new iza(c2850b, i2);
        this.f33614a = 2;
    }
}
