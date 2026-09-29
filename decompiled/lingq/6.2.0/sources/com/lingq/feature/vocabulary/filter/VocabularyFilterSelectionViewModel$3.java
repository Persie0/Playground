package com.lingq.feature.vocabulary.filter;

import com.lingq.core.datastore.C1371d;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionViewModel$3", m4291f = "VocabularyFilterSelectionViewModel.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSelectionViewModel$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33604a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2850b f33605b;

    /* JADX INFO: renamed from: com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionViewModel$3$1 */
    @c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionViewModel$3$1", m4291f = "VocabularyFilterSelectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28351 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f33606a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2850b f33607b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28351(C2850b c2850b, Continuation continuation) {
            super(2, continuation);
            this.f33607b = c2850b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C28351 c28351 = new C28351(this.f33607b, continuation);
            c28351.f33606a = obj;
            return c28351;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C28351 c28351 = (C28351) create((Map) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28351.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Map map = (Map) this.f33606a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2850b c2850b = this.f33607b;
            c2850b.f33701z.m15571i(map.get(c2850b.f33677b.mo4589b2()));
            c2850b.m9760V2();
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSelectionViewModel$3(C2850b c2850b, Continuation continuation) {
        super(2, continuation);
        this.f33605b = c2850b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyFilterSelectionViewModel$3(this.f33605b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyFilterSelectionViewModel$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33604a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2850b c2850b = this.f33605b;
            c83 c83Var = ((C1371d) c2850b.f33678c).f18580q;
            C28351 c28351 = new C28351(c2850b, null);
            this.f33604a = 1;
            if (AbstractC3224d.m15529h(c83Var, c28351, this) == coroutineSingletons) {
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
