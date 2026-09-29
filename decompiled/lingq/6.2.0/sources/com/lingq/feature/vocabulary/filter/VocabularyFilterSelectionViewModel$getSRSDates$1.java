package com.lingq.feature.vocabulary.filter;

import com.lingq.core.data.repository.C1293i;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.e83;
import p000.iza;
import p000.m83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionViewModel$getSRSDates$1", m4291f = "VocabularyFilterSelectionViewModel.kt", m4292l = {446}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSelectionViewModel$getSRSDates$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33623a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2850b f33624b;

    /* JADX INFO: renamed from: com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionViewModel$getSRSDates$1$1 */
    @c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionViewModel$getSRSDates$1$1", m4291f = "VocabularyFilterSelectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28401 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2850b f33625a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28401(C2850b c2850b, Continuation continuation) {
            super(2, continuation);
            this.f33625a = c2850b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C28401(this.f33625a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C28401 c28401 = (C28401) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28401.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f33625a.f33687l;
            Boolean bool = Boolean.TRUE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSelectionViewModel$getSRSDates$1(C2850b c2850b, Continuation continuation) {
        super(2, continuation);
        this.f33624b = c2850b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyFilterSelectionViewModel$getSRSDates$1(this.f33624b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyFilterSelectionViewModel$getSRSDates$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33623a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2850b c2850b = this.f33624b;
            m83 m83Var = new m83(((C1293i) c2850b.f33681f).m7215l(c2850b.f33677b.mo4589b2()), new C28401(c2850b, null));
            iza izaVar = new iza(c2850b, 4);
            this.f33623a = 1;
            if (m83Var.collect(izaVar, this) == coroutineSingletons) {
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
